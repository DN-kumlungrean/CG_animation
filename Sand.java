import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Sand {
    private void fillRectPolygon(Graphics2D g2d, int x, int y, int w, int h) {
        int[] xs = new int[] { x, x + w, x + w, x };
        int[] ys = new int[] { y, y,     y + h, y + h };
        g2d.fillPolygon(xs, ys, 4);
    }

    private void fillEllipsePolygon(Graphics2D g2d, double x, double y, double w, double h) {
        final int SEG = 36; // enough for smooth small footprints
        double cx = x + w / 2.0;
        double cy = y + h / 2.0;
        double rx = w / 2.0;
        double ry = h / 2.0;

        int[] px = new int[SEG];
        int[] py = new int[SEG];

        for (int i = 0; i < SEG; i++) {
            double theta = (2.0 * Math.PI * i) / SEG;
            double dx = rx * Math.cos(theta);
            double dy = ry * Math.sin(theta);
            px[i] = (int) Math.round(cx + dx);
            py[i] = (int) Math.round(cy + dy);
        }
        g2d.fillPolygon(px, py, SEG);
    }

    public void draw(Graphics2D g2d, int panelWidth, double characterX) {
        g2d.setColor(new Color(244, 214, 181));
        fillRectPolygon(g2d, 0, 290, panelWidth, 310);

        // Footprints
        g2d.setColor(new Color(218, 184, 143));
        for (int i = 0; i < 5; i++) {
            double footX = characterX - 50 - (i * 60);
            if (footX > 0) {
                // Main oval
                fillEllipsePolygon(g2d, footX, 470, 8, 10);
                // Three small ovals
                fillEllipsePolygon(g2d, footX - 5, 465, 4, 4);
                fillEllipsePolygon(g2d, footX,     465, 4, 4);
                fillEllipsePolygon(g2d, footX + 5, 465, 4, 4);
            }
        }
    }
}
