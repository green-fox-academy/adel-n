import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    String input = "green";
    Map<String, Integer> map = new HashMap<>();
    map.put("g", 1);
    map.put("r", 1);
    map.put("e", 2);
    map.put("e", 2);
    map.put("n", 1);

    CountLetters test = new CountLetters();
    System.out.println(test.countLetters(input).get("e").intValue());
  }
}
