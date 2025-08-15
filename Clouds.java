import java.awt.*;
import java.awt.geom.GeneralPath;

public class Clouds {
    public void draw(Graphics2D g2d, int panelWidth) {
        g2d.setColor(new Color(255, 245, 200, 200));
        GeneralPath cloudMass = new GeneralPath();
        cloudMass.moveTo(0, 200);
        cloudMass.quadTo(80, 100, 180, 180);
        cloudMass.quadTo(250, 70, 350, 170);
        cloudMass.quadTo(450, 110, 550, 185);
        cloudMass.quadTo(600, 130, panelWidth, 200);
        cloudMass.closePath();
        g2d.fill(cloudMass);
    }
}