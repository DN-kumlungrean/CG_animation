import java.awt.*;
import java.awt.geom.*;

public class Test_UU {
    public static void draw(Graphics2D g2d, double x, double y) {
        // g2d.fill(new Ellipse2D.Double(x, y, 50, 60));
        // g2d.fill(new Ellipse2D.Double(x - 10, y - 30, 45, 45));
        // g2d.fill(new Ellipse2D.Double(x - 20, y - 15, 20, 20));
        // g2d.fill(new Ellipse2D.Double(x + 25, y - 15, 20, 20));

        // g2d.setColor(Color.BLACK);
        // g2d.fill(new Ellipse2D.Double(x + 5, y - 15, 5, 5));
        // g2d.fill(new Ellipse2D.Double(x + 20, y - 15, 5, 5));
        // g2d.draw(new QuadCurve2D.Double(x + 10, y - 5, x + 15, y, x + 20, y - 5));

        // g2d.setColor(new Color(0, 49, 83));
        // g2d.fillRect((int) x, (int) y + 10, 50, 20);
        // g2d.fillPolygon(new int[]{(int)x+10, (int)x+25, (int)x+40}, new int[]{(int)y, (int)y+15, (int)y}, 3);



        // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // หนา 3 px
        g2d.setStroke(new BasicStroke(3)); 

        // set colur
        g2d.setColor(new Color(255, 203, 162));

        // shadow head
        g2d.draw(new QuadCurve2D.Double(x + 92, y + 25, x + 97, y + 23, x + 96, y + 16));

        g2d.draw(new QuadCurve2D.Double(x + 92, y + 40, x + 80, y + 57, x + 89, y + 57));
        g2d.draw(new QuadCurve2D.Double(x + 89, y + 57, x + 85, y + 70, x + 88, y + 85));

        // shadow-hat
        g2d.draw(new QuadCurve2D.Double(x + 108, y + 9, x + 105, y + 15, x + 120, y + 21));

        // shadow shirt
        g2d.draw(new QuadCurve2D.Double(x + 72, y + 80, x + 52, y + 93, x + 65, y + 114));

        g2d.draw(new QuadCurve2D.Double(x + 72, y + 111, x + 76, y + 115, x + 75, y + 125));

        // shadow leg
        g2d.draw(new QuadCurve2D.Double(x + 75, y + 128, x + 93, y + 160, x + 110, y + 157));

        g2d.draw(new QuadCurve2D.Double(x + 105, y + 165, x + 105, y + 176, x + 110, y + 178));



        // set colur
        g2d.setColor(Color.BLACK);

        // ear L
        g2d.draw(new QuadCurve2D.Double(x + 82, y + 35, x + 92, y, x + 101, y + 25));
        g2d.draw(new QuadCurve2D.Double(x + 92, y + 25, x + 94, y + 28, x + 92, y + 32));
        g2d.draw(new QuadCurve2D.Double(x + 92, y + 32, x + 100, y + 30, x + 92, y + 39));
        
        // ear R
        g2d.draw(new QuadCurve2D.Double(x + 132, y + 23, x + 149, y + 7, x + 145, y + 33));

        // head
        g2d.draw(new QuadCurve2D.Double(x + 101, y + 25, x + 105, y + 15, x + 108, y + 23));
        g2d.draw(new QuadCurve2D.Double(x + 108, y + 23, x + 120, y + 20, x + 132, y + 23));

        g2d.draw(new QuadCurve2D.Double(x + 145, y + 33, x + 155, y + 30, x + 150, y + 39));
        g2d.draw(new QuadCurve2D.Double(x + 150, y + 39, x + 160, y + 50, x + 160, y + 70));
        g2d.draw(new QuadCurve2D.Double(x + 160, y + 70, x + 162, y + 80, x + 155, y + 80));
        g2d.draw(new QuadCurve2D.Double(x + 155, y + 80, x + 140, y + 100, x + 137, y + 92));
        g2d.draw(new QuadCurve2D.Double(x + 137, y + 92, x + 120, y + 98, x + 104, y + 89));
        g2d.draw(new QuadCurve2D.Double(x + 104, y + 89, x + 100, y + 95, x + 88, y + 85));

        g2d.draw(new QuadCurve2D.Double(x + 82, y + 35, x + 60, y + 55, x + 73, y + 55));
        g2d.draw(new QuadCurve2D.Double(x + 73, y + 55, x + 68, y + 68, x + 70, y + 73));


        // hat
        g2d.draw(new QuadCurve2D.Double(x + 135, y + 20, x + 120, y - 13, x + 70, y + 30));
        g2d.draw(new QuadCurve2D.Double(x + 70, y + 30, x + 60, y + 37, x + 72, y + 45));

        g2d.draw(new QuadCurve2D.Double(x + 72, y + 28, x + 68, y + 27, x + 70, y + 20));
        g2d.draw(new QuadCurve2D.Double(x + 70, y + 20, x + 80, y + 2, x + 86, y + 16));

        // boo-hat
        g2d.draw(new QuadCurve2D.Double(x + 68, y + 21, x + 60, y + 23, x + 50, y + 23));
        g2d.draw(new QuadCurve2D.Double(x + 50, y + 23, x + 35, y + 22, x + 45, y + 31));
        g2d.draw(new QuadCurve2D.Double(x + 45, y + 31, x + 35, y + 39, x + 45, y + 40));
        g2d.draw(new QuadCurve2D.Double(x + 45, y + 40, x + 50, y + 42, x + 65, y + 35));

        // eye
        g2d.rotate(Math.toRadians(-20), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        g2d.fill(new Ellipse2D.Double(x + 111, y + 52, 8, 5));
        g2d.rotate(Math.toRadians(20), x + 115, y + 55); // หมุนกลับ

        g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        g2d.fill(new Ellipse2D.Double(x + 138, y + 52, 7, 5));
        g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ

        // nose
        g2d.fill(new Ellipse2D.Double(x + 127, y + 53, 8, 6));

        // mouth
        g2d.draw(new QuadCurve2D.Double(x + 113, y + 65, x + 121, y + 71, x + 127, y + 64));
        g2d.draw(new QuadCurve2D.Double(x + 127, y + 64, x + 130, y + 60, x + 134, y + 64));
        g2d.draw(new QuadCurve2D.Double(x + 134, y + 64, x + 138, y + 68, x + 144, y + 62));

        g2d.draw(new QuadCurve2D.Double(x + 132, y + 64, x + 133, y + 66, x + 133, y + 71));
        g2d.draw(new QuadCurve2D.Double(x + 121, y + 69, x + 124, y + 80, x + 132, y + 79));
        g2d.draw(new QuadCurve2D.Double(x + 132, y + 79, x + 143, y + 79, x + 141, y + 65));

        // shirt-pok
        g2d.draw(new QuadCurve2D.Double(x + 88, y + 85, x + 80, y + 81, x + 70, y + 73));

        g2d.draw(new QuadCurve2D.Double(x + 70, y + 73, x + 53, y + 62, x + 57, y + 80));

        g2d.draw(new QuadCurve2D.Double(x + 71, y + 74, x + 74, y + 103, x + 102, y + 96));

        g2d.draw(new QuadCurve2D.Double(x + 127, y + 97, x + 147, y + 111, x + 149, y + 88));

        // shirt-boo
        g2d.draw(new QuadCurve2D.Double(x + 116, y + 96, x + 115, y + 105, x + 127, y + 96));

        g2d.draw(new QuadCurve2D.Double(x + 116, y + 96, x + 103, y + 91, x + 95, y + 104));
        g2d.draw(new QuadCurve2D.Double(x + 95, y + 104, x + 85, y + 118, x + 100, y + 115));
        g2d.draw(new QuadCurve2D.Double(x + 100, y + 115, x + 110, y + 112, x + 116, y + 100));

        g2d.draw(new QuadCurve2D.Double(x + 127, y + 96, x + 128, y + 110, x + 124, y + 113));
        g2d.draw(new QuadCurve2D.Double(x + 124, y + 113, x + 110, y + 124, x + 112, y + 108));

        // shirt-arm L
        g2d.draw(new QuadCurve2D.Double(x + 70, y + 74, x + 65, y + 75, x + 52, y + 84));
        g2d.draw(new QuadCurve2D.Double(x + 52, y + 84, x + 41, y + 90, x + 48, y + 92));
        g2d.draw(new QuadCurve2D.Double(x + 48, y + 92, x + 56, y + 100, x + 58, y + 111));
        g2d.draw(new QuadCurve2D.Double(x + 58, y + 111, x + 57, y + 120, x + 72, y + 111));

        // shirt-arm R
        g2d.draw(new QuadCurve2D.Double(x + 150, y + 86, x + 160, y + 94, x + 163, y + 98));
        g2d.draw(new QuadCurve2D.Double(x + 163, y + 98, x + 170, y + 101, x + 149, y + 123));

        // shirt
        g2d.draw(new QuadCurve2D.Double(x + 147, y + 110, x + 149, y + 137, x + 145, y + 137));
        g2d.draw(new QuadCurve2D.Double(x + 145, y + 137, x + 100, y + 125, x + 65, y + 127));
        g2d.draw(new QuadCurve2D.Double(x + 65, y + 127, x + 60, y + 129, x + 63, y + 116));

        // hand L
        g2d.draw(new QuadCurve2D.Double(x + 46, y + 90, x + 33, y + 105, x + 44, y + 112));
        g2d.draw(new QuadCurve2D.Double(x + 44, y + 112, x + 50, y + 116, x + 57, y + 115));

        // hand R
        g2d.draw(new QuadCurve2D.Double(x + 165, y + 101, x + 174, y + 115, x + 168, y + 123));
        g2d.draw(new QuadCurve2D.Double(x + 168, y + 123, x + 163, y + 129, x + 149, y + 124));

        // leg L
        g2d.draw(new QuadCurve2D.Double(x + 63, y + 127, x + 62, y + 146, x + 68, y + 142));
        g2d.draw(new QuadCurve2D.Double(x + 68, y + 142, x + 80, y + 169, x + 105, y + 162));
        g2d.draw(new QuadCurve2D.Double(x + 105, y + 162, x + 119, y + 155, x + 111, y + 140));

        // leg R
        g2d.draw(new QuadCurve2D.Double(x + 145, y + 137, x + 143, y + 158, x + 137, y + 152));
        g2d.draw(new QuadCurve2D.Double(x + 137, y + 152, x + 125, y + 170, x + 110, y + 179));
        g2d.draw(new QuadCurve2D.Double(x + 110, y + 179, x + 82, y + 190, x + 85, y + 162));

        // tail
        g2d.draw(new QuadCurve2D.Double(x + 62, y + 133, x + 50, y + 130, x + 61, y + 120));

        g2d.draw(new QuadCurve2D.Double(x + 70, y + 147, x + 50, y + 165, x + 50, y + 154));
        g2d.draw(new QuadCurve2D.Double(x + 50, y + 154, x + 20, y + 158, x + 15, y + 133));
        g2d.draw(new QuadCurve2D.Double(x + 15, y + 133, x + 13, y + 124, x + 20, y + 126));
        g2d.draw(new QuadCurve2D.Double(x + 20, y + 126, x + 20, y + 105, x + 40, y + 97));





        // // วาดพื้นหลังสีขาวเต็มจอ
        // g2.setColor(Color.WHITE);
        // g2.fillRect(0, 0, getWidth(), getHeight());

        // // วาดเส้นตรงสีน้ำเงิน
        // g2.setColor(Color.BLUE);
        // g2.setStroke(new BasicStroke(3)); // หนา 3 px
        // g2.draw(new Line2D.Double(50, 50, 200, 50));

        // // วาดเส้นโค้งแบบควอด (Quadratic Curve) สีแดง
        // g2.setColor(Color.RED);
        // QuadCurve2D q = new QuadCurve2D.Double();
        // q.setCurve(50, 100, 125, 50, 200, 100);
        // g2.draw(q);

        // // วาดเส้นโค้งแบบคิวบิก (Cubic Curve) สีเขียว
        // g2.setColor(Color.GREEN.darker());
        // CubicCurve2D c = new CubicCurve2D.Double(50, 150, 90, 120, 160, 180, 200, 150);
        // g2.draw(c);

        // // วาดวงรี (Ellipse) สีส้มเติมเต็ม
        // g2.setColor(new Color(255, 165, 0)); // สีส้ม
        // Ellipse2D ellipse = new Ellipse2D.Double(50, 200, 150, 80);
        // g2.fill(ellipse);

        // // วาดสี่เหลี่ยมสีม่วงเส้นขอบหนา
        // g2.setColor(new Color(128, 0, 128)); // สีม่วง
        // g2.setStroke(new BasicStroke(5));
        // Rectangle rect = new Rectangle(220, 200, 100, 80);
        // g2.draw(rect);
    }
}
