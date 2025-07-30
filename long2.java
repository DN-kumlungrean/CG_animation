import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;

/**
 * คลาสหลักสำหรับสร้าง JFrame และแสดงผลอนิเมชัน
 */
public class long2 {

    public static void main(String[] args) {
        // สร้าง Frame หลักของโปรแกรม
        JFrame frame = new JFrame("Beach Animation inspired by Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null); // แสดงหน้าต่างกลางจอ

        // เพิ่ม Panel สำหรับวาดภาพเข้าไปใน Frame
        frame.add(new DrawingPanel());

        // แสดง Frame
        frame.setVisible(true);
    }
}

/**
 * คลาส Panel ที่จัดการการวาดภาพและอนิเมชันทั้งหมด
 */
class DrawingPanel extends JPanel implements ActionListener {

    private final int PANEL_WIDTH = 600;
    private final int PANEL_HEIGHT = 600;

    // ตัวแปรสำหรับควบคุมอนิเมชัน
    private int sunY; // ตำแหน่งแกน Y ของดวงอาทิตย์
    private double waveOffset; // ตำแหน่งของคลื่น
    private double characterX; // ตำแหน่งแกน X ของตัวละคร

    private Timer timer;

    public DrawingPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.CYAN); // สีพื้นหลังเริ่มต้น

        // กำหนดค่าเริ่มต้นสำหรับอนิเมชัน
        sunY = 100;
        waveOffset = 0;
        characterX = -100; // เริ่มจากนอกจอทางซ้าย

        // สร้าง Timer เพื่อขับเคลื่อนอนิเมชัน
        // โดยจะเรียก actionPerformed() ทุกๆ 50 มิลลิวินาที
        timer = new Timer(50, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // เปิดใช้งาน Anti-aliasing เพื่อให้เส้นโค้งและภาพดูเรียบเนียน
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // วาดส่วนต่างๆ ของฉาก
        drawSkyAndSun(g2d);
        drawSea(g2d);
        drawSand(g2d);
        drawClouds(g2d);
        drawCharacters(g2d);
    }

    /**
     * เมธอดสำหรับวาดท้องฟ้าและดวงอาทิตย์
     */
    private void drawSkyAndSun(Graphics2D g2d) {
        // วาดท้องฟ้าแบบไล่สี โดยให้สิ้นสุดที่ y = 250
        GradientPaint skyGradient = new GradientPaint(0, 0, new Color(255, 179, 186), 0, 250, new Color(255, 223, 186));
        g2d.setPaint(skyGradient);
        g2d.fillRect(0, 0, PANEL_WIDTH, 250); 
    
        // วาดดวงอาทิตย์ (ใช้ค่า sunY ที่กำหนดไว้)
        g2d.setColor(new Color(255, 229, 153));
        drawMidpointCircle(g2d, PANEL_WIDTH / 2, sunY, 80);
    
        // วาดแสงสะท้อนของดวงอาทิตย์บนน้ำ
        g2d.setColor(new Color(255, 245, 200, 150));
        for (int i = 0; i < 10; i++) {
            int reflectionY = 255 + (sunY / 10) + (i * 5); 
            if (reflectionY < 450) {
                 g2d.draw(new Line2D.Double(280 + i, reflectionY, 320 - i, reflectionY));
            }
        }
    }

    /**
     * เมธอดสำหรับวาดทะเลและคลื่น
     */
    private void drawSea(Graphics2D g2d) {
        // วาดพื้นน้ำ โดยเริ่มที่ y = 250 และสูง 170
        g2d.setColor(new Color(129, 178, 202));
        g2d.fillRect(0, 250, PANEL_WIDTH, 170);
    
        // วาดคลื่นด้วยเส้นโค้ง (QuadCurve2D)
        g2d.setColor(new Color(236, 242, 245, 200));
        g2d.setStroke(new BasicStroke(2));
        for (int i = 0; i < 15; i++) {
            double x = (i * 50) + waveOffset - 50;
            double y = 260;
            QuadCurve2D wave = new QuadCurve2D.Double(x, y, x + 25, y - 10, x + 50, y);
            g2d.draw(wave);
        }
    }

