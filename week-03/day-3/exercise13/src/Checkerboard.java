import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Checkerboard {
  static  Graphics g;

  public static void mainDraw(Graphics graphics) {
    // fill the canvas with a checkerboard pattern.

    int sY;
    int sX;
    for (int i = 0; i <= 20; i++) {
      for (int j = 0; j <= 20; j++) {
        sY = i * 20;
        sX = j * 20;
        if ( (j % 2) == (i % 2) )
        squareDraw(sX, sY);
      }
    }
  }
  private static void squareDraw(int sX, int sY) {
    g.setColor(Color.BLACK);
    g.fillRect(sX, sY, 20, 20);
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
