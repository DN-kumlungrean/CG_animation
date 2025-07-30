import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;

public class DrawingPanel extends JPanel implements ActionListener {
    private final int PANEL_WIDTH = 600, PANEL_HEIGHT = 600;
    private int sunY = 100;
    private double waveOffset = 0;
    private double characterX = -100;
    private final Timer timer;

    private final Sky sky = new Sky();
    private final Sea sea = new Sea();
    private final Sand sand = new Sand();
    private final Clouds clouds = new Clouds();
    private final Characters characters = new Characters();

    public DrawingPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.CYAN);
        timer = new Timer(50, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        sky.draw(g2d, PANEL_WIDTH, sunY);
        sea.draw(g2d, PANEL_WIDTH, waveOffset);
        sand.draw(g2d, PANEL_WIDTH, characterX);
        clouds.draw(g2d, PANEL_WIDTH);
        characters.draw(g2d, characterX);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (sunY < 300) sunY++;
        waveOffset -= 1.5;
        if (waveOffset < -50) waveOffset = 0;
        characterX += 1;
        if (characterX > PANEL_WIDTH + 100) characterX = -100;
        repaint();
    }
}
