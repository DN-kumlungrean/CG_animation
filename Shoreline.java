import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;

public class Shoreline {
    // Colors 
    private final Color WAVE_BASE_COLOR  = new Color(146, 128, 166);         // dark 
    private final Color WAVE_MID_COLOR   = new Color(170, 145, 175, 200);    // mid
    private final Color WAVE_TOP_COLOR   = new Color(225, 216, 227, 220);    // foam
    private final Color SAND_UNDER_COLOR = new Color(188, 160, 120, 220);    // wet sand under foam

    // Thickness base and per-layer scales 
    private static final double BAND_THICK_BASE = 50.0;
    private static final double DARK_BASE_SCALE  = 1.80;
    private static final double MID_BASE_SCALE   = 1.10;
    private static final double WHITE_BASE_SCALE = 1.00;
    private static final double SAND_BASE_SCALE  = 1.60;

    // Small boosts during hold 
    private static final double PRESS_BOOST_DARK  = 0.06;
    private static final double PRESS_BOOST_MID   = 0.06;
    private static final double PRESS_BOOST_WHITE = 0.08;
    private static final double PRESS_BOOST_SAND  = 0.10;

    private static final int SEA_OVERLAP   = 0;
    private static final int SHORE_LIFT_UP = 30;

    // Reach from shore for each band (dark, mid, white, sand)
    private static final double[] MAX_REACH = {
        23.0, // dark
        60.0, // mid
        75.0, // white
        80.0  // wet sand
    };

    // Phase timing per layer: {delay, expand, hold, retract}
    private static final double[][] PHASES = {
        {0.00, 0.36, 0.28, 0.36}, // dark
        {0.06, 0.32, 0.20, 0.24}, // mid
        {0.14, 0.28, 0.14, 0.18}, // white
        {0.22, 0.32, 0.22, 0.20}  // wet sand
    };

    // Progress memory for direction detection
    private double lastProgress = Double.NaN;

    // Math helpers
    private static double clamp01(double x) { return Math.max(0.0, Math.min(1.0, x)); }

    private static double easeOutCubic(double x) {
        x = clamp01(x);
        return 1.0 - Math.pow(1.0 - x, 3.0);
    }

    private static double easeInCubic(double x) {
        x = clamp01(x);
        return x * x * x;
    }

    private static double phaseExpandHoldRetract(double p, double delay, double expand, double hold, double retract) {
        double t = p - delay;
        if (t < 0) return 0;
        if (t < expand) return easeOutCubic(t / expand);
        t -= expand;
        if (t < hold) return 1;
        t -= hold;
        if (t < retract) return 1.0 - easeInCubic(t / retract);
        return 0;
    }

    private static double holdEmphasis(double p, double delay, double expand, double hold) {
        double t = p - delay;
        if (t < 0) return 0;
        if (t < expand) return 0;
        t -= expand;
        if (t < hold) return 1;
        return 0;
    }

    private static double retractEmphasis(double p, double delay, double expand, double hold, double retract) {
        double t = p - delay;
        if (t < 0) return 0;
        if (t < expand + hold) return 0;
        t -= (expand + hold);
        if (t < retract) return easeInCubic(t / retract);
        return 0;
    }

    /** 0=pre, 1=expand, 2=hold, 3=retract, 4=post */
    private static int phaseStage(double p, double delay, double expand, double hold, double retract) {
        double t = p - delay;
        if (t < 0) return 0;
        if (t < expand) return 1;
        t -= expand;
        if (t < hold) return 2;
        t -= hold;
        if (t < retract) return 3;
        return 4;
    }

    /* Normalize ping-pong progress */
    private double normalizeProgressForward(double progress, boolean[] isIncreasingOut) {
        double p = clamp01(progress);
        boolean increasing;
        if (Double.isNaN(lastProgress)) {
            increasing = true;
        } else {
            increasing = p >= lastProgress - 1e-9;
        }
        lastProgress = p;
        if (isIncreasingOut != null && isIncreasingOut.length > 0) {
            isIncreasingOut[0] = increasing;
        }
        // Map decreasing half to forward phase 
        return increasing ? p : (1.0 - p);
    }

    private void buildBottomProfile(int panelWidth, double centerY, double thicknessScale, int[] xs, int[] ys) {
        int idx = 0;
        for (int x = -2; x <= panelWidth + 2; x++) {
            double env = 0.90
                       + 0.08 * Math.sin((x + 37.0) / 240.0)
                       + 0.04 * Math.sin((x + 111.0) / 97.0);
            if (env < 0.75) env = 0.75;
            if (env > 1.10) env = 1.10;

            double f1 = 15.0 * Math.sin((x + 31.0) / 60.0);
            double f2 =  7.0 * Math.sin((x + 73.0) / 120.0);
            double f3 =  3.0 * Math.sin((x + 149.0) / 35.0);
            double profile = (f1 + f2 + f3) * 0.9;

            double thickness = BAND_THICK_BASE * thicknessScale * env;
            double y = centerY + thickness / 2.0 + profile * 0.9;

            xs[idx] = x;
            ys[idx] = (int)Math.round(y);
            idx++;
        }
    }

