import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SquareGrid {

  public static void mainDraw(Graphics graphics){

    recSquare(graphics, WIDTH /4, HEIGHT/4, 300, 20, 5);
  }

  public static void recSquare(Graphics graphics, int x, int y, int s, int lineWidth, int level){
    if(level == 0){
      return;
    } else {
      square(graphics, x, y, s, lineWidth);
      int sN = s/2;
      int lineWidthN = lineWidth/2;

      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      recSquare(graphics, x - sN/2, y - sN/2, sN, lineWidthN,level-1);
      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      recSquare(graphics, x + 3* sN/2, y - sN/2, sN, lineWidthN,level-1);
      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      recSquare(graphics, x - sN/2, y + 3*sN/2, sN, lineWidthN,level-1);
      graphics.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      recSquare(graphics, x + 3*sN/2, y + 3*sN/2, sN, lineWidthN,level-1);
    }
  }

  public static void square (Graphics graphics,int x, int y, int s, int lineWidth) {
    Graphics2D g2d = (Graphics2D) graphics.create();

    g2d.setStroke(new BasicStroke(lineWidth));
    g2d.drawRect(x, y, s, s);
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
