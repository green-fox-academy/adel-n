import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
    Path filePath = Paths.get("reversed-lines.txt");
    reversed(filePath);
  }

  public static void reversed(Path path){
    try {
      List<String> lines = Files.readAllLines((path), Charset.defaultCharset());
      List<String> reverseLines = new ArrayList<>();
      for(int i = 0; i < lines.size(); i++) {
        String stringReverse = new StringBuilder(lines.get(i)).reverse().toString();
        reverseLines.add(stringReverse);
      }
      Path target = Paths.get("decrypt.txt");
      Files.write(target, reverseLines);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}