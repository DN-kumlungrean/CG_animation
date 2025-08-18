import java.awt.*;

public class Shadow {

    public static void drawMidpointEllipse(Graphics2D g, int cx, int cy, int a, int b) {
        Paint originalPaint = g.getPaint();

        // ใช้ gradient ดำจางๆ เป็นเงา
        g.setPaint(new GradientPaint(cx, cy - b, new Color(0, 0, 0, 50),
                                     cx, cy + b, new Color(0, 0, 0,50)));

        int top = cy - b;
        int bottom = cy + b;
        int height = bottom - top + 1;
        int[] left = new int[height];
        int[] right = new int[height];
        final int INF = 1_000_000_000;
        for (int i = 0; i < height; i++) { left[i] = INF; right[i] = -INF; }

        // Midpoint ellipse algorithm
        int x = 0;
        int y = b;

        // Decision parameters
        double a2 = a * a;
        double b2 = b * b;
        double d1 = b2 - (a2 * b) + (0.25 * a2);

        // Region 1
        while (b2 * x <= a2 * y) {
            markEllipseExtents(left, right, cx, cy, x, y, top);
            if (d1 < 0) {
                d1 += b2 * (2 * x + 3);
            } else {
                d1 += b2 * (2 * x + 3) + a2 * (-2 * y + 2);
                y--;
            }
            x++;
        }

        // Region 2
        double d2 = (b2) * (x + 0.5) * (x + 0.5) + (a2) * (y - 1) * (y - 1) - (a2 * b2);
        while (y >= 0) {
            markEllipseExtents(left, right, cx, cy, x, y, top);
            if (d2 > 0) {
                d2 += a2 * (-2 * y + 3);
            } else {
                d2 += b2 * (2 * x + 2) + a2 * (-2 * y + 3);
                x++;
            }
            y--;
        }

        // Fill scanlines
        for (int sy = top; sy <= bottom; sy++) {
            int idx = sy - top;
            int L = left[idx];
            int R = right[idx];
            if (L <= R) {
                int sy2 = sy + 1;
                int[] xs = new int[] { L, R, R, L };
                int[] ys = new int[] { sy, sy, sy2, sy2 };
                g.fillPolygon(xs, ys, 4);
            }
        }

        g.setPaint(originalPaint);
    }

    // mark symmetric ellipse points
    private static void markEllipseExtents(int[] left, int[] right, int cx, int cy, int x, int y, int top) {
        plotExtent(left, right, cx + x, cy + y, top);
        plotExtent(left, right, cx - x, cy + y, top);
        plotExtent(left, right, cx + x, cy - y, top);
        plotExtent(left, right, cx - x, cy - y, top);
    }

    private static void plotExtent(int[] left, int[] right, int px, int py, int top) {
        int idx = py - top;
        if (idx < 0 || idx >= left.length) return;
        if (px < left[idx]) left[idx] = px;
        if (px > right[idx]) right[idx] = px;
    }
}