    private void fillBandPolygon(Graphics2D g2d, int panelWidth, double centerY, double thicknessScale) {
        int sampleCount = (panelWidth + 2) - (-2) + 1; // inclusive range
        int[] bx = new int[sampleCount];
        int[] by = new int[sampleCount];
        buildBottomProfile(panelWidth, centerY, thicknessScale, bx, by);

        double topYd = centerY - (BAND_THICK_BASE * thicknessScale) / 2.0;
        int topY = (int)Math.round(topYd);

        int n = sampleCount * 2;
        int[] xs = new int[n];
        int[] ys = new int[n];

        // Top edge
        for (int i = 0; i < sampleCount; i++) {
            xs[i] = -2 + i;
            ys[i] = topY;
        }
        // Bottom edge
        for (int i = 0; i < sampleCount; i++) {
            int j = sampleCount - 1 - i;
            xs[sampleCount + i] = bx[j];
            ys[sampleCount + i] = by[j];
        }
        g2d.fillPolygon(xs, ys, n);
    }

    private void fillEdgeLine(Graphics2D g2d, int panelWidth, double centerY, double thicknessScale, int thicknessPx, Color color) {
        int sampleCount = (panelWidth + 2) - (-2) + 1;
        int[] bx = new int[sampleCount];
        int[] by = new int[sampleCount];
        buildBottomProfile(panelWidth, centerY, thicknessScale, bx, by);

        g2d.setColor(color);
        for (int i = 0; i < sampleCount - 1; i++) {
            int x1 = bx[i],     y1 = by[i];
            int x2 = bx[i + 1], y2 = by[i + 1];

            double dx = x2 - x1;
            double dy = y2 - y1;
            double len = Math.hypot(dx, dy);
            if (len < 1e-6) continue;

            double nx = -dy / len;
            double ny =  dx / len;

            int ox = (int)Math.round(nx * (thicknessPx / 2.0));
            int oy = (int)Math.round(ny * (thicknessPx / 2.0));

            int[] px = new int[] { x1 - ox, x2 - ox, x2 + ox, x1 + ox };
            int[] py = new int[] { y1 - oy, y2 - oy, y2 + oy, y1 + oy };
            g2d.fillPolygon(px, py, 4);
        }
    }
    
    public void drawStaged(Graphics2D g2d, int panelWidth, int panelHeight, int shoreY,
                           double offset, double progress) {

        boolean[] incBox = new boolean[1];
        double pNorm = normalizeProgressForward(progress, incBox);
        boolean isExpandingHalf = incBox[0];

        final int baseY = shoreY + SHORE_LIFT_UP;

        double[] amt = new double[4];
        double[] holdW = new double[4];
        int[]    stage = new int[4];
        boolean[] active = new boolean[4];
        double[] centerY = new double[4];

        // Evaluate phase per layer
        for (int i = 0; i < 4; i++) {
            double[] ph = PHASES[i];
            amt[i]   = phaseExpandHoldRetract(pNorm, ph[0], ph[1], ph[2], ph[3]);
            holdW[i] = holdEmphasis(pNorm, ph[0], ph[1], ph[2]);
            stage[i] = phaseStage(pNorm, ph[0], ph[1], ph[2], ph[3]);
            active[i] = amt[i] > 0;
            centerY[i] = baseY + MAX_REACH[i] * amt[i];
        }

        Shape oldClip = g2d.getClip();

        // SAND-UNDER (deepest)
        if (active[3]) {
            if (isExpandingHalf && stage[3] == 1) {
                g2d.setClip(0, baseY - SEA_OVERLAP, panelWidth, panelHeight - baseY + SEA_OVERLAP);
            } else {
                g2d.setClip(0, baseY, panelWidth, panelHeight - baseY);
            }
            double scale = SAND_BASE_SCALE + PRESS_BOOST_SAND * holdW[3];
            g2d.setColor(SAND_UNDER_COLOR);
            fillBandPolygon(g2d, panelWidth, centerY[3] + 2.0, scale); // +2 like original
        }

        // WHITE FOAM
        if (active[2]) {
            if (isExpandingHalf && stage[2] == 1) {
                g2d.setClip(0, baseY - SEA_OVERLAP, panelWidth, panelHeight - baseY + SEA_OVERLAP);
            } else {
                g2d.setClip(0, baseY, panelWidth, panelHeight - baseY);
            }
            double scale = WHITE_BASE_SCALE + PRESS_BOOST_WHITE * holdW[2];
            g2d.setColor(WAVE_TOP_COLOR);
            fillBandPolygon(g2d, panelWidth, centerY[2], scale);
            fillEdgeLine(g2d, panelWidth, centerY[2], scale, 2, new Color(225, 216, 227, 200));
        }

        // MID
        if (active[1]) {
            g2d.setClip(0, baseY, panelWidth, panelHeight - baseY);
            double scale = MID_BASE_SCALE + PRESS_BOOST_MID * holdW[1];
            g2d.setColor(WAVE_MID_COLOR);
            fillBandPolygon(g2d, panelWidth, centerY[1], scale);
        }

        // DARK (top-most)
        if (active[0]) {
            g2d.setClip(0, baseY, panelWidth, panelHeight - baseY);
            double scale = DARK_BASE_SCALE + PRESS_BOOST_DARK * holdW[0];
            g2d.setColor(WAVE_BASE_COLOR);
            fillBandPolygon(g2d, panelWidth, centerY[0], scale);
        }

        g2d.setClip(oldClip);
    }
}
