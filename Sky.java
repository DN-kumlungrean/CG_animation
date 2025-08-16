import java.awt.*;

public class Sky {
    /** thickness in pixels for water reflections */
    private static final int REFLECTION_THICKNESS = 1;

    private void fillRectPolygon(Graphics2D g2d, int x, int y, int w, int h) {
        int[] xs = new int[] { x, x + w, x + w, x };
        int[] ys = new int[] { y, y,     y + h, y + h };
        g2d.fillPolygon(xs, ys, 4);
    }

    private void fillHSegment(Graphics2D g2d, int x1, int y, int x2, int thickness) {
        if (x2 < x1) { int t = x1; x1 = x2; x2 = t; }
        int[] xs = new int[] { x1, x2, x2, x1 };
        int[] ys = new int[] { y,  y,  y + thickness, y + thickness };
        g2d.fillPolygon(xs, ys, 4);
    }

    public void draw(Graphics2D g2d, int panelWidth, int sunY) {
        GradientPaint skyGradient = new GradientPaint(0, 0, new Color(255, 179, 186),
                                                      0, 200, new Color(255, 223, 186));
        Paint prev = g2d.getPaint();
        g2d.setPaint(skyGradient);
        fillRectPolygon(g2d, 0, 0, panelWidth, 200);
        g2d.setPaint(prev);

        g2d.setColor(new Color(255, 229, 153));
        Sun.drawMidpointCircle(g2d, panelWidth / 2, sunY, 120);

        g2d.setColor(new Color(255, 245, 200, 150));
        for (int i = 0; i < 10; i++) {
            int reflectionY = 205 + (sunY / 10) + (i * 5);
            if (reflectionY < 450) {
                int x1 = 280 + i;
                int x2 = 320 - i;
                fillHSegment(g2d, x1, reflectionY, x2, REFLECTION_THICKNESS);
            }
        }
    }
}
