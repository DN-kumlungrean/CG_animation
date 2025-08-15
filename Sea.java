import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Sea {
    // สีที่ถูกต้องตามที่คุณระบุ
    private final Color START_SEA_COLOR = new Color(200, 162, 181);
    private final Color END_SEA_COLOR = new Color(144, 122, 161); // 134, 110, 153
    private final int NUMBER_OF_LAYERS = 30;
    private final int LAYER_HEIGHT = 110 / NUMBER_OF_LAYERS;
    private final int SEA_HEIGHT = 55; // sea height
    private final int START_Y = 200;    // sea top Y
    public int getShoreY(){ return START_Y + SEA_HEIGHT; }

    public void draw(Graphics2D g2d, int panelWidth, double waveOffset, int sunY) {
        int seaHeight = SEA_HEIGHT; 
        int startY = START_Y;


        // วาดทะเลไล่สี
        for (int i = 0; i < NUMBER_OF_LAYERS; i++) {
            float ratio = (float) i / (NUMBER_OF_LAYERS - 1);
            int red = (int) (START_SEA_COLOR.getRed() + (END_SEA_COLOR.getRed() - START_SEA_COLOR.getRed()) * ratio);
            int green = (int) (START_SEA_COLOR.getGreen() + (END_SEA_COLOR.getGreen() - START_SEA_COLOR.getGreen()) * ratio);
            int blue = (int) (START_SEA_COLOR.getBlue() + (END_SEA_COLOR.getBlue() - START_SEA_COLOR.getBlue()) * ratio);
            Color layerColor = new Color(red, green, blue);
            g2d.setColor(layerColor);
            g2d.fillRect(0, startY + i * LAYER_HEIGHT, panelWidth, LAYER_HEIGHT + 1);
        }

    }
}