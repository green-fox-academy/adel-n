import java.util.*;
import java.util.stream.Collectors;

public class Exercise5 {
  public static void main(String[] args) {
    //Write a Stream Expression to find the frequency of numbers in the following array:

    List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));
    System.out.println(getNumberFrequency(numbers));

    Map<Integer, Long> numberFrequency = numbers.stream()
            .collect(Collectors.groupingBy(number -> number, Collectors.counting()));
    System.out.println(numberFrequency);
  }

  public static Map<Integer, Integer> getNumberFrequency(List<Integer> numbers) {
    Map<Integer, Integer> numberFrequency = new HashMap<>();

    for (Integer number : numbers) {
      if (numberFrequency.containsKey(number)) {
        numberFrequency.put(number, numberFrequency.get(number) + 1);
      } else {
        numberFrequency.put(number, 1);
      }
    }
    return numberFrequency;
  }
}
