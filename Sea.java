import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;

public class Sea {
    public void draw(Graphics2D g2d, int panelWidth, double waveOffset) {
        g2d.setColor(new Color(129, 178, 202));
        g2d.fillRect(0, 250, panelWidth, 170);

        g2d.setColor(new Color(236, 242, 245, 200));
        g2d.setStroke(new BasicStroke(2));
        for (int i = 0; i < 15; i++) {
            double x = (i * 50) + waveOffset - 50;
            double y = 260;
            QuadCurve2D wave = new QuadCurve2D.Double(x, y, x + 25, y - 10, x + 50, y);
            g2d.draw(wave);
        }
    }
}
