import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class graphic   {

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.YELLOW);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);

    lineDraw(graphics, 0, 0, WIDTH, 5);
  }

  public static void lineDraw(Graphics graphics, int x, int y, int s, int level) {
    if (level == 0) {
      return;
    } else {
      graphics.setColor(Color.black);
      drawLines(graphics, x, y, s);
      int xA = x + s / 3;
      int xB = x + (s * 2 / 3);
      int yA = y + s / 3;
      int yB = y + (s * 2 / 3);

      lineDraw(graphics, xA, y, s / 3, level - 1);
      lineDraw(graphics, xB, yA, s / 3, level - 1);
      lineDraw(graphics, xA, yB, s / 3, level - 1);
      lineDraw(graphics, x, yA, s / 3, level - 1);
    }
  }

  public static void drawLines (Graphics graphics, int x, int y, int s){
    graphics.setColor(Color.black);
    graphics.drawLine(x, y + s / 3, x + s, y + s /3);
    graphics.drawLine(x, y + (s * 2 / 3), x + s, y + (s * 2 / 3));
    graphics.drawLine(x + s / 3, y, x + s / 3, y + s);
    graphics.drawLine(x + (s * 2 / 3), y, x + (s * 2 / 3), y + s);
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
