import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
// Create a method that decrypts the duplicated-chars.txt
    Path filePath = Paths.get("duplicated-chars.txt");
    decrypt(filePath);
  }

  public static void decrypt(Path path) {
    try {
      List<String> lines = Files.readAllLines((path), Charset.defaultCharset());
      List<String> decryptList = new ArrayList<>();
      for (int i = 0; i < lines.size(); i++) {
        String string = "";
        for (int j = 0; j < lines.get(i).length() - 1; j += 2) {
          string = string + lines.get(i).charAt(j);
        }
          decryptList.add(string);
      }
      Path filePath = Paths.get("decrypt.txt");
      Files.write(filePath, decryptList);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

