import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
  public static void main(String[] args) {
  //Write a Stream Expression to get the squared value of the positive numbers from the following array:

    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    System.out.println(getSquaredOfPositives(numbers));

    List<Integer> squaredPositives = numbers.stream()
            .filter(number -> number > 0)
            .map(number -> (int)Math.pow(number, 2))
            .collect(Collectors.toList());
    System.out.println(squaredPositives);
  }

  public static List<Integer> getSquaredOfPositives (List<Integer> numbers) {
    List<Integer> squaredOfPositives =  new ArrayList<>();
    for (int number : numbers) {
      if (number > 0) {
        number = (int) Math.pow(number, 2);
        squaredOfPositives.add(number);
      }
    }
    return squaredOfPositives;
  }
}
