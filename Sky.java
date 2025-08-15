import java.awt.*;
import java.awt.geom.Line2D;

public class Sky {
    public void draw(Graphics2D g2d, int panelWidth, int sunY) {
        GradientPaint skyGradient = new GradientPaint(0, 0, new Color(255, 179, 186),
                                                      0, 200, new Color(255, 223, 186));
        g2d.setPaint(skyGradient);
        g2d.fillRect(0, 0, panelWidth, 200);
        g2d.setColor(new Color(255, 229, 153));
        Sun.drawMidpointCircle(g2d, panelWidth / 2, sunY, 80);
        g2d.setColor(new Color(255, 245, 200, 150));
        for (int i = 0; i < 10; i++) {
            int reflectionY = 205 + (sunY / 10) + (i * 5); 
            if (reflectionY < 450)
                g2d.draw(new Line2D.Double(280 + i, reflectionY, 320 - i, reflectionY));
        }
    }
}