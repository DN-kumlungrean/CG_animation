import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawingPanel1 extends JPanel implements ActionListener {
    private final int PANEL_WIDTH = 600, PANEL_HEIGHT = 600; 
    
    // Sun animation
    private static final double SUN_START_Y = 100.0; 
    private static final double SUN_END_Y = 200.0;  
    private static final int ANIMATION_DURATION_MS = 5000; 
    private static final int TIMER_DELAY_MS = 30;  
    private static final double SUN_Y_INCREMENT = 
        (SUN_END_Y - SUN_START_Y) / (ANIMATION_DURATION_MS / (double)TIMER_DELAY_MS);
    private double sunY = SUN_START_Y;

    // Wave wash ping-pong timing
    private static final int WAVE_IN_MS  = 8000; // reach in
    private static final int WAVE_OUT_MS = 6000; // retract

    // Footprint
    private double waveOffset = 0;
    private double characterX = -100;

    // Shoreline animation
    private double shorelineOffset = 0.0; // ควบคุม "รูปร่าง" คลื่น
    private double waveWashProgress = 0.0; // ควบคุม "ระยะซัดฝั่ง"
    private final long waveLoopStartNano = System.nanoTime();
    
    private final Timer timer;
    private final Sky sky = new Sky();
    private final Sea sea = new Sea();
    private final Sand sand = new Sand();
    private final Clouds clouds = new Clouds();
    private final Shoreline shoreline = new Shoreline();
    private final Shadow shadow = new Shadow();
    private final Test_UU2 test_UU2 = new Test_UU2();

    public DrawingPanel1() {
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

        // Draw (Sort by order)
        sky.draw(g2d, PANEL_WIDTH, (int) Math.round(sunY));
        clouds.draw(g2d, PANEL_WIDTH);
        sand.draw(g2d, PANEL_WIDTH, characterX);       
        sea.draw(g2d, PANEL_WIDTH, waveOffset, (int) Math.round(sunY));
        shoreline.drawStaged(g2d, PANEL_WIDTH, PANEL_HEIGHT, sea.getShoreY(),
                     shorelineOffset, waveWashProgress);

        shadow.drawMidpointEllipse(g2d, (int)characterX + 100, 480, 80, 20);
        test_UU2.draw(g2d, characterX, 300);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (sunY < SUN_END_Y) {
            sunY += SUN_Y_INCREMENT;
        } else {
            sunY = SUN_END_Y; 
        }

        // Footprints
        waveOffset -= 1.5;
        if (waveOffset < -50) waveOffset = 0;
        characterX += 2;
        if (characterX > PANEL_WIDTH) characterX = -100;

        // Logic Shoreline 
        shorelineOffset += 1; 
        {
            // Time-based wave progress: 0→1 in WAVE_IN_MS, then 1→0 in WAVE_OUT_MS (seamless)
            long now = System.nanoTime();
            long periodNanos = (long)(WAVE_IN_MS + WAVE_OUT_MS) * 1_000_000L;
            double u = ((now - waveLoopStartNano) % periodNanos) / (double) periodNanos; // [0,1)
            double inFrac = WAVE_IN_MS / (double)(WAVE_IN_MS + WAVE_OUT_MS);
            if (u < inFrac) {
                double s = u / inFrac;      // [0,1] during "in"
                waveWashProgress = s;
            } else {
                double v = (u - inFrac) / (1.0 - inFrac); // [0,1] during "out"
                waveWashProgress = 1.0 - v;
            }
        }

        repaint();
    }
}