import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Path2D;

public class Shoreline {

    // === Colors (keep your palette) ===
    private final Color WAVE_BASE_COLOR   = new Color(146, 128, 166);          // dark purple (top-most, retracts last)
    private final Color WAVE_MID_COLOR    = new Color(170, 145, 175, 200);     // mid (slightly transparent)
    private final Color WAVE_TOP_COLOR    = new Color(255, 255, 255, 220);     // white foam
    private final Color SAND_UNDER_COLOR  = new Color(188, 160, 120, 220);     // wet sand under foam

    // === Geometry / visibility ===
    private static final double BAND_THICK_BASE = 50.0; // thicker base for all bands
    private static final int    SHORE_LIFT_UP   = 30;  // <0 lifts shoreline upward in screen space (reduce sand usage)
    private static final int    SEA_OVERLAP     = 0;   // allow overlap into sea during EXPAND to look like it comes from sea

    // Per-layer base thickness scale (dark very wide to occlude while retracting)
    private static final double DARK_BASE_SCALE  = 1.80; // ↑ much wider
    private static final double MID_BASE_SCALE   = 1.10;
    private static final double WHITE_BASE_SCALE = 1.00;
    private static final double SAND_BASE_SCALE  = 1.60;

    // Extra thickness while holding / retracting
    private static final double PRESS_BOOST_WHITE  = 0.08;
    private static final double PRESS_BOOST_SAND   = 0.10;
    private static final double PRESS_BOOST_MID    = 0.06;
    private static final double PRESS_BOOST_DARK   = 0.06;
    private static final double RETRACT_BOOST_DARK = 0.75; //0.55

    // ---------- easing & phase (shape preserved while retracting) ----------
    private static double easeOutCubic(double x) { return 1.0 - Math.pow(1.0 - x, 3.0); }
    private static double easeInCubic(double x)  { return x * x * x; }

    /** piecewise: expand -> hold -> retract (times are fractions of cycle 0..1) */
    private static double phaseExpandHoldRetract(double p, double delay, double expand, double hold, double retract) {
        double t = p - delay;
        if (t < 0) return 0;
        if (t < expand) return easeOutCubic(t / expand);        // expand
        t -= expand;
        if (t < hold) return 1;                                 // hold
        t -= hold;
        if (t < retract) return 1 - easeInCubic(t / retract);   // retract (no curl)
        return 0;
    }

    /** 0 during non-hold, 1 during hold window (used to add thickness while holding) */
    private static double holdEmphasis(double p, double delay, double expand, double hold) {
        double t = p - delay;
        if (t < 0) return 0;
        if (t < expand) return 0;
        t -= expand;
        if (t < hold) return 1;
        return 0;
    }

    /** 0..1 only during retract portion (used to widen dark for occlusion) */
    private static double retractEmphasis(double p, double delay, double expand, double hold, double retract) {
        double t = p - delay;
        if (t < 0) return 0;
        if (t < expand + hold) return 0;
        t -= (expand + hold);
        if (t < retract) return easeInCubic(t / retract);
        return 0;
    }

    /** return stage: 0=pre, 1=expand, 2=hold, 3=retract, 4=post */
    private static int phaseStage(double p, double delay, double expand, double hold, double retract){
        double t = p - delay;
        if (t < 0) return 0;
        if (t < expand) return 1;
        t -= expand;
        if (t < hold) return 2;
        t -= hold;
        if (t < retract) return 3;
        return 4;
    }

    // --- internal state to make loops deterministic even with ping-pong progress ---
    private double lastProgress = Double.NaN;
    private boolean lastIncreasing = true; // assume first frame increasing

    /** Convert caller progress (which may ping-pong) into forward (outward) or backward (inward) phase. */
    private double normalizeProgressForward(double progress, boolean[] isIncreasingOut) {
        double p = progress;
        if (Double.isNaN(lastProgress)) {
            lastProgress = p;
            lastIncreasing = true;
        }
        boolean increasing = p >= lastProgress - 1e-9;
        // Remember direction for next frame
        lastProgress = p;
        isIncreasingOut[0] = increasing;
        // Forward phase uses p as-is; backward maps to 1-p so that phases run in reverse correctly
        return increasing ? clamp01(p) : clamp01(1.0 - p);
    }

    private static double clamp01(double v){ return (v < 0) ? 0 : (v > 1 ? 1 : v); }

