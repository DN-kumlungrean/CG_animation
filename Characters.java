import java.awt.*;

public class Characters {
    public void draw(Graphics2D g2d, double characterX) {
        Dog.draw(g2d, characterX, 480, new Color(205, 133, 63), true);
        Dog.draw(g2d, characterX + 60, 480, Color.WHITE, false);

        // Samoyed.draw(g2d, characterX, 480, new Color(245, 205, 170));
        // Samoyed.draw(g2d, characterX + 60, 480);
    }
}
