import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Triangles {

  public static void mainDraw(Graphics graphics)  {
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);

    int triangleHeight = (int) Math.round(WIDTH * Math.sqrt(3.0) / 2.0);

    Point p1 = new Point(0,0);
    Point p2 = new Point(WIDTH/2, triangleHeight);
    Point p3 = new Point(WIDTH, 0);
    triangle(6, graphics, p1, p2, p3);
  }

  public static void triangle(int level, Graphics g, Point p1, Point p2, Point p3){
    if(level == 1){
      Polygon p = new Polygon();
      p.addPoint(p1.x, p1.y);
      p.addPoint(p2.x, p2.y);
      p.addPoint(p3.x, p3.y);
      g.fillPolygon(p);
    } else{
      Point p4 = midPoint(p1, p2);
      Point p5 = midPoint(p2, p3);
      Point p6 = midPoint(p1, p3);

      g.setColor(new Color(205,92,92));
      triangle(level - 1, g, p1, p4, p6);
      g.setColor(new Color(220,20,60));
      triangle(level - 1, g, p4, p2, p5);
      g.setColor(new Color(240,128,128));
      triangle(level - 1, g, p6, p5, p3);
    }
  }

  public static Point midPoint(Point p1, Point p2) {
    return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
  }

  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
