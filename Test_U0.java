import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Test_U0 extends JPanel{
    private static BufferedImage samoyedImage;
    private double characterX = 60;
    private double characterY = 60;

    private final Test_UU0 test_UU = new Test_UU0();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Drawing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 650);
        frame.add(new Test_U0());
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


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // กำหนดอัตราส่วนขยาย เช่น 1.5 = ขยายใหญ่ 150%
        double scale = 2;

        // บันทึก transform เดิมไว้
        AffineTransform oldTransform = g2.getTransform();

        // ขยายทุกอย่างในกราฟิกด้วย scale
        g2.scale(scale, scale);

        // if (samoyedImage != null) {
        //     g2.drawImage(samoyedImage, 60, 60, null);
        // }

        test_UU.draw(g2, characterX, characterY);

        // คืนค่ากลับ transform เดิม (ถ้ามีอะไรจะวาดต่อข้างนอก)
        g2.setTransform(oldTransform);
        
    }

    
}