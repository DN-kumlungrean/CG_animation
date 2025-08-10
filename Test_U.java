import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Stack;

public class Test_U extends JPanel{
    private BufferedImage canvas;
    private static BufferedImage samoyedImage;
    private final int scale = 1; // ขยาย 2 เท่า
    private double characterX = 60;
    private double characterY = 60;

    private final Test_UU test_UU = new Test_UU(this);

    public Test_U() {
        // สร้าง canvas ขนาดเท่ากับ panel
        canvas = new BufferedImage(600 * scale, 650 * scale, BufferedImage.TYPE_INT_ARGB);

        // วาดครั้งแรกลง canvas
        Graphics2D g2 = canvas.createGraphics();
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        g2.dispose();

        drawCharacter();
    }

    public void drawCharacter() {
        Graphics2D gCanvas = canvas.createGraphics();

        // เปิด Anti-aliasing
        gCanvas.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);

        // วาดตัวละครโดยคูณพิกัดด้วย scale เพื่อให้ถูกต้องบน canvas ขนาดใหญ่
        test_UU.draw(gCanvas, characterX * scale, characterY * scale, this);
        
        gCanvas.dispose();
        repaint(); // ให้จออัปเดต
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Drawing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 650);
        frame.add(new Test_U());
        // frame.setLocationRelativeTo(null);
        frame.setLocation(100, 150);
        frame.setVisible(true);
    }

    // static {
    //     try {
    //         // โหลดภาพครั้งเดียวตอน class โหลด
    //         samoyedImage = ImageIO.read(new File("img/samoyed_walk_01.png")); // ชื่อไฟล์และ path ปรับให้ตรงของคุณ
    //         // samoyedImage = ImageIO.read(Samoyed.class.getResource("/img/samoyed_walk_01.png"));

    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

    public BufferedImage getCanvas() {
        return canvas;
    }

    public int getScale() {
        return scale;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // ใช้ nearest neighbor เพื่อความคมชัด ไม่เบลอเวลา scale
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                            RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
        
        // // วาดภาพด้วย transform scale 1/scale ให้ขนาดเท่ากับ panel จริง
        // AffineTransform at = AffineTransform.getScaleInstance(1.0 / scale, 1.0 / scale);
        // g2.drawImage(canvas, at, null);

        // ไม่ต้อง scale หรือย่อขนาดใดๆ
        // แสดง canvas ขนาดจริง 600x650 ตามที่สร้างไว้
        g2.drawImage(canvas, 0, 0, getWidth(), getHeight(), null);

        // // ตั้งค่าให้ขยายภาพแบบคมชัด (ไม่เบลอ)
        // // ตั้งค่าความเรียบเนียนและการขยายที่คมชัด
        // g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        // // เปิด anti-aliasing
        // g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // ตั้งค่า interpolation ให้ภาพเวลาวาดแบบย่อ/ขยาย (ให้คมชัด)
        // g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
        //                    RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        // // กำหนดอัตราส่วนขยาย เช่น 1.5 = ขยายใหญ่ 150%
        // double scale = 2;

        // // บันทึก transform เดิมไว้
        // AffineTransform oldTransform = g2.getTransform();

        // // ขยายทุกอย่างในกราฟิกด้วย scale
        // g2.scale(scale, scale);

        // if (samoyedImage != null) {
        //     g2.drawImage(samoyedImage, 60, 60, null);
        // }

        // test_UU.draw(g2, characterX, characterY, this);
        // วาด canvas ลง panel ขนาดปกติ (600x650)
        // g2.drawImage(canvas, 0, 0, getWidth(), getHeight(), null);

        


        // // คืนค่ากลับ transform เดิม (ถ้ามีอะไรจะวาดต่อข้างนอก)
        // g2.setTransform(oldTransform);
        
    }

    public void floodFill(int x, int y, int targetRGB, int replacementRGB) {
        if (targetRGB == replacementRGB) return;

        int width = canvas.getWidth();
        int height = canvas.getHeight();

        Stack<Point> stack = new Stack<>();
        stack.push(new Point(x, y));

        int tolerance = 90; // กำหนดความต่างสีที่ยอมรับได้ (ปรับได้ตามต้องการ)

        while (!stack.isEmpty()) {
            Point p = stack.pop();
            int px = p.x;
            int py = p.y;

            if (px < 0 || py < 0 || px >= width || py >= height) continue;
            
            int currentRGB = canvas.getRGB(px, py);
            if (!isColorClose(currentRGB, targetRGB, tolerance)) continue;

            canvas.setRGB(px, py, replacementRGB);

            stack.push(new Point(px + 1, py));
            stack.push(new Point(px - 1, py));
            stack.push(new Point(px, py + 1));
            stack.push(new Point(px, py - 1));
        }
        repaint(); // วาดใหม่หลังเติมสี
    }

    private boolean isColorClose(int rgb1, int rgb2, int tolerance) {
        int r1 = (rgb1 >> 16) & 0xFF;
        int g1 = (rgb1 >> 8) & 0xFF;
        int b1 = rgb1 & 0xFF;

        int r2 = (rgb2 >> 16) & 0xFF;
        int g2 = (rgb2 >> 8) & 0xFF;
        int b2 = rgb2 & 0xFF;

        return Math.abs(r1 - r2) <= tolerance &&
            Math.abs(g1 - g2) <= tolerance &&
            Math.abs(b1 - b2) <= tolerance;
    }


    
}
