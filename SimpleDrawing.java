import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class SimpleDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // เปิดใช้งานความเรียบเนียน (Anti-aliasing)
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // วาดพื้นหลังสีขาวเต็มจอ
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, getWidth(), getHeight());

        // วาดเส้นตรงสีน้ำเงิน
        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(3)); // หนา 3 px
        g2.draw(new Line2D.Double(50, 50, 200, 50));

        // วาดเส้นโค้งแบบควอด (Quadratic Curve) สีแดง
        g2.setColor(Color.RED);
        QuadCurve2D q = new QuadCurve2D.Double();
        q.setCurve(50, 100, 125, 50, 200, 100);
        g2.draw(q);

        // วาดเส้นโค้งแบบคิวบิก (Cubic Curve) สีเขียว
        g2.setColor(Color.GREEN.darker());
        CubicCurve2D c = new CubicCurve2D.Double(50, 150, 90, 120, 160, 180, 200, 150);
        g2.draw(c);

        // วาดวงรี (Ellipse) สีส้มเติมเต็ม
        g2.setColor(new Color(255, 165, 0)); // สีส้ม
        Ellipse2D ellipse = new Ellipse2D.Double(50, 200, 150, 80);
        g2.fill(ellipse);

        // วาดสี่เหลี่ยมสีม่วงเส้นขอบหนา
        g2.setColor(new Color(128, 0, 128)); // สีม่วง
        g2.setStroke(new BasicStroke(5));
        Rectangle rect = new Rectangle(220, 200, 100, 80);
        g2.draw(rect);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Drawing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 350);
        frame.add(new SimpleDrawing());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
