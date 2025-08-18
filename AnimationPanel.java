import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AnimationPanel extends JPanel {

    // ฟังก์ชันวาด pixel
    private void putPixel(Graphics2D g2d, int x, int y) {
        g2d.drawLine(x, y, x, y); // pixel = line จุดเดียว
    }

    // Bresenham's Line Algorithm
    private void drawLineBresenham(Graphics2D g2d, int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;
        int err = dx - dy;

        while (true) {
            putPixel(g2d, x1, y1);
            if (x1 == x2 && y1 == y2) break;
            int e2 = 2 * err;
            if (e2 > -dy) { err -= dy; x1 += sx; }
            if (e2 < dx) { err += dx; y1 += sy; }
        }
    }

    // Midpoint Circle Algorithm
    private void drawCircleMidpoint(Graphics2D g2d, int xc, int yc, int r) {
        int x = 0, y = r;
        int d = 1 - r;

        while (x <= y) {
            putPixel(g2d, xc + x, yc + y);
            putPixel(g2d, xc - x, yc + y);
            putPixel(g2d, xc + x, yc - y);
            putPixel(g2d, xc - x, yc - y);
            putPixel(g2d, xc + y, yc + x);
            putPixel(g2d, xc - y, yc + x);
            putPixel(g2d, xc + y, yc - x);
            putPixel(g2d, xc - y, yc - x);

            x++;
            if (d < 0) {
                d += 2 * x + 1;
            } else {
                y--;
                d += 2 * (x - y) + 1;
            }
        }
    }

    // Quadratic Bezier Curve
    private void drawBezierQuadratic(Graphics2D g2d, int[] x, int[] y) {
        // x[0],y[0] = start | x[1],y[1] = control | x[2],y[2] = end
        for (double t = 0; t <= 1.0; t += 0.001) {
            double xt = (1 - t) * (1 - t) * x[0] + 2 * (1 - t) * t * x[1] + t * t * x[2];
            double yt = (1 - t) * (1 - t) * y[0] + 2 * (1 - t) * t * y[1] + t * t * y[2];
            putPixel(g2d, (int) xt, (int) yt);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // หนา 3 px
        g2d.setStroke(new BasicStroke(3));

        // Anti-aliasing off (อาจารย์อยากเห็น pixel)
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);

        // ---------- เส้นตรง (Bresenham) ----------
        g2d.setColor(Color.RED);
        drawLineBresenham(g2d, 50, 50, 200, 150);

        // ---------- วงกลม (Midpoint Circle) ----------
        g2d.setColor(Color.BLUE);
        drawCircleMidpoint(g2d, 300, 150, 60);

        // ---------- เส้นโค้ง (Bezier) ----------
        g2d.setColor(Color.GREEN);
        int[] bx = {100, 180, 260};
        int[] by = {250, 100, 250};
        drawBezierQuadratic(g2d, bx, by);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Assignment 1 Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.add(new AnimationPanel());
        frame.setVisible(true);
    }
}
