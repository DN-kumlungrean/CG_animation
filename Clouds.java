import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;

public class Clouds {
    public void draw(Graphics2D g2d, int panelWidth) {
        g2d.setColor(new Color(255, 245, 200, 200));
        GeneralPath cloudMass = new GeneralPath();
        cloudMass.moveTo(0, 250);
        cloudMass.quadTo(80, 150, 180, 230);
        cloudMass.quadTo(250, 120, 350, 220);
        cloudMass.quadTo(450, 160, 550, 235);
        cloudMass.quadTo(600, 180, panelWidth, 250);
        cloudMass.closePath();
        g2d.fill(cloudMass);
    }
}
