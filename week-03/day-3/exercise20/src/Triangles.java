import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics){
    int tB = 10;
    int tH = 9;
    for (int i=0; i <10; i++) {
      for (int j = 0; j < i + 1; j++)

        triangle(WIDTH / 2 - i * tB / 2 + j * tB, 20 + i * tH, tH, tB, graphics);
    }
  }

  public static void triangle (int aX, int aY, int h, int b, Graphics graphics){
    int [] x ={aX, aX - b / 2, aX + b / 2};
    int [] y ={aY, aY + h, aY + h};
    int n = 3;
    graphics.drawPolygon(x, y, n);
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
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
