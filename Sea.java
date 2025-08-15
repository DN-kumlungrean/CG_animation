import java.awt.*;
import java.awt.geom.QuadCurve2D;

public class Sea {
    public void draw(Graphics2D g2d, int panelWidth, double waveOffset) {
        g2d.setColor(new Color(129, 178, 202));
        g2d.fillRect(0, 200, panelWidth, 150);
        g2d.setColor(new Color(236, 242, 245, 200));
        g2d.setStroke(new BasicStroke(2));
        for (int i = 0; i < 15; i++) {
            double x = (i * 50) + waveOffset - 50;
            double y = 220; 
            QuadCurve2D wave = new QuadCurve2D.Double(x, y, x + 25, y - 10, x + 50, y);
            g2d.draw(wave);
        }
    }
}