import java.awt.*;

public class Sea {
    private final Color START_SEA_COLOR = new Color(200, 162, 181);
    private final Color END_SEA_COLOR   = new Color(146, 128, 166);
    private final int NUMBER_OF_LAYERS  = 30;
    private final int LAYER_HEIGHT      = 110 / NUMBER_OF_LAYERS; 
    private final int SEA_HEIGHT        = 55;  

    // Ripples
    private static final int RIPPLE_ROW_COUNT   = 14;           
    private static final int RIPPLE_MIN_LEN     = 16;           
    private static final int RIPPLE_MAX_LEN     = 48;           
    private static final int RIPPLE_THICKNESS   = 2;            
    private static final int RIPPLE_COL_STRIDE  = 34;          
    private static final Color RIPPLE_PURPLE    = new Color(110, 94, 136, 170);
    private static final Color RIPPLE_GOLD      = new Color(253, 221, 99, 200);
    
    private final int START_Y           = 200;
    private final int START_LINE_THICKNESS = 4;
    private final Color START_LINE_COLOR   = new Color(134, 110, 153); 

    public int getShoreY(){ return START_Y + SEA_HEIGHT; }

    private void fillRectPolygon(Graphics2D g2d, int x, int y, int w, int h) {
        int[] xs = new int[] { x, x + w, x + w, x };
        int[] ys = new int[] { y, y,     y + h, y + h };
        g2d.fillPolygon(xs, ys, 4);
    }

    // Simple deterministic hash 
    private static int hash32(int a) {
        a ^= (a << 13);
        a ^= (a >>> 17);
        a ^= (a << 5);
        return a;
    }
    
    public void draw(Graphics2D g2d, int panelWidth, double waveOffset, int sunY) {
        final int startY   = START_Y;
        final int totalTop = startY;
        
        // Draw a gradient sea
        for (int i = 0; i < NUMBER_OF_LAYERS; i++) {
            float ratio = (float) i / (NUMBER_OF_LAYERS - 1);
            int red   = (int)(START_SEA_COLOR.getRed()   + (END_SEA_COLOR.getRed()   - START_SEA_COLOR.getRed())   * ratio);
            int green = (int)(START_SEA_COLOR.getGreen() + (END_SEA_COLOR.getGreen() - START_SEA_COLOR.getGreen()) * ratio);
            int blue  = (int)(START_SEA_COLOR.getBlue()  + (END_SEA_COLOR.getBlue()  - START_SEA_COLOR.getBlue())  * ratio);
            Color layerColor = new Color(red, green, blue);

            g2d.setColor(layerColor);

            int y = totalTop + i * LAYER_HEIGHT;
            fillRectPolygon(g2d, 0, y, panelWidth, LAYER_HEIGHT + 1);
        }
        
        // Surface ripples
        drawSurfaceRipples(g2d, panelWidth, waveOffset, sunY);
        
        // Draw a top border
        g2d.setColor(START_LINE_COLOR);
        fillRectPolygon(g2d, 0, START_Y, panelWidth, START_LINE_THICKNESS);
        
    }
    // Draw ripples
    private void drawSurfaceRipples(Graphics2D g2d, int panelWidth, double waveOffset, int sunY) {
        final int top = START_Y + START_LINE_THICKNESS + 2;
        final int bottom = START_Y + NUMBER_OF_LAYERS * LAYER_HEIGHT - 6;
        if (bottom <= top) return;
        final int usableH = bottom - top;
        final int rows = RIPPLE_ROW_COUNT;
        final int tick = (int)Math.floor(waveOffset * 0.1); 
        final int centerX = panelWidth / 2;

        for (int r = 0; r < rows; r++) {
            int y = top + (r + 1) * usableH / (rows + 1);
            int stride = RIPPLE_COL_STRIDE + (r % 3) * 6;

            for (int x = 10; x < panelWidth - 10; x += stride) {
                int h = hash32((r * 73856093) ^ (x * 19349663) ^ (tick * 83492791));
                if ((h & 0x3) != 0) continue; // ~1/4 appear

                int len = RIPPLE_MIN_LEN + Math.abs(h) % (RIPPLE_MAX_LEN - RIPPLE_MIN_LEN + 1);
                boolean nearSun = Math.abs((x + len / 2) - centerX) < 140 && y < START_Y + 46;

                g2d.setColor(nearSun ? RIPPLE_GOLD : RIPPLE_PURPLE);
                fillRectPolygon(g2d, x, y, len, RIPPLE_THICKNESS);
            }
        }
    }
    
}