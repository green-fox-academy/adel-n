import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SierpinskyCarpet {

  public static void mainDraw(Graphics graphics){
    graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
    graphics.fillRect(0, 0, WIDTH, HEIGHT);

   recRectangle(graphics, 200, 200, 200, 5);
  }

  public static void recRectangle (Graphics graphics, int x, int y, int s, int level){
    if(level == 0){
      return;
    } else {
      rectangle(graphics, x, y, s);
      int sN = s/3;

      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      recRectangle(graphics, x - sN * 2, y - sN*2, sN, level - 1);
      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      recRectangle(graphics, x + sN, y - sN*2, sN, level - 1);
      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      recRectangle(graphics, x + sN * 4, y - sN*2, sN, level - 1);
      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      recRectangle(graphics, x - sN * 2, y + sN, sN, level - 1);
      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      recRectangle(graphics, x + sN * 4, y + sN, sN, level - 1);
      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      recRectangle(graphics, x - sN * 2, y + sN*4, sN, level - 1);
      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      recRectangle(graphics, x + sN, y + sN*4, sN, level - 1);
      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      recRectangle(graphics, x + sN * 4, y + sN*4, sN, level - 1);
    }
  }

  public static void rectangle (Graphics graphics,int x, int y, int s) {
    graphics.fillRect(x, y, s, s);
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
