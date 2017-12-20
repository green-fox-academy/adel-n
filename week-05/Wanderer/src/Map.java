import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Map {
  String pathString;


  public Map() {
  }

  public Map(String pathString) {
    this.pathString = pathString;
  }

  public void getMap(String pathString, Graphics graphics) {
      List<String> fileLines = getFileContent(pathString);

      PositionedImage tile = new PositionedImage("floortp.png");
      PositionedImage wall = new PositionedImage("walltpp.jpg");

      for (int i = 0; i < fileLines.size(); i++) {
        for (int j = 0; j < fileLines.get(i).length(); j++) {
          if (fileLines.get(i).charAt(j) == 'T') {
            tile.draw(graphics, 72 * i, 72 * j);
          } else {
            wall.draw(graphics, 72 * i, 72 * j);
          }
        }
      }
  }

  public static List<String> getFileContent(String pathString){
    Path path = Paths.get(pathString);
    List<String> fileLines = new ArrayList<>();

    try {
      fileLines = Files.readAllLines(path);
    } catch (IOException e) {
      System.out.println("Error: Unable to open file.");
    }
    return fileLines;
  }
}
