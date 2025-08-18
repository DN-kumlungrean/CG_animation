import java.awt.*;
import java.util.Arrays;

public class Sand {
    private static final int PANEL_HEIGHT = 600;
    private static final int SAND_TOP_Y   = 255;

    // Sand base gradient
    private static final Color SAND_TOP_COLOR    = new Color(237, 210, 175);
    private static final Color SAND_BOTTOM_COLOR = new Color(216, 184, 147);

    private static void fillRectPolygon(Graphics2D g2d, int x, int y, int w, int h) {
        int[] xs = { x, x + w, x + w, x };
        int[] ys = { y, y,     y + h, y + h };
        g2d.fillPolygon(xs, ys, 4);
    }

    private static void fillCircleMidpoint(Graphics2D g2d, int cx, int cy, int r) {
        if (r <= 0) return;
        final int size = 2 * r + 1;
        int[] minX = new int[size];
        int[] maxX = new int[size];
        Arrays.fill(minX, Integer.MAX_VALUE);
        Arrays.fill(maxX, Integer.MIN_VALUE);

        int x = r;
        int y = 0;
        int d = 1 - r;
        while (x >= y) {
            // accumulate min/max per scanline
            accumulate(minX, maxX, r, cx + x, cy + y, cx, cy);
            accumulate(minX, maxX, r, cx - x, cy + y, cx, cy);
            accumulate(minX, maxX, r, cx + x, cy - y, cx, cy);
            accumulate(minX, maxX, r, cx - x, cy - y, cx, cy);

            accumulate(minX, maxX, r, cx + y, cy + x, cx, cy);
            accumulate(minX, maxX, r, cx - y, cy + x, cx, cy);
            accumulate(minX, maxX, r, cx + y, cy - x, cx, cy);
            accumulate(minX, maxX, r, cx - y, cy - x, cx, cy);

            y++;
            if (d < 0) {
                d += 2 * y + 1;
            } else {
                x--;
                d += 2 * (y - x) + 1;
            }
        }
        // draw spans
        for (int iy = -r; iy <= r; iy++) {
            int idx = iy + r;
            if (minX[idx] <= maxX[idx]) {
                int yPix = cy + iy;
                int x0 = minX[idx];
                int w  = maxX[idx] - minX[idx] + 1;
                fillRectPolygon(g2d, x0, yPix, w, 1);
            }
        }
    }
    private static void accumulate(int[] minX, int[] maxX, int r, int px, int py, int cx, int cy) {
        int relY = py - cy;
        int idx = relY + r;
        if (idx < 0 || idx >= minX.length) return;
        if (px < minX[idx]) minX[idx] = px;
        if (px > maxX[idx]) maxX[idx] = px;
    }

    // Linear color interpolation for sampling base sand tone at y
    private static Color lerpColor(Color a, Color b, float u) {
        u = Math.max(0f, Math.min(1f, u));
        int r = (int)(a.getRed()   + (b.getRed()   - a.getRed())   * u);
        int g = (int)(a.getGreen() + (b.getGreen() - a.getGreen()) * u);
        int bl= (int)(a.getBlue()  + (b.getBlue()  - a.getBlue())  * u);
        return new Color(r, g, bl);
    }

    // Simple deterministic hash
    private static int hash32(int a) {
        a ^= (a << 13);
        a ^= (a >>> 17);
        a ^= (a << 5);
        return a;
    }

    private void drawSparseGrainDots(Graphics2D g2d, int panelWidth) {
        final int cellX = 14;     // horizontal spacing
        final int cellY = 12;     // vertical spacing
        final int y0 = SAND_TOP_Y;
        final int y1 = PANEL_HEIGHT;
        int depthH = Math.max(1, y1 - y0);

        for (int y = y0 + cellY/2; y < y1; y += cellY) {
            for (int x = cellX/2; x < panelWidth; x += cellX) {
                int h = hash32(x * 73856093 ^ y * 19349663);
                float depth = (y - y0) / (float) depthH; 
                int base = 18;             
                int extra = (int)(depth * 10); 
                int thresh = base + extra;  
                if ((h & 255) >= thresh) continue;

                // Dot radius
                int r = 1;
                if (depth > 0.5 && ((h >>> 8) & 7) == 0) r = 2;

                // Slight jitter inside the cell
                int jx = ((h >>> 11) & 3) - 1; 
                int jy = ((h >>> 13) & 3) - 1;

                int cx = Math.max(1, Math.min(panelWidth - 2, x + jx));
                int cy = Math.max(y0 + 1, Math.min(y1 - 2, y + jy));

                // Sample local sand color and darken slightly 
                Color baseCol = lerpColor(SAND_TOP_COLOR, SAND_BOTTOM_COLOR, depth);
                int dr = Math.max(0, baseCol.getRed()   - 30 - ((h >>> 16) & 3));
                int dg = Math.max(0, baseCol.getGreen() - 30 - ((h >>> 18) & 3));
                int db = Math.max(0, baseCol.getBlue()  - 26 - ((h >>> 20) & 3));
                int alpha = 150 + ((h >>> 22) & 15); 
                g2d.setColor(new Color(dr, dg, db, alpha));

                fillCircleMidpoint(g2d, cx, cy, r);
            }
        }
    }

    public void draw(Graphics2D g2d, int panelWidth, double t) {
        // Sand gradient
        int H = PANEL_HEIGHT - SAND_TOP_Y;
        int layers = 24;
        for (int i = 0; i < layers; i++) {
            float u = (float)i / Math.max(1, layers - 1);
            int r = (int)(SAND_TOP_COLOR.getRed()   + (SAND_BOTTOM_COLOR.getRed()   - SAND_TOP_COLOR.getRed())   * u);
            int g = (int)(SAND_TOP_COLOR.getGreen() + (SAND_BOTTOM_COLOR.getGreen() - SAND_TOP_COLOR.getGreen()) * u);
            int b = (int)(SAND_TOP_COLOR.getBlue()  + (SAND_BOTTOM_COLOR.getBlue()  - SAND_TOP_COLOR.getBlue())  * u);
            g2d.setColor(new Color(r, g, b));
            int y = SAND_TOP_Y + (i * H) / layers;
            int h = (i == layers - 1) ? (PANEL_HEIGHT - y) : ((i + 1) * H) / layers - (i * H) / layers;
            fillRectPolygon(g2d, 0, y, panelWidth, h);
        }

        drawSparseGrainDots(g2d, panelWidth);
    }
}
