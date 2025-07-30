import java.awt.*;

public class Sun {
    public static void drawMidpointCircle(Graphics2D g, int cx, int cy, int r) {
        int x = r, y = 0, p = 1 - r;
        Paint originalPaint = g.getPaint();
        g.setPaint(new GradientPaint(cx, cy - r, new Color(253, 221, 99),
                                     cx, cy + r, new Color(243, 156, 18)));

        plotCircle(g, cx, cy, x, y);
        while (x > y) {
            y++;
            if (p <= 0) p += 2 * y + 1;
            else { x--; p += 2 * y - 2 * x + 1; }
            plotCircle(g, cx, cy, x, y);
        }

        g.setPaint(originalPaint);
    }

    private static void plotCircle(Graphics2D g, int cx, int cy, int x, int y) {
        g.drawLine(cx - x, cy + y, cx + x, cy + y);
        g.drawLine(cx - x, cy - y, cx + x, cy - y);
        g.drawLine(cx - y, cy + x, cx + y, cy + x);
        g.drawLine(cx - y, cy - x, cx + y, cy - x);
    }
}
