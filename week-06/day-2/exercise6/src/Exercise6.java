import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Exercise6 {
  public static void main(String[] args) {
  //Write a Stream Expression to find the frequency of characters in a given string!

    String toBeCounted = "Blablabla";
    System.out.println(getCharacterFrequency(toBeCounted));

    Stream<String> words = Stream.of("blablabla");
    Map<String, Long> letterToCount = words
            .map(w -> w.split(""))
            .flatMap(Arrays::stream)
            .collect(groupingBy(identity(), counting()));
    System.out.println(letterToCount);
  }

  public static Map<Character, Integer> getCharacterFrequency(String toCount) {
    Map<Character, Integer> charFrequency = new HashMap<>();

    for (Character character : toCount.toLowerCase().toCharArray()) {
      if (charFrequency.containsKey(character)) {
        charFrequency.put(character, charFrequency.get(character) + 1);
      } else {
        charFrequency.put(character, 1);
      }
    }
    return charFrequency;
  }
}
