import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class PurpleSteps3d {
  static  Graphics g;

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]
    int sS = 10;
    int sY = 5;
    int sX=  5;
    for(int i = 1; i <= 7; i++) {
      squareDraw(sX, sY, sS*i);
      sY = sY + (sS*i);
      sX = sX + (sS*i);
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
