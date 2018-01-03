import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Circles {

  public static void mainDraw(Graphics graphics) {
    //graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
    graphics.fillRect(0, 0, WIDTH, HEIGHT);

    int r = 300;
    int x = WIDTH/2;
    int y = HEIGHT/2;

    circle(7, graphics, x, y, r);
  }

  public static void circle(int level, Graphics graphics, int x, int y, int r) {
    if (level == 0) {
      return;
    } else {
      circleFirst(graphics, x, y, r);
      int rN = r/2;
      int xAdj = (int) Math.round(rN * Math.sqrt(3.0)/(2.0));

      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      circle(level-1, graphics, x, y - r/2 , rN);
      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      circle(level-1, graphics, x - xAdj, y + rN/2, rN);
      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      circle(level-1, graphics, x + xAdj, y + rN/2, rN);
    }
  }

  public static void circleFirst (Graphics graphics, int x, int y, int r){
    graphics.drawOval(x-r, y-r, r*2, r*2);
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



