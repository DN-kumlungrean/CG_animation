import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class FillShapeExample extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        double x = 50;
        double y = 50;

        // ใช้ Path2D เพื่อรวมเส้นเป็นรูปปิด
        Path2D path = new Path2D.Double();
        path.moveTo(x + 92, y + 25);
        path.quadTo(x + 97, y + 23, x + 96, y + 16);
        path.quadTo(x + 90, y + 10, x + 80, y + 16);
        path.quadTo(x + 78, y + 23, x + 92, y + 25);
        path.closePath(); // ปิดรูปร่าง

        // ตั้งค่าสีเติม
        g2d.setColor(Color.RED);
        g2d.fill(path);

        // วาดเส้นขอบ
        g2d.setColor(Color.BLACK);
        g2d.draw(path);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fill Shape Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new FillShapeExample());
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
