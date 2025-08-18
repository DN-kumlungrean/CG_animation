import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.*;


public class Test_UU2 {

    // private static Color borderColor = new Color(63, 38, 76);
    private static Color borderColor = new Color(73, 44, 89);

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
        fillBezierShape(g2d, shadow_boo_hat1, 0.001, new Color(115,71,121), borderColor);

        // shadow_s_hat
        List<int[]> shadow_s_hat1 = List.of(
            new int[]{(int)x + 72, (int)x + 68, (int)x + 70, (int)y + 28, (int)y + 27, (int)y + 20},
            new int[]{(int)x + 70, (int)x + 80, (int)x + 86, (int)y + 20, (int)y + 2, (int)y + 16}
        );
        fillBezierShape(g2d, shadow_s_hat1, 0.001, new Color(115,71,121), borderColor);

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
        fillBezierShape(g2d, shadow_hat1, 0.001, null, borderColor);

        
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
        fillBezierShape(g2d, tail1, 0.001, new Color(255, 195, 144), borderColor);
        
        // hand_L1
        List<int[]> hand_L1 = List.of(
            new int[]{(int)x + 165, (int)x + 171, (int)x + 165, (int)y + 101, (int)y + 115, (int)y + 121},
            new int[]{(int)x + 165, (int)x + 160, (int)x + 149, (int)y + 121, (int)y + 127, (int)y + 124}
        );
        fillBezierShape(g2d, hand_L1, 0.001, new Color(255, 245, 227), borderColor);
        

        // hand_R1
        List<int[]> hand_R1 = List.of(
            new int[]{(int)x + 46, (int)x + 33, (int)x + 44, (int)y + 90, (int)y + 105, (int)y + 112},
            new int[]{(int)x + 44, (int)x + 50, (int)x + 57, (int)y + 112, (int)y + 116, (int)y + 115},
            new int[]{(int)x + 57, (int)x + 71, (int)x + 46, (int)y + 115, (int)y + 90, (int)y + 90}
        );
        fillBezierShape(g2d, hand_R1, 0.001, new Color(255, 195, 144), borderColor);
        
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
        fillBezierShape(g2d, leg_L1, 0.001, null, borderColor);
        
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
        fillBezierShape(g2d, leg_R1, 0.001, null, borderColor);

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
        fillBezierShape(g2d, shirt1, 0.001, null, borderColor);

        // shadow_shirt_pok1
        List<int[]> shadow_shirt_pok1 = List.of(
            new int[]{(int)x + 70, (int)x + 53, (int)x + 57, (int)y + 73, (int)y + 62, (int)y + 80},

            new int[]{(int)x + 71, (int)x + 74, (int)x + 102, (int)y + 74, (int)y + 103, (int)y + 96},
            new int[]{(int)x + 102, (int)x + 120, (int)x + 100, (int)y + 96, (int)y + 105, (int)y + 70}
        );
        fillBezierShape(g2d, shadow_shirt_pok1, 0.001, new Color(115, 71, 121), borderColor);

        // shirt_pok1
        List<int[]> shirt_pok1 = List.of(
            new int[]{(int)x + 127, (int)x + 147, (int)x + 149, (int)y + 97, (int)y + 111, (int)y + 88},
            new int[]{(int)x + 149, (int)x + 140, (int)x + 127, (int)y + 88, (int)y + 80, (int)y + 97}
        );
        fillBezierShape(g2d, shirt_pok1, 0.001, new Color(115, 89, 190), borderColor);

        // shirt_boo1
        List<int[]> shirt_boo1 = List.of(
            new int[]{(int)x + 127, (int)x + 128, (int)x + 124, (int)y + 96, (int)y + 110, (int)y + 113},
            new int[]{(int)x + 124, (int)x + 110, (int)x + 112, (int)y + 113, (int)y + 124, (int)y + 108},
            new int[]{(int)x + 112, (int)x + 115, (int)x + 127, (int)y + 108, (int)y + 98, (int)y + 96},

            new int[]{(int)x + 116, (int)x + 103, (int)x + 95, (int)y + 96, (int)y + 91, (int)y + 104},
            new int[]{(int)x + 95, (int)x + 85, (int)x + 100, (int)y + 104, (int)y + 118, (int)y + 115},
            new int[]{(int)x + 100, (int)x + 110, (int)x + 116, (int)y + 115, (int)y + 112, (int)y + 100}
        );
        fillBezierShape(g2d, shirt_boo1, 0.001, new Color(115, 89, 190), borderColor);

        // shirt_boo_boo1
        List<int[]> shirt_boo_boo1 = List.of(
            new int[]{(int)x + 116, (int)x + 115, (int)x + 127, (int)y + 96, (int)y + 105, (int)y + 96}
        );
        fillBezierShape(g2d, shirt_boo_boo1, 0.001, new Color(115, 89, 190), borderColor);

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
        fillBezierShape(g2d, head1, 0.001, null, borderColor);

        List<int[]> head_ear1 = List.of(
            new int[]{(int)x + 92, (int)x + 94, (int)x + 92, (int)y + 25, (int)y + 28, (int)y + 32},
            new int[]{(int)x + 92, (int)x + 100, (int)x + 92, (int)y + 32, (int)y + 30, (int)y + 39}
        );
        fillBezierShape(g2d, head_ear1, 0.001, null, borderColor);

        // eye
        g2d.rotate(Math.toRadians(-30), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        fillEllipse(g2d, (int)x + 116, (int)y + 54, 2, 2, borderColor, borderColor);
        g2d.rotate(Math.toRadians(30), x + 115, y + 55); // หมุนกลับ

        g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        fillEllipse(g2d, (int)x + 141, (int)y + 54, 2, 2, borderColor, borderColor);
        g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ
        
        // nose
        fillEllipse(g2d, (int)x + 130, (int)y + 55, 3, 2, borderColor, borderColor);

        // tongue
        List<int[]> tongue1 = List.of(
            new int[]{(int)x + 121, (int)x + 124, (int)x + 132, (int)y + 69, (int)y + 80, (int)y + 79},
            new int[]{(int)x + 132, (int)x + 143, (int)x + 141, (int)y + 79, (int)y + 79, (int)y + 65},
            new int[]{(int)x + 141, (int)x + 138, (int)x + 134, (int)y + 65, (int)y + 68, (int)y + 64},
            new int[]{(int)x + 134, (int)x + 130, (int)x + 127, (int)y + 64, (int)y + 60, (int)y + 64}
        );
        fillBezierShape(g2d, tongue1, 0.001, new Color(255, 101, 101), borderColor);

        List<int[]> tongue_p1 = List.of(
            new int[]{(int)x + 131, (int)x + 132, (int)x + 133, (int)y + 64, (int)y + 66, (int)y + 71}
        );
        fillBezierShape(g2d, tongue_p1, 0.001, null, borderColor);

        // mouth
        List<int[]> mouth1 = List.of(
            new int[]{(int)x + 113, (int)x + 121, (int)x + 127, (int)y + 65, (int)y + 71, (int)y + 64},
            new int[]{(int)x + 127, (int)x + 130, (int)x + 134, (int)y + 64, (int)y + 60, (int)y + 64},
            new int[]{(int)x + 134, (int)x + 138, (int)x + 144, (int)y + 64, (int)y + 68, (int)y + 62}
        );
        fillBezierShape(g2d, mouth1, 0.001, null, borderColor);







        // // frame 2
        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(2));

        // // shadow_boo_hat
        // List<int[]> shadow_boo_hat2 = List.of(
        //     new int[]{(int)x + 73, (int)x + 60, (int)x + 50, (int)y + 21, (int)y + 23, (int)y + 23},
        //     new int[]{(int)x + 50, (int)x + 35, (int)x + 45, (int)y + 23, (int)y + 22, (int)y + 31},
        //     new int[]{(int)x + 45, (int)x + 35, (int)x + 45, (int)y + 31, (int)y + 39, (int)y + 40},
        //     new int[]{(int)x + 45, (int)x + 50, (int)x + 70, (int)y + 40, (int)y + 42, (int)y + 35}
        // );
        // fillBezierShape(g2d, shadow_boo_hat2, 0.001, new Color(115,71,121), borderColor);

        // // shadow_s_hat
        // List<int[]> shadow_s_hat2 = List.of(
        //     new int[]{(int)x + 72, (int)x + 68, (int)x + 70, (int)y + 28, (int)y + 27, (int)y + 20},
        //     new int[]{(int)x + 70, (int)x + 80, (int)x + 86, (int)y + 20, (int)y + 2, (int)y + 16}
        // );
        // fillBezierShape(g2d, shadow_s_hat2, 0.001, new Color(115,71,121), borderColor);

        // // shadow_hat
        // List<int[]> shadow_hat2 = List.of(
        //     new int[]{(int)x + 135, (int)x + 120, (int)x + 70, (int)y + 22, (int)y - 13, (int)y + 30},
        //     new int[]{(int)x + 70, (int)x + 60, (int)x + 72, (int)y + 30, (int)y + 37, (int)y + 45}
        // );
        
        // // light_hat
        // List<int[]> light_hat2 = List.of(
        //     new int[]{(int)x + 108, (int)x + 105, (int)x + 120, (int)y + 9, (int)y + 15, (int)y + 21},
        //     new int[]{(int)x + 120, (int)x + 132, (int)x + 133, (int)y + 21, (int)y + 23, (int)y + 22},
        //     new int[]{(int)x + 133, (int)x + 125, (int)x + 108, (int)y + 22, (int)y + 4, (int)y + 9}
        // );
        // fillBezierShape(g2d, shadow_hat2, 0.001, new Color(115,71,121),  null);
        // fillBezierShape(g2d, light_hat2, 0.001, new Color(115, 89, 190), null);
        // fillBezierShape(g2d, shadow_hat2, 0.001, null, borderColor);

        // // tail
        // List<int[]> tail2 = List.of(
        //     new int[]{(int)x + 61, (int)x + 50, (int)x + 62, (int)y + 120, (int)y + 130, (int)y + 133},
        //     new int[]{(int)x + 62, (int)x + 62, (int)x + 70, (int)y + 133, (int)y + 133, (int)y + 147},
        //     new int[]{(int)x + 70, (int)x + 50, (int)x + 50, (int)y + 147, (int)y + 165, (int)y + 154},
        //     new int[]{(int)x + 50, (int)x + 20, (int)x + 15, (int)y + 154, (int)y + 158, (int)y + 133},
        //     new int[]{(int)x + 15, (int)x + 13, (int)x + 20, (int)y + 133, (int)y + 124, (int)y + 126},
        //     new int[]{(int)x + 20, (int)x + 20, (int)x + 40, (int)y + 126, (int)y + 105, (int)y + 97},
        //     new int[]{(int)x + 40, (int)x + 50, (int)x + 70, (int)y + 97, (int)y + 97, (int)y + 120}
        // );
        // fillBezierShape(g2d, tail2, 0.001, new Color(255, 195, 144), borderColor);
        
        // // hand_L
        // List<int[]> hand_L2 = List.of(
        //     new int[]{(int)x + 165, (int)x + 171, (int)x + 165, (int)y + 101, (int)y + 115, (int)y + 121},
        //     new int[]{(int)x + 165, (int)x + 160, (int)x + 149, (int)y + 121, (int)y + 127, (int)y + 124}
        // );
        // fillBezierShape(g2d, hand_L2, 0.001, new Color(255, 245, 227), borderColor);
        

        // // hand_R
        // List<int[]> hand_R2 = List.of(
        //     new int[]{(int)x + 46, (int)x + 33, (int)x + 44, (int)y + 90, (int)y + 105, (int)y + 112},
        //     new int[]{(int)x + 44, (int)x + 50, (int)x + 57, (int)y + 112, (int)y + 116, (int)y + 115},
        //     new int[]{(int)x + 57, (int)x + 71, (int)x + 46, (int)y + 115, (int)y + 90, (int)y + 90}
        // );
        // fillBezierShape(g2d, hand_R2, 0.001, new Color(255, 195, 144), borderColor);
        
        // Polygon fill_leg2 = new Polygon();
        // fill_leg2.addPoint((int)x + 63, (int)y + 127);
        // fill_leg2.addPoint((int)x + 98, (int)y + 173);
        // fill_leg2.addPoint((int)x + 145, (int)y + 137);
        // fill_leg2.addPoint((int)x + 90, (int)y + 120);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(fill_leg2);

        // // leg_L
        // List<int[]> leg_L2 = List.of(
        //     new int[]{(int)x + 145, (int)x + 145, (int)x + 139, (int)y + 137, (int)y + 158, (int)y + 157},
        //     new int[]{(int)x + 139, (int)x + 132, (int)x + 122, (int)y + 157, (int)y + 170, (int)y + 179},
        //     new int[]{(int)x + 122, (int)x + 104, (int)x + 98, (int)y + 179, (int)y + 188, (int)y + 173}
        // );

        // // shadow_leg_L
        // List<int[]> shadow_leg_L2 = List.of(
        //     new int[]{(int)x + 98, (int)x + 104, (int)x + 104, (int)y + 173, (int)y + 188, (int)y + 179},
        //     new int[]{(int)x + 122, (int)x + 115, (int)x + 111, (int)y + 179, (int)y + 177, (int)y + 167}
        // );
        // fillBezierShape(g2d, leg_L2, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_leg_L2, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, leg_L2, 0.001, null, borderColor);
        
        // // leg_R
        // List<int[]> leg_R2 = List.of(
        //     new int[]{(int)x + 63, (int)x + 62, (int)x + 70, (int)y + 127, (int)y + 156, (int)y + 152},
        //     new int[]{(int)x + 70, (int)x + 80, (int)x + 103, (int)y + 152, (int)y + 179, (int)y + 172},
        //     new int[]{(int)x + 103, (int)x + 117, (int)x + 111, (int)y + 172, (int)y + 165, (int)y + 142}
        // );

        // // shadow_leg_R
        // List<int[]> shadow_leg_R2 = List.of(
        //     new int[]{(int)x + 63, (int)x + 62, (int)x + 70, (int)y + 127, (int)y + 156, (int)y + 152},
        //     new int[]{(int)x + 70, (int)x + 80, (int)x + 103, (int)y + 152, (int)y + 179, (int)y + 172},
        //     new int[]{(int)x + 103, (int)x + 88, (int)x + 75, (int)y + 172, (int)y + 165, (int)y + 127}
        // );
        // fillBezierShape(g2d, leg_R2, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_leg_R2, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, leg_R2, 0.001, null, borderColor);

        // // fill_shirt
        // Polygon fill_shirt2 = new Polygon();
        // fill_shirt2.addPoint((int)x + 70, (int)y + 74);
        // fill_shirt2.addPoint((int)x + 63, (int)y + 116);
        // fill_shirt2.addPoint((int)x + 149, (int)y + 127);
        // fill_shirt2.addPoint((int)x + 150, (int)y + 86);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(fill_shirt2);

        // // shirt
        // List<int[]> shirt2 = List.of(
        //     new int[]{(int)x + 70, (int)x + 65, (int)x + 52, (int)y + 74, (int)y + 75, (int)y + 84},
        //     new int[]{(int)x + 52, (int)x + 41, (int)x + 48, (int)y + 84, (int)y + 90, (int)y + 92},
        //     new int[]{(int)x + 48, (int)x + 56, (int)x + 58, (int)y + 92, (int)y + 100, (int)y + 111},
        //     new int[]{(int)x + 58, (int)x + 57, (int)x + 72, (int)y + 111, (int)y + 120, (int)y + 111},

        //     new int[]{(int)x + 150, (int)x + 160, (int)x + 163, (int)y + 86, (int)y + 94, (int)y + 98},
        //     new int[]{(int)x + 163, (int)x + 170, (int)x + 149, (int)y + 98, (int)y + 101, (int)y + 123},

        //     new int[]{(int)x + 147, (int)x + 149, (int)x + 145, (int)y + 110, (int)y + 137, (int)y + 137},
        //     new int[]{(int)x + 145, (int)x + 100, (int)x + 65, (int)y + 137, (int)y + 125, (int)y + 127},
        //     new int[]{(int)x + 65, (int)x + 60, (int)x + 63, (int)y + 127, (int)y + 129, (int)y + 116}
        // );

        // // shadow_shirt
        // List<int[]> shadow_shirt_t2 = List.of(
        //     new int[]{(int)x + 70, (int)x + 65, (int)x + 52, (int)y + 74, (int)y + 75, (int)y + 84},
        //     new int[]{(int)x + 52, (int)x + 41, (int)x + 48, (int)y + 84, (int)y + 90, (int)y + 92},
        //     new int[]{(int)x + 48, (int)x + 56, (int)x + 58, (int)y + 92, (int)y + 100, (int)y + 111},
        //     new int[]{(int)x + 58, (int)x + 57, (int)x + 65, (int)y + 111, (int)y + 120, (int)y + 114},
        //     new int[]{(int)x + 65, (int)x + 52, (int)x + 72, (int)y + 114, (int)y + 93, (int)y + 80}
        // );
        // List<int[]> shadow_shirt_b2 = List.of(
        //     new int[]{(int)x + 63, (int)x + 60, (int)x + 65, (int)y + 116, (int)y + 129, (int)y + 127},
        //     new int[]{(int)x + 65, (int)x + 65, (int)x + 75, (int)y + 127, (int)y + 127, (int)y + 125},
        //     new int[]{(int)x + 75, (int)x + 76, (int)x + 72, (int)y + 125, (int)y + 115, (int)y + 111}
        // );
        // fillBezierShape(g2d, shirt2, 0.001, new Color(255, 255, 255), null);
        // fillBezierShape(g2d, shadow_shirt_t2, 0.001, new Color(255, 203, 159), null);
        // fillBezierShape(g2d, shadow_shirt_b2, 0.001, new Color(255, 203, 159), null);
        // fillBezierShape(g2d, shirt2, 0.001, null, borderColor);