    /**
     * เมธอดสำหรับวาดหาดทราย
     */
    private void drawSand(Graphics2D g2d) {
        g2d.setColor(new Color(244, 214, 181));
        g2d.fillRect(0, 420, PANEL_WIDTH, 180);

        // วาดรอยเท้า
        g2d.setColor(new Color(218, 184, 143));
        for(int i = 0; i < 5; i++) {
            double footX = characterX - 50 - (i * 60);
            if(footX > 0) {
                 g2d.fill(new Ellipse2D.Double(footX, 500, 8, 10));
                 g2d.fill(new Ellipse2D.Double(footX - 5, 495, 4, 4));
                 g2d.fill(new Ellipse2D.Double(footX, 495, 4, 4));
                 g2d.fill(new Ellipse2D.Double(footX + 5, 495, 4, 4));
            }
        }
    }

    /**
     * เมธอดสำหรับวาดก้อนเมฆ
     */
    /*private void drawClouds(Graphics2D g2d) {
        g2d.setColor(new Color(255, 245, 200, 200));

        GeneralPath cloud1 = new GeneralPath();
        cloud1.moveTo(50, 150);
        cloud1.curveTo(80, 120, 180, 120, 220, 150);
        cloud1.curveTo(250, 130, 280, 140, 300, 160);
        cloud1.curveTo(250, 180, 100, 180, 50, 150);
        cloud1.closePath();
        g2d.fill(cloud1);
    
        GeneralPath cloud2 = new GeneralPath();
        cloud2.moveTo(350, 130);
        cloud2.curveTo(380, 100, 480, 100, 520, 130);
        cloud2.curveTo(550, 110, 580, 120, 600, 140);
        cloud2.lineTo(600, 180);
        cloud2.curveTo(550, 160, 400, 160, 350, 130);
        cloud2.closePath();
        g2d.fill(cloud2);
    }*/
    private void drawClouds(Graphics2D g2d) {
        // กำหนดสีของก้อนเมฆ
        g2d.setColor(new Color(255, 245, 200, 200));

        // สร้างรูปทรงของเมฆด้วย GeneralPath
        GeneralPath cloudMass = new GeneralPath();

        // 1. เริ่มต้นที่ขอบฟ้าด้านซ้าย
        cloudMass.moveTo(0, 250);

        // 2. วาด "เส้นขอบบน" ของกลุ่มเมฆทั้งหมดเป็นเส้นเดียว
        // โดยให้จุดปลายของแต่ละโค้ง เชื่อมต่อกันกลางอากาศ ไม่กลับลงมาที่พื้น
        // รูปแบบคือ: quadTo(จุดควบคุม x, จุดควบคุม y, จุดสิ้นสุด x, จุดสิ้นสุด y)
        cloudMass.quadTo(80, 150, 180, 230);   // โค้งแรก: ยอดสูง y=150, ปลายโค้งลอยอยู่ที่ y=230
        cloudMass.quadTo(250, 120, 350, 220);  // โค้งสอง: ยอดสูง y=120, ปลายโค้งลอยอยู่ที่ y=220
        cloudMass.quadTo(450, 160, 550, 235);  // โค้งสาม: ยอดสูง y=160, ปลายโค้งลอยอยู่ที่ y=235
        cloudMass.quadTo(600, 180, PANEL_WIDTH, 250); // โค้งสุดท้าย: กลับมาจบที่ขอบฟ้าด้านขวา

        // 3. ปิดรูปทรง (คำสั่งนี้จะลากเส้นตรงจากจุดสุดท้ายกลับไปยังจุดเริ่มต้นให้เอง)
        // ทำให้เกิดฐานเมฆที่เรียบและติดขอบฟ้า y=250 โดยอัตโนมัติ
        cloudMass.closePath();

        // 4. เติมสีเมฆ
        g2d.fill(cloudMass);
    }
    /**
     * เมธอดสำหรับวาดตัวละครสุนัข
     */
    private void drawCharacters(Graphics2D g2d) {
        // วาดสุนัขตัวสีน้ำตาล (ตัวซ้าย)
        drawDog(g2d, characterX, 480, new Color(205, 133, 63), true);
        // วาดสุนัขตัวสีขาว (ตัวขวา)
        drawDog(g2d, characterX + 60, 480, Color.WHITE, false);
    }
    
