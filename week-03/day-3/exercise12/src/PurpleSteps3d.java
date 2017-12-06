import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class PurpleSteps3d {
  static  Graphics g;

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]
    int sS = 5;
    int sY = 5;
    int sX=  5;
    for(int i = 0; i <= 6; i++) {
      sY = sY * 2;
      sX = sX * 2;
      sS = sS * 2;
      squareDraw(sX, sY, sS);
    }
  }

  private static void squareDraw(int sX, int sY, int sS) {
    g.setColor(new Color(176, 78, 240));
    g.fillRect(sX, sY, sS, sS);
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
