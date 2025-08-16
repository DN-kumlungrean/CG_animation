import java.awt.*;

public class Sea {
    private final Color START_SEA_COLOR = new Color(200, 162, 181);
    private final Color END_SEA_COLOR   = new Color(146, 128, 166);
    private final int NUMBER_OF_LAYERS  = 30;
    private final int LAYER_HEIGHT      = 110 / NUMBER_OF_LAYERS; 
    private final int SEA_HEIGHT        = 55;  
    private final int START_Y           = 200;
    private final int START_LINE_THICKNESS = 4;
    private final Color START_LINE_COLOR   = new Color(134, 110, 153); 

    public int getShoreY(){ return START_Y + SEA_HEIGHT; }

    private void fillRectPolygon(Graphics2D g2d, int x, int y, int w, int h) {
        int[] xs = new int[] { x, x + w, x + w, x };
        int[] ys = new int[] { y, y,     y + h, y + h };
        g2d.fillPolygon(xs, ys, 4);
    }

    public void draw(Graphics2D g2d, int panelWidth, double waveOffset, int sunY) {
        final int startY   = START_Y;
        final int totalTop = startY;
        
        // วาดทะเลแบบไล่สี
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
        // วาดเส้นขอบบนของทะเล 
        g2d.setColor(START_LINE_COLOR);
        fillRectPolygon(g2d, 0, START_Y, panelWidth, START_LINE_THICKNESS);
        
    }
}