        // // shadow_shirt_pok
        // List<int[]> shadow_shirt_pok2 = List.of(
        //     new int[]{(int)x + 70, (int)x + 53, (int)x + 57, (int)y + 73, (int)y + 62, (int)y + 80},

        //     new int[]{(int)x + 71, (int)x + 74, (int)x + 102, (int)y + 74, (int)y + 103, (int)y + 96},
        //     new int[]{(int)x + 102, (int)x + 120, (int)x + 100, (int)y + 96, (int)y + 105, (int)y + 70}
        // );
        // fillBezierShape(g2d, shadow_shirt_pok2, 0.001, new Color(115, 71, 121), borderColor);

        // // shirt_pok
        // List<int[]> shirt_pok2 = List.of(
        //     new int[]{(int)x + 127, (int)x + 147, (int)x + 149, (int)y + 97, (int)y + 111, (int)y + 88},
        //     new int[]{(int)x + 149, (int)x + 140, (int)x + 127, (int)y + 88, (int)y + 80, (int)y + 97}
        // );
        // fillBezierShape(g2d, shirt_pok2, 0.001, new Color(115, 89, 190), borderColor);

        // // shirt_boo
        // List<int[]> shirt_boo2 = List.of(
        //     new int[]{(int)x + 127, (int)x + 128, (int)x + 124, (int)y + 96, (int)y + 110, (int)y + 113},
        //     new int[]{(int)x + 124, (int)x + 110, (int)x + 112, (int)y + 113, (int)y + 124, (int)y + 108},
        //     new int[]{(int)x + 112, (int)x + 115, (int)x + 127, (int)y + 108, (int)y + 98, (int)y + 96},

        //     new int[]{(int)x + 116, (int)x + 103, (int)x + 95, (int)y + 96, (int)y + 91, (int)y + 104},
        //     new int[]{(int)x + 95, (int)x + 85, (int)x + 100, (int)y + 104, (int)y + 118, (int)y + 115},
        //     new int[]{(int)x + 100, (int)x + 110, (int)x + 116, (int)y + 115, (int)y + 112, (int)y + 100}
        // );
        // fillBezierShape(g2d, shirt_boo2, 0.001, new Color(115, 89, 190), borderColor);

        // // shirt_boo_boo
        // List<int[]> shirt_boo_boo2 = List.of(
        //     new int[]{(int)x + 116, (int)x + 115, (int)x + 127, (int)y + 96, (int)y + 105, (int)y + 96}
        // );
        // fillBezierShape(g2d, shirt_boo_boo2, 0.001, new Color(115, 89, 190), borderColor);

        // // head
        // List<int[]> head2 = List.of(
        //     new int[]{(int)x + 82, (int)x + 92, (int)x + 101, (int)y + 35, (int)y, (int)y + 25},
        //     new int[]{(int)x + 101, (int)x + 105, (int)x + 108, (int)y + 25, (int)y + 15, (int)y + 23},
        //     new int[]{(int)x + 108, (int)x + 120, (int)x + 132, (int)y + 23, (int)y + 20, (int)y + 23},
        //     new int[]{(int)x + 132, (int)x + 149, (int)x + 145, (int)y + 23, (int)y + 7, (int)y + 33},
        //     new int[]{(int)x + 145, (int)x + 155, (int)x + 150, (int)y + 33, (int)y + 30, (int)y + 39},
        //     new int[]{(int)x + 150, (int)x + 160, (int)x + 160, (int)y + 39, (int)y + 50, (int)y + 70},
        //     new int[]{(int)x + 160, (int)x + 162, (int)x + 155, (int)y + 70, (int)y + 80, (int)y + 80},
        //     new int[]{(int)x + 155, (int)x + 140, (int)x + 137, (int)y + 80, (int)y + 100, (int)y + 92},
        //     new int[]{(int)x + 137, (int)x + 120, (int)x + 104, (int)y + 92, (int)y + 98, (int)y + 89},
        //     new int[]{(int)x + 104, (int)x + 100, (int)x + 88, (int)y + 89, (int)y + 95, (int)y + 85},
        //     new int[]{(int)x + 88, (int)x + 80, (int)x + 70, (int)y + 85, (int)y + 81, (int)y + 73},
        //     new int[]{(int)x + 70, (int)x + 68, (int)x + 73, (int)y + 73, (int)y + 68, (int)y + 55},
        //     new int[]{(int)x + 73, (int)x + 60, (int)x + 82, (int)y + 55, (int)y + 55, (int)y + 35}
        // );

        // // shadow_head
        // List<int[]> shadow_head2 = List.of(
        //     new int[]{(int)x + 96, (int)x + 97, (int)x + 92, (int)y + 16, (int)y + 23, (int)y + 25},
        //     new int[]{(int)x + 92, (int)x + 94, (int)x + 92, (int)y + 25, (int)y + 28, (int)y + 32},
        //     new int[]{(int)x + 92, (int)x + 100, (int)x + 92, (int)y + 32, (int)y + 30, (int)y + 39},
        //     new int[]{(int)x + 92, (int)x + 80, (int)x + 89, (int)y + 39, (int)y + 57, (int)y + 57},
        //     new int[]{(int)x + 89, (int)x + 85, (int)x + 88, (int)y + 57, (int)y + 70, (int)y + 85},
        //     new int[]{(int)x + 88, (int)x + 70, (int)x + 68, (int)y + 85, (int)y + 73, (int)y + 68},
        //     new int[]{(int)x + 68, (int)x + 68, (int)x + 73, (int)y + 68, (int)y + 68, (int)y + 55},
        //     new int[]{(int)x + 73, (int)x +60 , (int)x + 82, (int)y + 55, (int)y + 55, (int)y + 35},
        //     new int[]{(int)x + 82, (int)x + 92, (int)x + 101, (int)y + 35, (int)y, (int)y + 25}
        // );
        // fillBezierShape(g2d, head2, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_head2, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, head2, 0.001, null, borderColor);

        // List<int[]> head_ear2 = List.of(
        //     new int[]{(int)x + 92, (int)x + 94, (int)x + 92, (int)y + 25, (int)y + 28, (int)y + 32},
        //     new int[]{(int)x + 92, (int)x + 100, (int)x + 92, (int)y + 32, (int)y + 30, (int)y + 39}
        // );
        // fillBezierShape(g2d, head_ear2, 0.001, null, borderColor);

        // // eye
        // g2d.rotate(Math.toRadians(-30), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        // fillEllipse(g2d, (int)x + 116, (int)y + 54, 2, 2, borderColor, borderColor);
        // g2d.rotate(Math.toRadians(30), x + 115, y + 55); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        // fillEllipse(g2d, (int)x + 141, (int)y + 54, 2, 2, borderColor, borderColor);
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ
        
        // // nose
        // fillEllipse(g2d, (int)x + 130, (int)y + 55, 3, 2, borderColor, borderColor);

        // // tongue
        // List<int[]> tongue2 = List.of(
        //     new int[]{(int)x + 121, (int)x + 124, (int)x + 132, (int)y + 69, (int)y + 80, (int)y + 79},
        //     new int[]{(int)x + 132, (int)x + 143, (int)x + 141, (int)y + 79, (int)y + 79, (int)y + 65},
        //     new int[]{(int)x + 141, (int)x + 138, (int)x + 134, (int)y + 65, (int)y + 68, (int)y + 64},
        //     new int[]{(int)x + 134, (int)x + 130, (int)x + 127, (int)y + 64, (int)y + 60, (int)y + 64}
        // );
        // fillBezierShape(g2d, tongue2, 0.001, new Color(255, 101, 101), borderColor);

        // List<int[]> tongue_p2 = List.of(
        //     new int[]{(int)x + 131, (int)x + 132, (int)x + 133, (int)y + 64, (int)y + 66, (int)y + 71}
        // );
        // fillBezierShape(g2d, tongue_p2, 0.001, null, borderColor);

        // // mouth
        // List<int[]> mouth2 = List.of(
        //     new int[]{(int)x + 113, (int)x + 121, (int)x + 127, (int)y + 65, (int)y + 71, (int)y + 64},
        //     new int[]{(int)x + 127, (int)x + 130, (int)x + 134, (int)y + 64, (int)y + 60, (int)y + 64},
        //     new int[]{(int)x + 134, (int)x + 138, (int)x + 144, (int)y + 64, (int)y + 68, (int)y + 62}
        // );
        // fillBezierShape(g2d, mouth2, 0.001, null, borderColor);












