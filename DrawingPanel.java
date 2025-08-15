import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawingPanel extends JPanel implements ActionListener {
    private final int PANEL_WIDTH = 600, PANEL_HEIGHT = 600; 
    
    private static final double SUN_START_Y = 100.0; 
    private static final double SUN_END_Y = 200.0;  
    private static final int ANIMATION_DURATION_MS = 5000; 
    private static final int TIMER_DELAY_MS = 30; 
    private static final double SUN_Y_INCREMENT = 
        (SUN_END_Y - SUN_START_Y) / (ANIMATION_DURATION_MS / (double)TIMER_DELAY_MS);

    private double sunY = SUN_START_Y; 
    private double waveOffset = 0;
    private double characterX = -100;
    private final Timer timer;

    private int characterFrame = 1;     
    private int frameUpdateCounter = 0;

    private final Sky sky = new Sky();
    private final Sea sea = new Sea();
    private final Sand sand = new Sand();
    private final Clouds clouds = new Clouds();
    private final Characters characters = new Characters();

    private final Test_UU1 test_UU1 = new Test_UU1();

    public DrawingPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.CYAN);
        timer = new Timer(TIMER_DELAY_MS, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        sky.draw(g2d, PANEL_WIDTH, (int) Math.round(sunY));       
        sea.draw(g2d, PANEL_WIDTH, waveOffset);
        sand.draw(g2d, PANEL_WIDTH, characterX);
        clouds.draw(g2d, PANEL_WIDTH);
        // characters.draw(g2d, characterX, 35, characterFrame);

        test_UU1.draw(g2d, characterX, sunY);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (sunY < SUN_END_Y) {
            sunY += SUN_Y_INCREMENT;
        } else {
            sunY = SUN_END_Y; 
        }

        waveOffset -= 1.5;
        if (waveOffset < -50) waveOffset = 0;
        characterX += 2;
        if (characterX > PANEL_WIDTH + 100) characterX = -100;
        
        frameUpdateCounter++;
        if (frameUpdateCounter % 4 == 0) { 
            characterFrame++;
            if (characterFrame > 8) {
                characterFrame = 1; 
            }
        }

        repaint();
    }
}