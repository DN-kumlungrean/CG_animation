import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawingPanel1 extends JPanel implements ActionListener {
    private final int PANEL_WIDTH = 600, PANEL_HEIGHT = 600; 
    
    // Sun animation
    private static final double SUN_START_Y = 100.0; 
    private static final double SUN_END_Y = 200.0;  
    private static final int ANIMATION_DURATION_MS = 3000; 
    private static final int TIMER_DELAY_MS = 30;  
    private static final double SUN_Y_INCREMENT = 
        (SUN_END_Y - SUN_START_Y) / (ANIMATION_DURATION_MS / (double)TIMER_DELAY_MS);
    private double sunY = SUN_START_Y;

    // Wave wash ping-pong timing
    private static final int WAVE_IN_MS  = 8000; // reach in
    private static final int WAVE_OUT_MS = 6000; // retract

    // Wave
    private double waveOffset = 0;
    private double characterX = -100;

    // Shoreline animation
    private double shorelineOffset = 0.0; // ควบคุม "รูปร่าง" คลื่น
    private double waveWashProgress = 0.0; // ควบคุม "ระยะซัดฝั่ง"
    private final long waveLoopStartNano = System.nanoTime();
    
    // Scene components
    private final Timer timer;
    private final Sky sky = new Sky();
    private final Sea sea = new Sea();
    private final Sand sand = new Sand();
    private final Clouds clouds = new Clouds();
    private final Shoreline shoreline = new Shoreline();
    private final Samoyed samoyed = new Samoyed();
    private final Shadow shadow = new Shadow();

    // Samoyed animation
    private long lastTickNano = System.nanoTime();
    private long dogAnimStartNano = System.nanoTime();
    private double dogX = -180.0;                 // start off-screen
    private double dogY = 225.0;                  // adjust to match Test_UU2 baseline (shore ~255)
    private double dogSpeedPxPerSec = 80.0;      // running speed
    private int dogFrameIndex = 0;                // 0..DOG_FRAMES-1
    private static final int DOG_FRAMES = 8;
    private double dogFrameFPS = 10.0;
    private static final int DOG_EST_WIDTH = 140; // approx width of UU2 drawing
    private static final int DOG_MARGIN = 40;     // off-screen margin

    public DrawingPanel1() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.CYAN);
        timer = new Timer(TIMER_DELAY_MS, this);
        timer.start();

        dogX = -DOG_EST_WIDTH - DOG_MARGIN;
        dogY = sea.getShoreY() - 30; 
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
        shadow.drawMidpointEllipse(g2d, (int)dogX + 100, 490, 60, 15);
        shadow.drawMidpointEllipse(g2d, (int)dogX - 20, 490, 60, 15);
        samoyed.draw(g2d, dogX, 300, dogFrameIndex, new Color(98, 160, 213), new Color(142, 194, 238));
        samoyed.draw(g2d, dogX - 120, 300, dogFrameIndex, new Color(115,71,121), new Color(115, 89, 190));
        
        g2d.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        long now1 = System.nanoTime();
        // Sun
        if (sunY < SUN_END_Y) {
            sunY += SUN_Y_INCREMENT;
        } else {
            sunY = SUN_END_Y; 
        }

        // Wave
        waveOffset -= 3.0;
        if (waveOffset < -50) waveOffset = 0;
        characterX += 2;
        if (characterX > PANEL_WIDTH) characterX = -100;

        // Shoreline
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

        // Samoyed
        double dt = (now1 - lastTickNano) / 1e9;
        if (dt < 0) dt = 0;
        lastTickNano = now1;

        dogX += dogSpeedPxPerSec * dt;

        double elapsedAnimSec = (now1 - dogAnimStartNano) / 1e9;
        dogFrameIndex = (int) Math.floor(elapsedAnimSec * dogFrameFPS) % DOG_FRAMES;

        if (dogX > PANEL_WIDTH + DOG_MARGIN) {
            dogX = -DOG_EST_WIDTH - DOG_MARGIN;
            dogAnimStartNano = now1;
            // Optionally vary speed slightly for natural feel:
            // dogSpeedPxPerSec = 110.0 + (now % 40) * 0.4;
        }

        repaint();
    }
}