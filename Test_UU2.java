import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.*;
import java.awt.geom.*;


public class Test_UU2 {
    public static void draw(Graphics2D g2d, double x, double y){
        
        // frame 1
        // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // หนา 3 px
        g2d.setStroke(new BasicStroke(2));

        // shadow_boo_hat
        List<int[]> shadow_boo_hat1 = List.of(
            new int[]{(int)x + 73, (int)x + 60, (int)x + 50, (int)y + 21, (int)y + 23, (int)y + 23},
            new int[]{(int)x + 50, (int)x + 35, (int)x + 45, (int)y + 23, (int)y + 22, (int)y + 31},
            new int[]{(int)x + 45, (int)x + 35, (int)x + 45, (int)y + 31, (int)y + 39, (int)y + 40},
            new int[]{(int)x + 45, (int)x + 50, (int)x + 70, (int)y + 40, (int)y + 42, (int)y + 35}
        );
        fillBezierShape(g2d, shadow_boo_hat1, 0.001, new Color(115,71,121), Color.BLACK);

        // shadow_s_hat
        List<int[]> shadow_s_hat1 = List.of(
            new int[]{(int)x + 72, (int)x + 68, (int)x + 70, (int)y + 28, (int)y + 27, (int)y + 20},
            new int[]{(int)x + 70, (int)x + 80, (int)x + 86, (int)y + 20, (int)y + 2, (int)y + 16}
        );
        fillBezierShape(g2d, shadow_s_hat1, 0.001, new Color(115,71,121), Color.BLACK);

        // shadow_hat
        List<int[]> shadow_hat1 = List.of(
            new int[]{(int)x + 135, (int)x + 120, (int)x + 70, (int)y + 22, (int)y - 13, (int)y + 30},
            new int[]{(int)x + 70, (int)x + 60, (int)x + 72, (int)y + 30, (int)y + 37, (int)y + 45}
        );
        
        // light_hat
        List<int[]> light_hat1 = List.of(
            new int[]{(int)x + 108, (int)x + 105, (int)x + 120, (int)y + 9, (int)y + 15, (int)y + 21},
            new int[]{(int)x + 120, (int)x + 132, (int)x + 133, (int)y + 21, (int)y + 23, (int)y + 22},
            new int[]{(int)x + 133, (int)x + 125, (int)x + 108, (int)y + 22, (int)y + 4, (int)y + 9}
        );
        fillBezierShape(g2d, shadow_hat1, 0.001, new Color(115,71,121),  null);
        fillBezierShape(g2d, light_hat1, 0.001, new Color(115, 89, 190), null);
        fillBezierShape(g2d, shadow_hat1, 0.001, null, Color.BLACK);

        
        // tail
        List<int[]> tail1 = List.of(
            new int[]{(int)x + 61, (int)x + 50, (int)x + 62, (int)y + 120, (int)y + 130, (int)y + 133},
            new int[]{(int)x + 62, (int)x + 62, (int)x + 70, (int)y + 133, (int)y + 133, (int)y + 147},
            new int[]{(int)x + 70, (int)x + 50, (int)x + 50, (int)y + 147, (int)y + 165, (int)y + 154},
            new int[]{(int)x + 50, (int)x + 20, (int)x + 15, (int)y + 154, (int)y + 158, (int)y + 133},
            new int[]{(int)x + 15, (int)x + 13, (int)x + 20, (int)y + 133, (int)y + 124, (int)y + 126},
            new int[]{(int)x + 20, (int)x + 20, (int)x + 40, (int)y + 126, (int)y + 105, (int)y + 97},
            new int[]{(int)x + 40, (int)x + 50, (int)x + 70, (int)y + 97, (int)y + 97, (int)y + 120}
        );
        fillBezierShape(g2d, tail1, 0.001, new Color(255, 195, 144), Color.BLACK);
        
        // hand_L1
        List<int[]> hand_L1 = List.of(
            new int[]{(int)x + 165, (int)x + 171, (int)x + 165, (int)y + 101, (int)y + 115, (int)y + 121},
            new int[]{(int)x + 165, (int)x + 160, (int)x + 149, (int)y + 121, (int)y + 127, (int)y + 124}
        );
        fillBezierShape(g2d, hand_L1, 0.001, new Color(255, 245, 227), Color.BLACK);
        

        // hand_R1
        List<int[]> hand_R1 = List.of(
            new int[]{(int)x + 46, (int)x + 33, (int)x + 44, (int)y + 90, (int)y + 105, (int)y + 112},
            new int[]{(int)x + 44, (int)x + 50, (int)x + 57, (int)y + 112, (int)y + 116, (int)y + 115},
            new int[]{(int)x + 57, (int)x + 71, (int)x + 46, (int)y + 115, (int)y + 90, (int)y + 90}
        );
        fillBezierShape(g2d, hand_R1, 0.001, new Color(255, 195, 144), Color.BLACK);
        
        Polygon fill_leg1 = new Polygon();
        fill_leg1.addPoint((int)x + 63, (int)y + 127);
        fill_leg1.addPoint((int)x + 85, (int)y + 162);
        fill_leg1.addPoint((int)x + 145, (int)y + 137);
        fill_leg1.addPoint((int)x + 90, (int)y + 120);

        g2d.setColor(new Color(255, 245, 227)); // สีผิว
        g2d.fill(fill_leg1);

        // leg_L1
        List<int[]> leg_L1 = List.of(
            new int[]{(int)x + 145, (int)x + 143, (int)x + 137, (int)y + 137, (int)y + 158, (int)y + 152},
            new int[]{(int)x + 137, (int)x + 125, (int)x + 110, (int)y + 152, (int)y + 170, (int)y + 179},
            new int[]{(int)x + 110, (int)x + 82, (int)x + 85, (int)y + 179, (int)y + 190, (int)y + 162}
        );

        // shadow_leg_L1
        List<int[]> shadow_leg_L1 = List.of(
            new int[]{(int)x + 85, (int)x + 82, (int)x + 110, (int)y + 162, (int)y + 190, (int)y + 178},
            new int[]{(int)x + 110, (int)x + 105, (int)x + 111, (int)y + 178, (int)y + 176, (int)y + 140}
        );
        fillBezierShape(g2d, leg_L1, 0.001, new Color(255, 245, 227), null);
        fillBezierShape(g2d, shadow_leg_L1, 0.001, new Color(255, 195, 144), null);
        fillBezierShape(g2d, leg_L1, 0.001, null, Color.BLACK);
        
        // leg_R1
        List<int[]> leg_R1 = List.of(
            new int[]{(int)x + 63, (int)x + 62, (int)x + 68, (int)y + 127, (int)y + 146, (int)y + 142},
            new int[]{(int)x + 68, (int)x + 80, (int)x + 105, (int)y + 142, (int)y + 169, (int)y + 162},
            new int[]{(int)x + 105, (int)x + 119, (int)x + 111, (int)y + 162, (int)y + 155, (int)y + 140}
        );

        // shadow_leg_R1
        List<int[]> shadow_leg_R1 = List.of(
            new int[]{(int)x + 63, (int)x + 62, (int)x + 68, (int)y + 127, (int)y + 146, (int)y + 142},
            new int[]{(int)x + 68, (int)x + 80, (int)x + 105, (int)y + 142, (int)y + 169, (int)y + 162},
            new int[]{(int)x + 105, (int)x + 93, (int)x + 75, (int)y + 162, (int)y + 160, (int)y + 128}
        );
        fillBezierShape(g2d, leg_R1, 0.001, new Color(255, 245, 227), null);
        fillBezierShape(g2d, shadow_leg_R1, 0.001, new Color(255, 195, 144), null);
        fillBezierShape(g2d, leg_R1, 0.001, null, Color.BLACK);

        // fill_shirt1
        Polygon fill_shirt1 = new Polygon();
        fill_shirt1.addPoint((int)x + 70, (int)y + 74);
        fill_shirt1.addPoint((int)x + 63, (int)y + 116);
        fill_shirt1.addPoint((int)x + 149, (int)y + 127);
        fill_shirt1.addPoint((int)x + 150, (int)y + 86);

        g2d.setColor(new Color(255, 255, 255)); // สีผิว
        g2d.fill(fill_shirt1);

        // shirt1
        List<int[]> shirt1 = List.of(
            new int[]{(int)x + 70, (int)x + 65, (int)x + 52, (int)y + 74, (int)y + 75, (int)y + 84},
            new int[]{(int)x + 52, (int)x + 41, (int)x + 48, (int)y + 84, (int)y + 90, (int)y + 92},
            new int[]{(int)x + 48, (int)x + 56, (int)x + 58, (int)y + 92, (int)y + 100, (int)y + 111},
            new int[]{(int)x + 58, (int)x + 57, (int)x + 72, (int)y + 111, (int)y + 120, (int)y + 111},

            new int[]{(int)x + 150, (int)x + 160, (int)x + 163, (int)y + 86, (int)y + 94, (int)y + 98},
            new int[]{(int)x + 163, (int)x + 170, (int)x + 149, (int)y + 98, (int)y + 101, (int)y + 123},

            new int[]{(int)x + 147, (int)x + 149, (int)x + 145, (int)y + 110, (int)y + 137, (int)y + 137},
            new int[]{(int)x + 145, (int)x + 100, (int)x + 65, (int)y + 137, (int)y + 125, (int)y + 127},
            new int[]{(int)x + 65, (int)x + 60, (int)x + 63, (int)y + 127, (int)y + 129, (int)y + 116}
        );

        // shadow_shirt1
        List<int[]> shadow_shirt_t1 = List.of(
            new int[]{(int)x + 70, (int)x + 65, (int)x + 52, (int)y + 74, (int)y + 75, (int)y + 84},
            new int[]{(int)x + 52, (int)x + 41, (int)x + 48, (int)y + 84, (int)y + 90, (int)y + 92},
            new int[]{(int)x + 48, (int)x + 56, (int)x + 58, (int)y + 92, (int)y + 100, (int)y + 111},
            new int[]{(int)x + 58, (int)x + 57, (int)x + 65, (int)y + 111, (int)y + 120, (int)y + 114},
            new int[]{(int)x + 65, (int)x + 52, (int)x + 72, (int)y + 114, (int)y + 93, (int)y + 80}
        );
        List<int[]> shadow_shirt_b1 = List.of(
            new int[]{(int)x + 63, (int)x + 60, (int)x + 65, (int)y + 116, (int)y + 129, (int)y + 127},
            new int[]{(int)x + 65, (int)x + 65, (int)x + 75, (int)y + 127, (int)y + 127, (int)y + 125},
            new int[]{(int)x + 75, (int)x + 76, (int)x + 72, (int)y + 125, (int)y + 115, (int)y + 111}
        );
        fillBezierShape(g2d, shirt1, 0.001, new Color(255, 255, 255), null);
        fillBezierShape(g2d, shadow_shirt_t1, 0.001, new Color(255, 203, 159), null);
        fillBezierShape(g2d, shadow_shirt_b1, 0.001, new Color(255, 203, 159), null);
        fillBezierShape(g2d, shirt1, 0.001, null, Color.BLACK);

        // shadow_shirt_pok1
        List<int[]> shadow_shirt_pok1 = List.of(
            new int[]{(int)x + 70, (int)x + 53, (int)x + 57, (int)y + 73, (int)y + 62, (int)y + 80},

            new int[]{(int)x + 71, (int)x + 74, (int)x + 102, (int)y + 74, (int)y + 103, (int)y + 96},
            new int[]{(int)x + 102, (int)x + 120, (int)x + 100, (int)y + 96, (int)y + 105, (int)y + 70}
        );
        fillBezierShape(g2d, shadow_shirt_pok1, 0.001, new Color(115, 71, 121), Color.BLACK);

        // shirt_pok1
        List<int[]> shirt_pok1 = List.of(
            new int[]{(int)x + 127, (int)x + 147, (int)x + 149, (int)y + 97, (int)y + 111, (int)y + 88},
            new int[]{(int)x + 149, (int)x + 140, (int)x + 127, (int)y + 88, (int)y + 80, (int)y + 97}
        );
        fillBezierShape(g2d, shirt_pok1, 0.001, new Color(115, 89, 190), Color.BLACK);

        // shirt_boo1
        List<int[]> shirt_boo1 = List.of(
            new int[]{(int)x + 127, (int)x + 128, (int)x + 124, (int)y + 96, (int)y + 110, (int)y + 113},
            new int[]{(int)x + 124, (int)x + 110, (int)x + 112, (int)y + 113, (int)y + 124, (int)y + 108},
            new int[]{(int)x + 112, (int)x + 115, (int)x + 127, (int)y + 108, (int)y + 98, (int)y + 96},

            new int[]{(int)x + 116, (int)x + 103, (int)x + 95, (int)y + 96, (int)y + 91, (int)y + 104},
            new int[]{(int)x + 95, (int)x + 85, (int)x + 100, (int)y + 104, (int)y + 118, (int)y + 115},
            new int[]{(int)x + 100, (int)x + 110, (int)x + 116, (int)y + 115, (int)y + 112, (int)y + 100}
        );
        fillBezierShape(g2d, shirt_boo1, 0.001, new Color(115, 89, 190), Color.BLACK);

        // shirt_boo_boo1
        List<int[]> shirt_boo_boo1 = List.of(
            new int[]{(int)x + 116, (int)x + 115, (int)x + 127, (int)y + 96, (int)y + 105, (int)y + 96}
        );
        fillBezierShape(g2d, shirt_boo_boo1, 0.001, new Color(115, 89, 190), Color.BLACK);

        // head1
        List<int[]> head1 = List.of(
            new int[]{(int)x + 82, (int)x + 92, (int)x + 101, (int)y + 35, (int)y, (int)y + 25},
            new int[]{(int)x + 101, (int)x + 105, (int)x + 108, (int)y + 25, (int)y + 15, (int)y + 23},
            new int[]{(int)x + 108, (int)x + 120, (int)x + 132, (int)y + 23, (int)y + 20, (int)y + 23},
            new int[]{(int)x + 132, (int)x + 149, (int)x + 145, (int)y + 23, (int)y + 7, (int)y + 33},
            new int[]{(int)x + 145, (int)x + 155, (int)x + 150, (int)y + 33, (int)y + 30, (int)y + 39},
            new int[]{(int)x + 150, (int)x + 160, (int)x + 160, (int)y + 39, (int)y + 50, (int)y + 70},
            new int[]{(int)x + 160, (int)x + 162, (int)x + 155, (int)y + 70, (int)y + 80, (int)y + 80},
            new int[]{(int)x + 155, (int)x + 140, (int)x + 137, (int)y + 80, (int)y + 100, (int)y + 92},
            new int[]{(int)x + 137, (int)x + 120, (int)x + 104, (int)y + 92, (int)y + 98, (int)y + 89},
            new int[]{(int)x + 104, (int)x + 100, (int)x + 88, (int)y + 89, (int)y + 95, (int)y + 85},
            new int[]{(int)x + 88, (int)x + 80, (int)x + 70, (int)y + 85, (int)y + 81, (int)y + 73},
            new int[]{(int)x + 70, (int)x + 68, (int)x + 73, (int)y + 73, (int)y + 68, (int)y + 55},
            new int[]{(int)x + 73, (int)x + 60, (int)x + 82, (int)y + 55, (int)y + 55, (int)y + 35}
        );

        // shadow_head1
        List<int[]> shadow_head1 = List.of(
            new int[]{(int)x + 96, (int)x + 97, (int)x + 92, (int)y + 16, (int)y + 23, (int)y + 25},
            new int[]{(int)x + 92, (int)x + 94, (int)x + 92, (int)y + 25, (int)y + 28, (int)y + 32},
            new int[]{(int)x + 92, (int)x + 100, (int)x + 92, (int)y + 32, (int)y + 30, (int)y + 39},
            new int[]{(int)x + 92, (int)x + 80, (int)x + 89, (int)y + 39, (int)y + 57, (int)y + 57},
            new int[]{(int)x + 89, (int)x + 85, (int)x + 88, (int)y + 57, (int)y + 70, (int)y + 85},
            new int[]{(int)x + 88, (int)x + 70, (int)x + 68, (int)y + 85, (int)y + 73, (int)y + 68},
            new int[]{(int)x + 68, (int)x + 68, (int)x + 73, (int)y + 68, (int)y + 68, (int)y + 55},
            new int[]{(int)x + 73, (int)x +60 , (int)x + 82, (int)y + 55, (int)y + 55, (int)y + 35},
            new int[]{(int)x + 82, (int)x + 92, (int)x + 101, (int)y + 35, (int)y, (int)y + 25}
        );
        fillBezierShape(g2d, head1, 0.001, new Color(255, 245, 227), null);
        fillBezierShape(g2d, shadow_head1, 0.001, new Color(255, 195, 144), null);
        fillBezierShape(g2d, head1, 0.001, null, Color.BLACK);

        // eye
        g2d.rotate(Math.toRadians(-20), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        fillEllipse(g2d, (int)x + 114, (int)y + 54, 4, 2, Color.BLACK, Color.BLACK);
        g2d.rotate(Math.toRadians(20), x + 115, y + 55); // หมุนกลับ

        g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        fillEllipse(g2d, (int)x + 141, (int)y + 54, 3, 2, Color.BLACK, Color.BLACK);
        g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ
        
        // nose
        fillEllipse(g2d, (int)x + 130, (int)y + 55, 3, 2, Color.BLACK, Color.BLACK);

        // tongue
        List<int[]> tongue1 = List.of(
            new int[]{(int)x + 121, (int)x + 124, (int)x + 132, (int)y + 69, (int)y + 80, (int)y + 79},
            new int[]{(int)x + 132, (int)x + 143, (int)x + 141, (int)y + 79, (int)y + 79, (int)y + 65},
            new int[]{(int)x + 141, (int)x + 138, (int)x + 134, (int)y + 65, (int)y + 68, (int)y + 64},
            new int[]{(int)x + 134, (int)x + 130, (int)x + 127, (int)y + 64, (int)y + 60, (int)y + 64}
        );
        fillBezierShape(g2d, tongue1, 0.001, new Color(255, 101, 101), Color.BLACK);

        List<int[]> tongue_p1 = List.of(
            new int[]{(int)x + 131, (int)x + 132, (int)x + 133, (int)y + 64, (int)y + 66, (int)y + 71}
        );
        fillBezierShape(g2d, tongue_p1, 0.001, null, Color.BLACK);

        // mouth
        List<int[]> mouth = List.of(
            new int[]{(int)x + 113, (int)x + 121, (int)x + 127, (int)y + 65, (int)y + 71, (int)y + 64},
            new int[]{(int)x + 127, (int)x + 130, (int)x + 134, (int)y + 64, (int)y + 60, (int)y + 64},
            new int[]{(int)x + 134, (int)x + 138, (int)x + 144, (int)y + 64, (int)y + 68, (int)y + 62}
        );
        fillBezierShape(g2d, mouth, 0.001, null, Color.BLACK);







        // List<int[]> tail1 = List.of(
        //     new int[]{(int)x + , (int)x + , (int)x + , (int)y + , (int)y + , (int)y + },
        //     new int[]{(int)x + , (int)x + , (int)x + , (int)y + , (int)y + , (int)y + },
        //     new int[]{(int)x + , (int)x + , (int)x + , (int)y + , (int)y + , (int)y + }
        // );
        // fillBezierShape(g2d, tail1, 0.001, new Color(115, 89, 190), null);


        
        








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







        // // frame 8
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
        // shadow_leg_L1.moveTo(x + 95, y + 166);
        // shadow_leg_L1.quadTo(x + 97, y + 180, x + 110, y + 183);
        // shadow_leg_L1.quadTo(x + 125, y + 184, x + 119, y + 180);
        // shadow_leg_L1.quadTo(x + 108, y + 171, x + 112, y + 150);

        // Path2D leg_L1 = new Path2D.Double();
        // leg_L1.moveTo(x + 145, y + 137);
        // leg_L1.quadTo(x + 150, y + 153, x + 142, y + 148);
        // leg_L1.quadTo(x + 125, y + 184, x + 110, y + 183);
        // leg_L1.quadTo(x + 97, y + 180, x + 95, y + 166);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(leg_L1);

        // g2d.setColor(new Color(255, 195, 144)); // สีผิว
        // g2d.fill(shadow_leg_L1);

        // g2d.setColor(Color.BLACK); // เส้นขอบ
        // g2d.draw(leg_L1);

        // Path2D shadow_leg_R1 = new Path2D.Double();
        // shadow_leg_R1.moveTo(x + 63, y + 127);
        // shadow_leg_R1.quadTo(x + 60, y + 146, x + 66, y + 142);
        // shadow_leg_R1.quadTo(x + 75, y + 165, x + 90, y + 167);
        // shadow_leg_R1.quadTo(x + 114, y + 167, x + 95, y + 165);
        // shadow_leg_R1.quadTo(x + 82, y + 154, x + 75, y + 125);

        // Path2D leg_R1 = new Path2D.Double();
        // leg_R1.moveTo(x + 63, y + 127);
        // leg_R1.quadTo(x + 60, y + 146, x + 66, y + 142);
        // leg_R1.quadTo(x + 75, y + 165, x + 90, y + 167);
        // leg_R1.quadTo(x + 114, y + 167, x + 113, y + 140);

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

        



    }

    private static void putPixel(Graphics2D g2d, int x, int y) {
        g2d.drawLine(x, y, x, y); // pixel = line จุดเดียว
    }

    // Bresenham's Line Algorithm
    private static void drawLineBresenham(Graphics2D g2d, int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;
        int err = dx - dy;

        while (true) {
            putPixel(g2d, x1, y1);
            if (x1 == x2 && y1 == y2) break;
            int e2 = 2 * err;
            if (e2 > -dy) { err -= dy; x1 += sx; }
            if (e2 < dx) { err += dx; y1 += sy; }
        }
    }

    // Midpoint Circle Algorithm
    private static void drawCircleMidpoint(Graphics2D g2d, int xc, int yc, int r) {
        int x = 0, y = r;
        int d = 1 - r;

        while (x <= y) {
            putPixel(g2d, xc + x, yc + y);
            putPixel(g2d, xc - x, yc + y);
            putPixel(g2d, xc + x, yc - y);
            putPixel(g2d, xc - x, yc - y);
            putPixel(g2d, xc + y, yc + x);
            putPixel(g2d, xc - y, yc + x);
            putPixel(g2d, xc + y, yc - x);
            putPixel(g2d, xc - y, yc - x);

            x++;
            if (d < 0) {
                d += 2 * x + 1;
            } else {
                y--;
                d += 2 * (x - y) + 1;
            }
        }
    }

    // Quadratic Bezier Curve
    private static void drawBezierQuadraticConnected(Graphics2D g2d, int[] x, int[] y, double dt) {
        double t = 0.0;
        double px = x[0], py = y[0];  // B(0) = P0
        while (t <= 1.0) {
            double xt = (1 - t)*(1 - t)*x[0] + 2*(1 - t)*t*x[1] + t*t*x[2];
            double yt = (1 - t)*(1 - t)*y[0] + 2*(1 - t)*t*y[1] + t*t*y[2];

            drawLineBresenham(g2d, (int)Math.round(px), (int)Math.round(py),
                                    (int)Math.round(xt), (int)Math.round(yt));

            px = xt; py = yt;
            t += dt;
        }
    }

    // วาดเส้นโค้ง Bezier Quadratic แบบสมูท (บาง 1 px)
    private static void drawBezierQuadraticSmooth(Graphics2D g2d, int[] x, int[] y, double dt) {
        for (double t = 0.0; t <= 1.0; t += dt) {
            double xt = (1 - t) * (1 - t) * x[0] 
                    + 2 * (1 - t) * t * x[1] 
                    + t * t * x[2];
            double yt = (1 - t) * (1 - t) * y[0] 
                    + 2 * (1 - t) * t * y[1] 
                    + t * t * y[2];

            putPixel(g2d, (int)Math.round(xt), (int)Math.round(yt));
        }
    }



    private static void drawBezierSet(Graphics2D g2d, int[][] points, double dt) {
        for (int i = 0; i < points.length; i++) {
            int[] x = { points[i][0], points[i][2], points[i][4] };
            int[] y = { points[i][1], points[i][3], points[i][5] };
            drawBezierQuadraticConnected(g2d, x, y, dt);
        }
    }


    // Midpoint Ellipse Algorithm
    private static void drawEllipseMidpoint(Graphics2D g2d, int xc, int yc, int rx, int ry) {
        int x = 0, y = ry;

        // Decision parameter for region 1
        double dx = 2 * ry * ry * x;
        double dy = 2 * rx * rx * y;

        double d1 = (ry * ry) - (rx * rx * ry) + (0.25 * rx * rx);

        // Region 1
        while (dx < dy) {
            // วาด 4 จุดสมมาตร
            putPixel(g2d, xc + x, yc + y);
            putPixel(g2d, xc - x, yc + y);
            putPixel(g2d, xc + x, yc - y);
            putPixel(g2d, xc - x, yc - y);

            if (d1 < 0) {
                x++;
                dx += 2 * ry * ry;
                d1 += dx + (ry * ry);
            } else {
                x++;
                y--;
                dx += 2 * ry * ry;
                dy -= 2 * rx * rx;
                d1 += dx - dy + (ry * ry);
            }
        }

        // Decision parameter for region 2
        double d2 = ((ry * ry) * (x + 0.5) * (x + 0.5)) +
                    ((rx * rx) * (y - 1) * (y - 1)) -
                    (rx * rx * ry * ry);

        // Region 2
        while (y >= 0) {
            putPixel(g2d, xc + x, yc + y);
            putPixel(g2d, xc - x, yc + y);
            putPixel(g2d, xc + x, yc - y);
            putPixel(g2d, xc - x, yc - y);

            if (d2 > 0) {
                y--;
                dy -= 2 * rx * rx;
                d2 += (rx * rx) - dy;
            } else {
                y--;
                x++;
                dx += 2 * ry * ry;
                dy -= 2 * rx * rx;
                d2 += dx - dy + (rx * rx);
            }
        }
    }

    private static void fillEllipse(Graphics2D g2d, int xc, int yc, int rx, int ry,
                               Color fillColor, Color borderColor) {
        java.util.List<Integer> xs = new ArrayList<>();
        java.util.List<Integer> ys = new ArrayList<>();

        // Midpoint Ellipse Algorithm
        int x = 0, y = ry;
        double dx = 2 * ry * ry * x;
        double dy = 2 * rx * rx * y;
        double d1 = (ry * ry) - (rx * rx * ry) + (0.25 * rx * rx);

        // Region 1
        while (dx < dy) {
            addEllipsePoints(xs, ys, xc, yc, x, y);
            if (d1 < 0) {
                x++;
                dx += 2 * ry * ry;
                d1 += dx + (ry * ry);
            } else {
                x++;
                y--;
                dx += 2 * ry * ry;
                dy -= 2 * rx * rx;
                d1 += dx - dy + (ry * ry);
            }
        }

        // Region 2
        double d2 = ((ry * ry) * (x + 0.5) * (x + 0.5)) +
                    ((rx * rx) * (y - 1) * (y - 1)) -
                    (rx * rx * ry * ry);
        while (y >= 0) {
            addEllipsePoints(xs, ys, xc, yc, x, y);
            if (d2 > 0) {
                y--;
                dy -= 2 * rx * rx;
                d2 += (rx * rx) - dy;
            } else {
                y--;
                x++;
                dx += 2 * ry * ry;
                dy -= 2 * rx * rx;
                d2 += dx - dy + (rx * rx);
            }
        }

        // แปลงเป็น array polygon
        int[] xPoints = xs.stream().mapToInt(Integer::intValue).toArray();
        int[] yPoints = ys.stream().mapToInt(Integer::intValue).toArray();

        // ระบายด้านใน
        if (fillColor != null) {
            g2d.setColor(fillColor);
            customFillPolygon(g2d, xPoints, yPoints);
        }

        // วาดเส้นขอบ
        if (borderColor != null) {
            g2d.setColor(borderColor);
            for (int i = 0; i < xPoints.length; i++) {
                putPixel(g2d, xPoints[i], yPoints[i]);
            }
        }
    }

    // เก็บ 4 จุดสมมาตรของวงรี
    private static void addEllipsePoints(List<Integer> xs, List<Integer> ys,
                                        int xc, int yc, int x, int y) {
        xs.add(xc + x); ys.add(yc + y);
        xs.add(xc - x); ys.add(yc + y);
        xs.add(xc + x); ys.add(yc - y);
        xs.add(xc - x); ys.add(yc - y);
    }


    private static void fillEllipseWH(Graphics2D g2d, int xc, int yc, int w, int h, Color fillColor, Color borderColor) {
        int rx = w / 2;
        int ry = h / 2;
        fillEllipse(g2d, xc, yc, rx, ry, fillColor, borderColor);
    }

    private static void fillBezierQuadratic(Graphics2D g2d, int[] x, int[] y, double dt) {
        java.util.List<Integer> xs = new ArrayList<>();
        java.util.List<Integer> ys = new ArrayList<>();

        // จุดเริ่ม
        xs.add(x[0]);
        ys.add(y[0]);

        // เก็บจุดตามโค้ง
        for (double t = 0.0; t <= 1.0; t += dt) {
            double xt = (1 - t) * (1 - t) * x[0]
                    + 2 * (1 - t) * t * x[1]
                    + t * t * x[2];
            double yt = (1 - t) * (1 - t) * y[0]
                    + 2 * (1 - t) * t * y[1]
                    + t * t * y[2];
            xs.add((int)Math.round(xt));
            ys.add((int)Math.round(yt));
        }

        // ปิดพื้นที่กลับมาที่ P0 (เพื่อให้เป็น Polygon ปิด)
        xs.add(x[0]);
        ys.add(y[0]);

        // แปลง List → array
        int[] xPoints = xs.stream().mapToInt(Integer::intValue).toArray();
        int[] yPoints = ys.stream().mapToInt(Integer::intValue).toArray();

        // fill ด้วย polygon
        g2d.fillPolygon(xPoints, yPoints, xPoints.length);
    }

    private static void fillBezierPath(Graphics2D g2d, int[][] xs, int[][] ys, double dt) {
        java.util.List<Integer> allX = new ArrayList<>();
        java.util.List<Integer> allY = new ArrayList<>();

        // จุดเริ่มจาก segment แรก
        allX.add(xs[0][0]);
        allY.add(ys[0][0]);

        // วนทุก segment (แต่ละ segment = Bezier 1 เส้น)
        for (int s = 0; s < xs.length; s++) {
            int[] x = xs[s];
            int[] y = ys[s];

            for (double t = 0.0; t <= 1.0; t += dt) {
                double xt = (1 - t) * (1 - t) * x[0]
                        + 2 * (1 - t) * t * x[1]
                        + t * t * x[2];
                double yt = (1 - t) * (1 - t) * y[0]
                        + 2 * (1 - t) * t * y[1]
                        + t * t * y[2];

                allX.add((int)Math.round(xt));
                allY.add((int)Math.round(yt));
            }
        }

        // ปิด path กลับไปจุดเริ่ม
        allX.add(xs[0][0]);
        allY.add(ys[0][0]);

        // แปลงเป็น array
        int[] xPoints = allX.stream().mapToInt(Integer::intValue).toArray();
        int[] yPoints = allY.stream().mapToInt(Integer::intValue).toArray();

        // fill polygon
        g2d.fillPolygon(xPoints, yPoints, xPoints.length);
    }

    private static void fillBezierPath(Graphics2D g2d, List<int[]> curves, double dt) {
        java.util.List<Integer> allX = new ArrayList<>();
        java.util.List<Integer> allY = new ArrayList<>();

        // จุดเริ่มจาก curve แรก
        allX.add(curves.get(0)[0]);
        allY.add(curves.get(0)[1]);

        // วนทุก Bezier curve
        for (int[] c : curves) {
            int x0 = c[0], y0 = c[1];
            int x1 = c[2], y1 = c[3];
            int x2 = c[4], y2 = c[5];

            for (double t = 0.0; t <= 1.0; t += dt) {
                double xt = (1 - t) * (1 - t) * x0
                        + 2 * (1 - t) * t * x1
                        + t * t * x2;
                double yt = (1 - t) * (1 - t) * y0
                        + 2 * (1 - t) * t * y1
                        + t * t * y2;

                allX.add((int)Math.round(xt));
                allY.add((int)Math.round(yt));
            }
        }

        // ปิด path
        allX.add(curves.get(0)[0]);
        allY.add(curves.get(0)[1]);

        int[] xPoints = allX.stream().mapToInt(Integer::intValue).toArray();
        int[] yPoints = allY.stream().mapToInt(Integer::intValue).toArray();

        g2d.fillPolygon(xPoints, yPoints, xPoints.length);
    }

    private static void fillBezierShape(Graphics2D g2d, List<int[]> curves, double dt, Color fillColor, Color borderColor) {
        java.util.List<Integer> xs = new ArrayList<>();
        java.util.List<Integer> ys = new ArrayList<>();

        // วนเก็บทุก curve
        for (int[] c : curves) {
            for (double t = 0; t <= 1.0; t += dt) {
                double xt = (1 - t) * (1 - t) * c[0]
                        + 2 * (1 - t) * t * c[1]
                        + t * t * c[2];
                double yt = (1 - t) * (1 - t) * c[3]
                        + 2 * (1 - t) * t * c[4]
                        + t * t * c[5];
                xs.add((int)Math.round(xt));
                ys.add((int)Math.round(yt));
            }
        }

        // ปิดรูป
        xs.add(xs.get(0));
        ys.add(ys.get(0));

        int[] xPoints = xs.stream().mapToInt(Integer::intValue).toArray();
        int[] yPoints = ys.stream().mapToInt(Integer::intValue).toArray();

        // fill & draw border
        // fill สีข้างใน
        if (fillColor != null) {
            g2d.setColor(fillColor);
            customFillPolygon(g2d, xPoints, yPoints); // ใช้ฟังก์ชัน scanline ของเราเอง
        }

        // วาดขอบถ้ามี
        if (borderColor != null) {
            g2d.setColor(borderColor);
            for (int[] c : curves) {
                drawBezierQuadraticSmooth(
                    g2d,
                    new int[]{c[0], c[1], c[2]},
                    new int[]{c[3], c[4], c[5]},
                    dt
                );
            }
        }
    }

    private static void customFillPolygon(Graphics2D g2d, int[] xPoints, int[] yPoints) {
        int n = xPoints.length;

        // หาค่า minY และ maxY ของ polygon
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        for (int y : yPoints) {
            if (y < minY) minY = y;
            if (y > maxY) maxY = y;
        }

        // วนทีละแถวแนวนอน
        for (int y = minY; y <= maxY; y++) {
            List<Integer> intersections = new ArrayList<>();

            // หาเส้นตัดกับ scanline
            for (int i = 0; i < n; i++) {
                int j = (i + 1) % n; // จุดถัดไป (วนรอบ)
                int x1 = xPoints[i], y1 = yPoints[i];
                int x2 = xPoints[j], y2 = yPoints[j];

                // ตรวจว่ามีเส้นตัด scanline ที่ y นี้ไหม
                if ((y1 <= y && y2 > y) || (y2 <= y && y1 > y)) {
                    // คำนวณจุดตัดแบบ linear interpolation
                    int x = x1 + (y - y1) * (x2 - x1) / (y2 - y1);
                    intersections.add(x);
                }
            }

            // เรียงตำแหน่งจุดตัดจากซ้ายไปขวา
            Collections.sort(intersections);

            // วาดเส้นระบายระหว่างคู่จุดตัด
            for (int k = 0; k < intersections.size(); k += 2) {
                if (k + 1 < intersections.size()) {
                    int xStart = intersections.get(k);
                    int xEnd   = intersections.get(k + 1);

                    g2d.drawLine(xStart, y, xEnd, y);
                }
            }
        }
    }



    

}
