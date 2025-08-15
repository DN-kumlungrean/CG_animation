import java.awt.*;
import java.awt.geom.*;

public class Test_UU0 {
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










        // // frame 1

        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(3)); 


        // // set colur
        // g2d.setColor(new Color(255, 203, 162));

        // // shadow head
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 25, x + 97, y + 23, x + 96, y + 16));

        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 40, x + 80, y + 57, x + 89, y + 57));
        // g2d.draw(new QuadCurve2D.Double(x + 89, y + 57, x + 85, y + 70, x + 88, y + 85));

        // // shadow-hat
        // g2d.draw(new QuadCurve2D.Double(x + 108, y + 9, x + 105, y + 15, x + 120, y + 21));

        // // shadow shirt
        // g2d.draw(new QuadCurve2D.Double(x + 72, y + 80, x + 52, y + 93, x + 65, y + 114));

        // g2d.draw(new QuadCurve2D.Double(x + 72, y + 111, x + 76, y + 115, x + 75, y + 125));

        // // shadow leg
        // g2d.draw(new QuadCurve2D.Double(x + 75, y + 128, x + 93, y + 160, x + 110, y + 157));

        // g2d.draw(new QuadCurve2D.Double(x + 105, y + 165, x + 105, y + 176, x + 110, y + 178));



        // // set colur
        // g2d.setColor(Color.BLACK);

        // // ear L
        // g2d.draw(new QuadCurve2D.Double(x + 82, y + 35, x + 92, y, x + 101, y + 25));    //
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 25, x + 94, y + 28, x + 92, y + 32));   //
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 32, x + 100, y + 30, x + 92, y + 39));  //
        
        // // ear R
        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 23, x + 149, y + 7, x + 145, y + 33));  //

        // // head
        // g2d.draw(new QuadCurve2D.Double(x + 101, y + 25, x + 105, y + 15, x + 108, y + 23)); //
        // g2d.draw(new QuadCurve2D.Double(x + 108, y + 23, x + 120, y + 20, x + 132, y + 23)); //

        // g2d.draw(new QuadCurve2D.Double(x + 145, y + 33, x + 155, y + 30, x + 150, y + 39)); //
        // g2d.draw(new QuadCurve2D.Double(x + 150, y + 39, x + 160, y + 50, x + 160, y + 70)); //
        // g2d.draw(new QuadCurve2D.Double(x + 160, y + 70, x + 162, y + 80, x + 155, y + 80)); //
        // g2d.draw(new QuadCurve2D.Double(x + 155, y + 80, x + 140, y + 100, x + 137, y + 92));    //
        // g2d.draw(new QuadCurve2D.Double(x + 137, y + 92, x + 120, y + 98, x + 104, y + 89)); //
        // g2d.draw(new QuadCurve2D.Double(x + 104, y + 89, x + 100, y + 95, x + 88, y + 85));  //

        // g2d.draw(new QuadCurve2D.Double(x + 82, y + 35, x + 60, y + 55, x + 73, y + 55));   //
        // g2d.draw(new QuadCurve2D.Double(x + 73, y + 55, x + 68, y + 68, x + 70, y + 73));   //


        // // hat
        // g2d.draw(new QuadCurve2D.Double(x + 135, y + 20, x + 120, y - 13, x + 70, y + 30)); //
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 30, x + 60, y + 37, x + 72, y + 45));   //

        // g2d.draw(new QuadCurve2D.Double(x + 72, y + 28, x + 68, y + 27, x + 70, y + 20));   //
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 20, x + 80, y + 2, x + 86, y + 16));    //

        // // boo-hat
        // g2d.draw(new QuadCurve2D.Double(x + 68, y + 21, x + 60, y + 23, x + 50, y + 23));   //
        // g2d.draw(new QuadCurve2D.Double(x + 50, y + 23, x + 35, y + 22, x + 45, y + 31));   //
        // g2d.draw(new QuadCurve2D.Double(x + 45, y + 31, x + 35, y + 39, x + 45, y + 40));   //
        // g2d.draw(new QuadCurve2D.Double(x + 45, y + 40, x + 50, y + 42, x + 65, y + 35));   //

        // // eye
        // g2d.rotate(Math.toRadians(-20), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 111, y + 52, 8, 5));
        // g2d.rotate(Math.toRadians(20), x + 115, y + 55); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 138, y + 52, 7, 5));
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ

        // // nose
        // g2d.fill(new Ellipse2D.Double(x + 127, y + 53, 8, 6));

        // // mouth
        // g2d.draw(new QuadCurve2D.Double(x + 113, y + 65, x + 121, y + 71, x + 127, y + 64));
        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 64, x + 130, y + 60, x + 134, y + 64));
        // g2d.draw(new QuadCurve2D.Double(x + 134, y + 64, x + 138, y + 68, x + 144, y + 62));

        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 64, x + 133, y + 66, x + 133, y + 71));
        // g2d.draw(new QuadCurve2D.Double(x + 121, y + 69, x + 124, y + 80, x + 132, y + 79));
        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 79, x + 143, y + 79, x + 141, y + 65));

        // // // shirt-pok
        // g2d.draw(new QuadCurve2D.Double(x + 88, y + 85, x + 80, y + 81, x + 70, y + 73));    //

        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 73, x + 53, y + 62, x + 57, y + 80));    //

        // g2d.draw(new QuadCurve2D.Double(x + 71, y + 74, x + 74, y + 103, x + 102, y + 96));  //

        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 97, x + 147, y + 111, x + 149, y + 88));    //

        // // // shirt-boo
        // g2d.draw(new QuadCurve2D.Double(x + 116, y + 96, x + 115, y + 105, x + 127, y + 96));

        // g2d.draw(new QuadCurve2D.Double(x + 116, y + 96, x + 103, y + 91, x + 95, y + 104));
        // g2d.draw(new QuadCurve2D.Double(x + 95, y + 104, x + 85, y + 118, x + 100, y + 115));
        // g2d.draw(new QuadCurve2D.Double(x + 100, y + 115, x + 110, y + 112, x + 116, y + 100));

        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 96, x + 128, y + 110, x + 124, y + 113));
        // g2d.draw(new QuadCurve2D.Double(x + 124, y + 113, x + 110, y + 124, x + 112, y + 108));

        // // shirt-arm L
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 74, x + 65, y + 75, x + 52, y + 84));
        // g2d.draw(new QuadCurve2D.Double(x + 52, y + 84, x + 41, y + 90, x + 48, y + 92));
        // g2d.draw(new QuadCurve2D.Double(x + 48, y + 92, x + 56, y + 100, x + 58, y + 111));
        // g2d.draw(new QuadCurve2D.Double(x + 58, y + 111, x + 57, y + 120, x + 72, y + 111));

        // // shirt-arm R
        // g2d.draw(new QuadCurve2D.Double(x + 150, y + 86, x + 160, y + 94, x + 163, y + 98));
        // g2d.draw(new QuadCurve2D.Double(x + 163, y + 98, x + 170, y + 101, x + 149, y + 123));

        // // shirt
        // g2d.draw(new QuadCurve2D.Double(x + 147, y + 110, x + 149, y + 137, x + 145, y + 137));
        // g2d.draw(new QuadCurve2D.Double(x + 145, y + 137, x + 100, y + 125, x + 65, y + 127));
        // g2d.draw(new QuadCurve2D.Double(x + 65, y + 127, x + 60, y + 129, x + 63, y + 116));

        // // hand L
        // g2d.draw(new QuadCurve2D.Double(x + 46, y + 90, x + 33, y + 105, x + 44, y + 112));
        // g2d.draw(new QuadCurve2D.Double(x + 44, y + 112, x + 50, y + 116, x + 57, y + 115));

        // // hand R
        // g2d.draw(new QuadCurve2D.Double(x + 165, y + 101, x + 171, y + 115, x + 165, y + 121));
        // g2d.draw(new QuadCurve2D.Double(x + 165, y + 121, x + 160, y + 127, x + 149, y + 124));

        // // leg L
        // g2d.draw(new QuadCurve2D.Double(x + 63, y + 127, x + 62, y + 146, x + 68, y + 142));
        // g2d.draw(new QuadCurve2D.Double(x + 68, y + 142, x + 80, y + 169, x + 105, y + 162));
        // g2d.draw(new QuadCurve2D.Double(x + 105, y + 162, x + 119, y + 155, x + 111, y + 140));

        // // leg R
        // g2d.draw(new QuadCurve2D.Double(x + 145, y + 137, x + 143, y + 158, x + 137, y + 152));
        // g2d.draw(new QuadCurve2D.Double(x + 137, y + 152, x + 125, y + 170, x + 110, y + 179));
        // g2d.draw(new QuadCurve2D.Double(x + 110, y + 179, x + 82, y + 190, x + 85, y + 162));

        // // tail
        // g2d.draw(new QuadCurve2D.Double(x + 62, y + 133, x + 50, y + 130, x + 61, y + 120));

        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 147, x + 50, y + 165, x + 50, y + 154));
        // g2d.draw(new QuadCurve2D.Double(x + 50, y + 154, x + 20, y + 158, x + 15, y + 133));
        // g2d.draw(new QuadCurve2D.Double(x + 15, y + 133, x + 13, y + 124, x + 20, y + 126));
        // g2d.draw(new QuadCurve2D.Double(x + 20, y + 126, x + 20, y + 105, x + 40, y + 97));







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







        // // frame 2 (y + 5)

        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(3)); 

        // // set colur
        // g2d.setColor(new Color(255, 203, 162));
        // // g2d.setColor(Color.RED);

        // // shadow head
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 30, x + 97, y + 28, x + 96, y + 21));

        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 45, x + 80, y + 62, x + 89, y + 62));
        // g2d.draw(new QuadCurve2D.Double(x + 89, y + 62, x + 85, y + 75, x + 88, y + 90));

        // // shadow-hat
        // g2d.draw(new QuadCurve2D.Double(x + 108, y + 14, x + 105, y + 20, x + 120, y + 26));

        // // shadow shirt
        // g2d.draw(new QuadCurve2D.Double(x + 72, y + 85, x + 52, y + 98, x + 65, y + 119));

        // g2d.draw(new QuadCurve2D.Double(x + 72, y + 116, x + 76, y + 120, x + 75, y + 130));

        // // shadow leg
        // g2d.draw(new QuadCurve2D.Double(x + 75, y + 133, x + 88, y + 165, x + 107, y + 167));

        // g2d.draw(new QuadCurve2D.Double(x + 111, y + 167, x + 115, y + 177, x + 122, y + 177));



        // // set colur
        // g2d.setColor(Color.BLACK);

        // // ear L
        // g2d.draw(new QuadCurve2D.Double(x + 82, y + 40, x + 92, y, x + 101, y + 30));
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 30, x + 94, y + 28, x + 92, y + 37));
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 37, x + 100, y + 30, x + 92, y + 44));
        
        // // ear R
        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 28, x + 149, y + 7, x + 145, y + 38));

        // // head
        // g2d.draw(new QuadCurve2D.Double(x + 101, y + 30, x + 105, y + 15, x + 108, y + 28));
        // g2d.draw(new QuadCurve2D.Double(x + 108, y + 28, x + 120, y + 25, x + 132, y + 28));

        // g2d.draw(new QuadCurve2D.Double(x + 145, y + 38, x + 155, y + 30, x + 150, y + 44));
        // g2d.draw(new QuadCurve2D.Double(x + 150, y + 44, x + 160, y + 55, x + 160, y + 75));
        // g2d.draw(new QuadCurve2D.Double(x + 160, y + 75, x + 162, y + 85, x + 155, y + 85));
        // g2d.draw(new QuadCurve2D.Double(x + 155, y + 85, x + 140, y + 105, x + 137, y + 97));
        // g2d.draw(new QuadCurve2D.Double(x + 137, y + 97, x + 120, y + 103, x + 104, y + 94));
        // g2d.draw(new QuadCurve2D.Double(x + 104, y + 94, x + 100, y + 100, x + 88, y + 90));

        // g2d.draw(new QuadCurve2D.Double(x + 82, y + 40, x + 60, y + 55, x + 73, y + 60));
        // g2d.draw(new QuadCurve2D.Double(x + 73, y + 60, x + 68, y + 68, x + 70, y + 78));


        // // hat
        // g2d.draw(new QuadCurve2D.Double(x + 135, y + 25, x + 120, y - 8, x + 70, y + 35));
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 35, x + 60, y + 42, x + 72, y + 50));

        // g2d.draw(new QuadCurve2D.Double(x + 72, y + 33, x + 68, y + 32, x + 70, y + 25));
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 25, x + 80, y + 7, x + 86, y + 21));

        // // boo-hat
        // g2d.draw(new QuadCurve2D.Double(x + 68, y + 26, x + 60, y + 28, x + 50, y + 28));
        // g2d.draw(new QuadCurve2D.Double(x + 50, y + 28, x + 35, y + 22, x + 45, y + 36));
        // g2d.draw(new QuadCurve2D.Double(x + 45, y + 36, x + 35, y + 39, x + 45, y + 45));
        // g2d.draw(new QuadCurve2D.Double(x + 45, y + 45, x + 50, y + 47, x + 65, y + 40));

        // // eye
        // g2d.rotate(Math.toRadians(-20), x + 115, y + 60); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 111, y + 57, 8, 5));
        // g2d.rotate(Math.toRadians(20), x + 115, y + 60); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 58); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 138, y + 57, 7, 5));
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 58); // หมุนกลับ

        // // nose
        // g2d.fill(new Ellipse2D.Double(x + 127, y + 58, 8, 6));

        // // mouth
        // g2d.draw(new QuadCurve2D.Double(x + 113, y + 70, x + 121, y + 76, x + 127, y + 69));
        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 69, x + 130, y + 65, x + 134, y + 69));
        // g2d.draw(new QuadCurve2D.Double(x + 134, y + 69, x + 138, y + 73, x + 144, y + 67));

        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 69, x + 133, y + 70, x + 133, y + 72));
        // g2d.draw(new QuadCurve2D.Double(x + 121, y + 74, x + 124, y + 80, x + 132, y + 79));
        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 79, x + 143, y + 79, x + 141, y + 70));

        // // shirt-pok
        // g2d.draw(new QuadCurve2D.Double(x + 88, y + 90, x + 80, y + 86, x + 70, y + 78));

        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 78, x + 53, y + 62, x + 57, y + 85));

        // g2d.draw(new QuadCurve2D.Double(x + 71, y + 79, x + 74, y + 108, x + 102, y + 101));

        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 102, x + 147, y + 116, x + 149, y + 93));

        // // shirt-boo
        // g2d.draw(new QuadCurve2D.Double(x + 116, y + 101, x + 115, y + 110, x + 127, y + 101));

        // g2d.draw(new QuadCurve2D.Double(x + 116, y + 101, x + 100, y + 96, x + 92, y + 109));
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 109, x + 82, y + 118, x + 97, y + 117));
        // g2d.draw(new QuadCurve2D.Double(x + 97, y + 117, x + 107, y + 117, x + 116, y + 105));

        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 101, x + 128, y + 115, x + 122, y + 118));
        // g2d.draw(new QuadCurve2D.Double(x + 122, y + 118, x + 105, y + 129, x + 112, y + 111));

        // // shirt-arm L
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 79, x + 65, y + 80, x + 52, y + 89));
        // g2d.draw(new QuadCurve2D.Double(x + 52, y + 89, x + 41, y + 95, x + 48, y + 97));
        // g2d.draw(new QuadCurve2D.Double(x + 48, y + 97, x + 56, y + 105, x + 58, y + 116));
        // g2d.draw(new QuadCurve2D.Double(x + 58, y + 116, x + 57, y + 125, x + 72, y + 116));

        // // shirt-arm R
        // g2d.draw(new QuadCurve2D.Double(x + 150, y + 91, x + 160, y + 99, x + 163, y + 103));
        // g2d.draw(new QuadCurve2D.Double(x + 163, y + 103, x + 170, y + 106, x + 149, y + 128));

        // // shirt
        // g2d.draw(new QuadCurve2D.Double(x + 147, y + 115, x + 149, y + 142, x + 145, y + 142));
        // g2d.draw(new QuadCurve2D.Double(x + 145, y + 142, x + 100, y + 130, x + 65, y + 132));
        // g2d.draw(new QuadCurve2D.Double(x + 65, y + 132, x + 60, y + 134, x + 63, y + 121));

        // // hand L
        // g2d.draw(new QuadCurve2D.Double(x + 46, y + 95, x + 33, y + 110, x + 44, y + 117));
        // g2d.draw(new QuadCurve2D.Double(x + 44, y + 117, x + 50, y + 121, x + 57, y + 120));

        // // hand R
        // g2d.draw(new QuadCurve2D.Double(x + 165, y + 106, x + 171, y + 120, x + 165, y + 126));
        // g2d.draw(new QuadCurve2D.Double(x + 165, y + 127, x + 160, y + 132, x + 149, y + 129));

        // // leg L
        // g2d.draw(new QuadCurve2D.Double(x + 63, y + 132, x + 62, y + 156, x + 70, y + 152));
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 152, x + 80, y + 179, x + 103, y + 172));
        // g2d.draw(new QuadCurve2D.Double(x + 103, y + 172, x + 117, y + 165, x + 111, y + 142));

        // // leg R
        // g2d.draw(new QuadCurve2D.Double(x + 145, y + 142, x + 145, y + 158, x + 139, y + 157));
        // g2d.draw(new QuadCurve2D.Double(x + 139, y + 157, x + 132, y + 170, x + 122, y + 179));
        // g2d.draw(new QuadCurve2D.Double(x + 122, y + 179, x + 104, y + 188, x + 98, y + 173));

        // // tail
        // g2d.draw(new QuadCurve2D.Double(x + 62, y + 133, x + 50, y + 130, x + 61, y + 120));

        // g2d.draw(new QuadCurve2D.Double(x + 64, y + 152, x + 50, y + 163, x + 50, y + 154));
        // g2d.draw(new QuadCurve2D.Double(x + 50, y + 154, x + 20, y + 153, x + 17, y + 128));
        // g2d.draw(new QuadCurve2D.Double(x + 17, y + 128, x + 15, y + 119, x + 22, y + 121));
        // g2d.draw(new QuadCurve2D.Double(x + 22, y + 121, x + 22, y + 95, x + 53, y + 87));






        // frame 3

        // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // หนา 3 px
        g2d.setStroke(new BasicStroke(3)); 

        // set colur
        g2d.setColor(new Color(255, 203, 162));
        // g2d.setColor(Color.RED);

        // shadow head
        g2d.draw(new QuadCurve2D.Double(x + 92, y + 25, x + 97, y + 23, x + 96, y + 16));

        g2d.draw(new QuadCurve2D.Double(x + 92, y + 40, x + 80, y + 57, x + 89, y + 57));
        g2d.draw(new QuadCurve2D.Double(x + 89, y + 57, x + 85, y + 70, x + 88, y + 85));

        // shadow-hat
        g2d.draw(new QuadCurve2D.Double(x + 108, y + 9, x + 105, y + 15, x + 120, y + 21));

        // shadow shirt
        g2d.draw(new QuadCurve2D.Double(x + 72, y + 80, x + 52, y + 93, x + 65, y + 116));

        g2d.draw(new QuadCurve2D.Double(x + 72, y + 116, x + 74, y + 117, x + 75, y + 125));

        // shadow leg
        g2d.draw(new QuadCurve2D.Double(x + 75, y + 128, x + 80, y + 174, x + 95, y + 180));

        g2d.draw(new QuadCurve2D.Double(x + 112, y + 152, x + 116, y + 176, x + 126, y + 180));



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
        g2d.draw(new QuadCurve2D.Double(x + 70, y + 74, x + 65, y + 75, x + 52, y + 89));
        g2d.draw(new QuadCurve2D.Double(x + 52, y + 89, x + 43, y + 95, x + 48, y + 97));
        g2d.draw(new QuadCurve2D.Double(x + 48, y + 97, x + 56, y + 105, x + 61, y + 116));
        g2d.draw(new QuadCurve2D.Double(x + 61, y + 116, x + 62, y + 124, x + 73, y + 115));

        // shirt-arm R
        g2d.draw(new QuadCurve2D.Double(x + 150, y + 86, x + 160, y + 94, x + 163, y + 98));
        g2d.draw(new QuadCurve2D.Double(x + 163, y + 98, x + 170, y + 101, x + 149, y + 123));

        // shirt
        g2d.draw(new QuadCurve2D.Double(x + 147, y + 110, x + 149, y + 134, x + 145, y + 134));
        g2d.draw(new QuadCurve2D.Double(x + 145, y + 134, x + 100, y + 126, x + 65, y + 129));
        g2d.draw(new QuadCurve2D.Double(x + 65, y + 129, x + 60, y + 131, x + 63, y + 119));

        // hand L
        g2d.draw(new QuadCurve2D.Double(x + 46, y + 97, x + 36, y + 112, x + 47, y + 119));
        g2d.draw(new QuadCurve2D.Double(x + 47, y + 119, x + 53, y + 123, x + 60, y + 120));

        // hand R
        g2d.draw(new QuadCurve2D.Double(x + 165, y + 101, x + 171, y + 115, x + 165, y + 121));
        g2d.draw(new QuadCurve2D.Double(x + 165, y + 121, x + 160, y + 127, x + 149, y + 124));

        // leg L
        g2d.draw(new QuadCurve2D.Double(x + 63, y + 127, x + 60, y + 146, x + 66, y + 142));
        g2d.draw(new QuadCurve2D.Double(x + 66, y + 142, x + 70, y + 180, x + 85, y + 183));
        g2d.draw(new QuadCurve2D.Double(x + 85, y + 183, x + 104, y + 184, x + 113, y + 145));

        // leg R
        g2d.draw(new QuadCurve2D.Double(x + 147, y + 135, x + 151, y + 152, x + 144, y + 148));
        g2d.draw(new QuadCurve2D.Double(x + 104, y + 170, x + 109, y + 182, x + 116, y + 183));
        g2d.draw(new QuadCurve2D.Double(x + 116, y + 183, x + 135, y + 184, x + 144, y + 148));

        // tail
        g2d.draw(new QuadCurve2D.Double(x + 62, y + 133, x + 50, y + 130, x + 61, y + 120));

        g2d.draw(new QuadCurve2D.Double(x + 66, y + 150, x + 50, y + 165, x + 50, y + 154));
        g2d.draw(new QuadCurve2D.Double(x + 50, y + 154, x + 20, y + 158, x + 15, y + 133));
        g2d.draw(new QuadCurve2D.Double(x + 15, y + 133, x + 13, y + 124, x + 20, y + 126));
        g2d.draw(new QuadCurve2D.Double(x + 20, y + 126, x + 20, y + 103, x + 45, y + 95));







        // // frame 4 (y - 5)

        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(3)); 

        // // set colur
        // g2d.setColor(new Color(255, 203, 162));
        // // g2d.setColor(Color.RED);

        // // shadow head
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 25, x + 97, y + 23, x + 96, y + 16));

        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 37, x + 80, y + 52, x + 89, y + 52));
        // g2d.draw(new QuadCurve2D.Double(x + 89, y + 52, x + 85, y + 65, x + 88, y + 79));

        // // shadow-hat
        // g2d.draw(new QuadCurve2D.Double(x + 108, y + 4, x + 105, y + 10, x + 120, y + 16));

        // // shadow shirt
        // g2d.draw(new QuadCurve2D.Double(x + 72, y + 76, x + 52, y + 88, x + 65, y + 113));

        // g2d.draw(new QuadCurve2D.Double(x + 72, y + 111, x + 74, y + 112, x + 75, y + 120));

        // // shadow leg
        // g2d.draw(new QuadCurve2D.Double(x + 75, y + 123, x + 75, y + 164, x + 90, y + 175));

        // g2d.draw(new QuadCurve2D.Double(x + 114, y + 147, x + 121, y + 171, x + 131, y + 174));



        // // set colur
        // g2d.setColor(Color.BLACK);

        // // ear L
        // g2d.draw(new QuadCurve2D.Double(x + 82, y + 30, x + 92, y + 5, x + 101, y + 20));
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 25, x + 94, y + 33, x + 92, y + 30));
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 30, x + 100, y + 30, x + 92, y + 37));
        
        // // ear R
        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 18, x + 156, y + 10, x + 145, y + 28));

        // // head
        // g2d.draw(new QuadCurve2D.Double(x + 101, y + 20, x + 105, y + 10, x + 108, y + 18));
        // g2d.draw(new QuadCurve2D.Double(x + 108, y + 18, x + 120, y + 15, x + 132, y + 18));

        // g2d.draw(new QuadCurve2D.Double(x + 145, y + 28, x + 155, y + 25, x + 150, y + 34));
        // g2d.draw(new QuadCurve2D.Double(x + 150, y + 34, x + 160, y + 45, x + 160, y + 65));
        // g2d.draw(new QuadCurve2D.Double(x + 160, y + 65, x + 162, y + 75, x + 155, y + 75));
        // g2d.draw(new QuadCurve2D.Double(x + 155, y + 75, x + 140, y + 95, x + 137, y + 87));
        // g2d.draw(new QuadCurve2D.Double(x + 137, y + 87, x + 120, y + 93, x + 104, y + 84));
        // g2d.draw(new QuadCurve2D.Double(x + 104, y + 84, x + 100, y + 90, x + 88, y + 80));

        // g2d.draw(new QuadCurve2D.Double(x + 82, y + 30, x + 60, y + 50, x + 73, y + 50));
        // g2d.draw(new QuadCurve2D.Double(x + 73, y + 50, x + 68, y + 63, x + 70, y + 68));


        // // hat
        // g2d.draw(new QuadCurve2D.Double(x + 135, y + 15, x + 120, y - 18, x + 70, y + 25));
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 25, x + 60, y + 32, x + 72, y + 40));

        // g2d.draw(new QuadCurve2D.Double(x + 72, y + 23, x + 68, y + 22, x + 70, y + 15));
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 15, x + 80, y - 3, x + 86, y + 11));

        // // boo-hat
        // g2d.draw(new QuadCurve2D.Double(x + 68, y + 16, x + 60, y + 23, x + 50, y + 23));
        // g2d.draw(new QuadCurve2D.Double(x + 50, y + 23, x + 35, y + 22, x + 45, y + 31));
        // g2d.draw(new QuadCurve2D.Double(x + 45, y + 31, x + 35, y + 39, x + 45, y + 40));
        // g2d.draw(new QuadCurve2D.Double(x + 45, y + 40, x + 50, y + 42, x + 65, y + 30));

        // // eye
        // g2d.rotate(Math.toRadians(-20), x + 115, y + 50); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 111, y + 47, 8, 5));
        // g2d.rotate(Math.toRadians(20), x + 115, y + 50); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 48); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 138, y + 47, 7, 5));
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 48); // หมุนกลับ

        // // nose
        // g2d.fill(new Ellipse2D.Double(x + 127, y + 48, 8, 6));

        // // mouth
        // g2d.draw(new QuadCurve2D.Double(x + 113, y + 60, x + 121, y + 66, x + 127, y + 59));
        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 59, x + 130, y + 55, x + 134, y + 59));
        // g2d.draw(new QuadCurve2D.Double(x + 134, y + 59, x + 138, y + 63, x + 144, y + 57));

        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 59, x + 133, y + 61, x + 133, y + 71));
        // g2d.draw(new QuadCurve2D.Double(x + 121, y + 64, x + 124, y + 80, x + 132, y + 79));
        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 79, x + 143, y + 79, x + 141, y + 60));

        // // shirt-pok
        // g2d.draw(new QuadCurve2D.Double(x + 88, y + 80, x + 80, y + 76, x + 70, y + 68));

        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 68, x + 53, y + 62, x + 57, y + 80));

        // g2d.draw(new QuadCurve2D.Double(x + 71, y + 69, x + 74, y + 98, x + 102, y + 91));

        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 92, x + 147, y + 106, x + 149, y + 83));

        // // shirt-boo
        // g2d.draw(new QuadCurve2D.Double(x + 116, y + 91, x + 115, y + 100, x + 127, y + 91));

        // g2d.draw(new QuadCurve2D.Double(x + 116, y + 91, x + 103, y + 91, x + 95, y + 99));
        // g2d.draw(new QuadCurve2D.Double(x + 95, y + 99, x + 85, y + 113, x + 100, y + 110));
        // g2d.draw(new QuadCurve2D.Double(x + 100, y + 110, x + 110, y + 107, x + 116, y + 95));

        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 91, x + 128, y + 105, x + 124, y + 108));
        // g2d.draw(new QuadCurve2D.Double(x + 124, y + 108, x + 110, y + 124, x + 112, y + 103));

        // // shirt-arm L
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 69, x + 65, y + 70, x + 52, y + 84));
        // g2d.draw(new QuadCurve2D.Double(x + 52, y + 84, x + 43, y + 90, x + 48, y + 92));
        // g2d.draw(new QuadCurve2D.Double(x + 48, y + 92, x + 56, y + 100, x + 61, y + 111));
        // g2d.draw(new QuadCurve2D.Double(x + 61, y + 111, x + 62, y + 119, x + 73, y + 110));

        // // shirt-arm R
        // g2d.draw(new QuadCurve2D.Double(x + 150, y + 81, x + 160, y + 89, x + 163, y + 93));
        // g2d.draw(new QuadCurve2D.Double(x + 163, y + 93, x + 170, y + 96, x + 149, y + 118));

        // // shirt
        // g2d.draw(new QuadCurve2D.Double(x + 147, y + 105, x + 149, y + 129, x + 145, y + 129));
        // g2d.draw(new QuadCurve2D.Double(x + 145, y + 129, x + 100, y + 126, x + 65, y + 124));
        // g2d.draw(new QuadCurve2D.Double(x + 65, y + 124, x + 60, y + 126, x + 63, y + 114));

        // // hand L
        // g2d.draw(new QuadCurve2D.Double(x + 46, y + 92, x + 36, y + 107, x + 47, y + 114));
        // g2d.draw(new QuadCurve2D.Double(x + 47, y + 114, x + 53, y + 118, x + 60, y + 115));

        // // hand R
        // g2d.draw(new QuadCurve2D.Double(x + 165, y + 96, x + 171, y + 110, x + 165, y + 116));
        // g2d.draw(new QuadCurve2D.Double(x + 165, y + 116, x + 160, y + 122, x + 149, y + 119));

        // // leg L
        // g2d.draw(new QuadCurve2D.Double(x + 63, y + 127, x + 57, y + 146, x + 63, y + 142));
        // g2d.draw(new QuadCurve2D.Double(x + 63, y + 142, x + 60, y + 180, x + 75, y + 183));
        // g2d.draw(new QuadCurve2D.Double(x + 75, y + 183, x + 94, y + 184, x + 113, y + 145));

        // // leg R
        // g2d.draw(new QuadCurve2D.Double(x + 147, y + 130, x + 153, y + 147, x + 147, y + 143));
        // g2d.draw(new QuadCurve2D.Double(x + 107, y + 158, x + 119, y + 177, x + 130, y + 175));
        // g2d.draw(new QuadCurve2D.Double(x + 130, y + 175, x + 145, y + 174, x + 147, y + 143));

        // // tail
        // g2d.draw(new QuadCurve2D.Double(x + 62, y + 128, x + 50, y + 125, x + 61, y + 120));

        // g2d.draw(new QuadCurve2D.Double(x + 63, y + 148, x + 50, y + 160, x + 50, y + 149));
        // g2d.draw(new QuadCurve2D.Double(x + 50, y + 149, x + 20, y + 153, x + 15, y + 128));
        // g2d.draw(new QuadCurve2D.Double(x + 15, y + 128, x + 13, y + 119, x + 20, y + 121));
        // g2d.draw(new QuadCurve2D.Double(x + 20, y + 121, x + 20, y + 103, x + 42, y + 100));








        // // frame 5

        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(3)); 

        // // // set colur
        // g2d.setColor(new Color(255, 203, 162));
        // // g2d.setColor(Color.RED);

        // // shadow head
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 25, x + 97, y + 23, x + 96, y + 16));

        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 40, x + 80, y + 57, x + 89, y + 57));
        // g2d.draw(new QuadCurve2D.Double(x + 89, y + 57, x + 85, y + 70, x + 88, y + 85));

        // // shadow-hat
        // g2d.draw(new QuadCurve2D.Double(x + 108, y + 9, x + 105, y + 15, x + 120, y + 21));

        // // shadow shirt
        // g2d.draw(new QuadCurve2D.Double(x + 72, y + 80, x + 52, y + 93, x + 72, y + 116));

        // g2d.draw(new QuadCurve2D.Double(x + 76, y + 116, x + 77, y + 117, x + 75, y + 127));

        // // shadow leg
        // g2d.draw(new QuadCurve2D.Double(x + 75, y + 128, x + 60, y + 174, x + 75, y + 179));

        // g2d.draw(new QuadCurve2D.Double(x + 115, y + 144, x + 126, y + 160, x + 138, y + 167));



        // // set colur
        // g2d.setColor(Color.BLACK);

        // // ear L
        // g2d.draw(new QuadCurve2D.Double(x + 82, y + 35, x + 92, y, x + 101, y + 25));
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 25, x + 94, y + 28, x + 92, y + 32));
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 32, x + 100, y + 30, x + 92, y + 39));
        
        // // ear R
        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 23, x + 149, y + 7, x + 145, y + 33));

        // // head
        // g2d.draw(new QuadCurve2D.Double(x + 101, y + 25, x + 105, y + 15, x + 108, y + 23));
        // g2d.draw(new QuadCurve2D.Double(x + 108, y + 23, x + 120, y + 20, x + 132, y + 23));

        // g2d.draw(new QuadCurve2D.Double(x + 145, y + 33, x + 155, y + 30, x + 150, y + 39));
        // g2d.draw(new QuadCurve2D.Double(x + 150, y + 39, x + 160, y + 50, x + 160, y + 70));
        // g2d.draw(new QuadCurve2D.Double(x + 160, y + 70, x + 162, y + 80, x + 155, y + 80));
        // g2d.draw(new QuadCurve2D.Double(x + 155, y + 80, x + 140, y + 100, x + 137, y + 92));
        // g2d.draw(new QuadCurve2D.Double(x + 137, y + 92, x + 120, y + 98, x + 104, y + 89));
        // g2d.draw(new QuadCurve2D.Double(x + 104, y + 89, x + 100, y + 95, x + 88, y + 85));

        // g2d.draw(new QuadCurve2D.Double(x + 82, y + 35, x + 60, y + 55, x + 73, y + 55));
        // g2d.draw(new QuadCurve2D.Double(x + 73, y + 55, x + 68, y + 68, x + 70, y + 73));


        // // hat
        // g2d.draw(new QuadCurve2D.Double(x + 135, y + 20, x + 120, y - 13, x + 70, y + 30));
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 30, x + 60, y + 37, x + 72, y + 45));

        // g2d.draw(new QuadCurve2D.Double(x + 72, y + 28, x + 68, y + 27, x + 70, y + 20));
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 20, x + 80, y + 2, x + 86, y + 16));

        // // boo-hat
        // g2d.draw(new QuadCurve2D.Double(x + 68, y + 21, x + 60, y + 23, x + 50, y + 23));
        // g2d.draw(new QuadCurve2D.Double(x + 50, y + 23, x + 35, y + 22, x + 45, y + 31));
        // g2d.draw(new QuadCurve2D.Double(x + 45, y + 31, x + 35, y + 39, x + 45, y + 40));
        // g2d.draw(new QuadCurve2D.Double(x + 45, y + 40, x + 50, y + 42, x + 65, y + 35));

        // // eye
        // g2d.rotate(Math.toRadians(-20), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 111, y + 52, 8, 5));
        // g2d.rotate(Math.toRadians(20), x + 115, y + 55); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 138, y + 52, 7, 5));
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ

        // // nose
        // g2d.fill(new Ellipse2D.Double(x + 127, y + 53, 8, 6));

        // // mouth
        // g2d.draw(new QuadCurve2D.Double(x + 113, y + 65, x + 121, y + 71, x + 127, y + 64));
        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 64, x + 130, y + 60, x + 134, y + 64));
        // g2d.draw(new QuadCurve2D.Double(x + 134, y + 64, x + 138, y + 68, x + 144, y + 62));

        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 64, x + 133, y + 66, x + 133, y + 71));
        // g2d.draw(new QuadCurve2D.Double(x + 121, y + 69, x + 124, y + 80, x + 132, y + 79));
        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 79, x + 143, y + 79, x + 141, y + 65));

        // // shirt-pok
        // g2d.draw(new QuadCurve2D.Double(x + 88, y + 85, x + 80, y + 81, x + 70, y + 73));

        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 73, x + 53, y + 62, x + 57, y + 80));

        // g2d.draw(new QuadCurve2D.Double(x + 71, y + 74, x + 74, y + 103, x + 102, y + 96));

        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 97, x + 147, y + 111, x + 149, y + 88));

        // // shirt-boo
        // g2d.draw(new QuadCurve2D.Double(x + 116, y + 96, x + 115, y + 105, x + 127, y + 96));

        // g2d.draw(new QuadCurve2D.Double(x + 116, y + 96, x + 103, y + 91, x + 95, y + 104));
        // g2d.draw(new QuadCurve2D.Double(x + 95, y + 104, x + 85, y + 118, x + 100, y + 115));
        // g2d.draw(new QuadCurve2D.Double(x + 100, y + 115, x + 110, y + 112, x + 116, y + 100));

        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 96, x + 128, y + 110, x + 124, y + 113));
        // g2d.draw(new QuadCurve2D.Double(x + 124, y + 113, x + 110, y + 124, x + 112, y + 108));

        // // shirt-arm L
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 74, x + 65, y + 75, x + 52, y + 89));
        // g2d.draw(new QuadCurve2D.Double(x + 52, y + 89, x + 41, y + 103, x + 48, y + 104));
        // g2d.draw(new QuadCurve2D.Double(x + 48, y + 104, x + 58, y + 107, x + 68, y + 120));
        // g2d.draw(new QuadCurve2D.Double(x + 68, y + 120, x + 70, y + 126, x + 78, y + 112));

        // // shirt-arm R
        // g2d.draw(new QuadCurve2D.Double(x + 150, y + 86, x + 160, y + 94, x + 163, y + 98));
        // g2d.draw(new QuadCurve2D.Double(x + 163, y + 98, x + 170, y + 101, x + 149, y + 123));

        // // shirt
        // g2d.draw(new QuadCurve2D.Double(x + 147, y + 110, x + 150, y + 134, x + 147, y + 134));
        // g2d.draw(new QuadCurve2D.Double(x + 147, y + 134, x + 120, y + 131, x + 65, y + 129));
        // g2d.draw(new QuadCurve2D.Double(x + 65, y + 129, x + 60, y + 131, x + 63, y + 124));

        // // hand L
        // g2d.draw(new QuadCurve2D.Double(x + 46, y + 102, x + 36, y + 117, x + 47, y + 124));
        // g2d.draw(new QuadCurve2D.Double(x + 47, y + 124, x + 55, y + 130, x + 66, y + 121));

        // // hand R
        // g2d.draw(new QuadCurve2D.Double(x + 165, y + 101, x + 171, y + 115, x + 165, y + 121));
        // g2d.draw(new QuadCurve2D.Double(x + 165, y + 121, x + 160, y + 127, x + 149, y + 124));

        // // leg L
        // g2d.draw(new QuadCurve2D.Double(x + 63, y + 127, x + 50, y + 141, x + 58, y + 142));
        // g2d.draw(new QuadCurve2D.Double(x + 58, y + 142, x + 50, y + 175, x + 60, y + 183));
        // g2d.draw(new QuadCurve2D.Double(x + 60, y + 183, x + 83, y + 186, x + 115, y + 143));

        // // leg R
        // g2d.draw(new QuadCurve2D.Double(x + 147, y + 135, x + 156, y + 142, x + 149, y + 143));
        // g2d.draw(new QuadCurve2D.Double(x + 108, y + 153, x + 119, y + 162, x + 126, y + 165));
        // g2d.draw(new QuadCurve2D.Double(x + 126, y + 165, x + 155, y + 179, x + 149, y + 143));

        // // tail
        // g2d.draw(new QuadCurve2D.Double(x + 58, y + 132, x + 55, y + 130, x + 57, y + 125));

        // g2d.draw(new QuadCurve2D.Double(x + 55, y + 158, x + 48, y + 160, x + 50, y + 154));
        // g2d.draw(new QuadCurve2D.Double(x + 50, y + 154, x + 20, y + 158, x + 15, y + 133));
        // g2d.draw(new QuadCurve2D.Double(x + 15, y + 133, x + 13, y + 124, x + 20, y + 126));
        // g2d.draw(new QuadCurve2D.Double(x + 20, y + 126, x + 20, y + 102, x + 47, y + 95));








        // // frame 6 (y + 5)

        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(3)); 

        // // set colur
        // g2d.setColor(new Color(255, 203, 162));
        // // g2d.setColor(Color.RED);

        // // shadow head
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 30, x + 97, y + 28, x + 96, y + 21));

        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 45, x + 80, y + 62, x + 89, y + 62));
        // g2d.draw(new QuadCurve2D.Double(x + 89, y + 62, x + 85, y + 75, x + 88, y + 90));

        // // shadow-hat
        // g2d.draw(new QuadCurve2D.Double(x + 108, y + 14, x + 105, y + 20, x + 120, y + 26));

        // // shadow shirt
        // g2d.draw(new QuadCurve2D.Double(x + 72, y + 85, x + 52, y + 98, x + 72, y + 121));

        // g2d.draw(new QuadCurve2D.Double(x + 76, y + 121, x + 77, y + 122, x + 75, y + 132));

        // // shadow leg
        // g2d.draw(new QuadCurve2D.Double(x + 75, y + 133, x + 70, y + 165, x + 80, y + 175));

        // g2d.draw(new QuadCurve2D.Double(x + 115, y + 145, x + 123, y + 175, x + 133, y + 179));



        // // set colur
        // g2d.setColor(Color.BLACK);

        // // ear L
        // g2d.draw(new QuadCurve2D.Double(x + 82, y + 40, x + 92, y, x + 101, y + 30));
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 30, x + 94, y + 28, x + 92, y + 37));
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 37, x + 100, y + 30, x + 92, y + 44));
        
        // // ear R
        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 28, x + 149, y + 7, x + 145, y + 38));

        // // head
        // g2d.draw(new QuadCurve2D.Double(x + 101, y + 30, x + 105, y + 15, x + 108, y + 28));
        // g2d.draw(new QuadCurve2D.Double(x + 108, y + 28, x + 120, y + 25, x + 132, y + 28));

        // g2d.draw(new QuadCurve2D.Double(x + 145, y + 38, x + 155, y + 30, x + 150, y + 44));
        // g2d.draw(new QuadCurve2D.Double(x + 150, y + 44, x + 160, y + 55, x + 160, y + 75));
        // g2d.draw(new QuadCurve2D.Double(x + 160, y + 75, x + 162, y + 85, x + 155, y + 85));
        // g2d.draw(new QuadCurve2D.Double(x + 155, y + 85, x + 140, y + 105, x + 137, y + 97));
        // g2d.draw(new QuadCurve2D.Double(x + 137, y + 97, x + 120, y + 103, x + 104, y + 94));
        // g2d.draw(new QuadCurve2D.Double(x + 104, y + 94, x + 100, y + 100, x + 88, y + 90));

        // g2d.draw(new QuadCurve2D.Double(x + 82, y + 40, x + 60, y + 55, x + 73, y + 60));
        // g2d.draw(new QuadCurve2D.Double(x + 73, y + 60, x + 68, y + 68, x + 70, y + 78));

        // // hat
        // g2d.draw(new QuadCurve2D.Double(x + 135, y + 25, x + 120, y - 8, x + 70, y + 35));
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 35, x + 60, y + 42, x + 71, y + 49));

        // g2d.draw(new QuadCurve2D.Double(x + 72, y + 33, x + 68, y + 32, x + 70, y + 25));
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 25, x + 80, y + 7, x + 86, y + 21));

        // // boo-hat
        // g2d.draw(new QuadCurve2D.Double(x + 68, y + 26, x + 60, y + 28, x + 50, y + 28));
        // g2d.draw(new QuadCurve2D.Double(x + 50, y + 28, x + 35, y + 22, x + 45, y + 36));
        // g2d.draw(new QuadCurve2D.Double(x + 45, y + 36, x + 35, y + 39, x + 45, y + 45));
        // g2d.draw(new QuadCurve2D.Double(x + 45, y + 45, x + 50, y + 47, x + 65, y + 40));

        // // eye
        // g2d.rotate(Math.toRadians(-20), x + 115, y + 60); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 111, y + 57, 8, 5));
        // g2d.rotate(Math.toRadians(20), x + 115, y + 60); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 58); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 138, y + 57, 7, 5));
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 58); // หมุนกลับ

        // // nose
        // g2d.fill(new Ellipse2D.Double(x + 127, y + 58, 8, 6));

        // // mouth
        // g2d.draw(new QuadCurve2D.Double(x + 113, y + 70, x + 121, y + 76, x + 127, y + 69));
        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 69, x + 130, y + 65, x + 134, y + 69));
        // g2d.draw(new QuadCurve2D.Double(x + 134, y + 69, x + 138, y + 73, x + 144, y + 67));

        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 69, x + 133, y + 70, x + 133, y + 72));
        // g2d.draw(new QuadCurve2D.Double(x + 121, y + 74, x + 124, y + 80, x + 132, y + 79));
        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 79, x + 143, y + 79, x + 141, y + 70));

        // // shirt-pok
        // g2d.draw(new QuadCurve2D.Double(x + 88, y + 90, x + 80, y + 86, x + 70, y + 78));

        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 78, x + 53, y + 62, x + 57, y + 85));

        // g2d.draw(new QuadCurve2D.Double(x + 71, y + 79, x + 74, y + 108, x + 102, y + 101));

        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 102, x + 147, y + 116, x + 149, y + 93));

        // // shirt-boo
        // g2d.draw(new QuadCurve2D.Double(x + 116, y + 101, x + 115, y + 110, x + 127, y + 101));

        // g2d.draw(new QuadCurve2D.Double(x + 116, y + 101, x + 100, y + 96, x + 92, y + 109));
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 109, x + 82, y + 118, x + 97, y + 117));
        // g2d.draw(new QuadCurve2D.Double(x + 97, y + 117, x + 107, y + 117, x + 116, y + 105));

        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 101, x + 128, y + 115, x + 122, y + 118));
        // g2d.draw(new QuadCurve2D.Double(x + 122, y + 118, x + 105, y + 129, x + 112, y + 111));

        // // shirt-arm L
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 79, x + 65, y + 80, x + 52, y + 94));
        // g2d.draw(new QuadCurve2D.Double(x + 52, y + 94, x + 41, y + 108, x + 48, y + 109));
        // g2d.draw(new QuadCurve2D.Double(x + 48, y + 109, x + 58, y + 112, x + 68, y + 125));
        // g2d.draw(new QuadCurve2D.Double(x + 68, y + 125, x + 70, y + 131, x + 78, y + 117));

        // // shirt-arm R
        // g2d.draw(new QuadCurve2D.Double(x + 150, y + 91, x + 160, y + 99, x + 163, y + 103));
        // g2d.draw(new QuadCurve2D.Double(x + 163, y + 103, x + 170, y + 106, x + 149, y + 128));

        // // shirt
        // g2d.draw(new QuadCurve2D.Double(x + 147, y + 115, x + 150, y + 139, x + 147, y + 139));
        // g2d.draw(new QuadCurve2D.Double(x + 147, y + 139, x + 120, y + 136, x + 65, y + 134));
        // g2d.draw(new QuadCurve2D.Double(x + 65, y + 134, x + 60, y + 136, x + 63, y + 129));

        // // hand L
        // g2d.draw(new QuadCurve2D.Double(x + 46, y + 107, x + 36, y + 122, x + 47, y + 129));
        // g2d.draw(new QuadCurve2D.Double(x + 47, y + 129, x + 55, y + 135, x + 66, y + 126));

        // // hand R
        // g2d.draw(new QuadCurve2D.Double(x + 165, y + 106, x + 171, y + 120, x + 165, y + 126));
        // g2d.draw(new QuadCurve2D.Double(x + 165, y + 126, x + 160, y + 132, x + 149, y + 129));

        // // leg L
        // g2d.draw(new QuadCurve2D.Double(x + 63, y + 132, x + 55, y + 146, x + 63, y + 147));
        // g2d.draw(new QuadCurve2D.Double(x + 63, y + 147, x + 60, y + 170, x + 73, y + 178));
        // g2d.draw(new QuadCurve2D.Double(x + 73, y + 178, x + 85, y + 183, x + 115, y + 143));

        // // leg R
        // g2d.draw(new QuadCurve2D.Double(x + 147, y + 140, x + 151, y + 152, x + 144, y + 150));
        // g2d.draw(new QuadCurve2D.Double(x + 105, y + 155, x + 116, y + 180, x + 126, y + 183));
        // g2d.draw(new QuadCurve2D.Double(x + 126, y + 183, x + 143, y + 185, x + 144, y + 150));

        // // tail
        // g2d.draw(new QuadCurve2D.Double(x + 62, y + 133, x + 50, y + 130, x + 61, y + 120));

        // g2d.draw(new QuadCurve2D.Double(x + 62, y + 153, x + 50, y + 163, x + 50, y + 154));
        // g2d.draw(new QuadCurve2D.Double(x + 50, y + 154, x + 20, y + 153, x + 17, y + 128));
        // g2d.draw(new QuadCurve2D.Double(x + 17, y + 128, x + 15, y + 119, x + 22, y + 121));
        // g2d.draw(new QuadCurve2D.Double(x + 22, y + 121, x + 22, y + 95, x + 55, y + 88));








        // // frame 7

        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(3)); 

        // // // set colur
        // g2d.setColor(new Color(255, 203, 162));
        // // g2d.setColor(Color.RED);

        // // shadow head
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 25, x + 97, y + 23, x + 96, y + 16));

        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 40, x + 80, y + 57, x + 89, y + 57));
        // g2d.draw(new QuadCurve2D.Double(x + 89, y + 57, x + 85, y + 70, x + 88, y + 85));

        // // shadow-hat
        // g2d.draw(new QuadCurve2D.Double(x + 108, y + 9, x + 105, y + 15, x + 120, y + 21));

        // // shadow shirt
        // g2d.draw(new QuadCurve2D.Double(x + 72, y + 85, x + 52, y + 98, x + 70, y + 121));

        // g2d.draw(new QuadCurve2D.Double(x + 76, y + 117, x + 77, y + 119, x + 75, y + 127));

        // // shadow leg
        // g2d.draw(new QuadCurve2D.Double(x + 75, y + 128, x + 74, y + 164, x + 86, y + 172));

        // g2d.draw(new QuadCurve2D.Double(x + 115, y + 144, x + 113, y + 170, x + 124, y + 180));



        // // set colur
        // g2d.setColor(Color.BLACK);

        // // ear L
        // g2d.draw(new QuadCurve2D.Double(x + 82, y + 35, x + 92, y, x + 101, y + 25));
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 25, x + 94, y + 28, x + 92, y + 32));
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 32, x + 100, y + 30, x + 92, y + 39));
        
        // // ear R
        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 23, x + 149, y + 7, x + 145, y + 33));

        // // head
        // g2d.draw(new QuadCurve2D.Double(x + 101, y + 25, x + 105, y + 15, x + 108, y + 23));
        // g2d.draw(new QuadCurve2D.Double(x + 108, y + 23, x + 120, y + 20, x + 132, y + 23));

        // g2d.draw(new QuadCurve2D.Double(x + 145, y + 33, x + 155, y + 30, x + 150, y + 39));
        // g2d.draw(new QuadCurve2D.Double(x + 150, y + 39, x + 160, y + 50, x + 160, y + 70));
        // g2d.draw(new QuadCurve2D.Double(x + 160, y + 70, x + 162, y + 80, x + 155, y + 80));
        // g2d.draw(new QuadCurve2D.Double(x + 155, y + 80, x + 140, y + 100, x + 137, y + 92));
        // g2d.draw(new QuadCurve2D.Double(x + 137, y + 92, x + 120, y + 98, x + 104, y + 89));
        // g2d.draw(new QuadCurve2D.Double(x + 104, y + 89, x + 100, y + 95, x + 88, y + 85));

        // g2d.draw(new QuadCurve2D.Double(x + 82, y + 35, x + 60, y + 55, x + 73, y + 55));
        // g2d.draw(new QuadCurve2D.Double(x + 73, y + 55, x + 68, y + 68, x + 70, y + 73));


        // // hat
        // g2d.draw(new QuadCurve2D.Double(x + 135, y + 20, x + 120, y - 13, x + 70, y + 30));
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 30, x + 60, y + 37, x + 72, y + 45));

        // g2d.draw(new QuadCurve2D.Double(x + 72, y + 28, x + 68, y + 27, x + 70, y + 20));
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 20, x + 80, y + 2, x + 86, y + 16));

        // // boo-hat
        // g2d.draw(new QuadCurve2D.Double(x + 68, y + 21, x + 60, y + 23, x + 50, y + 23));
        // g2d.draw(new QuadCurve2D.Double(x + 50, y + 23, x + 35, y + 22, x + 45, y + 31));
        // g2d.draw(new QuadCurve2D.Double(x + 45, y + 31, x + 35, y + 39, x + 45, y + 40));
        // g2d.draw(new QuadCurve2D.Double(x + 45, y + 40, x + 50, y + 42, x + 65, y + 35));

        // // eye
        // g2d.rotate(Math.toRadians(-20), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 111, y + 52, 8, 5));
        // g2d.rotate(Math.toRadians(20), x + 115, y + 55); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 138, y + 52, 7, 5));
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ

        // // nose
        // g2d.fill(new Ellipse2D.Double(x + 127, y + 53, 8, 6));

        // // mouth
        // g2d.draw(new QuadCurve2D.Double(x + 113, y + 65, x + 121, y + 71, x + 127, y + 64));
        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 64, x + 130, y + 60, x + 134, y + 64));
        // g2d.draw(new QuadCurve2D.Double(x + 134, y + 64, x + 138, y + 68, x + 144, y + 62));

        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 64, x + 133, y + 66, x + 133, y + 71));
        // g2d.draw(new QuadCurve2D.Double(x + 121, y + 69, x + 124, y + 80, x + 132, y + 79));
        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 79, x + 143, y + 79, x + 141, y + 65));

        // // shirt-pok
        // g2d.draw(new QuadCurve2D.Double(x + 88, y + 85, x + 80, y + 81, x + 70, y + 73));

        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 73, x + 53, y + 62, x + 57, y + 80));

        // g2d.draw(new QuadCurve2D.Double(x + 71, y + 74, x + 74, y + 103, x + 102, y + 96));

        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 97, x + 147, y + 111, x + 149, y + 88));

        // // shirt-boo
        // g2d.draw(new QuadCurve2D.Double(x + 116, y + 96, x + 115, y + 105, x + 127, y + 96));

        // g2d.draw(new QuadCurve2D.Double(x + 116, y + 96, x + 103, y + 91, x + 95, y + 104));
        // g2d.draw(new QuadCurve2D.Double(x + 95, y + 104, x + 85, y + 118, x + 100, y + 115));
        // g2d.draw(new QuadCurve2D.Double(x + 100, y + 115, x + 110, y + 112, x + 116, y + 100));

        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 96, x + 128, y + 110, x + 124, y + 113));
        // g2d.draw(new QuadCurve2D.Double(x + 124, y + 113, x + 110, y + 124, x + 112, y + 108));

        // // shirt-arm L
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 79, x + 65, y + 80, x + 52, y + 92));
        // g2d.draw(new QuadCurve2D.Double(x + 52, y + 92, x + 43, y + 100, x + 48, y + 102));
        // g2d.draw(new QuadCurve2D.Double(x + 48, y + 102, x + 56, y + 110, x + 61, y + 121));
        // g2d.draw(new QuadCurve2D.Double(x + 61, y + 121, x + 62, y + 129, x + 76, y + 117));

        // // shirt-arm R
        // g2d.draw(new QuadCurve2D.Double(x + 150, y + 86, x + 160, y + 94, x + 163, y + 98));
        // g2d.draw(new QuadCurve2D.Double(x + 163, y + 98, x + 170, y + 101, x + 149, y + 123));

        // // shirt
        // g2d.draw(new QuadCurve2D.Double(x + 147, y + 110, x + 150, y + 134, x + 147, y + 134));
        // g2d.draw(new QuadCurve2D.Double(x + 147, y + 134, x + 120, y + 131, x + 65, y + 129));
        // g2d.draw(new QuadCurve2D.Double(x + 65, y + 129, x + 60, y + 131, x + 63, y + 124));

        // // hand L
        // g2d.draw(new QuadCurve2D.Double(x + 46, y + 102, x + 36, y + 117, x + 47, y + 124));
        // g2d.draw(new QuadCurve2D.Double(x + 47, y + 124, x + 53, y + 128, x + 60, y + 125));

        // // hand R
        // g2d.draw(new QuadCurve2D.Double(x + 165, y + 101, x + 171, y + 115, x + 165, y + 121));
        // g2d.draw(new QuadCurve2D.Double(x + 165, y + 121, x + 160, y + 127, x + 149, y + 124));

        // // leg L
        // g2d.draw(new QuadCurve2D.Double(x + 63, y + 132, x + 57, y + 144, x + 65, y + 145));
        // g2d.draw(new QuadCurve2D.Double(x + 65, y + 145, x + 65, y + 175, x + 83, y + 175));
        // g2d.draw(new QuadCurve2D.Double(x + 83, y + 175, x + 98, y + 173, x + 115, y + 143));

        // // leg R
        // g2d.draw(new QuadCurve2D.Double(x + 147, y + 135, x + 151, y + 150, x + 143, y + 150));
        // g2d.draw(new QuadCurve2D.Double(x + 101, y + 163, x + 106, y + 181, x + 116, y + 183));
        // g2d.draw(new QuadCurve2D.Double(x + 116, y + 183, x + 130, y + 185, x + 143, y + 150));

        // // tail
        // g2d.draw(new QuadCurve2D.Double(x + 60, y + 132, x + 55, y + 131, x + 57, y + 126));

        // g2d.draw(new QuadCurve2D.Double(x + 64, y + 151, x + 48, y + 165, x + 50, y + 154));
        // g2d.draw(new QuadCurve2D.Double(x + 50, y + 154, x + 20, y + 158, x + 15, y + 133));
        // g2d.draw(new QuadCurve2D.Double(x + 15, y + 133, x + 13, y + 124, x + 20, y + 126));
        // g2d.draw(new QuadCurve2D.Double(x + 20, y + 126, x + 20, y + 102, x + 47, y + 95));
        






        // // frame 8

        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(3)); 

        // // set colur
        // g2d.setColor(new Color(255, 203, 162));
        // // g2d.setColor(Color.RED);

        // // shadow head
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 25, x + 97, y + 23, x + 96, y + 16));

        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 37, x + 80, y + 52, x + 89, y + 52));
        // g2d.draw(new QuadCurve2D.Double(x + 89, y + 52, x + 85, y + 65, x + 88, y + 79));

        // // shadow-hat
        // g2d.draw(new QuadCurve2D.Double(x + 108, y + 4, x + 105, y + 10, x + 120, y + 16));

        // // shadow shirt
        // g2d.draw(new QuadCurve2D.Double(x + 72, y + 76, x + 52, y + 88, x + 65, y + 113));

        // g2d.draw(new QuadCurve2D.Double(x + 72, y + 111, x + 74, y + 112, x + 75, y + 123));

        // // shadow leg
        // g2d.draw(new QuadCurve2D.Double(x + 75, y + 125, x + 82, y + 154, x + 95, y + 165));

        // g2d.draw(new QuadCurve2D.Double(x + 112, y + 150, x + 108, y + 171, x + 119, y + 180));



        // // set colur
        // g2d.setColor(Color.BLACK);

        // // ear L
        // g2d.draw(new QuadCurve2D.Double(x + 82, y + 30, x + 92, y + 5, x + 101, y + 20));
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 25, x + 94, y + 33, x + 92, y + 30));
        // g2d.draw(new QuadCurve2D.Double(x + 92, y + 30, x + 100, y + 30, x + 92, y + 37));
        
        // // ear R
        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 18, x + 156, y + 10, x + 145, y + 28));

        // // head
        // g2d.draw(new QuadCurve2D.Double(x + 101, y + 20, x + 105, y + 10, x + 108, y + 18));
        // g2d.draw(new QuadCurve2D.Double(x + 108, y + 18, x + 120, y + 15, x + 132, y + 18));

        // g2d.draw(new QuadCurve2D.Double(x + 145, y + 28, x + 155, y + 25, x + 150, y + 34));
        // g2d.draw(new QuadCurve2D.Double(x + 150, y + 34, x + 160, y + 45, x + 160, y + 65));
        // g2d.draw(new QuadCurve2D.Double(x + 160, y + 65, x + 162, y + 75, x + 155, y + 75));
        // g2d.draw(new QuadCurve2D.Double(x + 155, y + 75, x + 140, y + 95, x + 137, y + 87));
        // g2d.draw(new QuadCurve2D.Double(x + 137, y + 87, x + 120, y + 93, x + 104, y + 84));
        // g2d.draw(new QuadCurve2D.Double(x + 104, y + 84, x + 100, y + 90, x + 88, y + 80));

        // g2d.draw(new QuadCurve2D.Double(x + 82, y + 30, x + 60, y + 50, x + 73, y + 50));
        // g2d.draw(new QuadCurve2D.Double(x + 73, y + 50, x + 68, y + 63, x + 70, y + 68));

        // // hat
        // g2d.draw(new QuadCurve2D.Double(x + 135, y + 15, x + 120, y - 18, x + 70, y + 25));
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 25, x + 60, y + 32, x + 72, y + 40));

        // g2d.draw(new QuadCurve2D.Double(x + 72, y + 23, x + 68, y + 22, x + 70, y + 15));
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 15, x + 80, y - 3, x + 86, y + 11));

        // // boo-hat
        // g2d.draw(new QuadCurve2D.Double(x + 68, y + 16, x + 60, y + 23, x + 50, y + 23));
        // g2d.draw(new QuadCurve2D.Double(x + 50, y + 23, x + 35, y + 22, x + 45, y + 31));
        // g2d.draw(new QuadCurve2D.Double(x + 45, y + 31, x + 35, y + 39, x + 45, y + 40));
        // g2d.draw(new QuadCurve2D.Double(x + 45, y + 40, x + 50, y + 42, x + 65, y + 30));

        // // eye
        // g2d.rotate(Math.toRadians(-20), x + 115, y + 50); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 111, y + 47, 8, 5));
        // g2d.rotate(Math.toRadians(20), x + 115, y + 50); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 48); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 138, y + 47, 7, 5));
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 48); // หมุนกลับ

        // // nose
        // g2d.fill(new Ellipse2D.Double(x + 127, y + 48, 8, 6));

        // // mouth
        // g2d.draw(new QuadCurve2D.Double(x + 113, y + 60, x + 121, y + 66, x + 127, y + 59));
        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 59, x + 130, y + 55, x + 134, y + 59));
        // g2d.draw(new QuadCurve2D.Double(x + 134, y + 59, x + 138, y + 63, x + 144, y + 57));

        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 59, x + 133, y + 61, x + 133, y + 71));
        // g2d.draw(new QuadCurve2D.Double(x + 121, y + 64, x + 124, y + 80, x + 132, y + 79));
        // g2d.draw(new QuadCurve2D.Double(x + 132, y + 79, x + 143, y + 79, x + 141, y + 60));

        // // shirt-pok
        // g2d.draw(new QuadCurve2D.Double(x + 88, y + 80, x + 80, y + 76, x + 70, y + 68));

        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 68, x + 53, y + 62, x + 57, y + 80));

        // g2d.draw(new QuadCurve2D.Double(x + 71, y + 69, x + 74, y + 98, x + 102, y + 91));

        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 92, x + 147, y + 106, x + 149, y + 83));

        // // shirt-boo
        // g2d.draw(new QuadCurve2D.Double(x + 116, y + 91, x + 115, y + 100, x + 127, y + 91));

        // g2d.draw(new QuadCurve2D.Double(x + 116, y + 91, x + 103, y + 91, x + 95, y + 99));
        // g2d.draw(new QuadCurve2D.Double(x + 95, y + 99, x + 85, y + 113, x + 100, y + 110));
        // g2d.draw(new QuadCurve2D.Double(x + 100, y + 110, x + 110, y + 107, x + 116, y + 95));

        // g2d.draw(new QuadCurve2D.Double(x + 127, y + 91, x + 128, y + 105, x + 124, y + 108));
        // g2d.draw(new QuadCurve2D.Double(x + 124, y + 108, x + 110, y + 124, x + 112, y + 103));

        // // shirt-arm L
        // g2d.draw(new QuadCurve2D.Double(x + 70, y + 69, x + 65, y + 70, x + 52, y + 84));
        // g2d.draw(new QuadCurve2D.Double(x + 52, y + 84, x + 43, y + 90, x + 48, y + 92));
        // g2d.draw(new QuadCurve2D.Double(x + 48, y + 92, x + 56, y + 100, x + 61, y + 111));
        // g2d.draw(new QuadCurve2D.Double(x + 61, y + 111, x + 62, y + 119, x + 73, y + 110));

        // // shirt-arm R
        // g2d.draw(new QuadCurve2D.Double(x + 150, y + 81, x + 160, y + 89, x + 163, y + 93));
        // g2d.draw(new QuadCurve2D.Double(x + 163, y + 93, x + 170, y + 96, x + 149, y + 118));

        // // shirt
        // g2d.draw(new QuadCurve2D.Double(x + 147, y + 105, x + 149, y + 129, x + 145, y + 129));
        // g2d.draw(new QuadCurve2D.Double(x + 145, y + 129, x + 100, y + 126, x + 65, y + 124));
        // g2d.draw(new QuadCurve2D.Double(x + 65, y + 124, x + 60, y + 126, x + 63, y + 114));

        // // hand L
        // g2d.draw(new QuadCurve2D.Double(x + 46, y + 92, x + 36, y + 107, x + 47, y + 114));
        // g2d.draw(new QuadCurve2D.Double(x + 47, y + 114, x + 53, y + 118, x + 60, y + 115));

        // // hand R
        // g2d.draw(new QuadCurve2D.Double(x + 165, y + 96, x + 171, y + 110, x + 165, y + 116));
        // g2d.draw(new QuadCurve2D.Double(x + 165, y + 116, x + 160, y + 122, x + 149, y + 119));

        // // leg L
        // g2d.draw(new QuadCurve2D.Double(x + 63, y + 127, x + 60, y + 146, x + 66, y + 142));
        // g2d.draw(new QuadCurve2D.Double(x + 66, y + 142, x + 75, y + 165, x + 90, y + 167));
        // g2d.draw(new QuadCurve2D.Double(x + 90, y + 167, x + 114, y + 167, x + 113, y + 140));

        // // leg R
        // g2d.draw(new QuadCurve2D.Double(x + 147, y + 130, x + 150, y + 153, x + 142, y + 148));
        // g2d.draw(new QuadCurve2D.Double(x + 95, y + 166, x + 97, y + 180, x + 110, y + 183));
        // g2d.draw(new QuadCurve2D.Double(x + 110, y + 183, x + 125, y + 184, x + 142, y + 148));

        // // tail
        // g2d.draw(new QuadCurve2D.Double(x + 62, y + 128, x + 50, y + 125, x + 61, y + 120));

        // g2d.draw(new QuadCurve2D.Double(x + 63, y + 148, x + 50, y + 160, x + 50, y + 149));
        // g2d.draw(new QuadCurve2D.Double(x + 50, y + 149, x + 20, y + 153, x + 15, y + 128));
        // g2d.draw(new QuadCurve2D.Double(x + 15, y + 128, x + 13, y + 119, x + 20, y + 121));
        // g2d.draw(new QuadCurve2D.Double(x + 20, y + 121, x + 20, y + 103, x + 42, y + 100));












        //it need yo close path
        // g2d.fill(new QuadCurve2D.Double(x + 20, y + 121, x + 20, y + 103, x + 42, y + 100));
     
        // Path2D path2d = new Path2D.Double();
        // path2d.moveTo(50, 150);
        // path2d.quadTo(150, 50, 250, 150);
        // path2d.closePath();

        // g2d.fill(path2d);
        
    }
}