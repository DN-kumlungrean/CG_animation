import java.awt.*;

public class Sun {

    public static void drawMidpointCircle(Graphics2D g, int cx, int cy, int r) {
        Paint originalPaint = g.getPaint();
        g.setPaint(new GradientPaint(cx, cy - r, new Color(253, 221, 99),
                                     cx, cy + r, new Color(243, 156, 18)));

        // Build scanline extents using Midpoint Circle
        int top = cy - r;
        int bottom = cy + r;
        int height = bottom - top + 1;
        int[] left = new int[height];
        int[] right = new int[height];
        final int INF = 1_000_000_000;
        for (int i = 0; i < height; i++) { left[i] = INF; right[i] = -INF; }

        int x = r;
        int y = 0;
        int p = 1 - r;

        // plot initial octants
        markCircleExtents(left, right, cx, cy, x, y, top);

        while (x > y) {
            y++;
            if (p <= 0) {
                p += 2*y + 1;
            } else {
                x--;
                p += 2*y - 2*x + 1;
            }
            markCircleExtents(left, right, cx, cy, x, y, top);
        }

        // Fill each scanline as a polygon (rectangle) using fillPolygon
        for (int sy = top; sy <= bottom; sy++) {
            int idx = sy - top;
            int L = left[idx];
            int R = right[idx];
            if (L <= R) {
                // build rectangle polygon [L,sy] -> [R,sy] -> [R,sy+1] -> [L,sy+1]
                // Note: last scanline uses sy+1 = bottom+1; to avoid overflow we clamp
                int sy2 = sy + 1;
                int[] xs = new int[] { L, R, R, L };
                int[] ys = new int[] { sy, sy, sy2, sy2 };
                g.fillPolygon(xs, ys, 4);
            }
        }

        g.setPaint(originalPaint);
    }

    // Record symmetric points into left/right extents for the scanlines touched.
    private static void markCircleExtents(int[] left, int[] right, int cx, int cy, int x, int y, int top) {
        plotExtent(left, right, cx + x, cy + y, top);
        plotExtent(left, right, cx - x, cy + y, top);
        plotExtent(left, right, cx + x, cy - y, top);
        plotExtent(left, right, cx - x, cy - y, top);
        plotExtent(left, right, cx + y, cy + x, top);
        plotExtent(left, right, cx - y, cy + x, top);
        plotExtent(left, right, cx + y, cy - x, top);
        plotExtent(left, right, cx - y, cy - x, top);
    }

    private static void plotExtent(int[] left, int[] right, int px, int py, int top) {
        int idx = py - top;
        if (idx < 0 || idx >= left.length) return;
        if (px < left[idx]) left[idx] = px;
        if (px > right[idx]) right[idx] = px;
    }
}
