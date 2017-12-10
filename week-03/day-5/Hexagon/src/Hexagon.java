import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Hexagon {

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
    graphics.fillRect(0, 0, WIDTH, HEIGHT);

    int height = (int) Math.round(300 * Math.sqrt(3.0)/(2.0));
    recHexagon(graphics, 300, height, 300, height, 6);

  }

  public static void recHexagon(Graphics graphics, int x, int y, int s, int height, int level){
    if(level == 0) {
      return;
    } else {
      hexagon(graphics, x , y, s, height);
      int sN = s/3;
      int heightN = height/3;

      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      recHexagon(graphics, x - sN*2, y, sN,  heightN,level - 1);
      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      recHexagon(graphics, x - sN, y - heightN*2, sN, heightN,level-1);
      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      recHexagon(graphics, x + sN, y - heightN*2, sN, heightN, level - 1);
      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      recHexagon(graphics, x + sN*2, y, sN,  heightN,level - 1);
      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      recHexagon(graphics, x + sN, y + heightN*2, sN, heightN,  level-1);
      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      recHexagon(graphics, x - sN, y + heightN*2, sN, heightN, level - 1);
    }
  }

  public static void hexagon(Graphics graphics, int x, int y, int s, int height ){
    int [] xPoints = {x-s/2, x + s/2, x+ s, x + s/2, x- s/2, x - s};
    int [] yPoints = {y - height, y - height, y, y + height, y + height, y};
    int numPoints = 6;

    graphics.drawPolygon(xPoints, yPoints, numPoints);
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