    private void drawDog(Graphics2D g2d, double x, double y, Color bodyColor, boolean hasHat) {
        // ตัว
        g2d.setColor(bodyColor);
        g2d.fill(new Ellipse2D.Double(x, y, 50, 60));
        
        // หัว
        g2d.fill(new Ellipse2D.Double(x - 10, y - 30, 45, 45));

        // หู
        g2d.fill(new Ellipse2D.Double(x - 20, y - 15, 20, 20));
        g2d.fill(new Ellipse2D.Double(x + 25, y - 15, 20, 20));

        // ตาและปาก
        g2d.setColor(Color.BLACK);
        g2d.fill(new Ellipse2D.Double(x + 5, y - 15, 5, 5));
        g2d.fill(new Ellipse2D.Double(x + 20, y - 15, 5, 5));
        g2d.draw(new QuadCurve2D.Double(x + 10, y - 5, x + 15, y, x + 20, y - 5));

        // เสื้อ
        g2d.setColor(new Color(0, 49, 83));
        g2d.fillRect((int)x, (int)y + 10, 50, 20);
        g2d.fillPolygon(new int[]{(int)x+10, (int)x+25, (int)x+40}, new int[]{(int)y, (int)y+15, (int)y}, 3);


        if (hasHat) {
            // หมวก
            g2d.setColor(new Color(0, 49, 83));
            g2d.fill(new Ellipse2D.Double(x-5, y - 40, 30, 15));
            // ลูกบอลสีแดง
            g2d.setColor(Color.RED);
            g2d.fill(new Ellipse2D.Double(x + 55, y + 30, 20, 20));
        }
    }

    /**
     * **อัลกอริทึม Midpoint Circle**
     * ใช้วาดวงกลมโดยการคำนวณจุดบนเส้นรอบวงทีละ 1/8 ส่วน แล้วสะท้อนไปยังอีก 7 ส่วนที่เหลือ
     * @param g Graphics2D object
     * @param centerX ศูนย์กลางแกน X
     * @param centerY ศูนย์กลางแกน Y
     * @param radius รัศมี
     */
    private void drawMidpointCircle(Graphics2D g, int centerX, int centerY, int radius) {
        int x = radius;
        int y = 0;
        int p = 1 - radius; // decision parameter

        // บันทึกสีเดิมไว้ก่อน
        Paint originalPaint = g.getPaint();
        // สร้างสีแบบไล่ระดับสำหรับดวงอาทิตย์
        GradientPaint sunGradient = new GradientPaint(
            centerX, centerY - radius, new Color(253, 221, 99),
            centerX, centerY + radius, new Color(243, 156, 18)
        );
        g.setPaint(sunGradient);
        
        // วาดจุดแรก
        plotCirclePoints(g, centerX, centerY, x, y);

        while (x > y) {
            y++;
            if (p <= 0) {
                p = p + 2 * y + 1;
            } else {
                x--;
                p = p + 2 * y - 2 * x + 1;
            }
            // วาดจุดใน 1/8 ของวงกลม และสะท้อนไปยังส่วนอื่นๆ
            plotCirclePoints(g, centerX, centerY, x, y);
        }
        
        // คืนค่าสีเดิม
        g.setPaint(originalPaint);
    }
    
    /**
     * Helper method สำหรับวาดจุด 8 จุดของวงกลมแบบสมมาตร และเติมพื้นที่ด้านใน
     */
    private void plotCirclePoints(Graphics2D g, int centerX, int centerY, int x, int y) {
        // ใช้ drawLine เพื่อเติมพื้นที่วงกลม ทำให้เกิดเป็นวงกลมทึบ
        g.drawLine(centerX - x, centerY + y, centerX + x, centerY + y);
        g.drawLine(centerX - x, centerY - y, centerX + x, centerY - y);
        g.drawLine(centerX - y, centerY + x, centerX + y, centerY + x);
        g.drawLine(centerX - y, centerY - x, centerX + y, centerY - x);
    }


    /**
     * เมธอดนี้จะถูกเรียกโดย Timer ทุกๆ ช่วงเวลาที่กำหนด
     * ใช้สำหรับอัปเดตสถานะของวัตถุต่างๆ ในอนิเมชัน
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // อัปเดตตำแหน่งดวงอาทิตย์ (ให้ค่อยๆ ตกลงมา)
        if (sunY < 300) {
            sunY++;
        }

        // อัปเดตตำแหน่งคลื่น (ให้เลื่อนไปทางซ้าย)
        waveOffset -= 1.5;
        if (waveOffset < -50) {
            waveOffset = 0;
        }

        // อัปเดตตำแหน่งตัวละคร (ให้เดินจากซ้ายไปขวา)
        characterX += 1;
        if (characterX > PANEL_WIDTH + 100) {
            characterX = -100; // วนกลับมาเริ่มใหม่จากทางซ้าย
        }

        // เรียก paintComponent() เพื่อวาดภาพใหม่ตามตำแหน่งที่อัปเดต
        repaint();
    }
}