    /**
     * Cadence requirement:
     *   Outward: dark -> mid -> white -> sand-under (sand extends the most; dark the least).
     *   Inward : white -> mid -> sand-under -> dark (dark retreats last).
     * Shape is stationary; only the extent (centerY) changes with progress.
     * During EXPAND we allow overlap into the sea; during HOLD/RETRACT we strictly clip to sand.
     */
    public void drawStaged(Graphics2D g2d, int panelWidth, int panelHeight, int shoreY,
                           double offset, double progress) {

        // Normalize progress based on direction (detect per-frame) for stable loop
        boolean[] incBox = new boolean[1];
        double pNorm = normalizeProgressForward(progress, incBox);
        boolean isExpandingHalf = incBox[0]; // true when caller is moving progress upward

        // Shifted shoreline base to reduce sand usage
        int baseY = shoreY + SHORE_LIFT_UP;

        // Max reach (px) from baseY: dark < mid < white < sand-under
        final double[] MAX_REACH = {
            23.0,  // dark (least)
            55.0,  // mid
            70.0,  // white
            80.0  // sand-under (most)
        };

        // Timing per layer: {delay, expand, hold, retract} (fractions of 0..1 cycle)
        // Outward order: dark(0) -> mid(1) -> white(2) -> sand(3)
        // Finish order (earliest -> latest): white -> mid -> sand -> dark
        final double[][] PHASES = {
            {0.00, 0.36, 0.28, 0.36},  // dark  ends at 1.00 (retracts last)
            {0.06, 0.32, 0.20, 0.24},  // mid   ends at ~0.82
            {0.14, 0.28, 0.14, 0.18},  // white ends at ~0.74 (retracts first)
            {0.22, 0.32, 0.22, 0.20}   // sand  ends at ~0.96 (after mid, before dark)
        };

        // Compute center line and emphasis weights for each layer
        double[] centerY = new double[4];
        double[] holdW   = new double[4];
        double[] retractW= new double[4];
        int[]    stage   = new int[4];
        boolean[] active = new boolean[4];
        for (int i = 0; i < 4; i++) {
            double amt = phaseExpandHoldRetract(pNorm, PHASES[i][0], PHASES[i][1], PHASES[i][2], PHASES[i][3]);
            if (amt > 0) {
                centerY[i] = baseY + MAX_REACH[i] * amt;
                holdW[i]   = holdEmphasis(pNorm, PHASES[i][0], PHASES[i][1], PHASES[i][2]);
                retractW[i]= retractEmphasis(pNorm, PHASES[i][0], PHASES[i][1], PHASES[i][2], PHASES[i][3]);
                stage[i]   = phaseStage(pNorm, PHASES[i][0], PHASES[i][1], PHASES[i][2], PHASES[i][3]);
                active[i]  = true;
            } else {
                active[i] = false;
                stage[i]  = 0;
            }
        }

        // Clip config
        Shape oldClip = g2d.getClip();

        // Paint order (bottom -> top): sand-under -> white -> mid -> dark
        if (active[3]) {
            if (isExpandingHalf && stage[3] == 1) g2d.setClip(0, baseY - SEA_OVERLAP, panelWidth, panelHeight - baseY + SEA_OVERLAP);
            else                                  g2d.setClip(0, baseY,               panelWidth, panelHeight - baseY);
            double scale = SAND_BASE_SCALE + PRESS_BOOST_SAND * holdW[3];
            drawBandWithScale(g2d, panelWidth, centerY[3] + 2.0, scale, SAND_UNDER_COLOR);
        }

        if (active[2]) {
            if (isExpandingHalf && stage[2] == 1) g2d.setClip(0, baseY - SEA_OVERLAP, panelWidth, panelHeight - baseY + SEA_OVERLAP);
            else                                  g2d.setClip(0, baseY,               panelWidth, panelHeight - baseY);
            double scale = WHITE_BASE_SCALE + PRESS_BOOST_WHITE * holdW[2];
            drawBandWithScale(g2d, panelWidth, centerY[2], scale, WAVE_TOP_COLOR);
            Path2D edge = buildBottomEdge(panelWidth, centerY[2], scale);
            g2d.setStroke(new BasicStroke(2f));
            g2d.setColor(new Color(255, 255, 255, 200));
            g2d.draw(edge);
        }

        if (active[1]) {
            g2d.setClip(0, baseY, panelWidth, panelHeight - baseY);
            double scale = MID_BASE_SCALE + PRESS_BOOST_MID * holdW[1];
            drawBandWithScale(g2d, panelWidth, centerY[1], scale, WAVE_MID_COLOR);
        }

        if (active[0]) {
            g2d.setClip(0, baseY, panelWidth, panelHeight - baseY);
            double scale = DARK_BASE_SCALE + PRESS_BOOST_DARK * holdW[0] + RETRACT_BOOST_DARK * retractW[0];
            drawBandWithScale(g2d, panelWidth, centerY[0], scale, WAVE_BASE_COLOR);
        }

        // Restore clip
        g2d.setClip(oldClip);
    }

    // ---- band drawing helpers ----

    private void drawBandWithScale(Graphics2D g2d, int panelWidth, double centerY, double thicknessScale, Color color) {
        Path2D band = new Path2D.Double();

        // Straight top
        double topY = centerY - (BAND_THICK_BASE * thicknessScale) / 2.0;
        band.moveTo(0, topY);
        band.lineTo(panelWidth, topY);

        // Bottom edge with static multi-frequency profile (no time-based movement)
        for (int x = panelWidth; x >= 0; x--) {
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
            double bottomY = centerY + thickness / 2.0 + profile * 0.9;
            band.lineTo(x, bottomY);
        }

        band.closePath();
        g2d.setColor(color);
        g2d.fill(band);
    }

    private Path2D buildBottomEdge(int panelWidth, double centerY, double thicknessScale) {
        Path2D edge = new Path2D.Double();
        boolean moved = false;
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

            if (!moved) {
                edge.moveTo(x, y);
                moved = true;
            } else {
                edge.lineTo(x, y);
            }
        }
        return edge;
    }
}
