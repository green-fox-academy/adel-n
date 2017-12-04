import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
// Create a method that decrypts reversed-order.txt
    Path filePath = Paths.get("reversed-order.txt");
    reversedOrder(filePath);
  }


  public static void reversedOrder(Path filePath){
    try{
      List<String> order = Files.readAllLines(filePath);
      List<String> revOrder = new ArrayList<>();

      for(int i = order.size() - 1; i >= 0; i--){
        revOrder.add(order.get(i));
      }
      Path target = Paths.get("decrypt.txt");
      Files.write(target, revOrder);
    } catch (IOException e){
    }
  }
}
