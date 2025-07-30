import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;

public class Characters {
    public void draw(Graphics2D g2d, double characterX) {
        Dog.draw(g2d, characterX, 480, new Color(205, 133, 63), true);
        Dog.draw(g2d, characterX + 60, 480, Color.WHITE, false);
    }
}
