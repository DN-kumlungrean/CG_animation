import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;

public class Dog {
    public static void draw(Graphics2D g2d, double x, double y, Color bodyColor, boolean hasHat) {
        g2d.setColor(bodyColor);
        g2d.fill(new Ellipse2D.Double(x, y, 50, 60));
        g2d.fill(new Ellipse2D.Double(x - 10, y - 30, 45, 45));
        g2d.fill(new Ellipse2D.Double(x - 20, y - 15, 20, 20));
        g2d.fill(new Ellipse2D.Double(x + 25, y - 15, 20, 20));

        g2d.setColor(Color.BLACK);
        g2d.fill(new Ellipse2D.Double(x + 5, y - 15, 5, 5));
        g2d.fill(new Ellipse2D.Double(x + 20, y - 15, 5, 5));
        g2d.draw(new QuadCurve2D.Double(x + 10, y - 5, x + 15, y, x + 20, y - 5));

        g2d.setColor(new Color(0, 49, 83));
        g2d.fillRect((int) x, (int) y + 10, 50, 20);
        g2d.fillPolygon(new int[]{(int)x+10, (int)x+25, (int)x+40}, new int[]{(int)y, (int)y+15, (int)y}, 3);

        if (hasHat) {
            g2d.setColor(new Color(0, 49, 83));
            g2d.fill(new Ellipse2D.Double(x - 5, y - 40, 30, 15));
            g2d.setColor(Color.RED);
            g2d.fill(new Ellipse2D.Double(x + 55, y + 30, 20, 20));
        }
    }
}