        // // frame 3
        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(2));

        // // shadow_boo_hat
        // List<int[]> shadow_boo_hat3 = List.of(
        //     new int[]{(int)x + 73, (int)x + 60, (int)x + 50, (int)y + 21, (int)y + 23, (int)y + 23},
        //     new int[]{(int)x + 50, (int)x + 35, (int)x + 45, (int)y + 23, (int)y + 22, (int)y + 31},
        //     new int[]{(int)x + 45, (int)x + 35, (int)x + 45, (int)y + 31, (int)y + 39, (int)y + 40},
        //     new int[]{(int)x + 45, (int)x + 50, (int)x + 70, (int)y + 40, (int)y + 42, (int)y + 35}
        // );
        // fillBezierShape(g2d, shadow_boo_hat3, 0.001, new Color(115,71,121), borderColor);

        // // shadow_s_hat
        // List<int[]> shadow_s_hat3 = List.of(
        //     new int[]{(int)x + 72, (int)x + 68, (int)x + 70, (int)y + 28, (int)y + 27, (int)y + 20},
        //     new int[]{(int)x + 70, (int)x + 80, (int)x + 86, (int)y + 20, (int)y + 2, (int)y + 16}
        // );
        // fillBezierShape(g2d, shadow_s_hat3, 0.001, new Color(115,71,121), borderColor);

        // // shadow_hat
        // List<int[]> shadow_hat3 = List.of(
        //     new int[]{(int)x + 135, (int)x + 120, (int)x + 70, (int)y + 22, (int)y - 13, (int)y + 30},
        //     new int[]{(int)x + 70, (int)x + 60, (int)x + 72, (int)y + 30, (int)y + 37, (int)y + 45}
        // );
        
        // // light_hat
        // List<int[]> light_hat3 = List.of(
        //     new int[]{(int)x + 108, (int)x + 105, (int)x + 120, (int)y + 9, (int)y + 15, (int)y + 21},
        //     new int[]{(int)x + 120, (int)x + 132, (int)x + 133, (int)y + 21, (int)y + 23, (int)y + 22},
        //     new int[]{(int)x + 133, (int)x + 125, (int)x + 108, (int)y + 22, (int)y + 4, (int)y + 9}
        // );
        // fillBezierShape(g2d, shadow_hat3, 0.001, new Color(115,71,121),  null);
        // fillBezierShape(g2d, light_hat3, 0.001, new Color(115, 89, 190), null);
        // fillBezierShape(g2d, shadow_hat3, 0.001, null, borderColor);

        
        // // tail
        // List<int[]> tail3 = List.of(
        //     new int[]{(int)x + 61, (int)x + 50, (int)x + 62, (int)y + 120, (int)y + 130, (int)y + 133},
        //     new int[]{(int)x + 62, (int)x + 62, (int)x + 70, (int)y + 133, (int)y + 133, (int)y + 147},
        //     new int[]{(int)x + 70, (int)x + 50, (int)x + 50, (int)y + 147, (int)y + 165, (int)y + 154},
        //     new int[]{(int)x + 50, (int)x + 20, (int)x + 15, (int)y + 154, (int)y + 158, (int)y + 133},
        //     new int[]{(int)x + 15, (int)x + 13, (int)x + 20, (int)y + 133, (int)y + 124, (int)y + 126},
        //     new int[]{(int)x + 20, (int)x + 20, (int)x + 40, (int)y + 126, (int)y + 105, (int)y + 97},
        //     new int[]{(int)x + 40, (int)x + 50, (int)x + 70, (int)y + 97, (int)y + 97, (int)y + 120}
        // );
        // fillBezierShape(g2d, tail3, 0.001, new Color(255, 195, 144), borderColor);
        
        // // hand_L
        // List<int[]> hand_L3 = List.of(
        //     new int[]{(int)x + 165, (int)x + 171, (int)x + 165, (int)y + 101, (int)y + 115, (int)y + 121},
        //     new int[]{(int)x + 165, (int)x + 160, (int)x + 149, (int)y + 121, (int)y + 127, (int)y + 124}
        // );
        // fillBezierShape(g2d, hand_L3, 0.001, new Color(255, 245, 227), borderColor);
        

        // // hand_R
        // List<int[]> hand_R3 = List.of(
        //     new int[]{(int)x + 46, (int)x + 33, (int)x + 44, (int)y + 90, (int)y + 105, (int)y + 112},
        //     new int[]{(int)x + 44, (int)x + 50, (int)x + 57, (int)y + 112, (int)y + 116, (int)y + 115},
        //     new int[]{(int)x + 57, (int)x + 71, (int)x + 46, (int)y + 115, (int)y + 90, (int)y + 90}
        // );
        // fillBezierShape(g2d, hand_R3, 0.001, new Color(255, 195, 144), borderColor);
        
        // Polygon fill_leg3 = new Polygon();
        // fill_leg3.addPoint((int)x + 63, (int)y + 127);
        // fill_leg3.addPoint((int)x + 98, (int)y + 173);
        // fill_leg3.addPoint((int)x + 145, (int)y + 137);
        // fill_leg3.addPoint((int)x + 90, (int)y + 120);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(fill_leg3);

        // // leg_L
        // List<int[]> leg_L3 = List.of(
        //     new int[]{(int)x + 145, (int)x + 151, (int)x + 144, (int)y + 137, (int)y + 152, (int)y + 148},
        //     new int[]{(int)x + 144, (int)x + 135, (int)x + 116, (int)y + 148, (int)y + 184, (int)y + 183},
        //     new int[]{(int)x + 116, (int)x + 109, (int)x + 104, (int)y + 183, (int)y + 182, (int)y + 170}
        // );

        // // shadow_leg_L
        // List<int[]> shadow_leg_L3 = List.of(
        //     new int[]{(int)x + 104, (int)x + 109, (int)x + 116, (int)y + 170, (int)y + 182, (int)y + 183},
        //     new int[]{(int)x + 116, (int)x + 135, (int)x + 122, (int)y + 183, (int)y + 184, (int)y + 180},
        //     new int[]{(int)x + 122, (int)x + 116, (int)x + 112, (int)y + 180, (int)y + 176, (int)y + 152}
        // );
        // fillBezierShape(g2d, leg_L3, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_leg_L3, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, leg_L3, 0.001, null, borderColor);
        
        // // leg_R
        // List<int[]> leg_R3 = List.of(
        //     new int[]{(int)x + 63, (int)x + 60, (int)x + 66, (int)y + 127, (int)y + 146, (int)y + 142},
        //     new int[]{(int)x + 66, (int)x + 70, (int)x + 85, (int)y + 142, (int)y + 180, (int)y + 183},
        //     new int[]{(int)x + 85, (int)x + 104, (int)x + 113, (int)y + 183, (int)y + 184, (int)y + 145}
        // );

        // // shadow_leg_R
        // List<int[]> shadow_leg_R3 = List.of(
        //     new int[]{(int)x + 63, (int)x + 60, (int)x + 66, (int)y + 127, (int)y + 146, (int)y + 142},
        //     new int[]{(int)x + 66, (int)x + 70, (int)x + 85, (int)y + 142, (int)y + 180, (int)y + 183},
        //     new int[]{(int)x + 85, (int)x + 85, (int)x + 95, (int)y + 183, (int)y + 183, (int)y + 180},
        //     new int[]{(int)x + 95, (int)x + 80, (int)x + 75, (int)y + 180, (int)y + 174, (int)y + 128}
        // );
        // fillBezierShape(g2d, leg_R3, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_leg_R3, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, leg_R3, 0.001, null, borderColor);

        // // fill_shirt
        // Polygon fill_shirt3 = new Polygon();
        // fill_shirt3.addPoint((int)x + 70, (int)y + 74);
        // fill_shirt3.addPoint((int)x + 63, (int)y + 116);
        // fill_shirt3.addPoint((int)x + 149, (int)y + 127);
        // fill_shirt3.addPoint((int)x + 150, (int)y + 86);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(fill_shirt3);

        // // shirt
        // List<int[]> shirt3 = List.of(
        //     new int[]{(int)x + 70, (int)x + 65, (int)x + 52, (int)y + 74, (int)y + 75, (int)y + 84},
        //     new int[]{(int)x + 52, (int)x + 41, (int)x + 48, (int)y + 84, (int)y + 90, (int)y + 92},
        //     new int[]{(int)x + 48, (int)x + 56, (int)x + 58, (int)y + 92, (int)y + 100, (int)y + 111},
        //     new int[]{(int)x + 58, (int)x + 57, (int)x + 72, (int)y + 111, (int)y + 120, (int)y + 111},

        //     new int[]{(int)x + 150, (int)x + 160, (int)x + 163, (int)y + 86, (int)y + 94, (int)y + 98},
        //     new int[]{(int)x + 163, (int)x + 170, (int)x + 149, (int)y + 98, (int)y + 101, (int)y + 123},

        //     new int[]{(int)x + 147, (int)x + 149, (int)x + 145, (int)y + 110, (int)y + 137, (int)y + 137},
        //     new int[]{(int)x + 145, (int)x + 100, (int)x + 65, (int)y + 137, (int)y + 125, (int)y + 127},
        //     new int[]{(int)x + 65, (int)x + 60, (int)x + 63, (int)y + 127, (int)y + 129, (int)y + 116}
        // );

        // // shadow_shirt
        // List<int[]> shadow_shirt_t3 = List.of(
        //     new int[]{(int)x + 70, (int)x + 65, (int)x + 52, (int)y + 74, (int)y + 75, (int)y + 84},
        //     new int[]{(int)x + 52, (int)x + 41, (int)x + 48, (int)y + 84, (int)y + 90, (int)y + 92},
        //     new int[]{(int)x + 48, (int)x + 56, (int)x + 58, (int)y + 92, (int)y + 100, (int)y + 111},
        //     new int[]{(int)x + 58, (int)x + 57, (int)x + 65, (int)y + 111, (int)y + 120, (int)y + 114},
        //     new int[]{(int)x + 65, (int)x + 52, (int)x + 72, (int)y + 114, (int)y + 93, (int)y + 80}
        // );
        // List<int[]> shadow_shirt_b3 = List.of(
        //     new int[]{(int)x + 63, (int)x + 60, (int)x + 65, (int)y + 116, (int)y + 129, (int)y + 127},
        //     new int[]{(int)x + 65, (int)x + 65, (int)x + 75, (int)y + 127, (int)y + 127, (int)y + 125},
        //     new int[]{(int)x + 75, (int)x + 76, (int)x + 72, (int)y + 125, (int)y + 115, (int)y + 111}
        // );
        // fillBezierShape(g2d, shirt3, 0.001, new Color(255, 255, 255), null);
        // fillBezierShape(g2d, shadow_shirt_t3, 0.001, new Color(255, 203, 159), null);
        // fillBezierShape(g2d, shadow_shirt_b3, 0.001, new Color(255, 203, 159), null);
        // fillBezierShape(g2d, shirt3, 0.001, null, borderColor);

        // // shadow_shirt_pok
        // List<int[]> shadow_shirt_pok3 = List.of(
        //     new int[]{(int)x + 70, (int)x + 53, (int)x + 57, (int)y + 73, (int)y + 62, (int)y + 80},

        //     new int[]{(int)x + 71, (int)x + 74, (int)x + 102, (int)y + 74, (int)y + 103, (int)y + 96},
        //     new int[]{(int)x + 102, (int)x + 120, (int)x + 100, (int)y + 96, (int)y + 105, (int)y + 70}
        // );
        // fillBezierShape(g2d, shadow_shirt_pok3, 0.001, new Color(115, 71, 121), borderColor);

        // // shirt_pok
        // List<int[]> shirt_pok3 = List.of(
        //     new int[]{(int)x + 127, (int)x + 147, (int)x + 149, (int)y + 97, (int)y + 111, (int)y + 88},
        //     new int[]{(int)x + 149, (int)x + 140, (int)x + 127, (int)y + 88, (int)y + 80, (int)y + 97}
        // );
        // fillBezierShape(g2d, shirt_pok3, 0.001, new Color(115, 89, 190), borderColor);

        // // shirt_boo
        // List<int[]> shirt_boo3 = List.of(
        //     new int[]{(int)x + 127, (int)x + 128, (int)x + 124, (int)y + 96, (int)y + 110, (int)y + 113},
        //     new int[]{(int)x + 124, (int)x + 110, (int)x + 112, (int)y + 113, (int)y + 124, (int)y + 108},
        //     new int[]{(int)x + 112, (int)x + 115, (int)x + 127, (int)y + 108, (int)y + 98, (int)y + 96},

        //     new int[]{(int)x + 116, (int)x + 103, (int)x + 95, (int)y + 96, (int)y + 91, (int)y + 104},
        //     new int[]{(int)x + 95, (int)x + 85, (int)x + 100, (int)y + 104, (int)y + 118, (int)y + 115},
        //     new int[]{(int)x + 100, (int)x + 110, (int)x + 116, (int)y + 115, (int)y + 112, (int)y + 100}
        // );
        // fillBezierShape(g2d, shirt_boo3, 0.001, new Color(115, 89, 190), borderColor);

        // // shirt_boo_boo
        // List<int[]> shirt_boo_boo3 = List.of(
        //     new int[]{(int)x + 116, (int)x + 115, (int)x + 127, (int)y + 96, (int)y + 105, (int)y + 96}
        // );
        // fillBezierShape(g2d, shirt_boo_boo3, 0.001, new Color(115, 89, 190), borderColor);

        // // head
        // List<int[]> head3 = List.of(
        //     new int[]{(int)x + 82, (int)x + 92, (int)x + 101, (int)y + 35, (int)y, (int)y + 25},
        //     new int[]{(int)x + 101, (int)x + 105, (int)x + 108, (int)y + 25, (int)y + 15, (int)y + 23},
        //     new int[]{(int)x + 108, (int)x + 120, (int)x + 132, (int)y + 23, (int)y + 20, (int)y + 23},
        //     new int[]{(int)x + 132, (int)x + 149, (int)x + 145, (int)y + 23, (int)y + 7, (int)y + 33},
        //     new int[]{(int)x + 145, (int)x + 155, (int)x + 150, (int)y + 33, (int)y + 30, (int)y + 39},
        //     new int[]{(int)x + 150, (int)x + 160, (int)x + 160, (int)y + 39, (int)y + 50, (int)y + 70},
        //     new int[]{(int)x + 160, (int)x + 162, (int)x + 155, (int)y + 70, (int)y + 80, (int)y + 80},
        //     new int[]{(int)x + 155, (int)x + 140, (int)x + 137, (int)y + 80, (int)y + 100, (int)y + 92},
        //     new int[]{(int)x + 137, (int)x + 120, (int)x + 104, (int)y + 92, (int)y + 98, (int)y + 89},
        //     new int[]{(int)x + 104, (int)x + 100, (int)x + 88, (int)y + 89, (int)y + 95, (int)y + 85},
        //     new int[]{(int)x + 88, (int)x + 80, (int)x + 70, (int)y + 85, (int)y + 81, (int)y + 73},
        //     new int[]{(int)x + 70, (int)x + 68, (int)x + 73, (int)y + 73, (int)y + 68, (int)y + 55},
        //     new int[]{(int)x + 73, (int)x + 60, (int)x + 82, (int)y + 55, (int)y + 55, (int)y + 35}
        // );

        // // shadow_head
        // List<int[]> shadow_head3 = List.of(
        //     new int[]{(int)x + 96, (int)x + 97, (int)x + 92, (int)y + 16, (int)y + 23, (int)y + 25},
        //     new int[]{(int)x + 92, (int)x + 94, (int)x + 92, (int)y + 25, (int)y + 28, (int)y + 32},
        //     new int[]{(int)x + 92, (int)x + 100, (int)x + 92, (int)y + 32, (int)y + 30, (int)y + 39},
        //     new int[]{(int)x + 92, (int)x + 80, (int)x + 89, (int)y + 39, (int)y + 57, (int)y + 57},
        //     new int[]{(int)x + 89, (int)x + 85, (int)x + 88, (int)y + 57, (int)y + 70, (int)y + 85},
        //     new int[]{(int)x + 88, (int)x + 70, (int)x + 68, (int)y + 85, (int)y + 73, (int)y + 68},
        //     new int[]{(int)x + 68, (int)x + 68, (int)x + 73, (int)y + 68, (int)y + 68, (int)y + 55},
        //     new int[]{(int)x + 73, (int)x +60 , (int)x + 82, (int)y + 55, (int)y + 55, (int)y + 35},
        //     new int[]{(int)x + 82, (int)x + 92, (int)x + 101, (int)y + 35, (int)y, (int)y + 25}
        // );
        // fillBezierShape(g2d, head3, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_head3, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, head3, 0.001, null, borderColor);

        // List<int[]> head_ear3 = List.of(
        //     new int[]{(int)x + 92, (int)x + 94, (int)x + 92, (int)y + 25, (int)y + 28, (int)y + 32},
        //     new int[]{(int)x + 92, (int)x + 100, (int)x + 92, (int)y + 32, (int)y + 30, (int)y + 39}
        // );
        // fillBezierShape(g2d, head_ear3, 0.001, null, borderColor);

        // // eye
        // g2d.rotate(Math.toRadians(-30), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        // fillEllipse(g2d, (int)x + 116, (int)y + 54, 2, 2, borderColor, borderColor);
        // g2d.rotate(Math.toRadians(30), x + 115, y + 55); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        // fillEllipse(g2d, (int)x + 141, (int)y + 54, 2, 2, borderColor, borderColor);
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ
        
        // // nose
        // fillEllipse(g2d, (int)x + 130, (int)y + 55, 3, 2, borderColor, borderColor);

        // // tongue
        // List<int[]> tongue3 = List.of(
        //     new int[]{(int)x + 121, (int)x + 124, (int)x + 132, (int)y + 69, (int)y + 80, (int)y + 79},
        //     new int[]{(int)x + 132, (int)x + 143, (int)x + 141, (int)y + 79, (int)y + 79, (int)y + 65},
        //     new int[]{(int)x + 141, (int)x + 138, (int)x + 134, (int)y + 65, (int)y + 68, (int)y + 64},
        //     new int[]{(int)x + 134, (int)x + 130, (int)x + 127, (int)y + 64, (int)y + 60, (int)y + 64}
        // );
        // fillBezierShape(g2d, tongue3, 0.001, new Color(255, 101, 101), borderColor);

        // List<int[]> tongue_p3 = List.of(
        //     new int[]{(int)x + 131, (int)x + 132, (int)x + 133, (int)y + 64, (int)y + 66, (int)y + 71}
        // );
        // fillBezierShape(g2d, tongue_p3, 0.001, null, borderColor);

        // // mouth
        // List<int[]> mouth3 = List.of(
        //     new int[]{(int)x + 113, (int)x + 121, (int)x + 127, (int)y + 65, (int)y + 71, (int)y + 64},
        //     new int[]{(int)x + 127, (int)x + 130, (int)x + 134, (int)y + 64, (int)y + 60, (int)y + 64},
        //     new int[]{(int)x + 134, (int)x + 138, (int)x + 144, (int)y + 64, (int)y + 68, (int)y + 62}
        // );
        // fillBezierShape(g2d, mouth3, 0.001, null, borderColor);









        // // frame 4
        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(2));

        // // shadow_boo_hat
        // List<int[]> shadow_boo_hat4 = List.of(
        //     new int[]{(int)x + 73, (int)x + 60, (int)x + 50, (int)y + 21, (int)y + 23, (int)y + 23},
        //     new int[]{(int)x + 50, (int)x + 35, (int)x + 45, (int)y + 23, (int)y + 22, (int)y + 31},
        //     new int[]{(int)x + 45, (int)x + 35, (int)x + 45, (int)y + 31, (int)y + 39, (int)y + 40},
        //     new int[]{(int)x + 45, (int)x + 50, (int)x + 70, (int)y + 40, (int)y + 42, (int)y + 35}
        // );
        // fillBezierShape(g2d, shadow_boo_hat4, 0.001, new Color(115,71,121), borderColor);

        // // shadow_s_hat
        // List<int[]> shadow_s_hat4 = List.of(
        //     new int[]{(int)x + 72, (int)x + 68, (int)x + 70, (int)y + 28, (int)y + 27, (int)y + 20},
        //     new int[]{(int)x + 70, (int)x + 80, (int)x + 86, (int)y + 20, (int)y + 2, (int)y + 16}
        // );
        // fillBezierShape(g2d, shadow_s_hat4, 0.001, new Color(115,71,121), borderColor);

        // // shadow_hat
        // List<int[]> shadow_hat4 = List.of(
        //     new int[]{(int)x + 135, (int)x + 120, (int)x + 70, (int)y + 22, (int)y - 13, (int)y + 30},
        //     new int[]{(int)x + 70, (int)x + 60, (int)x + 72, (int)y + 30, (int)y + 37, (int)y + 45}
        // );
        
        // // light_hat
        // List<int[]> light_hat4 = List.of(
        //     new int[]{(int)x + 108, (int)x + 105, (int)x + 120, (int)y + 9, (int)y + 15, (int)y + 21},
        //     new int[]{(int)x + 120, (int)x + 132, (int)x + 133, (int)y + 21, (int)y + 23, (int)y + 22},
        //     new int[]{(int)x + 133, (int)x + 125, (int)x + 108, (int)y + 22, (int)y + 4, (int)y + 9}
        // );
        // fillBezierShape(g2d, shadow_hat4, 0.001, new Color(115,71,121),  null);
        // fillBezierShape(g2d, light_hat4, 0.001, new Color(115, 89, 190), null);
        // fillBezierShape(g2d, shadow_hat4, 0.001, null, borderColor);

        
        // // tail
        // List<int[]> tail4 = List.of(
        //     new int[]{(int)x + 61, (int)x + 50, (int)x + 62, (int)y + 120, (int)y + 130, (int)y + 133},
        //     new int[]{(int)x + 62, (int)x + 62, (int)x + 70, (int)y + 133, (int)y + 133, (int)y + 147},
        //     new int[]{(int)x + 70, (int)x + 50, (int)x + 50, (int)y + 147, (int)y + 165, (int)y + 154},
        //     new int[]{(int)x + 50, (int)x + 20, (int)x + 15, (int)y + 154, (int)y + 158, (int)y + 133},
        //     new int[]{(int)x + 15, (int)x + 13, (int)x + 20, (int)y + 133, (int)y + 124, (int)y + 126},
        //     new int[]{(int)x + 20, (int)x + 20, (int)x + 40, (int)y + 126, (int)y + 105, (int)y + 97},
        //     new int[]{(int)x + 40, (int)x + 50, (int)x + 70, (int)y + 97, (int)y + 97, (int)y + 120}
        // );
        // fillBezierShape(g2d, tail4, 0.001, new Color(255, 195, 144), borderColor);
        
        // // hand_L
        // List<int[]> hand_L4 = List.of(
        //     new int[]{(int)x + 165, (int)x + 171, (int)x + 165, (int)y + 101, (int)y + 115, (int)y + 121},
        //     new int[]{(int)x + 165, (int)x + 160, (int)x + 149, (int)y + 121, (int)y + 127, (int)y + 124}
        // );
        // fillBezierShape(g2d, hand_L4, 0.001, new Color(255, 245, 227), borderColor);
        

        // // hand_R
        // List<int[]> hand_R4 = List.of(
        //     new int[]{(int)x + 46, (int)x + 33, (int)x + 44, (int)y + 90, (int)y + 105, (int)y + 112},
        //     new int[]{(int)x + 44, (int)x + 50, (int)x + 57, (int)y + 112, (int)y + 116, (int)y + 115},
        //     new int[]{(int)x + 57, (int)x + 71, (int)x + 46, (int)y + 115, (int)y + 90, (int)y + 90}
        // );
        // fillBezierShape(g2d, hand_R4, 0.001, new Color(255, 195, 144), borderColor);
        
        // Polygon fill_leg4 = new Polygon();
        // fill_leg4.addPoint((int)x + 63, (int)y + 127);
        // fill_leg4.addPoint((int)x + 107, (int)y + 158);
        // fill_leg4.addPoint((int)x + 145, (int)y + 137);
        // fill_leg4.addPoint((int)x + 90, (int)y + 120);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(fill_leg4);

        // // leg_L
        // List<int[]> leg_L4 = List.of(
        //     new int[]{(int)x + 145, (int)x + 153, (int)x + 147, (int)y + 137, (int)y + 147, (int)y + 148},
        //     new int[]{(int)x + 147, (int)x + 145, (int)x + 130, (int)y + 148, (int)y + 174, (int)y + 175},
        //     new int[]{(int)x + 130, (int)x + 119, (int)x + 107, (int)y + 175, (int)y + 177, (int)y + 158}
        // );

        // // shadow_leg_L
        // List<int[]> shadow_leg_L4 = List.of(
        //     new int[]{(int)x + 107, (int)x + 119, (int)x + 130, (int)y + 158, (int)y + 177, (int)y + 175},
        //     new int[]{(int)x + 130, (int)x + 145, (int)x + 131, (int)y + 175, (int)y + 174, (int)y + 174},
        //     new int[]{(int)x + 131, (int)x + 121, (int)x + 114, (int)y + 174, (int)y + 171, (int)y + 147}
        // );
        // fillBezierShape(g2d, leg_L4, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_leg_L4, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, leg_L4, 0.001, null, borderColor);
        
        // // leg_R
        // List<int[]> leg_R4 = List.of(
        //     new int[]{(int)x + 63, (int)x + 57, (int)x + 63, (int)y + 127, (int)y + 146, (int)y + 142},
        //     new int[]{(int)x + 63, (int)x + 60, (int)x + 75, (int)y + 142, (int)y + 180, (int)y + 183},
        //     new int[]{(int)x + 75, (int)x + 94, (int)x + 113, (int)y + 183, (int)y + 184, (int)y + 145}
        // );

        // // shadow_leg_R
        // List<int[]> shadow_leg_R4 = List.of(
        //     new int[]{(int)x + 63, (int)x + 57, (int)x + 63, (int)y + 127, (int)y + 146, (int)y + 142},
        //     new int[]{(int)x + 63, (int)x + 60, (int)x + 75, (int)y + 142, (int)y + 180, (int)y + 183},
        //     new int[]{(int)x + 75, (int)x + 94, (int)x + 90, (int)y + 183, (int)y + 184, (int)y + 175},
        //     new int[]{(int)x + 90, (int)x + 75, (int)x + 75, (int)y + 175, (int)y + 164, (int)y + 123}
        // );
        // fillBezierShape(g2d, leg_R4, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_leg_R4, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, leg_R4, 0.001, null, borderColor);

        // // fill_shirt
        // Polygon fill_shirt4 = new Polygon();
        // fill_shirt4.addPoint((int)x + 70, (int)y + 74);
        // fill_shirt4.addPoint((int)x + 63, (int)y + 116);
        // fill_shirt4.addPoint((int)x + 149, (int)y + 127);
        // fill_shirt4.addPoint((int)x + 150, (int)y + 86);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(fill_shirt4);

        // // shirt
        // List<int[]> shirt4 = List.of(
        //     new int[]{(int)x + 70, (int)x + 65, (int)x + 52, (int)y + 74, (int)y + 75, (int)y + 84},
        //     new int[]{(int)x + 52, (int)x + 41, (int)x + 48, (int)y + 84, (int)y + 90, (int)y + 92},
        //     new int[]{(int)x + 48, (int)x + 56, (int)x + 58, (int)y + 92, (int)y + 100, (int)y + 111},
        //     new int[]{(int)x + 58, (int)x + 57, (int)x + 72, (int)y + 111, (int)y + 120, (int)y + 111},

        //     new int[]{(int)x + 150, (int)x + 160, (int)x + 163, (int)y + 86, (int)y + 94, (int)y + 98},
        //     new int[]{(int)x + 163, (int)x + 170, (int)x + 149, (int)y + 98, (int)y + 101, (int)y + 123},

        //     new int[]{(int)x + 147, (int)x + 149, (int)x + 145, (int)y + 110, (int)y + 137, (int)y + 137},
        //     new int[]{(int)x + 145, (int)x + 100, (int)x + 65, (int)y + 137, (int)y + 125, (int)y + 127},
        //     new int[]{(int)x + 65, (int)x + 60, (int)x + 63, (int)y + 127, (int)y + 129, (int)y + 116}
        // );

        // // shadow_shirt
        // List<int[]> shadow_shirt_t4 = List.of(
        //     new int[]{(int)x + 70, (int)x + 65, (int)x + 52, (int)y + 74, (int)y + 75, (int)y + 84},
        //     new int[]{(int)x + 52, (int)x + 41, (int)x + 48, (int)y + 84, (int)y + 90, (int)y + 92},
        //     new int[]{(int)x + 48, (int)x + 56, (int)x + 58, (int)y + 92, (int)y + 100, (int)y + 111},
        //     new int[]{(int)x + 58, (int)x + 57, (int)x + 65, (int)y + 111, (int)y + 120, (int)y + 114},
        //     new int[]{(int)x + 65, (int)x + 52, (int)x + 72, (int)y + 114, (int)y + 93, (int)y + 80}
        // );
        // List<int[]> shadow_shirt_b4 = List.of(
        //     new int[]{(int)x + 63, (int)x + 60, (int)x + 65, (int)y + 116, (int)y + 129, (int)y + 127},
        //     new int[]{(int)x + 65, (int)x + 65, (int)x + 75, (int)y + 127, (int)y + 127, (int)y + 125},
        //     new int[]{(int)x + 75, (int)x + 76, (int)x + 72, (int)y + 125, (int)y + 115, (int)y + 111}
        // );
        // fillBezierShape(g2d, shirt4, 0.001, new Color(255, 255, 255), null);
        // fillBezierShape(g2d, shadow_shirt_t4, 0.001, new Color(255, 203, 159), null);
        // fillBezierShape(g2d, shadow_shirt_b4, 0.001, new Color(255, 203, 159), null);
        // fillBezierShape(g2d, shirt4, 0.001, null, borderColor);

        // // shadow_shirt_pok
        // List<int[]> shadow_shirt_pok4 = List.of(
        //     new int[]{(int)x + 70, (int)x + 53, (int)x + 57, (int)y + 73, (int)y + 62, (int)y + 80},

        //     new int[]{(int)x + 71, (int)x + 74, (int)x + 102, (int)y + 74, (int)y + 103, (int)y + 96},
        //     new int[]{(int)x + 102, (int)x + 120, (int)x + 100, (int)y + 96, (int)y + 105, (int)y + 70}
        // );
        // fillBezierShape(g2d, shadow_shirt_pok4, 0.001, new Color(115, 71, 121), borderColor);

        // // shirt_pok
        // List<int[]> shirt_pok4 = List.of(
        //     new int[]{(int)x + 127, (int)x + 147, (int)x + 149, (int)y + 97, (int)y + 111, (int)y + 88},
        //     new int[]{(int)x + 149, (int)x + 140, (int)x + 127, (int)y + 88, (int)y + 80, (int)y + 97}
        // );
        // fillBezierShape(g2d, shirt_pok4, 0.001, new Color(115, 89, 190), borderColor);

        // // shirt_boo
        // List<int[]> shirt_boo4 = List.of(
        //     new int[]{(int)x + 127, (int)x + 128, (int)x + 124, (int)y + 96, (int)y + 110, (int)y + 113},
        //     new int[]{(int)x + 124, (int)x + 110, (int)x + 112, (int)y + 113, (int)y + 124, (int)y + 108},
        //     new int[]{(int)x + 112, (int)x + 115, (int)x + 127, (int)y + 108, (int)y + 98, (int)y + 96},

        //     new int[]{(int)x + 116, (int)x + 103, (int)x + 95, (int)y + 96, (int)y + 91, (int)y + 104},
        //     new int[]{(int)x + 95, (int)x + 85, (int)x + 100, (int)y + 104, (int)y + 118, (int)y + 115},
        //     new int[]{(int)x + 100, (int)x + 110, (int)x + 116, (int)y + 115, (int)y + 112, (int)y + 100}
        // );
        // fillBezierShape(g2d, shirt_boo4, 0.001, new Color(115, 89, 190), borderColor);

        // // shirt_boo_boo
        // List<int[]> shirt_boo_boo4 = List.of(
        //     new int[]{(int)x + 116, (int)x + 115, (int)x + 127, (int)y + 96, (int)y + 105, (int)y + 96}
        // );
        // fillBezierShape(g2d, shirt_boo_boo4, 0.001, new Color(115, 89, 190), borderColor);

        // // head
        // List<int[]> head4 = List.of(
        //     new int[]{(int)x + 82, (int)x + 92, (int)x + 101, (int)y + 35, (int)y, (int)y + 25},
        //     new int[]{(int)x + 101, (int)x + 105, (int)x + 108, (int)y + 25, (int)y + 15, (int)y + 23},
        //     new int[]{(int)x + 108, (int)x + 120, (int)x + 132, (int)y + 23, (int)y + 20, (int)y + 23},
        //     new int[]{(int)x + 132, (int)x + 149, (int)x + 145, (int)y + 23, (int)y + 7, (int)y + 33},
        //     new int[]{(int)x + 145, (int)x + 155, (int)x + 150, (int)y + 33, (int)y + 30, (int)y + 39},
        //     new int[]{(int)x + 150, (int)x + 160, (int)x + 160, (int)y + 39, (int)y + 50, (int)y + 70},
        //     new int[]{(int)x + 160, (int)x + 162, (int)x + 155, (int)y + 70, (int)y + 80, (int)y + 80},
        //     new int[]{(int)x + 155, (int)x + 140, (int)x + 137, (int)y + 80, (int)y + 100, (int)y + 92},
        //     new int[]{(int)x + 137, (int)x + 120, (int)x + 104, (int)y + 92, (int)y + 98, (int)y + 89},
        //     new int[]{(int)x + 104, (int)x + 100, (int)x + 88, (int)y + 89, (int)y + 95, (int)y + 85},
        //     new int[]{(int)x + 88, (int)x + 80, (int)x + 70, (int)y + 85, (int)y + 81, (int)y + 73},
        //     new int[]{(int)x + 70, (int)x + 68, (int)x + 73, (int)y + 73, (int)y + 68, (int)y + 55},
        //     new int[]{(int)x + 73, (int)x + 60, (int)x + 82, (int)y + 55, (int)y + 55, (int)y + 35}
        // );

        // // shadow_head
        // List<int[]> shadow_head4 = List.of(
        //     new int[]{(int)x + 96, (int)x + 97, (int)x + 92, (int)y + 16, (int)y + 23, (int)y + 25},
        //     new int[]{(int)x + 92, (int)x + 94, (int)x + 92, (int)y + 25, (int)y + 28, (int)y + 32},
        //     new int[]{(int)x + 92, (int)x + 100, (int)x + 92, (int)y + 32, (int)y + 30, (int)y + 39},
        //     new int[]{(int)x + 92, (int)x + 80, (int)x + 89, (int)y + 39, (int)y + 57, (int)y + 57},
        //     new int[]{(int)x + 89, (int)x + 85, (int)x + 88, (int)y + 57, (int)y + 70, (int)y + 85},
        //     new int[]{(int)x + 88, (int)x + 70, (int)x + 68, (int)y + 85, (int)y + 73, (int)y + 68},
        //     new int[]{(int)x + 68, (int)x + 68, (int)x + 73, (int)y + 68, (int)y + 68, (int)y + 55},
        //     new int[]{(int)x + 73, (int)x +60 , (int)x + 82, (int)y + 55, (int)y + 55, (int)y + 35},
        //     new int[]{(int)x + 82, (int)x + 92, (int)x + 101, (int)y + 35, (int)y, (int)y + 25}
        // );
        // fillBezierShape(g2d, head4, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_head4, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, head4, 0.001, null, borderColor);

        // List<int[]> head_ear4 = List.of(
        //     new int[]{(int)x + 92, (int)x + 94, (int)x + 92, (int)y + 25, (int)y + 28, (int)y + 32},
        //     new int[]{(int)x + 92, (int)x + 100, (int)x + 92, (int)y + 32, (int)y + 30, (int)y + 39}
        // );
        // fillBezierShape(g2d, head_ear4, 0.001, null, borderColor);

        // // eye
        // g2d.rotate(Math.toRadians(-30), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        // fillEllipse(g2d, (int)x + 116, (int)y + 54, 2, 2, borderColor, borderColor);
        // g2d.rotate(Math.toRadians(30), x + 115, y + 55); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        // fillEllipse(g2d, (int)x + 141, (int)y + 54, 2, 2, borderColor, borderColor);
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ
        
        // // nose
        // fillEllipse(g2d, (int)x + 130, (int)y + 55, 3, 2, borderColor, borderColor);

        // // tongue
        // List<int[]> tongue4 = List.of(
        //     new int[]{(int)x + 121, (int)x + 124, (int)x + 132, (int)y + 69, (int)y + 80, (int)y + 79},
        //     new int[]{(int)x + 132, (int)x + 143, (int)x + 141, (int)y + 79, (int)y + 79, (int)y + 65},
        //     new int[]{(int)x + 141, (int)x + 138, (int)x + 134, (int)y + 65, (int)y + 68, (int)y + 64},
        //     new int[]{(int)x + 134, (int)x + 130, (int)x + 127, (int)y + 64, (int)y + 60, (int)y + 64}
        // );
        // fillBezierShape(g2d, tongue4, 0.001, new Color(255, 101, 101), borderColor);

        // List<int[]> tongue_p4 = List.of(
        //     new int[]{(int)x + 131, (int)x + 132, (int)x + 133, (int)y + 64, (int)y + 66, (int)y + 71}
        // );
        // fillBezierShape(g2d, tongue_p4, 0.001, null, borderColor);

        // // mouth
        // List<int[]> mouth4 = List.of(
        //     new int[]{(int)x + 113, (int)x + 121, (int)x + 127, (int)y + 65, (int)y + 71, (int)y + 64},
        //     new int[]{(int)x + 127, (int)x + 130, (int)x + 134, (int)y + 64, (int)y + 60, (int)y + 64},
        //     new int[]{(int)x + 134, (int)x + 138, (int)x + 144, (int)y + 64, (int)y + 68, (int)y + 62}
        // );
        // fillBezierShape(g2d, mouth4, 0.001, null, borderColor);









        // // frame 5
        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(2));

        // // shadow_boo_hat
        // List<int[]> shadow_boo_hat5 = List.of(
        //     new int[]{(int)x + 73, (int)x + 60, (int)x + 50, (int)y + 21, (int)y + 23, (int)y + 23},
        //     new int[]{(int)x + 50, (int)x + 35, (int)x + 45, (int)y + 23, (int)y + 22, (int)y + 31},
        //     new int[]{(int)x + 45, (int)x + 35, (int)x + 45, (int)y + 31, (int)y + 39, (int)y + 40},
        //     new int[]{(int)x + 45, (int)x + 50, (int)x + 70, (int)y + 40, (int)y + 42, (int)y + 35}
        // );
        // fillBezierShape(g2d, shadow_boo_hat5, 0.001, new Color(115,71,121), borderColor);

        // // shadow_s_hat
        // List<int[]> shadow_s_hat5 = List.of(
        //     new int[]{(int)x + 72, (int)x + 68, (int)x + 70, (int)y + 28, (int)y + 27, (int)y + 20},
        //     new int[]{(int)x + 70, (int)x + 80, (int)x + 86, (int)y + 20, (int)y + 2, (int)y + 16}
        // );
        // fillBezierShape(g2d, shadow_s_hat5, 0.001, new Color(115,71,121), borderColor);

        // // shadow_hat
        // List<int[]> shadow_hat5 = List.of(
        //     new int[]{(int)x + 135, (int)x + 120, (int)x + 70, (int)y + 22, (int)y - 13, (int)y + 30},
        //     new int[]{(int)x + 70, (int)x + 60, (int)x + 72, (int)y + 30, (int)y + 37, (int)y + 45}
        // );
        
        // // light_hat
        // List<int[]> light_hat5 = List.of(
        //     new int[]{(int)x + 108, (int)x + 105, (int)x + 120, (int)y + 9, (int)y + 15, (int)y + 21},
        //     new int[]{(int)x + 120, (int)x + 132, (int)x + 133, (int)y + 21, (int)y + 23, (int)y + 22},
        //     new int[]{(int)x + 133, (int)x + 125, (int)x + 108, (int)y + 22, (int)y + 4, (int)y + 9}
        // );
        // fillBezierShape(g2d, shadow_hat5, 0.001, new Color(115,71,121),  null);
        // fillBezierShape(g2d, light_hat5, 0.001, new Color(115, 89, 190), null);
        // fillBezierShape(g2d, shadow_hat5, 0.001, null, borderColor);

        
        // // tail
        // List<int[]> tail5 = List.of(
        //     new int[]{(int)x + 61, (int)x + 50, (int)x + 62, (int)y + 120, (int)y + 130, (int)y + 133},
        //     new int[]{(int)x + 62, (int)x + 62, (int)x + 70, (int)y + 133, (int)y + 133, (int)y + 147},
        //     new int[]{(int)x + 70, (int)x + 50, (int)x + 50, (int)y + 147, (int)y + 165, (int)y + 154},
        //     new int[]{(int)x + 50, (int)x + 20, (int)x + 15, (int)y + 154, (int)y + 158, (int)y + 133},
        //     new int[]{(int)x + 15, (int)x + 13, (int)x + 20, (int)y + 133, (int)y + 124, (int)y + 126},
        //     new int[]{(int)x + 20, (int)x + 20, (int)x + 40, (int)y + 126, (int)y + 105, (int)y + 97},
        //     new int[]{(int)x + 40, (int)x + 50, (int)x + 70, (int)y + 97, (int)y + 97, (int)y + 120}
        // );
        // fillBezierShape(g2d, tail5, 0.001, new Color(255, 195, 144), borderColor);
        
        // // hand_L
        // List<int[]> hand_L5 = List.of(
        //     new int[]{(int)x + 165, (int)x + 171, (int)x + 165, (int)y + 101, (int)y + 115, (int)y + 121},
        //     new int[]{(int)x + 165, (int)x + 160, (int)x + 149, (int)y + 121, (int)y + 127, (int)y + 124}
        // );
        // fillBezierShape(g2d, hand_L5, 0.001, new Color(255, 245, 227), borderColor);
        

        // // hand_R
        // List<int[]> hand_R5 = List.of(
        //     new int[]{(int)x + 46, (int)x + 33, (int)x + 44, (int)y + 90, (int)y + 105, (int)y + 112},
        //     new int[]{(int)x + 44, (int)x + 50, (int)x + 57, (int)y + 112, (int)y + 116, (int)y + 115},
        //     new int[]{(int)x + 57, (int)x + 71, (int)x + 46, (int)y + 115, (int)y + 90, (int)y + 90}
        // );
        // fillBezierShape(g2d, hand_R5, 0.001, new Color(255, 195, 144), borderColor);
        
        // Polygon fill_leg5 = new Polygon();
        // fill_leg5.addPoint((int)x + 63, (int)y + 127);
        // fill_leg5.addPoint((int)x + 108, (int)y + 153);
        // fill_leg5.addPoint((int)x + 145, (int)y + 137);
        // fill_leg5.addPoint((int)x + 90, (int)y + 120);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(fill_leg5);

        // // leg_L
        // List<int[]> leg_L5 = List.of(
        //     new int[]{(int)x + 145, (int)x + 156, (int)x + 149, (int)y + 137, (int)y + 140, (int)y + 143},
        //     new int[]{(int)x + 149, (int)x + 155, (int)x + 126, (int)y + 143, (int)y + 179, (int)y + 165},
        //     new int[]{(int)x + 126, (int)x + 119, (int)x + 108, (int)y + 165, (int)y + 162, (int)y + 153}
        // );

        // // shadow_leg_L
        // List<int[]> shadow_leg_L5 = List.of(
        //     new int[]{(int)x + 108, (int)x + 119, (int)x + 126, (int)y + 153, (int)y + 162, (int)y + 165},
        //     new int[]{(int)x + 126, (int)x + 155, (int)x + 138, (int)y + 165, (int)y + 175, (int)y + 167},
        //     new int[]{(int)x + 138, (int)x + 126, (int)x + 115, (int)y + 167, (int)y + 160, (int)y + 143}
        // );
        // fillBezierShape(g2d, leg_L5, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_leg_L5, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, leg_L5, 0.001, null, borderColor);
        
        // // leg_R
        // List<int[]> leg_R5 = List.of(
        //     new int[]{(int)x + 63, (int)x + 50, (int)x + 58, (int)y + 127, (int)y + 141, (int)y + 142},
        //     new int[]{(int)x + 58, (int)x + 50, (int)x + 60, (int)y + 142, (int)y + 175, (int)y + 183},
        //     new int[]{(int)x + 60, (int)x + 83, (int)x + 115, (int)y + 183, (int)y + 186, (int)y + 143}
        // );

        // // shadow_leg_R
        // List<int[]> shadow_leg_R5 = List.of(
        //     new int[]{(int)x + 63, (int)x + 50, (int)x + 58, (int)y + 127, (int)y + 141, (int)y + 142},
        //     new int[]{(int)x + 58, (int)x + 50, (int)x + 60, (int)y + 142, (int)y + 175, (int)y + 183},
        //     new int[]{(int)x + 60, (int)x + 83, (int)x + 75, (int)y + 183, (int)y + 184, (int)y + 179},
        //     new int[]{(int)x + 75, (int)x + 60, (int)x + 75, (int)y + 179, (int)y + 174, (int)y + 128}
        // );
        // fillBezierShape(g2d, leg_R5, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_leg_R5, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, leg_R5, 0.001, null, borderColor);

        // // fill_shirt
        // Polygon fill_shirt5 = new Polygon();
        // fill_shirt5.addPoint((int)x + 70, (int)y + 74);
        // fill_shirt5.addPoint((int)x + 63, (int)y + 116);
        // fill_shirt5.addPoint((int)x + 149, (int)y + 127);
        // fill_shirt5.addPoint((int)x + 150, (int)y + 86);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(fill_shirt5);

        // // shirt
        // List<int[]> shirt5 = List.of(
        //     new int[]{(int)x + 70, (int)x + 65, (int)x + 52, (int)y + 74, (int)y + 75, (int)y + 84},
        //     new int[]{(int)x + 52, (int)x + 41, (int)x + 48, (int)y + 84, (int)y + 90, (int)y + 92},
        //     new int[]{(int)x + 48, (int)x + 56, (int)x + 58, (int)y + 92, (int)y + 100, (int)y + 111},
        //     new int[]{(int)x + 58, (int)x + 57, (int)x + 72, (int)y + 111, (int)y + 120, (int)y + 111},

        //     new int[]{(int)x + 150, (int)x + 160, (int)x + 163, (int)y + 86, (int)y + 94, (int)y + 98},
        //     new int[]{(int)x + 163, (int)x + 170, (int)x + 149, (int)y + 98, (int)y + 101, (int)y + 123},

        //     new int[]{(int)x + 147, (int)x + 149, (int)x + 145, (int)y + 110, (int)y + 137, (int)y + 137},
        //     new int[]{(int)x + 145, (int)x + 100, (int)x + 65, (int)y + 137, (int)y + 125, (int)y + 127},
        //     new int[]{(int)x + 65, (int)x + 60, (int)x + 63, (int)y + 127, (int)y + 129, (int)y + 116}
        // );

        // // shadow_shirt
        // List<int[]> shadow_shirt_t5 = List.of(
        //     new int[]{(int)x + 70, (int)x + 65, (int)x + 52, (int)y + 74, (int)y + 75, (int)y + 84},
        //     new int[]{(int)x + 52, (int)x + 41, (int)x + 48, (int)y + 84, (int)y + 90, (int)y + 92},
        //     new int[]{(int)x + 48, (int)x + 56, (int)x + 58, (int)y + 92, (int)y + 100, (int)y + 111},
        //     new int[]{(int)x + 58, (int)x + 57, (int)x + 65, (int)y + 111, (int)y + 120, (int)y + 114},
        //     new int[]{(int)x + 65, (int)x + 52, (int)x + 72, (int)y + 114, (int)y + 93, (int)y + 80}
        // );
        // List<int[]> shadow_shirt_b5 = List.of(
        //     new int[]{(int)x + 63, (int)x + 60, (int)x + 65, (int)y + 116, (int)y + 129, (int)y + 127},
        //     new int[]{(int)x + 65, (int)x + 65, (int)x + 75, (int)y + 127, (int)y + 127, (int)y + 125},
        //     new int[]{(int)x + 75, (int)x + 76, (int)x + 72, (int)y + 125, (int)y + 115, (int)y + 111}
        // );
        // fillBezierShape(g2d, shirt5, 0.001, new Color(255, 255, 255), null);
        // fillBezierShape(g2d, shadow_shirt_t5, 0.001, new Color(255, 203, 159), null);
        // fillBezierShape(g2d, shadow_shirt_b5, 0.001, new Color(255, 203, 159), null);
        // fillBezierShape(g2d, shirt5, 0.001, null, borderColor);

        // // shadow_shirt_pok
        // List<int[]> shadow_shirt_pok5 = List.of(
        //     new int[]{(int)x + 70, (int)x + 53, (int)x + 57, (int)y + 73, (int)y + 62, (int)y + 80},

        //     new int[]{(int)x + 71, (int)x + 74, (int)x + 102, (int)y + 74, (int)y + 103, (int)y + 96},
        //     new int[]{(int)x + 102, (int)x + 120, (int)x + 100, (int)y + 96, (int)y + 105, (int)y + 70}
        // );
        // fillBezierShape(g2d, shadow_shirt_pok5, 0.001, new Color(115, 71, 121), borderColor);

        // // shirt_pok
        // List<int[]> shirt_pok5 = List.of(
        //     new int[]{(int)x + 127, (int)x + 147, (int)x + 149, (int)y + 97, (int)y + 111, (int)y + 88},
        //     new int[]{(int)x + 149, (int)x + 140, (int)x + 127, (int)y + 88, (int)y + 80, (int)y + 97}
        // );
        // fillBezierShape(g2d, shirt_pok5, 0.001, new Color(115, 89, 190), borderColor);

        // // shirt_boo
        // List<int[]> shirt_boo5 = List.of(
        //     new int[]{(int)x + 127, (int)x + 128, (int)x + 124, (int)y + 96, (int)y + 110, (int)y + 113},
        //     new int[]{(int)x + 124, (int)x + 110, (int)x + 112, (int)y + 113, (int)y + 124, (int)y + 108},
        //     new int[]{(int)x + 112, (int)x + 115, (int)x + 127, (int)y + 108, (int)y + 98, (int)y + 96},

        //     new int[]{(int)x + 116, (int)x + 103, (int)x + 95, (int)y + 96, (int)y + 91, (int)y + 104},
        //     new int[]{(int)x + 95, (int)x + 85, (int)x + 100, (int)y + 104, (int)y + 118, (int)y + 115},
        //     new int[]{(int)x + 100, (int)x + 110, (int)x + 116, (int)y + 115, (int)y + 112, (int)y + 100}
        // );
        // fillBezierShape(g2d, shirt_boo5, 0.001, new Color(115, 89, 190), borderColor);

        // // shirt_boo_boo
        // List<int[]> shirt_boo_boo5 = List.of(
        //     new int[]{(int)x + 116, (int)x + 115, (int)x + 127, (int)y + 96, (int)y + 105, (int)y + 96}
        // );
        // fillBezierShape(g2d, shirt_boo_boo5, 0.001, new Color(115, 89, 190), borderColor);

        // // head
        // List<int[]> head5 = List.of(
        //     new int[]{(int)x + 82, (int)x + 92, (int)x + 101, (int)y + 35, (int)y, (int)y + 25},
        //     new int[]{(int)x + 101, (int)x + 105, (int)x + 108, (int)y + 25, (int)y + 15, (int)y + 23},
        //     new int[]{(int)x + 108, (int)x + 120, (int)x + 132, (int)y + 23, (int)y + 20, (int)y + 23},
        //     new int[]{(int)x + 132, (int)x + 149, (int)x + 145, (int)y + 23, (int)y + 7, (int)y + 33},
        //     new int[]{(int)x + 145, (int)x + 155, (int)x + 150, (int)y + 33, (int)y + 30, (int)y + 39},
        //     new int[]{(int)x + 150, (int)x + 160, (int)x + 160, (int)y + 39, (int)y + 50, (int)y + 70},
        //     new int[]{(int)x + 160, (int)x + 162, (int)x + 155, (int)y + 70, (int)y + 80, (int)y + 80},
        //     new int[]{(int)x + 155, (int)x + 140, (int)x + 137, (int)y + 80, (int)y + 100, (int)y + 92},
        //     new int[]{(int)x + 137, (int)x + 120, (int)x + 104, (int)y + 92, (int)y + 98, (int)y + 89},
        //     new int[]{(int)x + 104, (int)x + 100, (int)x + 88, (int)y + 89, (int)y + 95, (int)y + 85},
        //     new int[]{(int)x + 88, (int)x + 80, (int)x + 70, (int)y + 85, (int)y + 81, (int)y + 73},
        //     new int[]{(int)x + 70, (int)x + 68, (int)x + 73, (int)y + 73, (int)y + 68, (int)y + 55},
        //     new int[]{(int)x + 73, (int)x + 60, (int)x + 82, (int)y + 55, (int)y + 55, (int)y + 35}
        // );

        // // shadow_head
        // List<int[]> shadow_head5 = List.of(
        //     new int[]{(int)x + 96, (int)x + 97, (int)x + 92, (int)y + 16, (int)y + 23, (int)y + 25},
        //     new int[]{(int)x + 92, (int)x + 94, (int)x + 92, (int)y + 25, (int)y + 28, (int)y + 32},
        //     new int[]{(int)x + 92, (int)x + 100, (int)x + 92, (int)y + 32, (int)y + 30, (int)y + 39},
        //     new int[]{(int)x + 92, (int)x + 80, (int)x + 89, (int)y + 39, (int)y + 57, (int)y + 57},
        //     new int[]{(int)x + 89, (int)x + 85, (int)x + 88, (int)y + 57, (int)y + 70, (int)y + 85},
        //     new int[]{(int)x + 88, (int)x + 70, (int)x + 68, (int)y + 85, (int)y + 73, (int)y + 68},
        //     new int[]{(int)x + 68, (int)x + 68, (int)x + 73, (int)y + 68, (int)y + 68, (int)y + 55},
        //     new int[]{(int)x + 73, (int)x +60 , (int)x + 82, (int)y + 55, (int)y + 55, (int)y + 35},
        //     new int[]{(int)x + 82, (int)x + 92, (int)x + 101, (int)y + 35, (int)y, (int)y + 25}
        // );
        // fillBezierShape(g2d, head5, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_head5, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, head5, 0.001, null, borderColor);

        // List<int[]> head_ear5 = List.of(
        //     new int[]{(int)x + 92, (int)x + 94, (int)x + 92, (int)y + 25, (int)y + 28, (int)y + 32},
        //     new int[]{(int)x + 92, (int)x + 100, (int)x + 92, (int)y + 32, (int)y + 30, (int)y + 39}
        // );
        // fillBezierShape(g2d, head_ear5, 0.001, null, borderColor);

        // // eye
        // g2d.rotate(Math.toRadians(-30), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        // fillEllipse(g2d, (int)x + 116, (int)y + 54, 2, 2, borderColor, borderColor);
        // g2d.rotate(Math.toRadians(30), x + 115, y + 55); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        // fillEllipse(g2d, (int)x + 141, (int)y + 54, 2, 2, borderColor, borderColor);
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ
        
        // // nose
        // fillEllipse(g2d, (int)x + 130, (int)y + 55, 3, 2, borderColor, borderColor);

        // // tongue
        // List<int[]> tongue5 = List.of(
        //     new int[]{(int)x + 121, (int)x + 124, (int)x + 132, (int)y + 69, (int)y + 80, (int)y + 79},
        //     new int[]{(int)x + 132, (int)x + 143, (int)x + 141, (int)y + 79, (int)y + 79, (int)y + 65},
        //     new int[]{(int)x + 141, (int)x + 138, (int)x + 134, (int)y + 65, (int)y + 68, (int)y + 64},
        //     new int[]{(int)x + 134, (int)x + 130, (int)x + 127, (int)y + 64, (int)y + 60, (int)y + 64}
        // );
        // fillBezierShape(g2d, tongue5, 0.001, new Color(255, 101, 101), borderColor);

        // List<int[]> tongue_p5 = List.of(
        //     new int[]{(int)x + 131, (int)x + 132, (int)x + 133, (int)y + 64, (int)y + 66, (int)y + 71}
        // );
        // fillBezierShape(g2d, tongue_p5, 0.001, null, borderColor);

        // // mouth
        // List<int[]> mouth5 = List.of(
        //     new int[]{(int)x + 113, (int)x + 121, (int)x + 127, (int)y + 65, (int)y + 71, (int)y + 64},
        //     new int[]{(int)x + 127, (int)x + 130, (int)x + 134, (int)y + 64, (int)y + 60, (int)y + 64},
        //     new int[]{(int)x + 134, (int)x + 138, (int)x + 144, (int)y + 64, (int)y + 68, (int)y + 62}
        // );
        // fillBezierShape(g2d, mouth5, 0.001, null, borderColor);













        // // frame 6
        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(2));

        // // shadow_boo_hat
        // List<int[]> shadow_boo_hat6 = List.of(
        //     new int[]{(int)x + 73, (int)x + 60, (int)x + 50, (int)y + 21, (int)y + 23, (int)y + 23},
        //     new int[]{(int)x + 50, (int)x + 35, (int)x + 45, (int)y + 23, (int)y + 22, (int)y + 31},
        //     new int[]{(int)x + 45, (int)x + 35, (int)x + 45, (int)y + 31, (int)y + 39, (int)y + 40},
        //     new int[]{(int)x + 45, (int)x + 50, (int)x + 70, (int)y + 40, (int)y + 42, (int)y + 35}
        // );
        // fillBezierShape(g2d, shadow_boo_hat6, 0.001, new Color(115,71,121), borderColor);

        // // shadow_s_hat
        // List<int[]> shadow_s_hat6 = List.of(
        //     new int[]{(int)x + 72, (int)x + 68, (int)x + 70, (int)y + 28, (int)y + 27, (int)y + 20},
        //     new int[]{(int)x + 70, (int)x + 80, (int)x + 86, (int)y + 20, (int)y + 2, (int)y + 16}
        // );
        // fillBezierShape(g2d, shadow_s_hat6, 0.001, new Color(115,71,121), borderColor);

        // // shadow_hat
        // List<int[]> shadow_hat6 = List.of(
        //     new int[]{(int)x + 135, (int)x + 120, (int)x + 70, (int)y + 22, (int)y - 13, (int)y + 30},
        //     new int[]{(int)x + 70, (int)x + 60, (int)x + 72, (int)y + 30, (int)y + 37, (int)y + 45}
        // );
        
        // // light_hat
        // List<int[]> light_hat6 = List.of(
        //     new int[]{(int)x + 108, (int)x + 105, (int)x + 120, (int)y + 9, (int)y + 15, (int)y + 21},
        //     new int[]{(int)x + 120, (int)x + 132, (int)x + 133, (int)y + 21, (int)y + 23, (int)y + 22},
        //     new int[]{(int)x + 133, (int)x + 125, (int)x + 108, (int)y + 22, (int)y + 4, (int)y + 9}
        // );
        // fillBezierShape(g2d, shadow_hat6, 0.001, new Color(115,71,121),  null);
        // fillBezierShape(g2d, light_hat6, 0.001, new Color(115, 89, 190), null);
        // fillBezierShape(g2d, shadow_hat6, 0.001, null, borderColor);

        
        // // tail
        // List<int[]> tail6 = List.of(
        //     new int[]{(int)x + 61, (int)x + 50, (int)x + 62, (int)y + 120, (int)y + 130, (int)y + 133},
        //     new int[]{(int)x + 62, (int)x + 62, (int)x + 70, (int)y + 133, (int)y + 133, (int)y + 147},
        //     new int[]{(int)x + 70, (int)x + 50, (int)x + 50, (int)y + 147, (int)y + 165, (int)y + 154},
        //     new int[]{(int)x + 50, (int)x + 20, (int)x + 15, (int)y + 154, (int)y + 158, (int)y + 133},
        //     new int[]{(int)x + 15, (int)x + 13, (int)x + 20, (int)y + 133, (int)y + 124, (int)y + 126},
        //     new int[]{(int)x + 20, (int)x + 20, (int)x + 40, (int)y + 126, (int)y + 105, (int)y + 97},
        //     new int[]{(int)x + 40, (int)x + 50, (int)x + 70, (int)y + 97, (int)y + 97, (int)y + 120}
        // );
        // fillBezierShape(g2d, tail6, 0.001, new Color(255, 195, 144), borderColor);
        
        // // hand_L
        // List<int[]> hand_L6 = List.of(
        //     new int[]{(int)x + 165, (int)x + 171, (int)x + 165, (int)y + 101, (int)y + 115, (int)y + 121},
        //     new int[]{(int)x + 165, (int)x + 160, (int)x + 149, (int)y + 121, (int)y + 127, (int)y + 124}
        // );
        // fillBezierShape(g2d, hand_L6, 0.001, new Color(255, 245, 227), borderColor);
        

        // // hand_R
        // List<int[]> hand_R6 = List.of(
        //     new int[]{(int)x + 46, (int)x + 33, (int)x + 44, (int)y + 90, (int)y + 105, (int)y + 112},
        //     new int[]{(int)x + 44, (int)x + 50, (int)x + 57, (int)y + 112, (int)y + 116, (int)y + 115},
        //     new int[]{(int)x + 57, (int)x + 71, (int)x + 46, (int)y + 115, (int)y + 90, (int)y + 90}
        // );
        // fillBezierShape(g2d, hand_R6, 0.001, new Color(255, 195, 144), borderColor);
        
        // Polygon fill_leg6 = new Polygon();
        // fill_leg6.addPoint((int)x + 63, (int)y + 127);
        // fill_leg6.addPoint((int)x + 108, (int)y + 153);
        // fill_leg6.addPoint((int)x + 145, (int)y + 137);
        // fill_leg6.addPoint((int)x + 90, (int)y + 120);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(fill_leg6);

        // // leg_L
        // List<int[]> leg_L6 = List.of(
        //     new int[]{(int)x + 145, (int)x + 151, (int)x + 144, (int)y + 137, (int)y + 152, (int)y + 150},
        //     new int[]{(int)x + 144, (int)x + 143, (int)x + 126, (int)y + 150, (int)y + 185, (int)y + 183},
        //     new int[]{(int)x + 126, (int)x + 116, (int)x + 105, (int)y + 183, (int)y + 180, (int)y + 155}
        // );

        // // shadow_leg_L
        // List<int[]> shadow_leg_L6 = List.of(
        //     new int[]{(int)x + 105, (int)x + 116, (int)x + 126, (int)y + 155, (int)y + 180, (int)y + 183},
        //     new int[]{(int)x + 126, (int)x + 143, (int)x + 133, (int)y + 183, (int)y + 185, (int)y + 179},
        //     new int[]{(int)x + 133, (int)x + 123, (int)x + 115, (int)y + 179, (int)y + 175, (int)y + 145}
        // );
        // fillBezierShape(g2d, leg_L6, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_leg_L6, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, leg_L6, 0.001, null, borderColor);
        
        // // leg_R
        // List<int[]> leg_R6 = List.of(
        //     new int[]{(int)x + 63, (int)x + 55, (int)x + 63, (int)y + 127, (int)y + 146, (int)y + 147},
        //     new int[]{(int)x + 63, (int)x + 60, (int)x + 73, (int)y + 147, (int)y + 170, (int)y + 178},
        //     new int[]{(int)x + 73, (int)x + 85, (int)x + 115, (int)y + 178, (int)y + 183, (int)y + 143}
        // );

        // // shadow_leg_R
        // List<int[]> shadow_leg_R6 = List.of(
        //     new int[]{(int)x + 63, (int)x + 55, (int)x + 63, (int)y + 127, (int)y + 146, (int)y + 147},
        //     new int[]{(int)x + 63, (int)x + 60, (int)x + 73, (int)y + 147, (int)y + 170, (int)y + 178},
        //     new int[]{(int)x + 73, (int)x + 85, (int)x + 80, (int)y + 178, (int)y + 183, (int)y + 175},
        //     new int[]{(int)x + 80, (int)x + 70, (int)x + 75, (int)y + 175, (int)y + 165, (int)y + 128}
        // );
        // fillBezierShape(g2d, leg_R6, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_leg_R6, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, leg_R6, 0.001, null, borderColor);

        // // fill_shirt
        // Polygon fill_shirt6 = new Polygon();
        // fill_shirt6.addPoint((int)x + 70, (int)y + 74);
        // fill_shirt6.addPoint((int)x + 63, (int)y + 116);
        // fill_shirt6.addPoint((int)x + 149, (int)y + 127);
        // fill_shirt6.addPoint((int)x + 150, (int)y + 86);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(fill_shirt6);

        // // shirt
        // List<int[]> shirt6 = List.of(
        //     new int[]{(int)x + 70, (int)x + 65, (int)x + 52, (int)y + 74, (int)y + 75, (int)y + 84},
        //     new int[]{(int)x + 52, (int)x + 41, (int)x + 48, (int)y + 84, (int)y + 90, (int)y + 92},
        //     new int[]{(int)x + 48, (int)x + 56, (int)x + 58, (int)y + 92, (int)y + 100, (int)y + 111},
        //     new int[]{(int)x + 58, (int)x + 57, (int)x + 72, (int)y + 111, (int)y + 120, (int)y + 111},

        //     new int[]{(int)x + 150, (int)x + 160, (int)x + 163, (int)y + 86, (int)y + 94, (int)y + 98},
        //     new int[]{(int)x + 163, (int)x + 170, (int)x + 149, (int)y + 98, (int)y + 101, (int)y + 123},

        //     new int[]{(int)x + 147, (int)x + 149, (int)x + 145, (int)y + 110, (int)y + 137, (int)y + 137},
        //     new int[]{(int)x + 145, (int)x + 100, (int)x + 65, (int)y + 137, (int)y + 125, (int)y + 127},
        //     new int[]{(int)x + 65, (int)x + 60, (int)x + 63, (int)y + 127, (int)y + 129, (int)y + 116}
        // );

        // // shadow_shirt
        // List<int[]> shadow_shirt_t6 = List.of(
        //     new int[]{(int)x + 70, (int)x + 65, (int)x + 52, (int)y + 74, (int)y + 75, (int)y + 84},
        //     new int[]{(int)x + 52, (int)x + 41, (int)x + 48, (int)y + 84, (int)y + 90, (int)y + 92},
        //     new int[]{(int)x + 48, (int)x + 56, (int)x + 58, (int)y + 92, (int)y + 100, (int)y + 111},
        //     new int[]{(int)x + 58, (int)x + 57, (int)x + 65, (int)y + 111, (int)y + 120, (int)y + 114},
        //     new int[]{(int)x + 65, (int)x + 52, (int)x + 72, (int)y + 114, (int)y + 93, (int)y + 80}
        // );
        // List<int[]> shadow_shirt_b6 = List.of(
        //     new int[]{(int)x + 63, (int)x + 60, (int)x + 65, (int)y + 116, (int)y + 129, (int)y + 127},
        //     new int[]{(int)x + 65, (int)x + 65, (int)x + 75, (int)y + 127, (int)y + 127, (int)y + 125},
        //     new int[]{(int)x + 75, (int)x + 76, (int)x + 72, (int)y + 125, (int)y + 115, (int)y + 111}
        // );
        // fillBezierShape(g2d, shirt6, 0.001, new Color(255, 255, 255), null);
        // fillBezierShape(g2d, shadow_shirt_t6, 0.001, new Color(255, 203, 159), null);
        // fillBezierShape(g2d, shadow_shirt_b6, 0.001, new Color(255, 203, 159), null);
        // fillBezierShape(g2d, shirt6, 0.001, null, borderColor);

        // // shadow_shirt_pok
        // List<int[]> shadow_shirt_pok6 = List.of(
        //     new int[]{(int)x + 70, (int)x + 53, (int)x + 57, (int)y + 73, (int)y + 62, (int)y + 80},

        //     new int[]{(int)x + 71, (int)x + 74, (int)x + 102, (int)y + 74, (int)y + 103, (int)y + 96},
        //     new int[]{(int)x + 102, (int)x + 120, (int)x + 100, (int)y + 96, (int)y + 105, (int)y + 70}
        // );
        // fillBezierShape(g2d, shadow_shirt_pok6, 0.001, new Color(115, 71, 121), borderColor);

        // // shirt_pok
        // List<int[]> shirt_pok6 = List.of(
        //     new int[]{(int)x + 127, (int)x + 147, (int)x + 149, (int)y + 97, (int)y + 111, (int)y + 88},
        //     new int[]{(int)x + 149, (int)x + 140, (int)x + 127, (int)y + 88, (int)y + 80, (int)y + 97}
        // );
        // fillBezierShape(g2d, shirt_pok6, 0.001, new Color(115, 89, 190), borderColor);

        // // shirt_boo
        // List<int[]> shirt_boo6 = List.of(
        //     new int[]{(int)x + 127, (int)x + 128, (int)x + 124, (int)y + 96, (int)y + 110, (int)y + 113},
        //     new int[]{(int)x + 124, (int)x + 110, (int)x + 112, (int)y + 113, (int)y + 124, (int)y + 108},
        //     new int[]{(int)x + 112, (int)x + 115, (int)x + 127, (int)y + 108, (int)y + 98, (int)y + 96},

        //     new int[]{(int)x + 116, (int)x + 103, (int)x + 95, (int)y + 96, (int)y + 91, (int)y + 104},
        //     new int[]{(int)x + 95, (int)x + 85, (int)x + 100, (int)y + 104, (int)y + 118, (int)y + 115},
        //     new int[]{(int)x + 100, (int)x + 110, (int)x + 116, (int)y + 115, (int)y + 112, (int)y + 100}
        // );
        // fillBezierShape(g2d, shirt_boo6, 0.001, new Color(115, 89, 190), borderColor);

        // // shirt_boo_boo
        // List<int[]> shirt_boo_boo6 = List.of(
        //     new int[]{(int)x + 116, (int)x + 115, (int)x + 127, (int)y + 96, (int)y + 105, (int)y + 96}
        // );
        // fillBezierShape(g2d, shirt_boo_boo6, 0.001, new Color(115, 89, 190), borderColor);

        // // head
        // List<int[]> head6 = List.of(
        //     new int[]{(int)x + 82, (int)x + 92, (int)x + 101, (int)y + 35, (int)y, (int)y + 25},
        //     new int[]{(int)x + 101, (int)x + 105, (int)x + 108, (int)y + 25, (int)y + 15, (int)y + 23},
        //     new int[]{(int)x + 108, (int)x + 120, (int)x + 132, (int)y + 23, (int)y + 20, (int)y + 23},
        //     new int[]{(int)x + 132, (int)x + 149, (int)x + 145, (int)y + 23, (int)y + 7, (int)y + 33},
        //     new int[]{(int)x + 145, (int)x + 155, (int)x + 150, (int)y + 33, (int)y + 30, (int)y + 39},
        //     new int[]{(int)x + 150, (int)x + 160, (int)x + 160, (int)y + 39, (int)y + 50, (int)y + 70},
        //     new int[]{(int)x + 160, (int)x + 162, (int)x + 155, (int)y + 70, (int)y + 80, (int)y + 80},
        //     new int[]{(int)x + 155, (int)x + 140, (int)x + 137, (int)y + 80, (int)y + 100, (int)y + 92},
        //     new int[]{(int)x + 137, (int)x + 120, (int)x + 104, (int)y + 92, (int)y + 98, (int)y + 89},
        //     new int[]{(int)x + 104, (int)x + 100, (int)x + 88, (int)y + 89, (int)y + 95, (int)y + 85},
        //     new int[]{(int)x + 88, (int)x + 80, (int)x + 70, (int)y + 85, (int)y + 81, (int)y + 73},
        //     new int[]{(int)x + 70, (int)x + 68, (int)x + 73, (int)y + 73, (int)y + 68, (int)y + 55},
        //     new int[]{(int)x + 73, (int)x + 60, (int)x + 82, (int)y + 55, (int)y + 55, (int)y + 35}
        // );

        // // shadow_head
        // List<int[]> shadow_head6 = List.of(
        //     new int[]{(int)x + 96, (int)x + 97, (int)x + 92, (int)y + 16, (int)y + 23, (int)y + 25},
        //     new int[]{(int)x + 92, (int)x + 94, (int)x + 92, (int)y + 25, (int)y + 28, (int)y + 32},
        //     new int[]{(int)x + 92, (int)x + 100, (int)x + 92, (int)y + 32, (int)y + 30, (int)y + 39},
        //     new int[]{(int)x + 92, (int)x + 80, (int)x + 89, (int)y + 39, (int)y + 57, (int)y + 57},
        //     new int[]{(int)x + 89, (int)x + 85, (int)x + 88, (int)y + 57, (int)y + 70, (int)y + 85},
        //     new int[]{(int)x + 88, (int)x + 70, (int)x + 68, (int)y + 85, (int)y + 73, (int)y + 68},
        //     new int[]{(int)x + 68, (int)x + 68, (int)x + 73, (int)y + 68, (int)y + 68, (int)y + 55},
        //     new int[]{(int)x + 73, (int)x +60 , (int)x + 82, (int)y + 55, (int)y + 55, (int)y + 35},
        //     new int[]{(int)x + 82, (int)x + 92, (int)x + 101, (int)y + 35, (int)y, (int)y + 25}
        // );
        // fillBezierShape(g2d, head6, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_head6, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, head6, 0.001, null, borderColor);

        // List<int[]> head_ear6 = List.of(
        //     new int[]{(int)x + 92, (int)x + 94, (int)x + 92, (int)y + 25, (int)y + 28, (int)y + 32},
        //     new int[]{(int)x + 92, (int)x + 100, (int)x + 92, (int)y + 32, (int)y + 30, (int)y + 39}
        // );
        // fillBezierShape(g2d, head_ear6, 0.001, null, borderColor);

        // // eye
        // g2d.rotate(Math.toRadians(-30), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        // fillEllipse(g2d, (int)x + 116, (int)y + 54, 2, 2, borderColor, borderColor);
        // g2d.rotate(Math.toRadians(30), x + 115, y + 55); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        // fillEllipse(g2d, (int)x + 141, (int)y + 54, 2, 2, borderColor, borderColor);
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ
        
        // // nose
        // fillEllipse(g2d, (int)x + 130, (int)y + 55, 3, 2, borderColor, borderColor);

        // // tongue
        // List<int[]> tongue6 = List.of(
        //     new int[]{(int)x + 121, (int)x + 124, (int)x + 132, (int)y + 69, (int)y + 80, (int)y + 79},
        //     new int[]{(int)x + 132, (int)x + 143, (int)x + 141, (int)y + 79, (int)y + 79, (int)y + 65},
        //     new int[]{(int)x + 141, (int)x + 138, (int)x + 134, (int)y + 65, (int)y + 68, (int)y + 64},
        //     new int[]{(int)x + 134, (int)x + 130, (int)x + 127, (int)y + 64, (int)y + 60, (int)y + 64}
        // );
        // fillBezierShape(g2d, tongue6, 0.001, new Color(255, 101, 101), borderColor);

        // List<int[]> tongue_p6 = List.of(
        //     new int[]{(int)x + 131, (int)x + 132, (int)x + 133, (int)y + 64, (int)y + 66, (int)y + 71}
        // );
        // fillBezierShape(g2d, tongue_p6, 0.001, null, borderColor);

        // // mouth
        // List<int[]> mouth6 = List.of(
        //     new int[]{(int)x + 113, (int)x + 121, (int)x + 127, (int)y + 65, (int)y + 71, (int)y + 64},
        //     new int[]{(int)x + 127, (int)x + 130, (int)x + 134, (int)y + 64, (int)y + 60, (int)y + 64},
        //     new int[]{(int)x + 134, (int)x + 138, (int)x + 144, (int)y + 64, (int)y + 68, (int)y + 62}
        // );
        // fillBezierShape(g2d, mouth6, 0.001, null, borderColor);










        // // frame 7
        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(2));

        // // shadow_boo_hat
        // List<int[]> shadow_boo_hat7 = List.of(
        //     new int[]{(int)x + 73, (int)x + 60, (int)x + 50, (int)y + 21, (int)y + 23, (int)y + 23},
        //     new int[]{(int)x + 50, (int)x + 35, (int)x + 45, (int)y + 23, (int)y + 22, (int)y + 31},
        //     new int[]{(int)x + 45, (int)x + 35, (int)x + 45, (int)y + 31, (int)y + 39, (int)y + 40},
        //     new int[]{(int)x + 45, (int)x + 50, (int)x + 70, (int)y + 40, (int)y + 42, (int)y + 35}
        // );
        // fillBezierShape(g2d, shadow_boo_hat7, 0.001, new Color(115,71,121), borderColor);

        // // shadow_s_hat
        // List<int[]> shadow_s_hat7 = List.of(
        //     new int[]{(int)x + 72, (int)x + 68, (int)x + 70, (int)y + 28, (int)y + 27, (int)y + 20},
        //     new int[]{(int)x + 70, (int)x + 80, (int)x + 86, (int)y + 20, (int)y + 2, (int)y + 16}
        // );
        // fillBezierShape(g2d, shadow_s_hat7, 0.001, new Color(115,71,121), borderColor);

        // // shadow_hat
        // List<int[]> shadow_hat7 = List.of(
        //     new int[]{(int)x + 135, (int)x + 120, (int)x + 70, (int)y + 22, (int)y - 13, (int)y + 30},
        //     new int[]{(int)x + 70, (int)x + 60, (int)x + 72, (int)y + 30, (int)y + 37, (int)y + 45}
        // );
        
        // // light_hat
        // List<int[]> light_hat7 = List.of(
        //     new int[]{(int)x + 108, (int)x + 105, (int)x + 120, (int)y + 9, (int)y + 15, (int)y + 21},
        //     new int[]{(int)x + 120, (int)x + 132, (int)x + 133, (int)y + 21, (int)y + 23, (int)y + 22},
        //     new int[]{(int)x + 133, (int)x + 125, (int)x + 108, (int)y + 22, (int)y + 4, (int)y + 9}
        // );
        // fillBezierShape(g2d, shadow_hat7, 0.001, new Color(115,71,121),  null);
        // fillBezierShape(g2d, light_hat7, 0.001, new Color(115, 89, 190), null);
        // fillBezierShape(g2d, shadow_hat7, 0.001, null, borderColor);

        
        // // tail
        // List<int[]> tail7 = List.of(
        //     new int[]{(int)x + 61, (int)x + 50, (int)x + 62, (int)y + 120, (int)y + 130, (int)y + 133},
        //     new int[]{(int)x + 62, (int)x + 62, (int)x + 70, (int)y + 133, (int)y + 133, (int)y + 147},
        //     new int[]{(int)x + 70, (int)x + 50, (int)x + 50, (int)y + 147, (int)y + 165, (int)y + 154},
        //     new int[]{(int)x + 50, (int)x + 20, (int)x + 15, (int)y + 154, (int)y + 158, (int)y + 133},
        //     new int[]{(int)x + 15, (int)x + 13, (int)x + 20, (int)y + 133, (int)y + 124, (int)y + 126},
        //     new int[]{(int)x + 20, (int)x + 20, (int)x + 40, (int)y + 126, (int)y + 105, (int)y + 97},
        //     new int[]{(int)x + 40, (int)x + 50, (int)x + 70, (int)y + 97, (int)y + 97, (int)y + 120}
        // );
        // fillBezierShape(g2d, tail7, 0.001, new Color(255, 195, 144), borderColor);
        
        // // hand_L
        // List<int[]> hand_L7 = List.of(
        //     new int[]{(int)x + 165, (int)x + 171, (int)x + 165, (int)y + 101, (int)y + 115, (int)y + 121},
        //     new int[]{(int)x + 165, (int)x + 160, (int)x + 149, (int)y + 121, (int)y + 127, (int)y + 124}
        // );
        // fillBezierShape(g2d, hand_L7, 0.001, new Color(255, 245, 227), borderColor);
        

        // // hand_R
        // List<int[]> hand_R7 = List.of(
        //     new int[]{(int)x + 46, (int)x + 33, (int)x + 44, (int)y + 90, (int)y + 105, (int)y + 112},
        //     new int[]{(int)x + 44, (int)x + 50, (int)x + 57, (int)y + 112, (int)y + 116, (int)y + 115},
        //     new int[]{(int)x + 57, (int)x + 71, (int)x + 46, (int)y + 115, (int)y + 90, (int)y + 90}
        // );
        // fillBezierShape(g2d, hand_R7, 0.001, new Color(255, 195, 144), borderColor);
        
        // Polygon fill_leg7 = new Polygon();
        // fill_leg7.addPoint((int)x + 63, (int)y + 127);
        // fill_leg7.addPoint((int)x + 101, (int)y + 163);
        // fill_leg7.addPoint((int)x + 145, (int)y + 137);
        // fill_leg7.addPoint((int)x + 90, (int)y + 120);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(fill_leg7);

        // // leg_L
        // List<int[]> leg_L7 = List.of(
        //     new int[]{(int)x + 145, (int)x + 150, (int)x + 143, (int)y + 137, (int)y + 150, (int)y + 150},
        //     new int[]{(int)x + 143, (int)x + 130, (int)x + 116, (int)y + 150, (int)y + 185, (int)y + 183},
        //     new int[]{(int)x + 116, (int)x + 106, (int)x + 101, (int)y + 183, (int)y + 181, (int)y + 163}
        // );

        // // shadow_leg_L
        // List<int[]> shadow_leg_L7 = List.of(
        //     new int[]{(int)x + 101, (int)x + 106, (int)x + 116, (int)y + 163, (int)y + 181, (int)y + 183},
        //     new int[]{(int)x + 116, (int)x + 130, (int)x + 124, (int)y + 183, (int)y + 185, (int)y + 180},
        //     new int[]{(int)x + 124, (int)x + 113, (int)x + 115, (int)y + 180, (int)y + 170, (int)y + 144}
        // );
        // fillBezierShape(g2d, leg_L7, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_leg_L7, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, leg_L7, 0.001, null, borderColor);
        
        // // leg_R
        // List<int[]> leg_R7 = List.of(
        //     new int[]{(int)x + 63, (int)x + 57, (int)x + 65, (int)y + 127, (int)y + 144, (int)y + 145},
        //     new int[]{(int)x + 65, (int)x + 65, (int)x + 83, (int)y + 145, (int)y + 175, (int)y + 175},
        //     new int[]{(int)x + 83, (int)x + 98, (int)x + 115, (int)y + 175, (int)y + 173, (int)y + 143}
        // );

        // // shadow_leg_R
        // List<int[]> shadow_leg_R7 = List.of(
        //     new int[]{(int)x + 63, (int)x + 57, (int)x + 65, (int)y + 127, (int)y + 144, (int)y + 145},
        //     new int[]{(int)x + 65, (int)x + 65, (int)x + 83, (int)y + 145, (int)y + 175, (int)y + 175},
        //     new int[]{(int)x + 83, (int)x + 98, (int)x + 86, (int)y + 175, (int)y + 173, (int)y + 172},
        //     new int[]{(int)x + 86, (int)x + 74, (int)x + 75, (int)y + 172, (int)y + 164, (int)y + 128}
        // );
        // fillBezierShape(g2d, leg_R7, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_leg_R7, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, leg_R7, 0.001, null, borderColor);

        // // fill_shirt
        // Polygon fill_shirt7 = new Polygon();
        // fill_shirt7.addPoint((int)x + 70, (int)y + 74);
        // fill_shirt7.addPoint((int)x + 63, (int)y + 116);
        // fill_shirt7.addPoint((int)x + 149, (int)y + 127);
        // fill_shirt7.addPoint((int)x + 150, (int)y + 86);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(fill_shirt7);

        // // shirt
        // List<int[]> shirt7 = List.of(
        //     new int[]{(int)x + 70, (int)x + 65, (int)x + 52, (int)y + 74, (int)y + 75, (int)y + 84},
        //     new int[]{(int)x + 52, (int)x + 41, (int)x + 48, (int)y + 84, (int)y + 90, (int)y + 92},
        //     new int[]{(int)x + 48, (int)x + 56, (int)x + 58, (int)y + 92, (int)y + 100, (int)y + 111},
        //     new int[]{(int)x + 58, (int)x + 57, (int)x + 72, (int)y + 111, (int)y + 120, (int)y + 111},

        //     new int[]{(int)x + 150, (int)x + 160, (int)x + 163, (int)y + 86, (int)y + 94, (int)y + 98},
        //     new int[]{(int)x + 163, (int)x + 170, (int)x + 149, (int)y + 98, (int)y + 101, (int)y + 123},

        //     new int[]{(int)x + 147, (int)x + 149, (int)x + 145, (int)y + 110, (int)y + 137, (int)y + 137},
        //     new int[]{(int)x + 145, (int)x + 100, (int)x + 65, (int)y + 137, (int)y + 125, (int)y + 127},
        //     new int[]{(int)x + 65, (int)x + 60, (int)x + 63, (int)y + 127, (int)y + 129, (int)y + 116}
        // );

        // // shadow_shirt
        // List<int[]> shadow_shirt_t7 = List.of(
        //     new int[]{(int)x + 70, (int)x + 65, (int)x + 52, (int)y + 74, (int)y + 75, (int)y + 84},
        //     new int[]{(int)x + 52, (int)x + 41, (int)x + 48, (int)y + 84, (int)y + 90, (int)y + 92},
        //     new int[]{(int)x + 48, (int)x + 56, (int)x + 58, (int)y + 92, (int)y + 100, (int)y + 111},
        //     new int[]{(int)x + 58, (int)x + 57, (int)x + 65, (int)y + 111, (int)y + 120, (int)y + 114},
        //     new int[]{(int)x + 65, (int)x + 52, (int)x + 72, (int)y + 114, (int)y + 93, (int)y + 80}
        // );
        // List<int[]> shadow_shirt_b7 = List.of(
        //     new int[]{(int)x + 63, (int)x + 60, (int)x + 65, (int)y + 116, (int)y + 129, (int)y + 127},
        //     new int[]{(int)x + 65, (int)x + 65, (int)x + 75, (int)y + 127, (int)y + 127, (int)y + 125},
        //     new int[]{(int)x + 75, (int)x + 76, (int)x + 72, (int)y + 125, (int)y + 115, (int)y + 111}
        // );
        // fillBezierShape(g2d, shirt7, 0.001, new Color(255, 255, 255), null);
        // fillBezierShape(g2d, shadow_shirt_t7, 0.001, new Color(255, 203, 159), null);
        // fillBezierShape(g2d, shadow_shirt_b7, 0.001, new Color(255, 203, 159), null);
        // fillBezierShape(g2d, shirt7, 0.001, null, borderColor);

        // // shadow_shirt_pok
        // List<int[]> shadow_shirt_pok7 = List.of(
        //     new int[]{(int)x + 70, (int)x + 53, (int)x + 57, (int)y + 73, (int)y + 62, (int)y + 80},

        //     new int[]{(int)x + 71, (int)x + 74, (int)x + 102, (int)y + 74, (int)y + 103, (int)y + 96},
        //     new int[]{(int)x + 102, (int)x + 120, (int)x + 100, (int)y + 96, (int)y + 105, (int)y + 70}
        // );
        // fillBezierShape(g2d, shadow_shirt_pok7, 0.001, new Color(115, 71, 121), borderColor);

        // // shirt_pok
        // List<int[]> shirt_pok7 = List.of(
        //     new int[]{(int)x + 127, (int)x + 147, (int)x + 149, (int)y + 97, (int)y + 111, (int)y + 88},
        //     new int[]{(int)x + 149, (int)x + 140, (int)x + 127, (int)y + 88, (int)y + 80, (int)y + 97}
        // );
        // fillBezierShape(g2d, shirt_pok7, 0.001, new Color(115, 89, 190), borderColor);

        // // shirt_boo
        // List<int[]> shirt_boo7 = List.of(
        //     new int[]{(int)x + 127, (int)x + 128, (int)x + 124, (int)y + 96, (int)y + 110, (int)y + 113},
        //     new int[]{(int)x + 124, (int)x + 110, (int)x + 112, (int)y + 113, (int)y + 124, (int)y + 108},
        //     new int[]{(int)x + 112, (int)x + 115, (int)x + 127, (int)y + 108, (int)y + 98, (int)y + 96},

        //     new int[]{(int)x + 116, (int)x + 103, (int)x + 95, (int)y + 96, (int)y + 91, (int)y + 104},
        //     new int[]{(int)x + 95, (int)x + 85, (int)x + 100, (int)y + 104, (int)y + 118, (int)y + 115},
        //     new int[]{(int)x + 100, (int)x + 110, (int)x + 116, (int)y + 115, (int)y + 112, (int)y + 100}
        // );
        // fillBezierShape(g2d, shirt_boo7, 0.001, new Color(115, 89, 190), borderColor);

        // // shirt_boo_boo
        // List<int[]> shirt_boo_boo7 = List.of(
        //     new int[]{(int)x + 116, (int)x + 115, (int)x + 127, (int)y + 96, (int)y + 105, (int)y + 96}
        // );
        // fillBezierShape(g2d, shirt_boo_boo7, 0.001, new Color(115, 89, 190), borderColor);

        // // head
        // List<int[]> head7 = List.of(
        //     new int[]{(int)x + 82, (int)x + 92, (int)x + 101, (int)y + 35, (int)y, (int)y + 25},
        //     new int[]{(int)x + 101, (int)x + 105, (int)x + 108, (int)y + 25, (int)y + 15, (int)y + 23},
        //     new int[]{(int)x + 108, (int)x + 120, (int)x + 132, (int)y + 23, (int)y + 20, (int)y + 23},
        //     new int[]{(int)x + 132, (int)x + 149, (int)x + 145, (int)y + 23, (int)y + 7, (int)y + 33},
        //     new int[]{(int)x + 145, (int)x + 155, (int)x + 150, (int)y + 33, (int)y + 30, (int)y + 39},
        //     new int[]{(int)x + 150, (int)x + 160, (int)x + 160, (int)y + 39, (int)y + 50, (int)y + 70},
        //     new int[]{(int)x + 160, (int)x + 162, (int)x + 155, (int)y + 70, (int)y + 80, (int)y + 80},
        //     new int[]{(int)x + 155, (int)x + 140, (int)x + 137, (int)y + 80, (int)y + 100, (int)y + 92},
        //     new int[]{(int)x + 137, (int)x + 120, (int)x + 104, (int)y + 92, (int)y + 98, (int)y + 89},
        //     new int[]{(int)x + 104, (int)x + 100, (int)x + 88, (int)y + 89, (int)y + 95, (int)y + 85},
        //     new int[]{(int)x + 88, (int)x + 80, (int)x + 70, (int)y + 85, (int)y + 81, (int)y + 73},
        //     new int[]{(int)x + 70, (int)x + 68, (int)x + 73, (int)y + 73, (int)y + 68, (int)y + 55},
        //     new int[]{(int)x + 73, (int)x + 60, (int)x + 82, (int)y + 55, (int)y + 55, (int)y + 35}
        // );

        // // shadow_head
        // List<int[]> shadow_head7 = List.of(
        //     new int[]{(int)x + 96, (int)x + 97, (int)x + 92, (int)y + 16, (int)y + 23, (int)y + 25},
        //     new int[]{(int)x + 92, (int)x + 94, (int)x + 92, (int)y + 25, (int)y + 28, (int)y + 32},
        //     new int[]{(int)x + 92, (int)x + 100, (int)x + 92, (int)y + 32, (int)y + 30, (int)y + 39},
        //     new int[]{(int)x + 92, (int)x + 80, (int)x + 89, (int)y + 39, (int)y + 57, (int)y + 57},
        //     new int[]{(int)x + 89, (int)x + 85, (int)x + 88, (int)y + 57, (int)y + 70, (int)y + 85},
        //     new int[]{(int)x + 88, (int)x + 70, (int)x + 68, (int)y + 85, (int)y + 73, (int)y + 68},
        //     new int[]{(int)x + 68, (int)x + 68, (int)x + 73, (int)y + 68, (int)y + 68, (int)y + 55},
        //     new int[]{(int)x + 73, (int)x +60 , (int)x + 82, (int)y + 55, (int)y + 55, (int)y + 35},
        //     new int[]{(int)x + 82, (int)x + 92, (int)x + 101, (int)y + 35, (int)y, (int)y + 25}
        // );
        // fillBezierShape(g2d, head7, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_head7, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, head7, 0.001, null, borderColor);

        // List<int[]> head_ear7 = List.of(
        //     new int[]{(int)x + 92, (int)x + 94, (int)x + 92, (int)y + 25, (int)y + 28, (int)y + 32},
        //     new int[]{(int)x + 92, (int)x + 100, (int)x + 92, (int)y + 32, (int)y + 30, (int)y + 39}
        // );
        // fillBezierShape(g2d, head_ear7, 0.001, null, borderColor);

        // // eye
        // g2d.rotate(Math.toRadians(-30), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        // fillEllipse(g2d, (int)x + 116, (int)y + 54, 2, 2, borderColor, borderColor);
        // g2d.rotate(Math.toRadians(30), x + 115, y + 55); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        // fillEllipse(g2d, (int)x + 141, (int)y + 54, 2, 2, borderColor, borderColor);
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ
        
        // // nose
        // fillEllipse(g2d, (int)x + 130, (int)y + 55, 3, 2, borderColor, borderColor);

        // // tongue
        // List<int[]> tongue7 = List.of(
        //     new int[]{(int)x + 121, (int)x + 124, (int)x + 132, (int)y + 69, (int)y + 80, (int)y + 79},
        //     new int[]{(int)x + 132, (int)x + 143, (int)x + 141, (int)y + 79, (int)y + 79, (int)y + 65},
        //     new int[]{(int)x + 141, (int)x + 138, (int)x + 134, (int)y + 65, (int)y + 68, (int)y + 64},
        //     new int[]{(int)x + 134, (int)x + 130, (int)x + 127, (int)y + 64, (int)y + 60, (int)y + 64}
        // );
        // fillBezierShape(g2d, tongue7, 0.001, new Color(255, 101, 101), borderColor);

        // List<int[]> tongue_p7 = List.of(
        //     new int[]{(int)x + 131, (int)x + 132, (int)x + 133, (int)y + 64, (int)y + 66, (int)y + 71}
        // );
        // fillBezierShape(g2d, tongue_p7, 0.001, null, borderColor);

        // // mouth
        // List<int[]> mouth7 = List.of(
        //     new int[]{(int)x + 113, (int)x + 121, (int)x + 127, (int)y + 65, (int)y + 71, (int)y + 64},
        //     new int[]{(int)x + 127, (int)x + 130, (int)x + 134, (int)y + 64, (int)y + 60, (int)y + 64},
        //     new int[]{(int)x + 134, (int)x + 138, (int)x + 144, (int)y + 64, (int)y + 68, (int)y + 62}
        // );
        // fillBezierShape(g2d, mouth7, 0.001, null, borderColor);














        // // frame 8
        // // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // // หนา 3 px
        // g2d.setStroke(new BasicStroke(2));

        // // shadow_boo_hat
        // List<int[]> shadow_boo_hat8 = List.of(
        //     new int[]{(int)x + 73, (int)x + 60, (int)x + 50, (int)y + 21, (int)y + 23, (int)y + 23},
        //     new int[]{(int)x + 50, (int)x + 35, (int)x + 45, (int)y + 23, (int)y + 22, (int)y + 31},
        //     new int[]{(int)x + 45, (int)x + 35, (int)x + 45, (int)y + 31, (int)y + 39, (int)y + 40},
        //     new int[]{(int)x + 45, (int)x + 50, (int)x + 70, (int)y + 40, (int)y + 42, (int)y + 35}
        // );
        // fillBezierShape(g2d, shadow_boo_hat8, 0.001, new Color(115,71,121), borderColor);

        // // shadow_s_hat
        // List<int[]> shadow_s_hat8 = List.of(
        //     new int[]{(int)x + 72, (int)x + 68, (int)x + 70, (int)y + 28, (int)y + 27, (int)y + 20},
        //     new int[]{(int)x + 70, (int)x + 80, (int)x + 86, (int)y + 20, (int)y + 2, (int)y + 16}
        // );
        // fillBezierShape(g2d, shadow_s_hat8, 0.001, new Color(115,71,121), borderColor);

        // // shadow_hat
        // List<int[]> shadow_hat8 = List.of(
        //     new int[]{(int)x + 135, (int)x + 120, (int)x + 70, (int)y + 22, (int)y - 13, (int)y + 30},
        //     new int[]{(int)x + 70, (int)x + 60, (int)x + 72, (int)y + 30, (int)y + 37, (int)y + 45}
        // );
        
        // // light_hat
        // List<int[]> light_hat8 = List.of(
        //     new int[]{(int)x + 108, (int)x + 105, (int)x + 120, (int)y + 9, (int)y + 15, (int)y + 21},
        //     new int[]{(int)x + 120, (int)x + 132, (int)x + 133, (int)y + 21, (int)y + 23, (int)y + 22},
        //     new int[]{(int)x + 133, (int)x + 125, (int)x + 108, (int)y + 22, (int)y + 4, (int)y + 9}
        // );
        // fillBezierShape(g2d, shadow_hat8, 0.001, new Color(115,71,121),  null);
        // fillBezierShape(g2d, light_hat8, 0.001, new Color(115, 89, 190), null);
        // fillBezierShape(g2d, shadow_hat8, 0.001, null, borderColor);

        
        // // tail
        // List<int[]> tail8 = List.of(
        //     new int[]{(int)x + 61, (int)x + 50, (int)x + 62, (int)y + 120, (int)y + 130, (int)y + 133},
        //     new int[]{(int)x + 62, (int)x + 62, (int)x + 70, (int)y + 133, (int)y + 133, (int)y + 147},
        //     new int[]{(int)x + 70, (int)x + 50, (int)x + 50, (int)y + 147, (int)y + 165, (int)y + 154},
        //     new int[]{(int)x + 50, (int)x + 20, (int)x + 15, (int)y + 154, (int)y + 158, (int)y + 133},
        //     new int[]{(int)x + 15, (int)x + 13, (int)x + 20, (int)y + 133, (int)y + 124, (int)y + 126},
        //     new int[]{(int)x + 20, (int)x + 20, (int)x + 40, (int)y + 126, (int)y + 105, (int)y + 97},
        //     new int[]{(int)x + 40, (int)x + 50, (int)x + 70, (int)y + 97, (int)y + 97, (int)y + 120}
        // );
        // fillBezierShape(g2d, tail8, 0.001, new Color(255, 195, 144), borderColor);
        
        // // hand_L
        // List<int[]> hand_L8 = List.of(
        //     new int[]{(int)x + 165, (int)x + 171, (int)x + 165, (int)y + 101, (int)y + 115, (int)y + 121},
        //     new int[]{(int)x + 165, (int)x + 160, (int)x + 149, (int)y + 121, (int)y + 127, (int)y + 124}
        // );
        // fillBezierShape(g2d, hand_L8, 0.001, new Color(255, 245, 227), borderColor);
        

        // // hand_R
        // List<int[]> hand_R8 = List.of(
        //     new int[]{(int)x + 46, (int)x + 33, (int)x + 44, (int)y + 90, (int)y + 105, (int)y + 112},
        //     new int[]{(int)x + 44, (int)x + 50, (int)x + 57, (int)y + 112, (int)y + 116, (int)y + 115},
        //     new int[]{(int)x + 57, (int)x + 71, (int)x + 46, (int)y + 115, (int)y + 90, (int)y + 90}
        // );
        // fillBezierShape(g2d, hand_R8, 0.001, new Color(255, 195, 144), borderColor);
        
        // Polygon fill_leg8 = new Polygon();
        // fill_leg8.addPoint((int)x + 63, (int)y + 127);
        // fill_leg8.addPoint((int)x + 101, (int)y + 163);
        // fill_leg8.addPoint((int)x + 145, (int)y + 137);
        // fill_leg8.addPoint((int)x + 90, (int)y + 120);

        // g2d.setColor(new Color(255, 245, 227)); // สีผิว
        // g2d.fill(fill_leg8);

        // // leg_L
        // List<int[]> leg_L8 = List.of(
        //     new int[]{(int)x + 145, (int)x + 150, (int)x + 142, (int)y + 137, (int)y + 153, (int)y + 148},
        //     new int[]{(int)x + 142, (int)x + 125, (int)x + 110, (int)y + 148, (int)y + 184, (int)y + 183},
        //     new int[]{(int)x + 110, (int)x + 97, (int)x + 95, (int)y + 183, (int)y + 180, (int)y + 166}
        // );

        // // shadow_leg_L
        // List<int[]> shadow_leg_L8 = List.of(
        //     new int[]{(int)x + 95, (int)x + 97, (int)x + 110, (int)y + 166, (int)y + 180, (int)y + 183},
        //     new int[]{(int)x + 110, (int)x + 125, (int)x + 119, (int)y + 183, (int)y + 184, (int)y + 180},
        //     new int[]{(int)x + 119, (int)x + 108, (int)x + 112, (int)y + 180, (int)y + 171, (int)y + 150}
        // );
        // fillBezierShape(g2d, leg_L8, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_leg_L8, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, leg_L8, 0.001, null, borderColor);
        
        // // leg_R
        // List<int[]> leg_R8 = List.of(
        //     new int[]{(int)x + 63, (int)x + 60, (int)x + 66, (int)y + 127, (int)y + 146, (int)y + 142},
        //     new int[]{(int)x + 66, (int)x + 75, (int)x + 90, (int)y + 142, (int)y + 165, (int)y + 167},
        //     new int[]{(int)x + 90, (int)x + 114, (int)x + 113, (int)y + 167, (int)y + 167, (int)y + 140}
        // );

        // // shadow_leg_R
        // List<int[]> shadow_leg_R8 = List.of(
        //     new int[]{(int)x + 63, (int)x + 60, (int)x + 66, (int)y + 127, (int)y + 146, (int)y + 142},
        //     new int[]{(int)x + 66, (int)x + 75, (int)x + 90, (int)y + 142, (int)y + 165, (int)y + 167},
        //     new int[]{(int)x + 90, (int)x + 114, (int)x + 95, (int)y + 167, (int)y + 167, (int)y + 165},
        //     new int[]{(int)x + 95, (int)x + 82, (int)x + 75, (int)y + 165, (int)y + 154, (int)y + 125}
        // );
        // fillBezierShape(g2d, leg_R8, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_leg_R8, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, leg_R8, 0.001, null, borderColor);

        // // fill_shirt
        // Polygon fill_shirt8 = new Polygon();
        // fill_shirt8.addPoint((int)x + 70, (int)y + 74);
        // fill_shirt8.addPoint((int)x + 63, (int)y + 116);
        // fill_shirt8.addPoint((int)x + 149, (int)y + 127);
        // fill_shirt8.addPoint((int)x + 150, (int)y + 86);

        // g2d.setColor(new Color(255, 255, 255)); // สีผิว
        // g2d.fill(fill_shirt8);

        // // shirt
        // List<int[]> shirt8 = List.of(
        //     new int[]{(int)x + 70, (int)x + 65, (int)x + 52, (int)y + 74, (int)y + 75, (int)y + 84},
        //     new int[]{(int)x + 52, (int)x + 41, (int)x + 48, (int)y + 84, (int)y + 90, (int)y + 92},
        //     new int[]{(int)x + 48, (int)x + 56, (int)x + 58, (int)y + 92, (int)y + 100, (int)y + 111},
        //     new int[]{(int)x + 58, (int)x + 57, (int)x + 72, (int)y + 111, (int)y + 120, (int)y + 111},

        //     new int[]{(int)x + 150, (int)x + 160, (int)x + 163, (int)y + 86, (int)y + 94, (int)y + 98},
        //     new int[]{(int)x + 163, (int)x + 170, (int)x + 149, (int)y + 98, (int)y + 101, (int)y + 123},

        //     new int[]{(int)x + 147, (int)x + 149, (int)x + 145, (int)y + 110, (int)y + 137, (int)y + 137},
        //     new int[]{(int)x + 145, (int)x + 100, (int)x + 65, (int)y + 137, (int)y + 125, (int)y + 127},
        //     new int[]{(int)x + 65, (int)x + 60, (int)x + 63, (int)y + 127, (int)y + 129, (int)y + 116}
        // );

        // // shadow_shirt
        // List<int[]> shadow_shirt_t8 = List.of(
        //     new int[]{(int)x + 70, (int)x + 65, (int)x + 52, (int)y + 74, (int)y + 75, (int)y + 84},
        //     new int[]{(int)x + 52, (int)x + 41, (int)x + 48, (int)y + 84, (int)y + 90, (int)y + 92},
        //     new int[]{(int)x + 48, (int)x + 56, (int)x + 58, (int)y + 92, (int)y + 100, (int)y + 111},
        //     new int[]{(int)x + 58, (int)x + 57, (int)x + 65, (int)y + 111, (int)y + 120, (int)y + 114},
        //     new int[]{(int)x + 65, (int)x + 52, (int)x + 72, (int)y + 114, (int)y + 93, (int)y + 80}
        // );
        // List<int[]> shadow_shirt_b8 = List.of(
        //     new int[]{(int)x + 63, (int)x + 60, (int)x + 65, (int)y + 116, (int)y + 129, (int)y + 127},
        //     new int[]{(int)x + 65, (int)x + 65, (int)x + 75, (int)y + 127, (int)y + 127, (int)y + 125},
        //     new int[]{(int)x + 75, (int)x + 76, (int)x + 72, (int)y + 125, (int)y + 115, (int)y + 111}
        // );
        // fillBezierShape(g2d, shirt8, 0.001, new Color(255, 255, 255), null);
        // fillBezierShape(g2d, shadow_shirt_t8, 0.001, new Color(255, 203, 159), null);
        // fillBezierShape(g2d, shadow_shirt_b8, 0.001, new Color(255, 203, 159), null);
        // fillBezierShape(g2d, shirt8, 0.001, null, borderColor);

        // // shadow_shirt_pok
        // List<int[]> shadow_shirt_pok8 = List.of(
        //     new int[]{(int)x + 70, (int)x + 53, (int)x + 57, (int)y + 73, (int)y + 62, (int)y + 80},

        //     new int[]{(int)x + 71, (int)x + 74, (int)x + 102, (int)y + 74, (int)y + 103, (int)y + 96},
        //     new int[]{(int)x + 102, (int)x + 120, (int)x + 100, (int)y + 96, (int)y + 105, (int)y + 70}
        // );
        // fillBezierShape(g2d, shadow_shirt_pok8, 0.001, new Color(115, 71, 121), borderColor);

        // // shirt_pok
        // List<int[]> shirt_pok8 = List.of(
        //     new int[]{(int)x + 127, (int)x + 147, (int)x + 149, (int)y + 97, (int)y + 111, (int)y + 88},
        //     new int[]{(int)x + 149, (int)x + 140, (int)x + 127, (int)y + 88, (int)y + 80, (int)y + 97}
        // );
        // fillBezierShape(g2d, shirt_pok8, 0.001, new Color(115, 89, 190), borderColor);

        // // shirt_boo
        // List<int[]> shirt_boo8 = List.of(
        //     new int[]{(int)x + 127, (int)x + 128, (int)x + 124, (int)y + 96, (int)y + 110, (int)y + 113},
        //     new int[]{(int)x + 124, (int)x + 110, (int)x + 112, (int)y + 113, (int)y + 124, (int)y + 108},
        //     new int[]{(int)x + 112, (int)x + 115, (int)x + 127, (int)y + 108, (int)y + 98, (int)y + 96},

        //     new int[]{(int)x + 116, (int)x + 103, (int)x + 95, (int)y + 96, (int)y + 91, (int)y + 104},
        //     new int[]{(int)x + 95, (int)x + 85, (int)x + 100, (int)y + 104, (int)y + 118, (int)y + 115},
        //     new int[]{(int)x + 100, (int)x + 110, (int)x + 116, (int)y + 115, (int)y + 112, (int)y + 100}
        // );
        // fillBezierShape(g2d, shirt_boo8, 0.001, new Color(115, 89, 190), borderColor);

        // // shirt_boo_boo
        // List<int[]> shirt_boo_boo8 = List.of(
        //     new int[]{(int)x + 116, (int)x + 115, (int)x + 127, (int)y + 96, (int)y + 105, (int)y + 96}
        // );
        // fillBezierShape(g2d, shirt_boo_boo8, 0.001, new Color(115, 89, 190), borderColor);

        // // head
        // List<int[]> head8 = List.of(
        //     new int[]{(int)x + 82, (int)x + 92, (int)x + 101, (int)y + 35, (int)y, (int)y + 25},
        //     new int[]{(int)x + 101, (int)x + 105, (int)x + 108, (int)y + 25, (int)y + 15, (int)y + 23},
        //     new int[]{(int)x + 108, (int)x + 120, (int)x + 132, (int)y + 23, (int)y + 20, (int)y + 23},
        //     new int[]{(int)x + 132, (int)x + 149, (int)x + 145, (int)y + 23, (int)y + 7, (int)y + 33},
        //     new int[]{(int)x + 145, (int)x + 155, (int)x + 150, (int)y + 33, (int)y + 30, (int)y + 39},
        //     new int[]{(int)x + 150, (int)x + 160, (int)x + 160, (int)y + 39, (int)y + 50, (int)y + 70},
        //     new int[]{(int)x + 160, (int)x + 162, (int)x + 155, (int)y + 70, (int)y + 80, (int)y + 80},
        //     new int[]{(int)x + 155, (int)x + 140, (int)x + 137, (int)y + 80, (int)y + 100, (int)y + 92},
        //     new int[]{(int)x + 137, (int)x + 120, (int)x + 104, (int)y + 92, (int)y + 98, (int)y + 89},
        //     new int[]{(int)x + 104, (int)x + 100, (int)x + 88, (int)y + 89, (int)y + 95, (int)y + 85},
        //     new int[]{(int)x + 88, (int)x + 80, (int)x + 70, (int)y + 85, (int)y + 81, (int)y + 73},
        //     new int[]{(int)x + 70, (int)x + 68, (int)x + 73, (int)y + 73, (int)y + 68, (int)y + 55},
        //     new int[]{(int)x + 73, (int)x + 60, (int)x + 82, (int)y + 55, (int)y + 55, (int)y + 35}
        // );

        // // shadow_head
        // List<int[]> shadow_head8 = List.of(
        //     new int[]{(int)x + 96, (int)x + 97, (int)x + 92, (int)y + 16, (int)y + 23, (int)y + 25},
        //     new int[]{(int)x + 92, (int)x + 94, (int)x + 92, (int)y + 25, (int)y + 28, (int)y + 32},
        //     new int[]{(int)x + 92, (int)x + 100, (int)x + 92, (int)y + 32, (int)y + 30, (int)y + 39},
        //     new int[]{(int)x + 92, (int)x + 80, (int)x + 89, (int)y + 39, (int)y + 57, (int)y + 57},
        //     new int[]{(int)x + 89, (int)x + 85, (int)x + 88, (int)y + 57, (int)y + 70, (int)y + 85},
        //     new int[]{(int)x + 88, (int)x + 70, (int)x + 68, (int)y + 85, (int)y + 73, (int)y + 68},
        //     new int[]{(int)x + 68, (int)x + 68, (int)x + 73, (int)y + 68, (int)y + 68, (int)y + 55},
        //     new int[]{(int)x + 73, (int)x +60 , (int)x + 82, (int)y + 55, (int)y + 55, (int)y + 35},
        //     new int[]{(int)x + 82, (int)x + 92, (int)x + 101, (int)y + 35, (int)y, (int)y + 25}
        // );
        // fillBezierShape(g2d, head8, 0.001, new Color(255, 245, 227), null);
        // fillBezierShape(g2d, shadow_head8, 0.001, new Color(255, 195, 144), null);
        // fillBezierShape(g2d, head8, 0.001, null, borderColor);

        // List<int[]> head_ear8 = List.of(
        //     new int[]{(int)x + 92, (int)x + 94, (int)x + 92, (int)y + 25, (int)y + 28, (int)y + 32},
        //     new int[]{(int)x + 92, (int)x + 100, (int)x + 92, (int)y + 32, (int)y + 30, (int)y + 39}
        // );
        // fillBezierShape(g2d, head_ear8, 0.001, null, borderColor);

        // // eye
        // g2d.rotate(Math.toRadians(-30), x + 115, y + 55); // จุดหมุนประมาณกลางวงรี
        // fillEllipse(g2d, (int)x + 116, (int)y + 54, 2, 2, borderColor, borderColor);
        // g2d.rotate(Math.toRadians(30), x + 115, y + 55); // หมุนกลับ

        // g2d.rotate(Math.toRadians(30), x + 142, y + 53); // จุดหมุนประมาณกลางวงรี
        // fillEllipse(g2d, (int)x + 141, (int)y + 54, 2, 2, borderColor, borderColor);
        // g2d.rotate(Math.toRadians(-30), x + 142, y + 53); // หมุนกลับ
        
        // // nose
        // fillEllipse(g2d, (int)x + 130, (int)y + 55, 3, 2, borderColor, borderColor);

        // // tongue
        // List<int[]> tongue8 = List.of(
        //     new int[]{(int)x + 121, (int)x + 124, (int)x + 132, (int)y + 69, (int)y + 80, (int)y + 79},
        //     new int[]{(int)x + 132, (int)x + 143, (int)x + 141, (int)y + 79, (int)y + 79, (int)y + 65},
        //     new int[]{(int)x + 141, (int)x + 138, (int)x + 134, (int)y + 65, (int)y + 68, (int)y + 64},
        //     new int[]{(int)x + 134, (int)x + 130, (int)x + 127, (int)y + 64, (int)y + 60, (int)y + 64}
        // );
        // fillBezierShape(g2d, tongue8, 0.001, new Color(255, 101, 101), borderColor);

        // List<int[]> tongue_p8 = List.of(
        //     new int[]{(int)x + 131, (int)x + 132, (int)x + 133, (int)y + 64, (int)y + 66, (int)y + 71}
        // );
        // fillBezierShape(g2d, tongue_p8, 0.001, null, borderColor);

        // // mouth
        // List<int[]> mouth8 = List.of(
        //     new int[]{(int)x + 113, (int)x + 121, (int)x + 127, (int)y + 65, (int)y + 71, (int)y + 64},
        //     new int[]{(int)x + 127, (int)x + 130, (int)x + 134, (int)y + 64, (int)y + 60, (int)y + 64},
        //     new int[]{(int)x + 134, (int)x + 138, (int)x + 144, (int)y + 64, (int)y + 68, (int)y + 62}
        // );
        // fillBezierShape(g2d, mouth8, 0.001, null, borderColor);









    }

    private static void putPixel(Graphics2D g2d, int x, int y) {
        g2d.drawLine(x, y, x, y); // pixel = line จุดเดียว
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
