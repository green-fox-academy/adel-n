import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ConnectTheDots {

  public static void mainDraw(Graphics graphics){
    // create a function that takes 1 parameter:
    // an array of {x, y} points
    // and connects them with green lines.
    // connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}
    int [][] s = new int [][]{{10, 10}, {290,  10}, {290, 290}, {10, 290}};
    int [][] z = new int [][]{{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};

    connectDots(graphics, s);
    connectDots(graphics, z);
  }

  public static void connectDots (Graphics graphics, int [][] x){
    graphics.setColor(Color.black);
    for(int i = 0; i <x.length -1; i++){
      graphics.drawLine(x[i][0], x[i][1], x[i+1][0], x[i+1][1]);
    }
    graphics.drawLine(x[0][0], x[0][1], x[x.length-1][0], x[x.length-1][1]);
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
