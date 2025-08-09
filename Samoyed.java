import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.geom.*;

public class Samoyed {
    private static BufferedImage samoyedImage;

    static {
        try {
            // โหลดภาพครั้งเดียวตอน class โหลด
            samoyedImage = ImageIO.read(new File("img/samoyed_walk_01.png")); // ชื่อไฟล์และ path ปรับให้ตรงของคุณ
            // samoyedImage = ImageIO.read(Samoyed.class.getResource("/img/samoyed_walk_01.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void draw(Graphics2D g2d, double x, double y, Color bodyColor) {
        if (samoyedImage != null) {
            g2d.drawImage(samoyedImage, (int) x, (int) y, null);
        }

        // ตัวหมา (body)
        g2d.setColor(bodyColor);
        g2d.fill(new Ellipse2D.Double(x + 0, y + 70, 200, 150));  // body
        
        // หัว
        g2d.fill(new Ellipse2D.Double(x + 70, y + 0, 110, 110));
        
        // หูซ้าย
        Polygon leftEar = new Polygon();
        leftEar.addPoint((int)(x + 70), (int)(y + 10));
        leftEar.addPoint((int)(x + 60), (int)(y + 50));
        leftEar.addPoint((int)(x + 100), (int)(y + 30));
        g2d.fill(leftEar);
        
        // หูขวา
        Polygon rightEar = new Polygon();
        rightEar.addPoint((int)(x + 180), (int)(y + 10));
        rightEar.addPoint((int)(x + 190), (int)(y + 50));
        rightEar.addPoint((int)(x + 150), (int)(y + 30));
        g2d.fill(rightEar);
        
        // ขาหลังซ้าย
        g2d.fill(new Ellipse2D.Double(x + 140, y + 200, 40, 60));
        
        // ขาหน้าซ้าย
        g2d.fill(new Ellipse2D.Double(x + 60, y + 210, 30, 50));
        
        // ตา
        g2d.setColor(Color.BLACK);
        g2d.fill(new Ellipse2D.Double(x + 105, y + 35, 10, 10));
        g2d.fill(new Ellipse2D.Double(x + 145, y + 35, 10, 10));
        
        // จมูก
        Polygon nose = new Polygon();
        nose.addPoint((int)(x + 125), (int)(y + 70));
        nose.addPoint((int)(x + 115), (int)(y + 90));
        nose.addPoint((int)(x + 135), (int)(y + 90));
        g2d.fill(nose);
        
        // ปาก (เส้นโค้ง)
        g2d.setStroke(new BasicStroke(3));
        CubicCurve2D.Double mouth = new CubicCurve2D.Double(x + 110, y + 100, x + 120, y + 110, x + 130, y + 110, x + 140, y + 100);
        g2d.draw(mouth);
        
        // หาง (เส้นโค้งหนา)
        g2d.setStroke(new BasicStroke(30, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        Arc2D.Double tail = new Arc2D.Double(x - 40, y + 150, 100, 120, 90, 180, Arc2D.OPEN);
        g2d.draw(tail);
        
        // คืน stroke ปกติ
        // g2d.setStroke(new BasicStroke(1));
    }



}
