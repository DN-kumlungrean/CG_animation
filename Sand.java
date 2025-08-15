import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Sand {
    public void draw(Graphics2D g2d, int panelWidth, double characterX) {
        g2d.setColor(new Color(244, 214, 181));
        g2d.fillRect(0, 290, panelWidth, 310);
        g2d.setColor(new Color(218, 184, 143));
        for (int i = 0; i < 5; i++) {
            double footX = characterX - 50 - (i * 60);
            if (footX > 0) {
                g2d.fill(new Ellipse2D.Double(footX, 470, 8, 10));
                g2d.fill(new Ellipse2D.Double(footX - 5, 465, 4, 4));
                g2d.fill(new Ellipse2D.Double(footX, 465, 4, 4));
                g2d.fill(new Ellipse2D.Double(footX + 5, 465, 4, 4));
            }
        }
    }
}