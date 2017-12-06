import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FunctionToCenter {
  static  Graphics g;

  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.

    int sX = 0;
    for (int i = 0; i < WIDTH/20; i++) {
      lineDraw(0, sX);
      lineDraw(WIDTH, sX);
      sX = sX + 20;
    }

    int sY = 0;
    for (int j = 0; j < HEIGHT/20; j ++) {
      lineDraw(sY, 0);
      lineDraw(sY, HEIGHT);
      sY = sY + 20;
    }

  }
  private static void lineDraw(int sX, int sY) {
    g.drawLine(sX, sY, WIDTH/2, HEIGHT/2);
    return;
  }

  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;
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
      g = graphics;
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
