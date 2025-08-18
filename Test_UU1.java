import java.awt.*;
import java.awt.geom.*;

public class Test_UU1 {
    public static void draw(Graphics2D g2d, double x, double y){
        
        // // frame 1
        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(2));
        
        // Path2D shadow_boo_hat1 = new Path2D.Double();
        // shadow_boo_hat1.moveTo(x + 73, y + 21);
        // shadow_boo_hat1.quadTo(x + 60, y + 23, x + 50, y + 23);
        // shadow_boo_hat1.quadTo(x + 35, y + 22, x + 45, y + 31);
        // shadow_boo_hat1.quadTo(x + 35, y + 39, x + 45, y + 40);
        // shadow_boo_hat1.quadTo(x + 50, y + 42, x + 70, y + 35);
        // shadow_boo_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_boo_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_boo_hat1);

        // Path2D shadow_s_hat1 = new Path2D.Double();
        // shadow_s_hat1.moveTo(x + 72, y + 28);
        // shadow_s_hat1.quadTo(x + 68, y + 27, x + 70, y + 20);
        // shadow_s_hat1.quadTo(x + 80, y + 2, x + 86, y + 16);
        // shadow_s_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_s_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_s_hat1);

        // Path2D shadow_hat1 = new Path2D.Double();
        // shadow_hat1.moveTo(x + 135, y + 22);
        // shadow_hat1.quadTo(x + 120, y - 13, x + 70, y + 30);
        // shadow_hat1.quadTo(x + 60, y + 37, x + 72, y + 45);
        // shadow_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_hat1);

        // Path2D light_hat = new Path2D.Double();
        // light_hat.moveTo(x + 108, y + 9);
        // light_hat.quadTo(x + 105, y + 15, x + 120, y + 21);
        // light_hat.quadTo(x + 132, y + 23, x + 133, y + 22);
        // light_hat.quadTo(x + 125, y + 4, x + 108, y + 9);

        // g2d.setColor(new Color(115, 89, 190));
        // g2d.fill(light_hat);


        // Path2D tail1 = new Path2D.Double();
        // tail1.moveTo(x + 61, y + 120);
        // tail1.quadTo(x + 50, y + 130, x + 62, y + 133);
        // tail1.quadTo(x + 62, y + 133, x + 70, y + 147);
        // tail1.quadTo(x + 50, y + 165, x + 50, y + 154);
        // tail1.quadTo(x + 20, y + 158, x + 15, y + 133);
        // tail1.quadTo(x + 13, y + 124, x + 20, y + 126);
        // tail1.quadTo(x + 20, y + 105, x + 40, y + 97);
        // tail1.quadTo(x + 50, y + 97, x + 70, y + 120);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(tail1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(tail1);

        // Path2D hand_R1 = new Path2D.Double();
        // hand_R1.moveTo(x + 46, y + 90);
        // hand_R1.quadTo(x + 33, y + 105, x + 44, y + 112);
        // hand_R1.quadTo(x + 50, y + 116, x + 57, y + 115);
        // hand_R1.quadTo(x + 71, y + 90, x + 46, y + 90);
        // hand_R1.closePath();

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(hand_R1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(hand_R1);

        // Path2D hand_L1 = new Path2D.Double();
        // hand_L1.moveTo(x + 165, y + 101);
        // hand_L1.quadTo(x + 171, y + 115, x + 165, y + 121);
        // hand_L1.quadTo(x + 160, y + 127, x + 149, y + 124);
        // hand_L1.closePath();

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(hand_L1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(hand_L1);

        // Polygon fill_leg1 = new Polygon();
        // fill_leg1.addPoint((int)x + 63, (int)y + 127);
        // fill_leg1.addPoint((int)x + 85, (int)y + 162);
        // fill_leg1.addPoint((int)x + 145, (int)y + 137);
        // fill_leg1.addPoint((int)x + 90, (int)y + 120);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(fill_leg1);

        // Path2D shadow_leg_L1 = new Path2D.Double();
        // shadow_leg_L1.moveTo(x + 85, y + 162);
        // shadow_leg_L1.quadTo(x + 82, y + 190, x + 110, y + 178);
        // shadow_leg_L1.quadTo(x + 105, y + 176, x + 111, y + 140);

        // Path2D leg_L1 = new Path2D.Double();
        // leg_L1.moveTo(x + 145, y + 137);
        // leg_L1.quadTo(x + 143, y + 158, x + 137, y + 152);
        // leg_L1.quadTo(x + 125, y + 170, x + 110, y + 179);
        // leg_L1.quadTo(x + 82, y + 190, x + 85, y + 162);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(leg_L1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_leg_L1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(leg_L1);

        // Path2D shadow_leg_R1 = new Path2D.Double();
        // shadow_leg_R1.moveTo(x + 63, y + 127);
        // shadow_leg_R1.quadTo(x + 62, y + 146, x + 68, y + 142);
        // shadow_leg_R1.quadTo(x + 80, y + 169, x + 105, y + 162);
        // shadow_leg_R1.quadTo(x + 93, y + 160, x + 75, y + 128);

        // Path2D leg_R1 = new Path2D.Double();
        // leg_R1.moveTo(x + 63, y + 127);
        // leg_R1.quadTo(x + 62, y + 146, x + 68, y + 142);
        // leg_R1.quadTo(x + 80, y + 169, x + 105, y + 162);
        // leg_R1.quadTo(x + 119, y + 155, x + 111, y + 140);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(leg_R1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_leg_R1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(leg_R1);

        // Path2D shadow_shirt1 = new Path2D.Double();
        // shadow_shirt1.moveTo(x + 70, y + 74);
        // shadow_shirt1.quadTo(x + 65, y + 75, x + 52, y + 84);
        // shadow_shirt1.quadTo(x + 41, y + 90, x + 48, y + 92);
        // shadow_shirt1.quadTo(x + 56, y + 100, x + 58, y + 111);
        // shadow_shirt1.quadTo(x + 57, y + 120, x + 65, y + 114);
        // shadow_shirt1.quadTo(x + 52, y + 93, x + 72, y + 80);

        // shadow_shirt1.moveTo(x + 63, y + 116);
        // shadow_shirt1.quadTo(x + 60, y + 129, x + 65, y + 127);
        // shadow_shirt1.quadTo(x + 65, y + 127, x + 75, y + 125);
        // shadow_shirt1.quadTo(x + 76, y + 115, x + 72, y + 111);

        // Polygon fill_shirt1 = new Polygon();
        // fill_shirt1.addPoint((int)x + 70, (int)y + 74);
        // fill_shirt1.addPoint((int)x + 63, (int)y + 116);
        // fill_shirt1.addPoint((int)x + 149, (int)y + 127);
        // fill_shirt1.addPoint((int)x + 150, (int)y + 86);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(fill_shirt1);

        // Path2D shirt1 = new Path2D.Double();
        // shirt1.moveTo(x + 70, y + 74);
        // shirt1.quadTo(x + 65, y + 75, x + 52, y + 84);
        // shirt1.quadTo(x + 41, y + 90, x + 48, y + 92);
        // shirt1.quadTo(x + 56, y + 100, x + 58, y + 111);
        // shirt1.quadTo(x + 57, y + 120, x + 72, y + 111);

        // shirt1.moveTo(x + 150, y + 86);
        // shirt1.quadTo(x + 160, y + 94, x + 163, y + 98);
        // shirt1.quadTo(x + 170, y + 101, x + 149, y + 123);

        // shirt1.moveTo(x + 147, y + 110);
        // shirt1.quadTo(x + 149, y + 137, x + 145, y + 137);
        // shirt1.quadTo(x + 100, y + 125, x + 65, y + 127);
        // shirt1.quadTo(x + 60, y + 129, x + 63, y + 116);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(shirt1);

        // g2d.setColor(new Color(255, 203, 159));
        // g2d.fill(shadow_shirt1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt1);

        // Path2D shadow_shirt_pok1 = new Path2D.Double();
        // shadow_shirt_pok1.moveTo(x + 70, y + 73);
        // shadow_shirt_pok1.quadTo(x + 53, y + 62, x + 57, y + 80);
        // shadow_shirt_pok1.closePath();

        // shadow_shirt_pok1.moveTo(x + 71, y + 74);
        // shadow_shirt_pok1.quadTo(x + 74, y + 103, x + 102, y + 96);
        // shadow_shirt_pok1.quadTo(x + 120, y + 105, x + 100, y + 70);
        // shadow_shirt_pok1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_shirt_pok1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_shirt_pok1);

        // Path2D shirt_pok1 = new Path2D.Double();
        // shirt_pok1.moveTo(x + 127, y + 97);
        // shirt_pok1.quadTo(x + 147, y + 111, x + 149, y + 88);
        // shirt_pok1.quadTo(x + 140, y + 80, x + 127, y + 97);
        // shirt_pok1.closePath();

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_pok1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_pok1);

        // Path2D shirt_boo1 = new Path2D.Double();
        // shirt_boo1.moveTo(x + 127, y + 96);
        // shirt_boo1.quadTo(x + 128, y + 110, x + 124, y + 113);
        // shirt_boo1.quadTo(x + 110, y + 124, x + 112, y + 108);
        // shirt_boo1.quadTo(x + 115, y + 98, x + 127, y + 96);
        // shirt_boo1.closePath();
        
        // shirt_boo1.moveTo(x + 116, y + 96);
        // shirt_boo1.quadTo(x + 103, y + 91, x + 95, y + 104);
        // shirt_boo1.quadTo(x + 85, y + 118, x + 100, y + 115);
        // shirt_boo1.quadTo(x + 110, y + 112, x + 116, y + 100);
        // shirt_boo1.closePath();

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_boo1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_boo1);

