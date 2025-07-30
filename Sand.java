import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;

public class Sand {
    public void draw(Graphics2D g2d, int panelWidth, double characterX) {
        g2d.setColor(new Color(244, 214, 181));
        g2d.fillRect(0, 420, panelWidth, 180);

        g2d.setColor(new Color(218, 184, 143));
        for (int i = 0; i < 5; i++) {
            double footX = characterX - 50 - (i * 60);
            if (footX > 0) {
                g2d.fill(new Ellipse2D.Double(footX, 500, 8, 10));
                g2d.fill(new Ellipse2D.Double(footX - 5, 495, 4, 4));
                g2d.fill(new Ellipse2D.Double(footX, 495, 4, 4));
                g2d.fill(new Ellipse2D.Double(footX + 5, 495, 4, 4));
            }
        }
    }
}
