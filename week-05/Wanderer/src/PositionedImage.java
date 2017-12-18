import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PositionedImage {
  BufferedImage image;
  int posX, posY;

  public PositionedImage(String filename) {
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public PositionedImage() {

  }

  public void draw(Graphics graphics, int posX, int posY) {
    if (image != null) {
      graphics.drawImage(image, posX, posY, null);
    }
  }
}