        // Path2D shirt_boo_boo1 = new Path2D.Double();
        // shirt_boo_boo1.moveTo(x + 116, y + 96);
        // shirt_boo_boo1.quadTo(x + 115, y + 105, x + 127, y + 96);

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_boo_boo1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_boo_boo1);

        // Path2D shadow_head1 = new Path2D.Double();
        // shadow_head1.moveTo(x + 96, y + 16);
        // shadow_head1.quadTo(x + 97, y + 23, x + 92, y + 25);
        // shadow_head1.quadTo(x + 94, y + 28, x + 92, y + 32);
        // shadow_head1.quadTo(x + 100, y + 30, x + 92, y + 39);
        // shadow_head1.quadTo(x + 80, y + 57, x + 89, y + 57);
        // shadow_head1.quadTo(x + 85, y + 70, x + 88, y + 85);
        // shadow_head1.quadTo(x + 70, y + 73, x + 68, y + 68);
        // shadow_head1.quadTo(x + 68, y + 68, x + 73, y + 55);
        // shadow_head1.quadTo(x + 60, y + 55, x + 82, y + 35);
        // shadow_head1.quadTo(x + 92, y, x + 101, y + 25);

        // Path2D head1 = new Path2D.Double();
        // head1.moveTo(x + 82, y + 35);
        // head1.quadTo(x + 92, y, x + 101, y + 25);
        // head1.quadTo(x + 105, y + 15, x + 108, y + 23);
        // head1.quadTo(x + 120, y + 20, x + 132, y + 23);
        // head1.quadTo(x + 149, y + 7, x + 145, y + 33);
        // head1.quadTo(x + 155, y + 30, x + 150, y + 39);
        // head1.quadTo(x + 160, y + 50, x + 160, y + 70);
        // head1.quadTo(x + 162, y + 80, x + 155, y + 80);
        // head1.quadTo(x + 140, y + 100, x + 137, y + 92);
        // head1.quadTo(x + 120, y + 98, x + 104, y + 89);
        // head1.quadTo(x + 100, y + 95, x + 88, y + 85);
        // head1.quadTo(x + 80, y + 81, x + 70, y + 73);
        // head1.quadTo(x + 68, y + 68, x + 73, y + 55);
        // head1.quadTo(x + 60, y + 55, x + 82, y + 35);
        // head1.closePath();

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(head1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_head1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(head1);

        // head1.moveTo(x + 92, y + 25);
        // head1.quadTo(x + 94, y + 28, x + 92, y + 32);
        // head1.quadTo(x + 100, y + 30, x + 92, y + 39);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(head1);

        // // eye
        // g2d.rotate(Math.toRadians(-20), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 111, y + 52, 8, 5));
        // g2d.rotate(Math.toRadians(20), x + 115, y + 55); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 138, y + 52, 7, 5));
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ

        // // nose
        // g2d.fill(new Ellipse2D.Double(x + 127, y + 53, 8, 6));

        // Path2D mouth1 = new Path2D.Double();
        // mouth1.moveTo(x + 113, y + 65);
        // mouth1.quadTo(x + 121, y + 71, x + 127, y + 64);
        // mouth1.quadTo(x + 130, y + 60, x + 134, y + 64);
        // mouth1.quadTo(x + 138, y + 68, x + 144, y + 62);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(mouth1);

        // Path2D tongue1 = new Path2D.Double();
        // tongue1.moveTo(x + 121, y + 69);
        // tongue1.quadTo(x + 124, y + 80, x + 132, y + 79);
        // tongue1.quadTo(x + 143, y + 79, x + 141, y + 65);
        // tongue1.quadTo(x + 138, y + 68, x + 134, y + 64);
        // tongue1.quadTo(x + 130, y + 60, x + 127, y + 64);
        // tongue1.closePath();

        // g2d.setColor(new Color(255, 101, 101)); // สีผิว
        // g2d.fill(tongue1);

        // tongue1.moveTo(x + 132, y + 64);
        // tongue1.quadTo(x + 133, y + 66, x + 133, y + 71);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(tongue1);
        








        // // frame 2
        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(3));
        
        // Path2D shadow_boo_hat1 = new Path2D.Double();
        // shadow_boo_hat1.moveTo(x + 73, y + 21);
        // shadow_boo_hat1.quadTo(x + 60, y + 23, x + 50, y + 23);
        // shadow_boo_hat1.quadTo(x + 35, y + 22, x + 45, y + 31);
        // shadow_boo_hat1.quadTo(x + 35, y + 39, x + 45, y + 40);
        // shadow_boo_hat1.quadTo(x + 50, y + 42, x + 70, y + 35);
        // shadow_boo_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_boo_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_boo_hat1);

        // Path2D shadow_s_hat1 = new Path2D.Double();
        // shadow_s_hat1.moveTo(x + 72, y + 28);
        // shadow_s_hat1.quadTo(x + 68, y + 27, x + 70, y + 20);
        // shadow_s_hat1.quadTo(x + 80, y + 2, x + 86, y + 16);
        // shadow_s_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_s_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_s_hat1);

        // Path2D shadow_hat1 = new Path2D.Double();
        // shadow_hat1.moveTo(x + 135, y + 22);
        // shadow_hat1.quadTo(x + 120, y - 13, x + 70, y + 30);
        // shadow_hat1.quadTo(x + 60, y + 37, x + 72, y + 45);
        // shadow_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_hat1);

        // Path2D hat1 = new Path2D.Double();
        // hat1.moveTo(x + 108, y + 9);
        // hat1.quadTo(x + 105, y + 15, x + 120, y + 21);
        // hat1.quadTo(x + 132, y + 23, x + 133, y + 22);
        // hat1.quadTo(x + 125, y + 4, x + 108, y + 9);

        // g2d.setColor(new Color(115, 89, 190));
        // g2d.fill(hat1);


        // Path2D tail1 = new Path2D.Double();
        // tail1.moveTo(x + 61, y + 120);
        // tail1.quadTo(x + 50, y + 130, x + 62, y + 133);
        // tail1.quadTo(x + 62, y + 133, x + 70, y + 147);
        // tail1.quadTo(x + 50, y + 165, x + 50, y + 154);
        // tail1.quadTo(x + 20, y + 158, x + 15, y + 133);
        // tail1.quadTo(x + 13, y + 124, x + 20, y + 126);
        // tail1.quadTo(x + 20, y + 105, x + 40, y + 97);
        // tail1.quadTo(x + 50, y + 97, x + 70, y + 120);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(tail1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(tail1);

        // Path2D hand_R1 = new Path2D.Double();
        // hand_R1.moveTo(x + 46, y + 90);
        // hand_R1.quadTo(x + 33, y + 105, x + 44, y + 112);
        // hand_R1.quadTo(x + 50, y + 116, x + 57, y + 115);
        // hand_R1.quadTo(x + 71, y + 90, x + 46, y + 90);
        // hand_R1.closePath();

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(hand_R1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(hand_R1);

        // Path2D hand_L1 = new Path2D.Double();
        // hand_L1.moveTo(x + 165, y + 101);
        // hand_L1.quadTo(x + 171, y + 115, x + 165, y + 121);
        // hand_L1.quadTo(x + 160, y + 127, x + 149, y + 124);
        // hand_L1.closePath();

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(hand_L1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(hand_L1);

        // Polygon fill_leg1 = new Polygon();
        // fill_leg1.addPoint((int)x + 63, (int)y + 127);
        // fill_leg1.addPoint((int)x + 98, (int)y + 173);
        // fill_leg1.addPoint((int)x + 145, (int)y + 137);
        // fill_leg1.addPoint((int)x + 90, (int)y + 120);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(fill_leg1);

        // Path2D shadow_leg_L1 = new Path2D.Double();
        // shadow_leg_L1.moveTo(x + 98, y + 173);
        // shadow_leg_L1.quadTo(x + 104, y + 188, x + 122, y + 179);
        // shadow_leg_L1.quadTo(x + 115, y + 177, x + 111, y + 167);

        // Path2D leg_L1 = new Path2D.Double();
        // leg_L1.moveTo(x + 145, y + 137);
        // leg_L1.quadTo(x + 145, y + 158, x + 139, y + 157);
        // leg_L1.quadTo(x + 132, y + 170, x + 122, y + 179);
        // leg_L1.quadTo(x + 104, y + 188, x + 98, y + 173);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(leg_L1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_leg_L1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(leg_L1);

        // Path2D shadow_leg_R1 = new Path2D.Double();
        // shadow_leg_R1.moveTo(x + 63, y + 127);
        // shadow_leg_R1.quadTo(x + 62, y + 156, x + 70, y + 152);
        // shadow_leg_R1.quadTo(x + 80, y + 179, x + 103, y + 172);
        // shadow_leg_R1.quadTo(x + 88, y + 165, x + 75, y + 127);

        // Path2D leg_R1 = new Path2D.Double();
        // leg_R1.moveTo(x + 63, y + 127);
        // leg_R1.quadTo(x + 62, y + 156, x + 70, y + 152);
        // leg_R1.quadTo(x + 80, y + 179, x + 103, y + 172);
        // leg_R1.quadTo(x + 117, y + 165, x + 111, y + 142);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(leg_R1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_leg_R1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(leg_R1);

        // Path2D shadow_shirt1 = new Path2D.Double();
        // shadow_shirt1.moveTo(x + 70, y + 74);
        // shadow_shirt1.quadTo(x + 65, y + 75, x + 52, y + 84);
        // shadow_shirt1.quadTo(x + 41, y + 90, x + 48, y + 92);
        // shadow_shirt1.quadTo(x + 56, y + 100, x + 58, y + 111);
        // shadow_shirt1.quadTo(x + 57, y + 120, x + 65, y + 114);
        // shadow_shirt1.quadTo(x + 52, y + 93, x + 72, y + 80);

        // shadow_shirt1.moveTo(x + 63, y + 116);
        // shadow_shirt1.quadTo(x + 60, y + 129, x + 65, y + 127);
        // shadow_shirt1.quadTo(x + 65, y + 127, x + 75, y + 125);
        // shadow_shirt1.quadTo(x + 76, y + 115, x + 72, y + 111);

        // Polygon fill_shirt1 = new Polygon();
        // fill_shirt1.addPoint((int)x + 70, (int)y + 74);
        // fill_shirt1.addPoint((int)x + 63, (int)y + 116);
        // fill_shirt1.addPoint((int)x + 149, (int)y + 127);
        // fill_shirt1.addPoint((int)x + 150, (int)y + 86);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(fill_shirt1);

        // Path2D shirt1 = new Path2D.Double();
        // shirt1.moveTo(x + 70, y + 74);
        // shirt1.quadTo(x + 65, y + 75, x + 52, y + 84);
        // shirt1.quadTo(x + 41, y + 90, x + 48, y + 92);
        // shirt1.quadTo(x + 56, y + 100, x + 58, y + 111);
        // shirt1.quadTo(x + 57, y + 120, x + 72, y + 111);

        // shirt1.moveTo(x + 150, y + 86);
        // shirt1.quadTo(x + 160, y + 94, x + 163, y + 98);
        // shirt1.quadTo(x + 170, y + 101, x + 149, y + 123);

        // shirt1.moveTo(x + 147, y + 110);
        // shirt1.quadTo(x + 149, y + 137, x + 145, y + 137);
        // shirt1.quadTo(x + 100, y + 125, x + 65, y + 127);
        // shirt1.quadTo(x + 60, y + 129, x + 63, y + 116);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(shirt1);

        // g2d.setColor(new Color(255, 203, 159));
        // g2d.fill(shadow_shirt1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt1);

        // Path2D shadow_shirt_pok1 = new Path2D.Double();
        // shadow_shirt_pok1.moveTo(x + 70, y + 73);
        // shadow_shirt_pok1.quadTo(x + 53, y + 62, x + 57, y + 80);
        // shadow_shirt_pok1.closePath();

        // shadow_shirt_pok1.moveTo(x + 71, y + 74);
        // shadow_shirt_pok1.quadTo(x + 74, y + 103, x + 102, y + 96);
        // shadow_shirt_pok1.quadTo(x + 120, y + 105, x + 100, y + 70);
        // shadow_shirt_pok1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_shirt_pok1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_shirt_pok1);

        // Path2D shirt_pok1 = new Path2D.Double();
        // shirt_pok1.moveTo(x + 127, y + 97);
        // shirt_pok1.quadTo(x + 147, y + 111, x + 149, y + 88);
        // shirt_pok1.quadTo(x + 140, y + 80, x + 127, y + 97);
        // shirt_pok1.closePath();

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_pok1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_pok1);

        // Path2D shirt_boo1 = new Path2D.Double();
        // shirt_boo1.moveTo(x + 127, y + 96);
        // shirt_boo1.quadTo(x + 128, y + 110, x + 124, y + 113);
        // shirt_boo1.quadTo(x + 110, y + 124, x + 112, y + 108);
        // shirt_boo1.quadTo(x + 115, y + 98, x + 127, y + 96);
        // shirt_boo1.closePath();
        
        // shirt_boo1.moveTo(x + 116, y + 96);
        // shirt_boo1.quadTo(x + 103, y + 91, x + 95, y + 104);
        // shirt_boo1.quadTo(x + 85, y + 118, x + 100, y + 115);
        // shirt_boo1.quadTo(x + 110, y + 112, x + 116, y + 100);
        // shirt_boo1.closePath();

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_boo1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_boo1);

        // Path2D shirt_boo_boo1 = new Path2D.Double();
        // shirt_boo_boo1.moveTo(x + 116, y + 96);
        // shirt_boo_boo1.quadTo(x + 115, y + 105, x + 127, y + 96);

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_boo_boo1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_boo_boo1);

        // Path2D shadow_head1 = new Path2D.Double();
        // shadow_head1.moveTo(x + 96, y + 16);
        // shadow_head1.quadTo(x + 97, y + 23, x + 92, y + 25);
        // shadow_head1.quadTo(x + 94, y + 28, x + 92, y + 32);
        // shadow_head1.quadTo(x + 100, y + 30, x + 92, y + 39);
        // shadow_head1.quadTo(x + 80, y + 57, x + 89, y + 57);
        // shadow_head1.quadTo(x + 85, y + 70, x + 88, y + 85);
        // shadow_head1.quadTo(x + 70, y + 73, x + 68, y + 68);
        // shadow_head1.quadTo(x + 68, y + 68, x + 73, y + 55);
        // shadow_head1.quadTo(x + 60, y + 55, x + 82, y + 35);
        // shadow_head1.quadTo(x + 92, y, x + 101, y + 25);

        // Path2D head1 = new Path2D.Double();
        // head1.moveTo(x + 82, y + 35);
        // head1.quadTo(x + 92, y, x + 101, y + 25);
        // head1.quadTo(x + 105, y + 15, x + 108, y + 23);
        // head1.quadTo(x + 120, y + 20, x + 132, y + 23);
        // head1.quadTo(x + 149, y + 7, x + 145, y + 33);
        // head1.quadTo(x + 155, y + 30, x + 150, y + 39);
        // head1.quadTo(x + 160, y + 50, x + 160, y + 70);
        // head1.quadTo(x + 162, y + 80, x + 155, y + 80);
        // head1.quadTo(x + 140, y + 100, x + 137, y + 92);
        // head1.quadTo(x + 120, y + 98, x + 104, y + 89);
        // head1.quadTo(x + 100, y + 95, x + 88, y + 85);
        // head1.quadTo(x + 80, y + 81, x + 70, y + 73);
        // head1.quadTo(x + 68, y + 68, x + 73, y + 55);
        // head1.quadTo(x + 60, y + 55, x + 82, y + 35);
        // head1.closePath();

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(head1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_head1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(head1);

        // head1.moveTo(x + 92, y + 25);
        // head1.quadTo(x + 94, y + 28, x + 92, y + 32);
        // head1.quadTo(x + 100, y + 30, x + 92, y + 39);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(head1);

        // // eye
        // g2d.rotate(Math.toRadians(-20), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 111, y + 52, 8, 5));
        // g2d.rotate(Math.toRadians(20), x + 115, y + 55); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 138, y + 52, 7, 5));
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ

        // // nose
        // g2d.fill(new Ellipse2D.Double(x + 127, y + 53, 8, 6));

        // Path2D mouth1 = new Path2D.Double();
        // mouth1.moveTo(x + 113, y + 65);
        // mouth1.quadTo(x + 121, y + 71, x + 127, y + 64);
        // mouth1.quadTo(x + 130, y + 60, x + 134, y + 64);
        // mouth1.quadTo(x + 138, y + 68, x + 144, y + 62);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(mouth1);

        // Path2D tongue1 = new Path2D.Double();
        // tongue1.moveTo(x + 121, y + 69);
        // tongue1.quadTo(x + 124, y + 80, x + 132, y + 79);
        // tongue1.quadTo(x + 143, y + 79, x + 141, y + 65);
        // tongue1.quadTo(x + 138, y + 68, x + 134, y + 64);
        // tongue1.quadTo(x + 130, y + 60, x + 127, y + 64);
        // tongue1.closePath();

        // g2d.setColor(new Color(255, 101, 101)); // สีผิว
        // g2d.fill(tongue1);

        // tongue1.moveTo(x + 132, y + 64);
        // tongue1.quadTo(x + 133, y + 66, x + 133, y + 71);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(tongue1);
        









        // // frame 3
        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(3));
        
        // Path2D shadow_boo_hat1 = new Path2D.Double();
        // shadow_boo_hat1.moveTo(x + 73, y + 21);
        // shadow_boo_hat1.quadTo(x + 60, y + 23, x + 50, y + 23);
        // shadow_boo_hat1.quadTo(x + 35, y + 22, x + 45, y + 31);
        // shadow_boo_hat1.quadTo(x + 35, y + 39, x + 45, y + 40);
        // shadow_boo_hat1.quadTo(x + 50, y + 42, x + 70, y + 35);
        // shadow_boo_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_boo_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_boo_hat1);

        // Path2D shadow_s_hat1 = new Path2D.Double();
        // shadow_s_hat1.moveTo(x + 72, y + 28);
        // shadow_s_hat1.quadTo(x + 68, y + 27, x + 70, y + 20);
        // shadow_s_hat1.quadTo(x + 80, y + 2, x + 86, y + 16);
        // shadow_s_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_s_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_s_hat1);

        // Path2D shadow_hat1 = new Path2D.Double();
        // shadow_hat1.moveTo(x + 135, y + 22);
        // shadow_hat1.quadTo(x + 120, y - 13, x + 70, y + 30);
        // shadow_hat1.quadTo(x + 60, y + 37, x + 72, y + 45);
        // shadow_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_hat1);

        // Path2D hat1 = new Path2D.Double();
        // hat1.moveTo(x + 108, y + 9);
        // hat1.quadTo(x + 105, y + 15, x + 120, y + 21);
        // hat1.quadTo(x + 132, y + 23, x + 133, y + 22);
        // hat1.quadTo(x + 125, y + 4, x + 108, y + 9);

        // g2d.setColor(new Color(115, 89, 190));
        // g2d.fill(hat1);


        // Path2D tail1 = new Path2D.Double();
        // tail1.moveTo(x + 61, y + 120);
        // tail1.quadTo(x + 50, y + 130, x + 62, y + 133);
        // tail1.quadTo(x + 62, y + 133, x + 70, y + 147);
        // tail1.quadTo(x + 50, y + 165, x + 50, y + 154);
        // tail1.quadTo(x + 20, y + 158, x + 15, y + 133);
        // tail1.quadTo(x + 13, y + 124, x + 20, y + 126);
        // tail1.quadTo(x + 20, y + 105, x + 40, y + 97);
        // tail1.quadTo(x + 50, y + 97, x + 70, y + 120);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(tail1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(tail1);

        // Path2D hand_R1 = new Path2D.Double();
        // hand_R1.moveTo(x + 46, y + 90);
        // hand_R1.quadTo(x + 33, y + 105, x + 44, y + 112);
        // hand_R1.quadTo(x + 50, y + 116, x + 57, y + 115);
        // hand_R1.quadTo(x + 71, y + 90, x + 46, y + 90);
        // hand_R1.closePath();

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(hand_R1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(hand_R1);

        // Path2D hand_L1 = new Path2D.Double();
        // hand_L1.moveTo(x + 165, y + 101);
        // hand_L1.quadTo(x + 171, y + 115, x + 165, y + 121);
        // hand_L1.quadTo(x + 160, y + 127, x + 149, y + 124);
        // hand_L1.closePath();

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(hand_L1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(hand_L1);

        // Polygon fill_leg1 = new Polygon();
        // fill_leg1.addPoint((int)x + 63, (int)y + 127);
        // fill_leg1.addPoint((int)x + 98, (int)y + 173);
        // fill_leg1.addPoint((int)x + 145, (int)y + 137);
        // fill_leg1.addPoint((int)x + 90, (int)y + 120);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(fill_leg1);

        // Path2D shadow_leg_L1 = new Path2D.Double();
        // shadow_leg_L1.moveTo(x + 104, y + 170);
        // shadow_leg_L1.quadTo(x + 109, y + 182, x + 116, y + 183);
        // shadow_leg_L1.quadTo(x + 135, y + 184, x + 122, y + 180);
        // shadow_leg_L1.quadTo(x + 116, y + 176, x + 112, y + 152);

        // Path2D leg_L1 = new Path2D.Double();
        // leg_L1.moveTo(x + 145, y + 137);
        // leg_L1.quadTo(x + 151, y + 152, x + 144, y + 148);
        // leg_L1.quadTo(x + 135, y + 184, x + 116, y + 183);
        // leg_L1.quadTo(x + 109, y + 182, x + 104, y + 170);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(leg_L1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_leg_L1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(leg_L1);

        // Path2D shadow_leg_R1 = new Path2D.Double();
        // shadow_leg_R1.moveTo(x + 63, y + 127);
        // shadow_leg_R1.quadTo(x + 60, y + 146, x + 66, y + 142);
        // shadow_leg_R1.quadTo(x + 70, y + 180, x + 85, y + 183);
        // shadow_leg_R1.quadTo(x + 85, y + 183, x + 95, y + 180);
        // shadow_leg_R1.quadTo(x + 80, y + 174, x + 75, y + 128);

        // Path2D leg_R1 = new Path2D.Double();
        // leg_R1.moveTo(x + 63, y + 127);
        // leg_R1.quadTo(x + 60, y + 146, x + 66, y + 142);
        // leg_R1.quadTo(x + 70, y + 180, x + 85, y + 183);
        // leg_R1.quadTo(x + 104, y + 184, x + 113, y + 145);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(leg_R1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_leg_R1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(leg_R1);

        // Path2D shadow_shirt1 = new Path2D.Double();
        // shadow_shirt1.moveTo(x + 70, y + 74);
        // shadow_shirt1.quadTo(x + 65, y + 75, x + 52, y + 84);
        // shadow_shirt1.quadTo(x + 41, y + 90, x + 48, y + 92);
        // shadow_shirt1.quadTo(x + 56, y + 100, x + 58, y + 111);
        // shadow_shirt1.quadTo(x + 57, y + 120, x + 65, y + 114);
        // shadow_shirt1.quadTo(x + 52, y + 93, x + 72, y + 80);

        // shadow_shirt1.moveTo(x + 63, y + 116);
        // shadow_shirt1.quadTo(x + 60, y + 129, x + 65, y + 127);
        // shadow_shirt1.quadTo(x + 65, y + 127, x + 75, y + 125);
        // shadow_shirt1.quadTo(x + 76, y + 115, x + 72, y + 111);

        // Polygon fill_shirt1 = new Polygon();
        // fill_shirt1.addPoint((int)x + 70, (int)y + 74);
        // fill_shirt1.addPoint((int)x + 63, (int)y + 116);
        // fill_shirt1.addPoint((int)x + 149, (int)y + 127);
        // fill_shirt1.addPoint((int)x + 150, (int)y + 86);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(fill_shirt1);

        // Path2D shirt1 = new Path2D.Double();
        // shirt1.moveTo(x + 70, y + 74);
        // shirt1.quadTo(x + 65, y + 75, x + 52, y + 84);
        // shirt1.quadTo(x + 41, y + 90, x + 48, y + 92);
        // shirt1.quadTo(x + 56, y + 100, x + 58, y + 111);
        // shirt1.quadTo(x + 57, y + 120, x + 72, y + 111);

        // shirt1.moveTo(x + 150, y + 86);
        // shirt1.quadTo(x + 160, y + 94, x + 163, y + 98);
        // shirt1.quadTo(x + 170, y + 101, x + 149, y + 123);

        // shirt1.moveTo(x + 147, y + 110);
        // shirt1.quadTo(x + 149, y + 137, x + 145, y + 137);
        // shirt1.quadTo(x + 100, y + 125, x + 65, y + 127);
        // shirt1.quadTo(x + 60, y + 129, x + 63, y + 116);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(shirt1);

        // g2d.setColor(new Color(255, 203, 159));
        // g2d.fill(shadow_shirt1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt1);

        // Path2D shadow_shirt_pok1 = new Path2D.Double();
        // shadow_shirt_pok1.moveTo(x + 70, y + 73);
        // shadow_shirt_pok1.quadTo(x + 53, y + 62, x + 57, y + 80);
        // shadow_shirt_pok1.closePath();

        // shadow_shirt_pok1.moveTo(x + 71, y + 74);
        // shadow_shirt_pok1.quadTo(x + 74, y + 103, x + 102, y + 96);
        // shadow_shirt_pok1.quadTo(x + 120, y + 105, x + 100, y + 70);
        // shadow_shirt_pok1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_shirt_pok1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_shirt_pok1);

        // Path2D shirt_pok1 = new Path2D.Double();
        // shirt_pok1.moveTo(x + 127, y + 97);
        // shirt_pok1.quadTo(x + 147, y + 111, x + 149, y + 88);
        // shirt_pok1.quadTo(x + 140, y + 80, x + 127, y + 97);
        // shirt_pok1.closePath();

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_pok1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_pok1);

        // Path2D shirt_boo1 = new Path2D.Double();
        // shirt_boo1.moveTo(x + 127, y + 96);
        // shirt_boo1.quadTo(x + 128, y + 110, x + 124, y + 113);
        // shirt_boo1.quadTo(x + 110, y + 124, x + 112, y + 108);
        // shirt_boo1.quadTo(x + 115, y + 98, x + 127, y + 96);
        // shirt_boo1.closePath();
        
        // shirt_boo1.moveTo(x + 116, y + 96);
        // shirt_boo1.quadTo(x + 103, y + 91, x + 95, y + 104);
        // shirt_boo1.quadTo(x + 85, y + 118, x + 100, y + 115);
        // shirt_boo1.quadTo(x + 110, y + 112, x + 116, y + 100);
        // shirt_boo1.closePath();

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_boo1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_boo1);

        // Path2D shirt_boo_boo1 = new Path2D.Double();
        // shirt_boo_boo1.moveTo(x + 116, y + 96);
        // shirt_boo_boo1.quadTo(x + 115, y + 105, x + 127, y + 96);

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_boo_boo1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_boo_boo1);

        // Path2D shadow_head1 = new Path2D.Double();
        // shadow_head1.moveTo(x + 96, y + 16);
        // shadow_head1.quadTo(x + 97, y + 23, x + 92, y + 25);
        // shadow_head1.quadTo(x + 94, y + 28, x + 92, y + 32);
        // shadow_head1.quadTo(x + 100, y + 30, x + 92, y + 39);
        // shadow_head1.quadTo(x + 80, y + 57, x + 89, y + 57);
        // shadow_head1.quadTo(x + 85, y + 70, x + 88, y + 85);
        // shadow_head1.quadTo(x + 70, y + 73, x + 68, y + 68);
        // shadow_head1.quadTo(x + 68, y + 68, x + 73, y + 55);
        // shadow_head1.quadTo(x + 60, y + 55, x + 82, y + 35);
        // shadow_head1.quadTo(x + 92, y, x + 101, y + 25);

        // Path2D head1 = new Path2D.Double();
        // head1.moveTo(x + 82, y + 35);
        // head1.quadTo(x + 92, y, x + 101, y + 25);
        // head1.quadTo(x + 105, y + 15, x + 108, y + 23);
        // head1.quadTo(x + 120, y + 20, x + 132, y + 23);
        // head1.quadTo(x + 149, y + 7, x + 145, y + 33);
        // head1.quadTo(x + 155, y + 30, x + 150, y + 39);
        // head1.quadTo(x + 160, y + 50, x + 160, y + 70);
        // head1.quadTo(x + 162, y + 80, x + 155, y + 80);
        // head1.quadTo(x + 140, y + 100, x + 137, y + 92);
        // head1.quadTo(x + 120, y + 98, x + 104, y + 89);
        // head1.quadTo(x + 100, y + 95, x + 88, y + 85);
        // head1.quadTo(x + 80, y + 81, x + 70, y + 73);
        // head1.quadTo(x + 68, y + 68, x + 73, y + 55);
        // head1.quadTo(x + 60, y + 55, x + 82, y + 35);
        // head1.closePath();

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(head1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_head1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(head1);

        // head1.moveTo(x + 92, y + 25);
        // head1.quadTo(x + 94, y + 28, x + 92, y + 32);
        // head1.quadTo(x + 100, y + 30, x + 92, y + 39);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(head1);

        // // eye
        // g2d.rotate(Math.toRadians(-20), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 111, y + 52, 8, 5));
        // g2d.rotate(Math.toRadians(20), x + 115, y + 55); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 138, y + 52, 7, 5));
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ

        // // nose
        // g2d.fill(new Ellipse2D.Double(x + 127, y + 53, 8, 6));

        // Path2D mouth1 = new Path2D.Double();
        // mouth1.moveTo(x + 113, y + 65);
        // mouth1.quadTo(x + 121, y + 71, x + 127, y + 64);
        // mouth1.quadTo(x + 130, y + 60, x + 134, y + 64);
        // mouth1.quadTo(x + 138, y + 68, x + 144, y + 62);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(mouth1);

        // Path2D tongue1 = new Path2D.Double();
        // tongue1.moveTo(x + 121, y + 69);
        // tongue1.quadTo(x + 124, y + 80, x + 132, y + 79);
        // tongue1.quadTo(x + 143, y + 79, x + 141, y + 65);
        // tongue1.quadTo(x + 138, y + 68, x + 134, y + 64);
        // tongue1.quadTo(x + 130, y + 60, x + 127, y + 64);
        // tongue1.closePath();

        // g2d.setColor(new Color(255, 101, 101)); // สีผิว
        // g2d.fill(tongue1);

        // tongue1.moveTo(x + 132, y + 64);
        // tongue1.quadTo(x + 133, y + 66, x + 133, y + 71);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(tongue1);







        // // frame 4
        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(3));
        
        // Path2D shadow_boo_hat1 = new Path2D.Double();
        // shadow_boo_hat1.moveTo(x + 73, y + 21);
        // shadow_boo_hat1.quadTo(x + 60, y + 23, x + 50, y + 23);
        // shadow_boo_hat1.quadTo(x + 35, y + 22, x + 45, y + 31);
        // shadow_boo_hat1.quadTo(x + 35, y + 39, x + 45, y + 40);
        // shadow_boo_hat1.quadTo(x + 50, y + 42, x + 70, y + 35);
        // shadow_boo_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_boo_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_boo_hat1);

        // Path2D shadow_s_hat1 = new Path2D.Double();
        // shadow_s_hat1.moveTo(x + 72, y + 28);
        // shadow_s_hat1.quadTo(x + 68, y + 27, x + 70, y + 20);
        // shadow_s_hat1.quadTo(x + 80, y + 2, x + 86, y + 16);
        // shadow_s_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_s_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_s_hat1);

        // Path2D shadow_hat1 = new Path2D.Double();
        // shadow_hat1.moveTo(x + 135, y + 22);
        // shadow_hat1.quadTo(x + 120, y - 13, x + 70, y + 30);
        // shadow_hat1.quadTo(x + 60, y + 37, x + 72, y + 45);
        // shadow_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_hat1);

        // Path2D hat1 = new Path2D.Double();
        // hat1.moveTo(x + 108, y + 9);
        // hat1.quadTo(x + 105, y + 15, x + 120, y + 21);
        // hat1.quadTo(x + 132, y + 23, x + 133, y + 22);
        // hat1.quadTo(x + 125, y + 4, x + 108, y + 9);

        // g2d.setColor(new Color(115, 89, 190));
        // g2d.fill(hat1);


        // Path2D tail1 = new Path2D.Double();
        // tail1.moveTo(x + 61, y + 120);
        // tail1.quadTo(x + 50, y + 130, x + 62, y + 133);
        // tail1.quadTo(x + 62, y + 133, x + 70, y + 147);
        // tail1.quadTo(x + 50, y + 165, x + 50, y + 154);
        // tail1.quadTo(x + 20, y + 158, x + 15, y + 133);
        // tail1.quadTo(x + 13, y + 124, x + 20, y + 126);
        // tail1.quadTo(x + 20, y + 105, x + 40, y + 97);
        // tail1.quadTo(x + 50, y + 97, x + 70, y + 120);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(tail1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(tail1);

        // Path2D hand_R1 = new Path2D.Double();
        // hand_R1.moveTo(x + 46, y + 90);
        // hand_R1.quadTo(x + 33, y + 105, x + 44, y + 112);
        // hand_R1.quadTo(x + 50, y + 116, x + 57, y + 115);
        // hand_R1.quadTo(x + 71, y + 90, x + 46, y + 90);
        // hand_R1.closePath();

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(hand_R1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(hand_R1);

        // Path2D hand_L1 = new Path2D.Double();
        // hand_L1.moveTo(x + 165, y + 101);
        // hand_L1.quadTo(x + 171, y + 115, x + 165, y + 121);
        // hand_L1.quadTo(x + 160, y + 127, x + 149, y + 124);
        // hand_L1.closePath();

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(hand_L1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(hand_L1);

        // Polygon fill_leg1 = new Polygon();
        // fill_leg1.addPoint((int)x + 63, (int)y + 127);
        // fill_leg1.addPoint((int)x + 107, (int)y + 158);
        // fill_leg1.addPoint((int)x + 145, (int)y + 137);
        // fill_leg1.addPoint((int)x + 90, (int)y + 120);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(fill_leg1);

        // Path2D shadow_leg_L1 = new Path2D.Double();
        // shadow_leg_L1.moveTo(x + 107, y + 158);
        // shadow_leg_L1.quadTo(x + 119, y + 177, x + 130, y + 175);
        // shadow_leg_L1.quadTo(x + 145, y + 174, x + 131, y + 174);
        // shadow_leg_L1.quadTo(x + 121, y + 171, x + 114, y + 147);

        // Path2D leg_L1 = new Path2D.Double();
        // leg_L1.moveTo(x + 145, y + 137);
        // leg_L1.quadTo(x + 153, y + 147, x + 147, y + 148);
        // leg_L1.quadTo(x + 145, y + 174, x + 130, y + 175);
        // leg_L1.quadTo(x + 119, y + 177, x + 107, y + 158);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(leg_L1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_leg_L1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(leg_L1);

        // Path2D shadow_leg_R1 = new Path2D.Double();
        // shadow_leg_R1.moveTo(x + 63, y + 127);
        // shadow_leg_R1.quadTo(x + 57, y + 146, x + 63, y + 142);
        // shadow_leg_R1.quadTo(x + 60, y + 180, x + 75, y + 183);
        // shadow_leg_R1.quadTo(x + 94, y + 184, x + 90, y + 175);
        // shadow_leg_R1.quadTo(x + 75, y + 164, x + 75, y + 123);

        // Path2D leg_R1 = new Path2D.Double();
        // leg_R1.moveTo(x + 63, y + 127);
        // leg_R1.quadTo(x + 57, y + 146, x + 63, y + 142);
        // leg_R1.quadTo(x + 60, y + 180, x + 75, y + 183);
        // leg_R1.quadTo(x + 94, y + 184, x + 113, y + 145);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(leg_R1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_leg_R1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(leg_R1);

        // Path2D shadow_shirt1 = new Path2D.Double();
        // shadow_shirt1.moveTo(x + 70, y + 74);
        // shadow_shirt1.quadTo(x + 65, y + 75, x + 52, y + 84);
        // shadow_shirt1.quadTo(x + 41, y + 90, x + 48, y + 92);
        // shadow_shirt1.quadTo(x + 56, y + 100, x + 58, y + 111);
        // shadow_shirt1.quadTo(x + 57, y + 120, x + 65, y + 114);
        // shadow_shirt1.quadTo(x + 52, y + 93, x + 72, y + 80);

        // shadow_shirt1.moveTo(x + 63, y + 116);
        // shadow_shirt1.quadTo(x + 60, y + 129, x + 65, y + 127);
        // shadow_shirt1.quadTo(x + 65, y + 127, x + 75, y + 125);
        // shadow_shirt1.quadTo(x + 76, y + 115, x + 72, y + 111);

        // Polygon fill_shirt1 = new Polygon();
        // fill_shirt1.addPoint((int)x + 70, (int)y + 74);
        // fill_shirt1.addPoint((int)x + 63, (int)y + 116);
        // fill_shirt1.addPoint((int)x + 149, (int)y + 127);
        // fill_shirt1.addPoint((int)x + 150, (int)y + 86);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(fill_shirt1);

        // Path2D shirt1 = new Path2D.Double();
        // shirt1.moveTo(x + 70, y + 74);
        // shirt1.quadTo(x + 65, y + 75, x + 52, y + 84);
        // shirt1.quadTo(x + 41, y + 90, x + 48, y + 92);
        // shirt1.quadTo(x + 56, y + 100, x + 58, y + 111);
        // shirt1.quadTo(x + 57, y + 120, x + 72, y + 111);

        // shirt1.moveTo(x + 150, y + 86);
        // shirt1.quadTo(x + 160, y + 94, x + 163, y + 98);
        // shirt1.quadTo(x + 170, y + 101, x + 149, y + 123);

        // shirt1.moveTo(x + 147, y + 110);
        // shirt1.quadTo(x + 149, y + 137, x + 145, y + 137);
        // shirt1.quadTo(x + 100, y + 125, x + 65, y + 127);
        // shirt1.quadTo(x + 60, y + 129, x + 63, y + 116);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(shirt1);

        // g2d.setColor(new Color(255, 203, 159));
        // g2d.fill(shadow_shirt1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt1);

        // Path2D shadow_shirt_pok1 = new Path2D.Double();
        // shadow_shirt_pok1.moveTo(x + 70, y + 73);
        // shadow_shirt_pok1.quadTo(x + 53, y + 62, x + 57, y + 80);
        // shadow_shirt_pok1.closePath();

        // shadow_shirt_pok1.moveTo(x + 71, y + 74);
        // shadow_shirt_pok1.quadTo(x + 74, y + 103, x + 102, y + 96);
        // shadow_shirt_pok1.quadTo(x + 120, y + 105, x + 100, y + 70);
        // shadow_shirt_pok1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_shirt_pok1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_shirt_pok1);

        // Path2D shirt_pok1 = new Path2D.Double();
        // shirt_pok1.moveTo(x + 127, y + 97);
        // shirt_pok1.quadTo(x + 147, y + 111, x + 149, y + 88);
        // shirt_pok1.quadTo(x + 140, y + 80, x + 127, y + 97);
        // shirt_pok1.closePath();

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_pok1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_pok1);

        // Path2D shirt_boo1 = new Path2D.Double();
        // shirt_boo1.moveTo(x + 127, y + 96);
        // shirt_boo1.quadTo(x + 128, y + 110, x + 124, y + 113);
        // shirt_boo1.quadTo(x + 110, y + 124, x + 112, y + 108);
        // shirt_boo1.quadTo(x + 115, y + 98, x + 127, y + 96);
        // shirt_boo1.closePath();
        
        // shirt_boo1.moveTo(x + 116, y + 96);
        // shirt_boo1.quadTo(x + 103, y + 91, x + 95, y + 104);
        // shirt_boo1.quadTo(x + 85, y + 118, x + 100, y + 115);
        // shirt_boo1.quadTo(x + 110, y + 112, x + 116, y + 100);
        // shirt_boo1.closePath();

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_boo1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_boo1);

        // Path2D shirt_boo_boo1 = new Path2D.Double();
        // shirt_boo_boo1.moveTo(x + 116, y + 96);
        // shirt_boo_boo1.quadTo(x + 115, y + 105, x + 127, y + 96);

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_boo_boo1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_boo_boo1);

        // Path2D shadow_head1 = new Path2D.Double();
        // shadow_head1.moveTo(x + 96, y + 16);
        // shadow_head1.quadTo(x + 97, y + 23, x + 92, y + 25);
        // shadow_head1.quadTo(x + 94, y + 28, x + 92, y + 32);
        // shadow_head1.quadTo(x + 100, y + 30, x + 92, y + 39);
        // shadow_head1.quadTo(x + 80, y + 57, x + 89, y + 57);
        // shadow_head1.quadTo(x + 85, y + 70, x + 88, y + 85);
        // shadow_head1.quadTo(x + 70, y + 73, x + 68, y + 68);
        // shadow_head1.quadTo(x + 68, y + 68, x + 73, y + 55);
        // shadow_head1.quadTo(x + 60, y + 55, x + 82, y + 35);
        // shadow_head1.quadTo(x + 92, y, x + 101, y + 25);

        // Path2D head1 = new Path2D.Double();
        // head1.moveTo(x + 82, y + 35);
        // head1.quadTo(x + 92, y, x + 101, y + 25);
        // head1.quadTo(x + 105, y + 15, x + 108, y + 23);
        // head1.quadTo(x + 120, y + 20, x + 132, y + 23);
        // head1.quadTo(x + 149, y + 7, x + 145, y + 33);
        // head1.quadTo(x + 155, y + 30, x + 150, y + 39);
        // head1.quadTo(x + 160, y + 50, x + 160, y + 70);
        // head1.quadTo(x + 162, y + 80, x + 155, y + 80);
        // head1.quadTo(x + 140, y + 100, x + 137, y + 92);
        // head1.quadTo(x + 120, y + 98, x + 104, y + 89);
        // head1.quadTo(x + 100, y + 95, x + 88, y + 85);
        // head1.quadTo(x + 80, y + 81, x + 70, y + 73);
        // head1.quadTo(x + 68, y + 68, x + 73, y + 55);
        // head1.quadTo(x + 60, y + 55, x + 82, y + 35);
        // head1.closePath();

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(head1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_head1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(head1);

        // head1.moveTo(x + 92, y + 25);
        // head1.quadTo(x + 94, y + 28, x + 92, y + 32);
        // head1.quadTo(x + 100, y + 30, x + 92, y + 39);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(head1);

        // // eye
        // g2d.rotate(Math.toRadians(-20), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 111, y + 52, 8, 5));
        // g2d.rotate(Math.toRadians(20), x + 115, y + 55); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 138, y + 52, 7, 5));
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ

        // // nose
        // g2d.fill(new Ellipse2D.Double(x + 127, y + 53, 8, 6));

        // Path2D mouth1 = new Path2D.Double();
        // mouth1.moveTo(x + 113, y + 65);
        // mouth1.quadTo(x + 121, y + 71, x + 127, y + 64);
        // mouth1.quadTo(x + 130, y + 60, x + 134, y + 64);
        // mouth1.quadTo(x + 138, y + 68, x + 144, y + 62);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(mouth1);

        // Path2D tongue1 = new Path2D.Double();
        // tongue1.moveTo(x + 121, y + 69);
        // tongue1.quadTo(x + 124, y + 80, x + 132, y + 79);
        // tongue1.quadTo(x + 143, y + 79, x + 141, y + 65);
        // tongue1.quadTo(x + 138, y + 68, x + 134, y + 64);
        // tongue1.quadTo(x + 130, y + 60, x + 127, y + 64);
        // tongue1.closePath();

        // g2d.setColor(new Color(255, 101, 101)); // สีผิว
        // g2d.fill(tongue1);

        // tongue1.moveTo(x + 132, y + 64);
        // tongue1.quadTo(x + 133, y + 66, x + 133, y + 71);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(tongue1);
         







        // // frame 5
        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(3));
        
        // Path2D shadow_boo_hat1 = new Path2D.Double();
        // shadow_boo_hat1.moveTo(x + 73, y + 21);
        // shadow_boo_hat1.quadTo(x + 60, y + 23, x + 50, y + 23);
        // shadow_boo_hat1.quadTo(x + 35, y + 22, x + 45, y + 31);
        // shadow_boo_hat1.quadTo(x + 35, y + 39, x + 45, y + 40);
        // shadow_boo_hat1.quadTo(x + 50, y + 42, x + 70, y + 35);
        // shadow_boo_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_boo_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_boo_hat1);

        // Path2D shadow_s_hat1 = new Path2D.Double();
        // shadow_s_hat1.moveTo(x + 72, y + 28);
        // shadow_s_hat1.quadTo(x + 68, y + 27, x + 70, y + 20);
        // shadow_s_hat1.quadTo(x + 80, y + 2, x + 86, y + 16);
        // shadow_s_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_s_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_s_hat1);

        // Path2D shadow_hat1 = new Path2D.Double();
        // shadow_hat1.moveTo(x + 135, y + 22);
        // shadow_hat1.quadTo(x + 120, y - 13, x + 70, y + 30);
        // shadow_hat1.quadTo(x + 60, y + 37, x + 72, y + 45);
        // shadow_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_hat1);

        // Path2D hat1 = new Path2D.Double();
        // hat1.moveTo(x + 108, y + 9);
        // hat1.quadTo(x + 105, y + 15, x + 120, y + 21);
        // hat1.quadTo(x + 132, y + 23, x + 133, y + 22);
        // hat1.quadTo(x + 125, y + 4, x + 108, y + 9);

        // g2d.setColor(new Color(115, 89, 190));
        // g2d.fill(hat1);


        // Path2D tail1 = new Path2D.Double();
        // tail1.moveTo(x + 61, y + 120);
        // tail1.quadTo(x + 50, y + 130, x + 62, y + 133);
        // tail1.quadTo(x + 62, y + 133, x + 70, y + 147);
        // tail1.quadTo(x + 50, y + 165, x + 50, y + 154);
        // tail1.quadTo(x + 20, y + 158, x + 15, y + 133);
        // tail1.quadTo(x + 13, y + 124, x + 20, y + 126);
        // tail1.quadTo(x + 20, y + 105, x + 40, y + 97);
        // tail1.quadTo(x + 50, y + 97, x + 70, y + 120);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(tail1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(tail1);

        // Path2D hand_R1 = new Path2D.Double();
        // hand_R1.moveTo(x + 46, y + 90);
        // hand_R1.quadTo(x + 33, y + 105, x + 44, y + 112);
        // hand_R1.quadTo(x + 50, y + 116, x + 57, y + 115);
        // hand_R1.quadTo(x + 71, y + 90, x + 46, y + 90);
        // hand_R1.closePath();

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(hand_R1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(hand_R1);

        // Path2D hand_L1 = new Path2D.Double();
        // hand_L1.moveTo(x + 165, y + 101);
        // hand_L1.quadTo(x + 171, y + 115, x + 165, y + 121);
        // hand_L1.quadTo(x + 160, y + 127, x + 149, y + 124);
        // hand_L1.closePath();

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(hand_L1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(hand_L1);

        // Polygon fill_leg1 = new Polygon();
        // fill_leg1.addPoint((int)x + 63, (int)y + 127);
        // fill_leg1.addPoint((int)x + 108, (int)y + 153);
        // fill_leg1.addPoint((int)x + 145, (int)y + 137);
        // fill_leg1.addPoint((int)x + 90, (int)y + 120);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(fill_leg1);

        // Path2D shadow_leg_L1 = new Path2D.Double();
        // shadow_leg_L1.moveTo(x + 108, y + 153);
        // shadow_leg_L1.quadTo(x + 119, y + 162, x + 126, y + 165);
        // shadow_leg_L1.quadTo(x + 155, y + 175, x + 138, y + 167);
        // shadow_leg_L1.quadTo(x + 126, y + 160, x + 115, y + 143);

        // Path2D leg_L1 = new Path2D.Double();
        // leg_L1.moveTo(x + 145, y + 137);
        // leg_L1.quadTo(x + 156, y + 140, x + 149, y + 143);
        // leg_L1.quadTo(x + 155, y + 179, x + 126, y + 165);
        // leg_L1.quadTo(x + 119, y + 162, x + 108, y + 153);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(leg_L1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_leg_L1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(leg_L1);

        // Path2D shadow_leg_R1 = new Path2D.Double();
        // shadow_leg_R1.moveTo(x + 63, y + 127);
        // shadow_leg_R1.quadTo(x + 50, y + 141, x + 58, y + 142);
        // shadow_leg_R1.quadTo(x + 50, y + 175, x + 60, y + 183);
        // shadow_leg_R1.quadTo(x + 83, y + 184, x + 75, y + 179);
        // shadow_leg_R1.quadTo(x + 60, y + 174, x + 75, y + 128);

        // Path2D leg_R1 = new Path2D.Double();
        // leg_R1.moveTo(x + 63, y + 127);
        // leg_R1.quadTo(x + 50, y + 141, x + 58, y + 142);
        // leg_R1.quadTo(x + 50, y + 175, x + 60, y + 183);
        // leg_R1.quadTo(x + 83, y + 186, x + 115, y + 143);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(leg_R1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_leg_R1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(leg_R1);

        // Path2D shadow_shirt1 = new Path2D.Double();
        // shadow_shirt1.moveTo(x + 70, y + 74);
        // shadow_shirt1.quadTo(x + 65, y + 75, x + 52, y + 84);
        // shadow_shirt1.quadTo(x + 41, y + 90, x + 48, y + 92);
        // shadow_shirt1.quadTo(x + 56, y + 100, x + 58, y + 111);
        // shadow_shirt1.quadTo(x + 57, y + 120, x + 65, y + 114);
        // shadow_shirt1.quadTo(x + 52, y + 93, x + 72, y + 80);

        // shadow_shirt1.moveTo(x + 63, y + 116);
        // shadow_shirt1.quadTo(x + 60, y + 129, x + 65, y + 127);
        // shadow_shirt1.quadTo(x + 65, y + 127, x + 75, y + 125);
        // shadow_shirt1.quadTo(x + 76, y + 115, x + 72, y + 111);

        // Polygon fill_shirt1 = new Polygon();
        // fill_shirt1.addPoint((int)x + 70, (int)y + 74);
        // fill_shirt1.addPoint((int)x + 63, (int)y + 116);
        // fill_shirt1.addPoint((int)x + 149, (int)y + 127);
        // fill_shirt1.addPoint((int)x + 150, (int)y + 86);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(fill_shirt1);

        // Path2D shirt1 = new Path2D.Double();
        // shirt1.moveTo(x + 70, y + 74);
        // shirt1.quadTo(x + 65, y + 75, x + 52, y + 84);
        // shirt1.quadTo(x + 41, y + 90, x + 48, y + 92);
        // shirt1.quadTo(x + 56, y + 100, x + 58, y + 111);
        // shirt1.quadTo(x + 57, y + 120, x + 72, y + 111);

        // shirt1.moveTo(x + 150, y + 86);
        // shirt1.quadTo(x + 160, y + 94, x + 163, y + 98);
        // shirt1.quadTo(x + 170, y + 101, x + 149, y + 123);

        // shirt1.moveTo(x + 147, y + 110);
        // shirt1.quadTo(x + 149, y + 137, x + 145, y + 137);
        // shirt1.quadTo(x + 100, y + 125, x + 65, y + 127);
        // shirt1.quadTo(x + 60, y + 129, x + 63, y + 116);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(shirt1);

        // g2d.setColor(new Color(255, 203, 159));
        // g2d.fill(shadow_shirt1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt1);

        // Path2D shadow_shirt_pok1 = new Path2D.Double();
        // shadow_shirt_pok1.moveTo(x + 70, y + 73);
        // shadow_shirt_pok1.quadTo(x + 53, y + 62, x + 57, y + 80);
        // shadow_shirt_pok1.closePath();

        // shadow_shirt_pok1.moveTo(x + 71, y + 74);
        // shadow_shirt_pok1.quadTo(x + 74, y + 103, x + 102, y + 96);
        // shadow_shirt_pok1.quadTo(x + 120, y + 105, x + 100, y + 70);
        // shadow_shirt_pok1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_shirt_pok1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_shirt_pok1);

        // Path2D shirt_pok1 = new Path2D.Double();
        // shirt_pok1.moveTo(x + 127, y + 97);
        // shirt_pok1.quadTo(x + 147, y + 111, x + 149, y + 88);
        // shirt_pok1.quadTo(x + 140, y + 80, x + 127, y + 97);
        // shirt_pok1.closePath();

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_pok1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_pok1);

        // Path2D shirt_boo1 = new Path2D.Double();
        // shirt_boo1.moveTo(x + 127, y + 96);
        // shirt_boo1.quadTo(x + 128, y + 110, x + 124, y + 113);
        // shirt_boo1.quadTo(x + 110, y + 124, x + 112, y + 108);
        // shirt_boo1.quadTo(x + 115, y + 98, x + 127, y + 96);
        // shirt_boo1.closePath();
        
        // shirt_boo1.moveTo(x + 116, y + 96);
        // shirt_boo1.quadTo(x + 103, y + 91, x + 95, y + 104);
        // shirt_boo1.quadTo(x + 85, y + 118, x + 100, y + 115);
        // shirt_boo1.quadTo(x + 110, y + 112, x + 116, y + 100);
        // shirt_boo1.closePath();

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_boo1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_boo1);

        // Path2D shirt_boo_boo1 = new Path2D.Double();
        // shirt_boo_boo1.moveTo(x + 116, y + 96);
        // shirt_boo_boo1.quadTo(x + 115, y + 105, x + 127, y + 96);

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_boo_boo1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_boo_boo1);

        // Path2D shadow_head1 = new Path2D.Double();
        // shadow_head1.moveTo(x + 96, y + 16);
        // shadow_head1.quadTo(x + 97, y + 23, x + 92, y + 25);
        // shadow_head1.quadTo(x + 94, y + 28, x + 92, y + 32);
        // shadow_head1.quadTo(x + 100, y + 30, x + 92, y + 39);
        // shadow_head1.quadTo(x + 80, y + 57, x + 89, y + 57);
        // shadow_head1.quadTo(x + 85, y + 70, x + 88, y + 85);
        // shadow_head1.quadTo(x + 70, y + 73, x + 68, y + 68);
        // shadow_head1.quadTo(x + 68, y + 68, x + 73, y + 55);
        // shadow_head1.quadTo(x + 60, y + 55, x + 82, y + 35);
        // shadow_head1.quadTo(x + 92, y, x + 101, y + 25);

        // Path2D head1 = new Path2D.Double();
        // head1.moveTo(x + 82, y + 35);
        // head1.quadTo(x + 92, y, x + 101, y + 25);
        // head1.quadTo(x + 105, y + 15, x + 108, y + 23);
        // head1.quadTo(x + 120, y + 20, x + 132, y + 23);
        // head1.quadTo(x + 149, y + 7, x + 145, y + 33);
        // head1.quadTo(x + 155, y + 30, x + 150, y + 39);
        // head1.quadTo(x + 160, y + 50, x + 160, y + 70);
        // head1.quadTo(x + 162, y + 80, x + 155, y + 80);
        // head1.quadTo(x + 140, y + 100, x + 137, y + 92);
        // head1.quadTo(x + 120, y + 98, x + 104, y + 89);
        // head1.quadTo(x + 100, y + 95, x + 88, y + 85);
        // head1.quadTo(x + 80, y + 81, x + 70, y + 73);
        // head1.quadTo(x + 68, y + 68, x + 73, y + 55);
        // head1.quadTo(x + 60, y + 55, x + 82, y + 35);
        // head1.closePath();

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(head1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_head1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(head1);

        // head1.moveTo(x + 92, y + 25);
        // head1.quadTo(x + 94, y + 28, x + 92, y + 32);
        // head1.quadTo(x + 100, y + 30, x + 92, y + 39);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(head1);

        // // eye
        // g2d.rotate(Math.toRadians(-20), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 111, y + 52, 8, 5));
        // g2d.rotate(Math.toRadians(20), x + 115, y + 55); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 138, y + 52, 7, 5));
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ

        // // nose
        // g2d.fill(new Ellipse2D.Double(x + 127, y + 53, 8, 6));

        // Path2D mouth1 = new Path2D.Double();
        // mouth1.moveTo(x + 113, y + 65);
        // mouth1.quadTo(x + 121, y + 71, x + 127, y + 64);
        // mouth1.quadTo(x + 130, y + 60, x + 134, y + 64);
        // mouth1.quadTo(x + 138, y + 68, x + 144, y + 62);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(mouth1);

        // Path2D tongue1 = new Path2D.Double();
        // tongue1.moveTo(x + 121, y + 69);
        // tongue1.quadTo(x + 124, y + 80, x + 132, y + 79);
        // tongue1.quadTo(x + 143, y + 79, x + 141, y + 65);
        // tongue1.quadTo(x + 138, y + 68, x + 134, y + 64);
        // tongue1.quadTo(x + 130, y + 60, x + 127, y + 64);
        // tongue1.closePath();

        // g2d.setColor(new Color(255, 101, 101)); // สีผิว
        // g2d.fill(tongue1);

        // tongue1.moveTo(x + 132, y + 64);
        // tongue1.quadTo(x + 133, y + 66, x + 133, y + 71);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(tongue1);









        // // frame 6
        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(3));
        
        // Path2D shadow_boo_hat1 = new Path2D.Double();
        // shadow_boo_hat1.moveTo(x + 73, y + 21);
        // shadow_boo_hat1.quadTo(x + 60, y + 23, x + 50, y + 23);
        // shadow_boo_hat1.quadTo(x + 35, y + 22, x + 45, y + 31);
        // shadow_boo_hat1.quadTo(x + 35, y + 39, x + 45, y + 40);
        // shadow_boo_hat1.quadTo(x + 50, y + 42, x + 70, y + 35);
        // shadow_boo_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_boo_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_boo_hat1);

        // Path2D shadow_s_hat1 = new Path2D.Double();
        // shadow_s_hat1.moveTo(x + 72, y + 28);
        // shadow_s_hat1.quadTo(x + 68, y + 27, x + 70, y + 20);
        // shadow_s_hat1.quadTo(x + 80, y + 2, x + 86, y + 16);
        // shadow_s_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_s_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_s_hat1);

        // Path2D shadow_hat1 = new Path2D.Double();
        // shadow_hat1.moveTo(x + 135, y + 22);
        // shadow_hat1.quadTo(x + 120, y - 13, x + 70, y + 30);
        // shadow_hat1.quadTo(x + 60, y + 37, x + 72, y + 45);
        // shadow_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_hat1);

        // Path2D hat1 = new Path2D.Double();
        // hat1.moveTo(x + 108, y + 9);
        // hat1.quadTo(x + 105, y + 15, x + 120, y + 21);
        // hat1.quadTo(x + 132, y + 23, x + 133, y + 22);
        // hat1.quadTo(x + 125, y + 4, x + 108, y + 9);

        // g2d.setColor(new Color(115, 89, 190));
        // g2d.fill(hat1);


        // Path2D tail1 = new Path2D.Double();
        // tail1.moveTo(x + 61, y + 120);
        // tail1.quadTo(x + 50, y + 130, x + 62, y + 133);
        // tail1.quadTo(x + 62, y + 133, x + 70, y + 147);
        // tail1.quadTo(x + 50, y + 165, x + 50, y + 154);
        // tail1.quadTo(x + 20, y + 158, x + 15, y + 133);
        // tail1.quadTo(x + 13, y + 124, x + 20, y + 126);
        // tail1.quadTo(x + 20, y + 105, x + 40, y + 97);
        // tail1.quadTo(x + 50, y + 97, x + 70, y + 120);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(tail1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(tail1);

        // Path2D hand_R1 = new Path2D.Double();
        // hand_R1.moveTo(x + 46, y + 90);
        // hand_R1.quadTo(x + 33, y + 105, x + 44, y + 112);
        // hand_R1.quadTo(x + 50, y + 116, x + 57, y + 115);
        // hand_R1.quadTo(x + 71, y + 90, x + 46, y + 90);
        // hand_R1.closePath();

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(hand_R1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(hand_R1);

        // Path2D hand_L1 = new Path2D.Double();
        // hand_L1.moveTo(x + 165, y + 101);
        // hand_L1.quadTo(x + 171, y + 115, x + 165, y + 121);
        // hand_L1.quadTo(x + 160, y + 127, x + 149, y + 124);
        // hand_L1.closePath();

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(hand_L1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(hand_L1);

        // Polygon fill_leg1 = new Polygon();
        // fill_leg1.addPoint((int)x + 63, (int)y + 127);
        // fill_leg1.addPoint((int)x + 108, (int)y + 153);
        // fill_leg1.addPoint((int)x + 145, (int)y + 137);
        // fill_leg1.addPoint((int)x + 90, (int)y + 120);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(fill_leg1);

        // Path2D shadow_leg_L1 = new Path2D.Double();
        // shadow_leg_L1.moveTo(x + 105, y + 155);
        // shadow_leg_L1.quadTo(x + 116, y + 180, x + 126, y + 183);
        // shadow_leg_L1.quadTo(x + 143, y + 185, x + 133, y + 179);
        // shadow_leg_L1.quadTo(x + 123, y + 175, x + 115, y + 145);

        // Path2D leg_L1 = new Path2D.Double();
        // leg_L1.moveTo(x + 145, y + 137);
        // leg_L1.quadTo(x + 151, y + 152, x + 144, y + 150);
        // leg_L1.quadTo(x + 143, y + 185, x + 126, y + 183);
        // leg_L1.quadTo(x + 116, y + 180, x + 105, y + 155);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(leg_L1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_leg_L1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(leg_L1);

        // Path2D shadow_leg_R1 = new Path2D.Double();
        // shadow_leg_R1.moveTo(x + 63, y + 127);
        // shadow_leg_R1.quadTo(x + 55, y + 146, x + 63, y + 147);
        // shadow_leg_R1.quadTo(x + 60, y + 170, x + 73, y + 178);
        // shadow_leg_R1.quadTo(x + 85, y + 183, x + 80, y + 175);
        // shadow_leg_R1.quadTo(x + 70, y + 165, x + 75, y + 128);

        // Path2D leg_R1 = new Path2D.Double();
        // leg_R1.moveTo(x + 63, y + 127);
        // leg_R1.quadTo(x + 55, y + 146, x + 63, y + 147);
        // leg_R1.quadTo(x + 60, y + 170, x + 73, y + 178);
        // leg_R1.quadTo(x + 85, y + 183, x + 115, y + 143);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(leg_R1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_leg_R1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(leg_R1);

        // Path2D shadow_shirt1 = new Path2D.Double();
        // shadow_shirt1.moveTo(x + 70, y + 74);
        // shadow_shirt1.quadTo(x + 65, y + 75, x + 52, y + 84);
        // shadow_shirt1.quadTo(x + 41, y + 90, x + 48, y + 92);
        // shadow_shirt1.quadTo(x + 56, y + 100, x + 58, y + 111);
        // shadow_shirt1.quadTo(x + 57, y + 120, x + 65, y + 114);
        // shadow_shirt1.quadTo(x + 52, y + 93, x + 72, y + 80);

        // shadow_shirt1.moveTo(x + 63, y + 116);
        // shadow_shirt1.quadTo(x + 60, y + 129, x + 65, y + 127);
        // shadow_shirt1.quadTo(x + 65, y + 127, x + 75, y + 125);
        // shadow_shirt1.quadTo(x + 76, y + 115, x + 72, y + 111);

        // Polygon fill_shirt1 = new Polygon();
        // fill_shirt1.addPoint((int)x + 70, (int)y + 74);
        // fill_shirt1.addPoint((int)x + 63, (int)y + 116);
        // fill_shirt1.addPoint((int)x + 149, (int)y + 127);
        // fill_shirt1.addPoint((int)x + 150, (int)y + 86);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(fill_shirt1);

        // Path2D shirt1 = new Path2D.Double();
        // shirt1.moveTo(x + 70, y + 74);
        // shirt1.quadTo(x + 65, y + 75, x + 52, y + 84);
        // shirt1.quadTo(x + 41, y + 90, x + 48, y + 92);
        // shirt1.quadTo(x + 56, y + 100, x + 58, y + 111);
        // shirt1.quadTo(x + 57, y + 120, x + 72, y + 111);

        // shirt1.moveTo(x + 150, y + 86);
        // shirt1.quadTo(x + 160, y + 94, x + 163, y + 98);
        // shirt1.quadTo(x + 170, y + 101, x + 149, y + 123);

        // shirt1.moveTo(x + 147, y + 110);
        // shirt1.quadTo(x + 149, y + 137, x + 145, y + 137);
        // shirt1.quadTo(x + 100, y + 125, x + 65, y + 127);
        // shirt1.quadTo(x + 60, y + 129, x + 63, y + 116);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(shirt1);

        // g2d.setColor(new Color(255, 203, 159));
        // g2d.fill(shadow_shirt1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt1);

        // Path2D shadow_shirt_pok1 = new Path2D.Double();
        // shadow_shirt_pok1.moveTo(x + 70, y + 73);
        // shadow_shirt_pok1.quadTo(x + 53, y + 62, x + 57, y + 80);
        // shadow_shirt_pok1.closePath();

        // shadow_shirt_pok1.moveTo(x + 71, y + 74);
        // shadow_shirt_pok1.quadTo(x + 74, y + 103, x + 102, y + 96);
        // shadow_shirt_pok1.quadTo(x + 120, y + 105, x + 100, y + 70);
        // shadow_shirt_pok1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_shirt_pok1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_shirt_pok1);

        // Path2D shirt_pok1 = new Path2D.Double();
        // shirt_pok1.moveTo(x + 127, y + 97);
        // shirt_pok1.quadTo(x + 147, y + 111, x + 149, y + 88);
        // shirt_pok1.quadTo(x + 140, y + 80, x + 127, y + 97);
        // shirt_pok1.closePath();

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_pok1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_pok1);

        // Path2D shirt_boo1 = new Path2D.Double();
        // shirt_boo1.moveTo(x + 127, y + 96);
        // shirt_boo1.quadTo(x + 128, y + 110, x + 124, y + 113);
        // shirt_boo1.quadTo(x + 110, y + 124, x + 112, y + 108);
        // shirt_boo1.quadTo(x + 115, y + 98, x + 127, y + 96);
        // shirt_boo1.closePath();
        
        // shirt_boo1.moveTo(x + 116, y + 96);
        // shirt_boo1.quadTo(x + 103, y + 91, x + 95, y + 104);
        // shirt_boo1.quadTo(x + 85, y + 118, x + 100, y + 115);
        // shirt_boo1.quadTo(x + 110, y + 112, x + 116, y + 100);
        // shirt_boo1.closePath();

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_boo1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_boo1);

        // Path2D shirt_boo_boo1 = new Path2D.Double();
        // shirt_boo_boo1.moveTo(x + 116, y + 96);
        // shirt_boo_boo1.quadTo(x + 115, y + 105, x + 127, y + 96);

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_boo_boo1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_boo_boo1);

        // Path2D shadow_head1 = new Path2D.Double();
        // shadow_head1.moveTo(x + 96, y + 16);
        // shadow_head1.quadTo(x + 97, y + 23, x + 92, y + 25);
        // shadow_head1.quadTo(x + 94, y + 28, x + 92, y + 32);
        // shadow_head1.quadTo(x + 100, y + 30, x + 92, y + 39);
        // shadow_head1.quadTo(x + 80, y + 57, x + 89, y + 57);
        // shadow_head1.quadTo(x + 85, y + 70, x + 88, y + 85);
        // shadow_head1.quadTo(x + 70, y + 73, x + 68, y + 68);
        // shadow_head1.quadTo(x + 68, y + 68, x + 73, y + 55);
        // shadow_head1.quadTo(x + 60, y + 55, x + 82, y + 35);
        // shadow_head1.quadTo(x + 92, y, x + 101, y + 25);

        // Path2D head1 = new Path2D.Double();
        // head1.moveTo(x + 82, y + 35);
        // head1.quadTo(x + 92, y, x + 101, y + 25);
        // head1.quadTo(x + 105, y + 15, x + 108, y + 23);
        // head1.quadTo(x + 120, y + 20, x + 132, y + 23);
        // head1.quadTo(x + 149, y + 7, x + 145, y + 33);
        // head1.quadTo(x + 155, y + 30, x + 150, y + 39);
        // head1.quadTo(x + 160, y + 50, x + 160, y + 70);
        // head1.quadTo(x + 162, y + 80, x + 155, y + 80);
        // head1.quadTo(x + 140, y + 100, x + 137, y + 92);
        // head1.quadTo(x + 120, y + 98, x + 104, y + 89);
        // head1.quadTo(x + 100, y + 95, x + 88, y + 85);
        // head1.quadTo(x + 80, y + 81, x + 70, y + 73);
        // head1.quadTo(x + 68, y + 68, x + 73, y + 55);
        // head1.quadTo(x + 60, y + 55, x + 82, y + 35);
        // head1.closePath();

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(head1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_head1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(head1);

        // head1.moveTo(x + 92, y + 25);
        // head1.quadTo(x + 94, y + 28, x + 92, y + 32);
        // head1.quadTo(x + 100, y + 30, x + 92, y + 39);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(head1);

        // // eye
        // g2d.rotate(Math.toRadians(-20), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 111, y + 52, 8, 5));
        // g2d.rotate(Math.toRadians(20), x + 115, y + 55); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 138, y + 52, 7, 5));
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ

        // // nose
        // g2d.fill(new Ellipse2D.Double(x + 127, y + 53, 8, 6));

        // Path2D mouth1 = new Path2D.Double();
        // mouth1.moveTo(x + 113, y + 65);
        // mouth1.quadTo(x + 121, y + 71, x + 127, y + 64);
        // mouth1.quadTo(x + 130, y + 60, x + 134, y + 64);
        // mouth1.quadTo(x + 138, y + 68, x + 144, y + 62);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(mouth1);

        // Path2D tongue1 = new Path2D.Double();
        // tongue1.moveTo(x + 121, y + 69);
        // tongue1.quadTo(x + 124, y + 80, x + 132, y + 79);
        // tongue1.quadTo(x + 143, y + 79, x + 141, y + 65);
        // tongue1.quadTo(x + 138, y + 68, x + 134, y + 64);
        // tongue1.quadTo(x + 130, y + 60, x + 127, y + 64);
        // tongue1.closePath();

        // g2d.setColor(new Color(255, 101, 101)); // สีผิว
        // g2d.fill(tongue1);

        // tongue1.moveTo(x + 132, y + 64);
        // tongue1.quadTo(x + 133, y + 66, x + 133, y + 71);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(tongue1);
        






        // // frame 7
        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(3));
        
        // Path2D shadow_boo_hat1 = new Path2D.Double();
        // shadow_boo_hat1.moveTo(x + 73, y + 21);
        // shadow_boo_hat1.quadTo(x + 60, y + 23, x + 50, y + 23);
        // shadow_boo_hat1.quadTo(x + 35, y + 22, x + 45, y + 31);
        // shadow_boo_hat1.quadTo(x + 35, y + 39, x + 45, y + 40);
        // shadow_boo_hat1.quadTo(x + 50, y + 42, x + 70, y + 35);
        // shadow_boo_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_boo_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_boo_hat1);

        // Path2D shadow_s_hat1 = new Path2D.Double();
        // shadow_s_hat1.moveTo(x + 72, y + 28);
        // shadow_s_hat1.quadTo(x + 68, y + 27, x + 70, y + 20);
        // shadow_s_hat1.quadTo(x + 80, y + 2, x + 86, y + 16);
        // shadow_s_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_s_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_s_hat1);

        // Path2D shadow_hat1 = new Path2D.Double();
        // shadow_hat1.moveTo(x + 135, y + 22);
        // shadow_hat1.quadTo(x + 120, y - 13, x + 70, y + 30);
        // shadow_hat1.quadTo(x + 60, y + 37, x + 72, y + 45);
        // shadow_hat1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_hat1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_hat1);

        // Path2D hat1 = new Path2D.Double();
        // hat1.moveTo(x + 108, y + 9);
        // hat1.quadTo(x + 105, y + 15, x + 120, y + 21);
        // hat1.quadTo(x + 132, y + 23, x + 133, y + 22);
        // hat1.quadTo(x + 125, y + 4, x + 108, y + 9);

        // g2d.setColor(new Color(115, 89, 190));
        // g2d.fill(hat1);


        // Path2D tail1 = new Path2D.Double();
        // tail1.moveTo(x + 61, y + 120);
        // tail1.quadTo(x + 50, y + 130, x + 62, y + 133);
        // tail1.quadTo(x + 62, y + 133, x + 70, y + 147);
        // tail1.quadTo(x + 50, y + 165, x + 50, y + 154);
        // tail1.quadTo(x + 20, y + 158, x + 15, y + 133);
        // tail1.quadTo(x + 13, y + 124, x + 20, y + 126);
        // tail1.quadTo(x + 20, y + 105, x + 40, y + 97);
        // tail1.quadTo(x + 50, y + 97, x + 70, y + 120);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(tail1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(tail1);

        // Path2D hand_R1 = new Path2D.Double();
        // hand_R1.moveTo(x + 46, y + 90);
        // hand_R1.quadTo(x + 33, y + 105, x + 44, y + 112);
        // hand_R1.quadTo(x + 50, y + 116, x + 57, y + 115);
        // hand_R1.quadTo(x + 71, y + 90, x + 46, y + 90);
        // hand_R1.closePath();

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(hand_R1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(hand_R1);

        // Path2D hand_L1 = new Path2D.Double();
        // hand_L1.moveTo(x + 165, y + 101);
        // hand_L1.quadTo(x + 171, y + 115, x + 165, y + 121);
        // hand_L1.quadTo(x + 160, y + 127, x + 149, y + 124);
        // hand_L1.closePath();

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(hand_L1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(hand_L1);

        // Polygon fill_leg1 = new Polygon();
        // fill_leg1.addPoint((int)x + 63, (int)y + 127);
        // fill_leg1.addPoint((int)x + 101, (int)y + 163);
        // fill_leg1.addPoint((int)x + 145, (int)y + 137);
        // fill_leg1.addPoint((int)x + 90, (int)y + 120);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(fill_leg1);

        // Path2D shadow_leg_L1 = new Path2D.Double();
        // shadow_leg_L1.moveTo(x + 101, y + 163);
        // shadow_leg_L1.quadTo(x + 106, y + 181, x + 116, y + 183);
        // shadow_leg_L1.quadTo(x + 130, y + 185, x + 124, y + 180);
        // shadow_leg_L1.quadTo(x + 113, y + 170, x + 115, y + 144);

        // Path2D leg_L1 = new Path2D.Double();
        // leg_L1.moveTo(x + 145, y + 137);
        // leg_L1.quadTo(x + 150, y + 150, x + 143, y + 150);
        // leg_L1.quadTo(x + 130, y + 185, x + 116, y + 183);
        // leg_L1.quadTo(x + 106, y + 181, x + 101, y + 163);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(leg_L1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_leg_L1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(leg_L1);

        // Path2D shadow_leg_R1 = new Path2D.Double();
        // shadow_leg_R1.moveTo(x + 63, y + 127);
        // shadow_leg_R1.quadTo(x + 57, y + 144, x + 65, y + 145);
        // shadow_leg_R1.quadTo(x + 65, y + 175, x + 83, y + 175);
        // shadow_leg_R1.quadTo(x + 98, y + 173, x + 86, y + 172);
        // shadow_leg_R1.quadTo(x + 74, y + 164, x + 75, y + 128);

        // Path2D leg_R1 = new Path2D.Double();
        // leg_R1.moveTo(x + 63, y + 127);
        // leg_R1.quadTo(x + 57, y + 144, x + 65, y + 145);
        // leg_R1.quadTo(x + 65, y + 175, x + 83, y + 175);
        // leg_R1.quadTo(x + 98, y + 173, x + 115, y + 143);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(leg_R1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_leg_R1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(leg_R1);

        // Path2D shadow_shirt1 = new Path2D.Double();
        // shadow_shirt1.moveTo(x + 70, y + 74);
        // shadow_shirt1.quadTo(x + 65, y + 75, x + 52, y + 84);
        // shadow_shirt1.quadTo(x + 41, y + 90, x + 48, y + 92);
        // shadow_shirt1.quadTo(x + 56, y + 100, x + 58, y + 111);
        // shadow_shirt1.quadTo(x + 57, y + 120, x + 65, y + 114);
        // shadow_shirt1.quadTo(x + 52, y + 93, x + 72, y + 80);

        // shadow_shirt1.moveTo(x + 63, y + 116);
        // shadow_shirt1.quadTo(x + 60, y + 129, x + 65, y + 127);
        // shadow_shirt1.quadTo(x + 65, y + 127, x + 75, y + 125);
        // shadow_shirt1.quadTo(x + 76, y + 115, x + 72, y + 111);

        // Polygon fill_shirt1 = new Polygon();
        // fill_shirt1.addPoint((int)x + 70, (int)y + 74);
        // fill_shirt1.addPoint((int)x + 63, (int)y + 116);
        // fill_shirt1.addPoint((int)x + 149, (int)y + 127);
        // fill_shirt1.addPoint((int)x + 150, (int)y + 86);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(fill_shirt1);

        // Path2D shirt1 = new Path2D.Double();
        // shirt1.moveTo(x + 70, y + 74);
        // shirt1.quadTo(x + 65, y + 75, x + 52, y + 84);
        // shirt1.quadTo(x + 41, y + 90, x + 48, y + 92);
        // shirt1.quadTo(x + 56, y + 100, x + 58, y + 111);
        // shirt1.quadTo(x + 57, y + 120, x + 72, y + 111);

        // shirt1.moveTo(x + 150, y + 86);
        // shirt1.quadTo(x + 160, y + 94, x + 163, y + 98);
        // shirt1.quadTo(x + 170, y + 101, x + 149, y + 123);

        // shirt1.moveTo(x + 147, y + 110);
        // shirt1.quadTo(x + 149, y + 137, x + 145, y + 137);
        // shirt1.quadTo(x + 100, y + 125, x + 65, y + 127);
        // shirt1.quadTo(x + 60, y + 129, x + 63, y + 116);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(shirt1);

        // g2d.setColor(new Color(255, 203, 159));
        // g2d.fill(shadow_shirt1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt1);

        // Path2D shadow_shirt_pok1 = new Path2D.Double();
        // shadow_shirt_pok1.moveTo(x + 70, y + 73);
        // shadow_shirt_pok1.quadTo(x + 53, y + 62, x + 57, y + 80);
        // shadow_shirt_pok1.closePath();

        // shadow_shirt_pok1.moveTo(x + 71, y + 74);
        // shadow_shirt_pok1.quadTo(x + 74, y + 103, x + 102, y + 96);
        // shadow_shirt_pok1.quadTo(x + 120, y + 105, x + 100, y + 70);
        // shadow_shirt_pok1.closePath();

        // g2d.setColor(new Color(115, 71, 121)); // สีผิว
        // g2d.fill(shadow_shirt_pok1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shadow_shirt_pok1);

        // Path2D shirt_pok1 = new Path2D.Double();
        // shirt_pok1.moveTo(x + 127, y + 97);
        // shirt_pok1.quadTo(x + 147, y + 111, x + 149, y + 88);
        // shirt_pok1.quadTo(x + 140, y + 80, x + 127, y + 97);
        // shirt_pok1.closePath();

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_pok1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_pok1);

        // Path2D shirt_boo1 = new Path2D.Double();
        // shirt_boo1.moveTo(x + 127, y + 96);
        // shirt_boo1.quadTo(x + 128, y + 110, x + 124, y + 113);
        // shirt_boo1.quadTo(x + 110, y + 124, x + 112, y + 108);
        // shirt_boo1.quadTo(x + 115, y + 98, x + 127, y + 96);
        // shirt_boo1.closePath();
        
        // shirt_boo1.moveTo(x + 116, y + 96);
        // shirt_boo1.quadTo(x + 103, y + 91, x + 95, y + 104);
        // shirt_boo1.quadTo(x + 85, y + 118, x + 100, y + 115);
        // shirt_boo1.quadTo(x + 110, y + 112, x + 116, y + 100);
        // shirt_boo1.closePath();

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_boo1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_boo1);

        // Path2D shirt_boo_boo1 = new Path2D.Double();
        // shirt_boo_boo1.moveTo(x + 116, y + 96);
        // shirt_boo_boo1.quadTo(x + 115, y + 105, x + 127, y + 96);

        // g2d.setColor(new Color(115, 89, 190)); // สีผิว
        // g2d.fill(shirt_boo_boo1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(shirt_boo_boo1);

        // Path2D shadow_head1 = new Path2D.Double();
        // shadow_head1.moveTo(x + 96, y + 16);
        // shadow_head1.quadTo(x + 97, y + 23, x + 92, y + 25);
        // shadow_head1.quadTo(x + 94, y + 28, x + 92, y + 32);
        // shadow_head1.quadTo(x + 100, y + 30, x + 92, y + 39);
        // shadow_head1.quadTo(x + 80, y + 57, x + 89, y + 57);
        // shadow_head1.quadTo(x + 85, y + 70, x + 88, y + 85);
        // shadow_head1.quadTo(x + 70, y + 73, x + 68, y + 68);
        // shadow_head1.quadTo(x + 68, y + 68, x + 73, y + 55);
        // shadow_head1.quadTo(x + 60, y + 55, x + 82, y + 35);
        // shadow_head1.quadTo(x + 92, y, x + 101, y + 25);

        // Path2D head1 = new Path2D.Double();
        // head1.moveTo(x + 82, y + 35);
        // head1.quadTo(x + 92, y, x + 101, y + 25);
        // head1.quadTo(x + 105, y + 15, x + 108, y + 23);
        // head1.quadTo(x + 120, y + 20, x + 132, y + 23);
        // head1.quadTo(x + 149, y + 7, x + 145, y + 33);
        // head1.quadTo(x + 155, y + 30, x + 150, y + 39);
        // head1.quadTo(x + 160, y + 50, x + 160, y + 70);
        // head1.quadTo(x + 162, y + 80, x + 155, y + 80);
        // head1.quadTo(x + 140, y + 100, x + 137, y + 92);
        // head1.quadTo(x + 120, y + 98, x + 104, y + 89);
        // head1.quadTo(x + 100, y + 95, x + 88, y + 85);
        // head1.quadTo(x + 80, y + 81, x + 70, y + 73);
        // head1.quadTo(x + 68, y + 68, x + 73, y + 55);
        // head1.quadTo(x + 60, y + 55, x + 82, y + 35);
        // head1.closePath();

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(head1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_head1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(head1);

        // head1.moveTo(x + 92, y + 25);
        // head1.quadTo(x + 94, y + 28, x + 92, y + 32);
        // head1.quadTo(x + 100, y + 30, x + 92, y + 39);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(head1);

        // // eye
        // g2d.rotate(Math.toRadians(-20), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 111, y + 52, 8, 5));
        // g2d.rotate(Math.toRadians(20), x + 115, y + 55); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        // g2d.fill(new Ellipse2D.Double(x + 138, y + 52, 7, 5));
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ

        // // nose
        // g2d.fill(new Ellipse2D.Double(x + 127, y + 53, 8, 6));

        // Path2D mouth1 = new Path2D.Double();
        // mouth1.moveTo(x + 113, y + 65);
        // mouth1.quadTo(x + 121, y + 71, x + 127, y + 64);
        // mouth1.quadTo(x + 130, y + 60, x + 134, y + 64);
        // mouth1.quadTo(x + 138, y + 68, x + 144, y + 62);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(mouth1);

        // Path2D tongue1 = new Path2D.Double();
        // tongue1.moveTo(x + 121, y + 69);
        // tongue1.quadTo(x + 124, y + 80, x + 132, y + 79);
        // tongue1.quadTo(x + 143, y + 79, x + 141, y + 65);
        // tongue1.quadTo(x + 138, y + 68, x + 134, y + 64);
        // tongue1.quadTo(x + 130, y + 60, x + 127, y + 64);
        // tongue1.closePath();

        // g2d.setColor(new Color(255, 101, 101)); // สีผิว
        // g2d.fill(tongue1);

        // tongue1.moveTo(x + 132, y + 64);
        // tongue1.quadTo(x + 133, y + 66, x + 133, y + 71);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(tongue1);







        // frame 8
        // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // หนา 3 px
        g2d.setStroke(new BasicStroke(3));
        
        Path2D shadow_boo_hat1 = new Path2D.Double();
        shadow_boo_hat1.moveTo(x + 73, y + 21);
        shadow_boo_hat1.quadTo(x + 60, y + 23, x + 50, y + 23);
        shadow_boo_hat1.quadTo(x + 35, y + 22, x + 45, y + 31);
        shadow_boo_hat1.quadTo(x + 35, y + 39, x + 45, y + 40);
        shadow_boo_hat1.quadTo(x + 50, y + 42, x + 70, y + 35);
        shadow_boo_hat1.closePath();

        g2d.setColor(new Color(115, 71, 121)); // สีผิว
        g2d.fill(shadow_boo_hat1);

        g2d.setColor(Color.BLACK); // เส้นขอบ
        g2d.draw(shadow_boo_hat1);

        Path2D shadow_s_hat1 = new Path2D.Double();
        shadow_s_hat1.moveTo(x + 72, y + 28);
        shadow_s_hat1.quadTo(x + 68, y + 27, x + 70, y + 20);
        shadow_s_hat1.quadTo(x + 80, y + 2, x + 86, y + 16);
        shadow_s_hat1.closePath();

        g2d.setColor(new Color(115, 71, 121)); // สีผิว
        g2d.fill(shadow_s_hat1);

        g2d.setColor(Color.BLACK); // เส้นขอบ
        g2d.draw(shadow_s_hat1);

        Path2D shadow_hat1 = new Path2D.Double();
        shadow_hat1.moveTo(x + 135, y + 22);
        shadow_hat1.quadTo(x + 120, y - 13, x + 70, y + 30);
        shadow_hat1.quadTo(x + 60, y + 37, x + 72, y + 45);
        shadow_hat1.closePath();

        g2d.setColor(new Color(115, 71, 121)); // สีผิว
        g2d.fill(shadow_hat1);

        g2d.setColor(Color.BLACK); // เส้นขอบ
        g2d.draw(shadow_hat1);

        Path2D hat1 = new Path2D.Double();
        hat1.moveTo(x + 108, y + 9);
        hat1.quadTo(x + 105, y + 15, x + 120, y + 21);
        hat1.quadTo(x + 132, y + 23, x + 133, y + 22);
        hat1.quadTo(x + 125, y + 4, x + 108, y + 9);

        g2d.setColor(new Color(115, 89, 190));
        g2d.fill(hat1);


        Path2D tail1 = new Path2D.Double();
        tail1.moveTo(x + 61, y + 120);
        tail1.quadTo(x + 50, y + 130, x + 62, y + 133);
        tail1.quadTo(x + 62, y + 133, x + 70, y + 147);
        tail1.quadTo(x + 50, y + 165, x + 50, y + 154);
        tail1.quadTo(x + 20, y + 158, x + 15, y + 133);
        tail1.quadTo(x + 13, y + 124, x + 20, y + 126);
        tail1.quadTo(x + 20, y + 105, x + 40, y + 97);
        tail1.quadTo(x + 50, y + 97, x + 70, y + 120);

        g2d.setColor(new Color(255, 195, 144)); // สีผิว
        g2d.fill(tail1);

        g2d.setColor(Color.BLACK); // เส้นขอบ
        g2d.draw(tail1);

        Path2D hand_R1 = new Path2D.Double();
        hand_R1.moveTo(x + 46, y + 90);
        hand_R1.quadTo(x + 33, y + 105, x + 44, y + 112);
        hand_R1.quadTo(x + 50, y + 116, x + 57, y + 115);
        hand_R1.quadTo(x + 71, y + 90, x + 46, y + 90);
        hand_R1.closePath();

        g2d.setColor(new Color(255, 195, 144)); // สีผิว
        g2d.fill(hand_R1);

        g2d.setColor(Color.BLACK); // เส้นขอบ
        g2d.draw(hand_R1);

        Path2D hand_L1 = new Path2D.Double();
        hand_L1.moveTo(x + 165, y + 101);
        hand_L1.quadTo(x + 171, y + 115, x + 165, y + 121);
        hand_L1.quadTo(x + 160, y + 127, x + 149, y + 124);
        hand_L1.closePath();

        g2d.setColor(new Color(255, 245, 227)); // สีผิว
        g2d.fill(hand_L1);

        g2d.setColor(Color.BLACK); // เส้นขอบ
        g2d.draw(hand_L1);

        Polygon fill_leg1 = new Polygon();
        fill_leg1.addPoint((int)x + 63, (int)y + 127);
        fill_leg1.addPoint((int)x + 101, (int)y + 163);
        fill_leg1.addPoint((int)x + 145, (int)y + 137);
        fill_leg1.addPoint((int)x + 90, (int)y + 120);

        g2d.setColor(new Color(255, 245, 227)); // สีผิว
        g2d.fill(fill_leg1);

        Path2D shadow_leg_L1 = new Path2D.Double();
        shadow_leg_L1.moveTo(x + 95, y + 166);
        shadow_leg_L1.quadTo(x + 97, y + 180, x + 110, y + 183);
        shadow_leg_L1.quadTo(x + 125, y + 184, x + 119, y + 180);
        shadow_leg_L1.quadTo(x + 108, y + 171, x + 112, y + 150);

        Path2D leg_L1 = new Path2D.Double();
        leg_L1.moveTo(x + 145, y + 137);
        leg_L1.quadTo(x + 150, y + 153, x + 142, y + 148);
        leg_L1.quadTo(x + 125, y + 184, x + 110, y + 183);
        leg_L1.quadTo(x + 97, y + 180, x + 95, y + 166);

        g2d.setColor(new Color(255, 245, 227)); // สีผิว
        g2d.fill(leg_L1);

        g2d.setColor(new Color(255, 195, 144)); // สีผิว
        g2d.fill(shadow_leg_L1);

        g2d.setColor(Color.BLACK); // เส้นขอบ
        g2d.draw(leg_L1);

        Path2D shadow_leg_R1 = new Path2D.Double();
        shadow_leg_R1.moveTo(x + 63, y + 127);
        shadow_leg_R1.quadTo(x + 60, y + 146, x + 66, y + 142);
        shadow_leg_R1.quadTo(x + 75, y + 165, x + 90, y + 167);
        shadow_leg_R1.quadTo(x + 114, y + 167, x + 95, y + 165);
        shadow_leg_R1.quadTo(x + 82, y + 154, x + 75, y + 125);

        Path2D leg_R1 = new Path2D.Double();
        leg_R1.moveTo(x + 63, y + 127);
        leg_R1.quadTo(x + 60, y + 146, x + 66, y + 142);
        leg_R1.quadTo(x + 75, y + 165, x + 90, y + 167);
        leg_R1.quadTo(x + 114, y + 167, x + 113, y + 140);

        g2d.setColor(new Color(255, 245, 227)); // สีผิว
        g2d.fill(leg_R1);

        g2d.setColor(new Color(255, 195, 144)); // สีผิว
        g2d.fill(shadow_leg_R1);

        g2d.setColor(Color.BLACK); // เส้นขอบ
        g2d.draw(leg_R1);

        Path2D shadow_shirt1 = new Path2D.Double();
        shadow_shirt1.moveTo(x + 70, y + 74);
        shadow_shirt1.quadTo(x + 65, y + 75, x + 52, y + 84);
        shadow_shirt1.quadTo(x + 41, y + 90, x + 48, y + 92);
        shadow_shirt1.quadTo(x + 56, y + 100, x + 58, y + 111);
        shadow_shirt1.quadTo(x + 57, y + 120, x + 65, y + 114);
        shadow_shirt1.quadTo(x + 52, y + 93, x + 72, y + 80);

        shadow_shirt1.moveTo(x + 63, y + 116);
        shadow_shirt1.quadTo(x + 60, y + 129, x + 65, y + 127);
        shadow_shirt1.quadTo(x + 65, y + 127, x + 75, y + 125);
        shadow_shirt1.quadTo(x + 76, y + 115, x + 72, y + 111);

        Polygon fill_shirt1 = new Polygon();
        fill_shirt1.addPoint((int)x + 70, (int)y + 74);
        fill_shirt1.addPoint((int)x + 63, (int)y + 116);
        fill_shirt1.addPoint((int)x + 149, (int)y + 127);
        fill_shirt1.addPoint((int)x + 150, (int)y + 86);

        g2d.setColor(new Color(255, 255, 255)); // สีผิว
        g2d.fill(fill_shirt1);

        Path2D shirt1 = new Path2D.Double();
        shirt1.moveTo(x + 70, y + 74);
        shirt1.quadTo(x + 65, y + 75, x + 52, y + 84);
        shirt1.quadTo(x + 41, y + 90, x + 48, y + 92);
        shirt1.quadTo(x + 56, y + 100, x + 58, y + 111);
        shirt1.quadTo(x + 57, y + 120, x + 72, y + 111);

        shirt1.moveTo(x + 150, y + 86);
        shirt1.quadTo(x + 160, y + 94, x + 163, y + 98);
        shirt1.quadTo(x + 170, y + 101, x + 149, y + 123);

        shirt1.moveTo(x + 147, y + 110);
        shirt1.quadTo(x + 149, y + 137, x + 145, y + 137);
        shirt1.quadTo(x + 100, y + 125, x + 65, y + 127);
        shirt1.quadTo(x + 60, y + 129, x + 63, y + 116);

        g2d.setColor(new Color(255, 255, 255)); // สีผิว
        g2d.fill(shirt1);

        g2d.setColor(new Color(255, 203, 159));
        g2d.fill(shadow_shirt1);

        g2d.setColor(Color.BLACK); // เส้นขอบ
        g2d.draw(shirt1);

        Path2D shadow_shirt_pok1 = new Path2D.Double();
        shadow_shirt_pok1.moveTo(x + 70, y + 73);
        shadow_shirt_pok1.quadTo(x + 53, y + 62, x + 57, y + 80);
        shadow_shirt_pok1.closePath();

        shadow_shirt_pok1.moveTo(x + 71, y + 74);
        shadow_shirt_pok1.quadTo(x + 74, y + 103, x + 102, y + 96);
        shadow_shirt_pok1.quadTo(x + 120, y + 105, x + 100, y + 70);
        shadow_shirt_pok1.closePath();

        g2d.setColor(new Color(115, 71, 121)); // สีผิว
        g2d.fill(shadow_shirt_pok1);

        g2d.setColor(Color.BLACK); // เส้นขอบ
        g2d.draw(shadow_shirt_pok1);

        Path2D shirt_pok1 = new Path2D.Double();
        shirt_pok1.moveTo(x + 127, y + 97);
        shirt_pok1.quadTo(x + 147, y + 111, x + 149, y + 88);
        shirt_pok1.quadTo(x + 140, y + 80, x + 127, y + 97);
        shirt_pok1.closePath();

        g2d.setColor(new Color(115, 89, 190)); // สีผิว
        g2d.fill(shirt_pok1);

        g2d.setColor(Color.BLACK); // เส้นขอบ
        g2d.draw(shirt_pok1);

        Path2D shirt_boo1 = new Path2D.Double();
        shirt_boo1.moveTo(x + 127, y + 96);
        shirt_boo1.quadTo(x + 128, y + 110, x + 124, y + 113);
        shirt_boo1.quadTo(x + 110, y + 124, x + 112, y + 108);
        shirt_boo1.quadTo(x + 115, y + 98, x + 127, y + 96);
        shirt_boo1.closePath();
        
        shirt_boo1.moveTo(x + 116, y + 96);
        shirt_boo1.quadTo(x + 103, y + 91, x + 95, y + 104);
        shirt_boo1.quadTo(x + 85, y + 118, x + 100, y + 115);
        shirt_boo1.quadTo(x + 110, y + 112, x + 116, y + 100);
        shirt_boo1.closePath();

        g2d.setColor(new Color(115, 89, 190)); // สีผิว
        g2d.fill(shirt_boo1);

        g2d.setColor(Color.BLACK); // เส้นขอบ
        g2d.draw(shirt_boo1);

        Path2D shirt_boo_boo1 = new Path2D.Double();
        shirt_boo_boo1.moveTo(x + 116, y + 96);
        shirt_boo_boo1.quadTo(x + 115, y + 105, x + 127, y + 96);

        g2d.setColor(new Color(115, 89, 190)); // สีผิว
        g2d.fill(shirt_boo_boo1);

        g2d.setColor(Color.BLACK); // เส้นขอบ
        g2d.draw(shirt_boo_boo1);

        Path2D shadow_head1 = new Path2D.Double();
        shadow_head1.moveTo(x + 96, y + 16);
        shadow_head1.quadTo(x + 97, y + 23, x + 92, y + 25);
        shadow_head1.quadTo(x + 94, y + 28, x + 92, y + 32);
        shadow_head1.quadTo(x + 100, y + 30, x + 92, y + 39);
        shadow_head1.quadTo(x + 80, y + 57, x + 89, y + 57);
        shadow_head1.quadTo(x + 85, y + 70, x + 88, y + 85);
        shadow_head1.quadTo(x + 70, y + 73, x + 68, y + 68);
        shadow_head1.quadTo(x + 68, y + 68, x + 73, y + 55);
        shadow_head1.quadTo(x + 60, y + 55, x + 82, y + 35);
        shadow_head1.quadTo(x + 92, y, x + 101, y + 25);

        Path2D head1 = new Path2D.Double();
        head1.moveTo(x + 82, y + 35);
        head1.quadTo(x + 92, y, x + 101, y + 25);
        head1.quadTo(x + 105, y + 15, x + 108, y + 23);
        head1.quadTo(x + 120, y + 20, x + 132, y + 23);
        head1.quadTo(x + 149, y + 7, x + 145, y + 33);
        head1.quadTo(x + 155, y + 30, x + 150, y + 39);
        head1.quadTo(x + 160, y + 50, x + 160, y + 70);
        head1.quadTo(x + 162, y + 80, x + 155, y + 80);
        head1.quadTo(x + 140, y + 100, x + 137, y + 92);
        head1.quadTo(x + 120, y + 98, x + 104, y + 89);
        head1.quadTo(x + 100, y + 95, x + 88, y + 85);
        head1.quadTo(x + 80, y + 81, x + 70, y + 73);
        head1.quadTo(x + 68, y + 68, x + 73, y + 55);
        head1.quadTo(x + 60, y + 55, x + 82, y + 35);
        head1.closePath();

        g2d.setColor(new Color(255, 245, 227)); // สีผิว
        g2d.fill(head1);

        g2d.setColor(new Color(255, 195, 144)); // สีผิว
        g2d.fill(shadow_head1);

        g2d.setColor(Color.BLACK); // เส้นขอบ
        g2d.draw(head1);

        head1.moveTo(x + 92, y + 25);
        head1.quadTo(x + 94, y + 28, x + 92, y + 32);
        head1.quadTo(x + 100, y + 30, x + 92, y + 39);

        g2d.setColor(Color.BLACK); // เส้นขอบ
        g2d.draw(head1);

        // eye
        g2d.rotate(Math.toRadians(-20), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        g2d.fill(new Ellipse2D.Double(x + 111, y + 52, 8, 5));
        g2d.rotate(Math.toRadians(20), x + 115, y + 55); // หมุนกลับ

        g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        g2d.fill(new Ellipse2D.Double(x + 138, y + 52, 7, 5));
        g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ

        // nose
        g2d.fill(new Ellipse2D.Double(x + 127, y + 53, 8, 6));

        Path2D mouth1 = new Path2D.Double();
        mouth1.moveTo(x + 113, y + 65);
        mouth1.quadTo(x + 121, y + 71, x + 127, y + 64);
        mouth1.quadTo(x + 130, y + 60, x + 134, y + 64);
        mouth1.quadTo(x + 138, y + 68, x + 144, y + 62);

        g2d.setColor(Color.BLACK); // เส้นขอบ
        g2d.draw(mouth1);

        Path2D tongue1 = new Path2D.Double();
        tongue1.moveTo(x + 121, y + 69);
        tongue1.quadTo(x + 124, y + 80, x + 132, y + 79);
        tongue1.quadTo(x + 143, y + 79, x + 141, y + 65);
        tongue1.quadTo(x + 138, y + 68, x + 134, y + 64);
        tongue1.quadTo(x + 130, y + 60, x + 127, y + 64);
        tongue1.closePath();

        g2d.setColor(new Color(255, 101, 101)); // สีผิว
        g2d.fill(tongue1);

        tongue1.moveTo(x + 132, y + 64);
        tongue1.quadTo(x + 133, y + 66, x + 133, y + 71);

        g2d.setColor(Color.BLACK); // เส้นขอบ
        g2d.draw(tongue1);



    }
}
