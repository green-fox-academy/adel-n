import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Character {
  int maxHP;
  int currentHP;
  int defendPoint;
  int strikePoint;
  BufferedImage image;
  int x;
  int y;

  public Character(String filename, int x, int y) {
    this.maxHP = maxHP;
    this.currentHP = currentHP;
    this.defendPoint = defendPoint;
    this.strikePoint = strikePoint;
    this.x=x;
    this.y=y;

    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public Character() {

  }

  public void setImage(BufferedImage image){
    this.image = image;
  }

  /*public void getCharacter(String fileName, Graphics graphics){
    PositionedImage character = new PositionedImage("hero-down.png");
    character.draw(graphics, x,y);

    try {
      image = ImageIO.read(new File(fileName));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }*/

  public void draw(Graphics graphics){
    if(image != null){
      Image scaledImage = image.getScaledInstance(72, 72, Image.SCALE_DEFAULT);
      graphics.drawImage(scaledImage, x, y, null);
    }
  }



}
