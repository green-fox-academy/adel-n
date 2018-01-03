import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {
  public static void main(String[] args) {
  //Write a Stream Expression to find which number squared value is more then 20 from the following array:

    List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
    System.out.println(getSquaredValueMoreThan20(numbers));

    List<Integer> squaredMoreThan20 = numbers.stream()
            .map(number -> (int)Math.pow(number, 2))
            .filter(number -> number > 20)
            .collect(Collectors.toList());
    System.out.println(squaredMoreThan20);
  }

  public static List<Integer> getSquaredValueMoreThan20 (List<Integer> numbers) {
    List<Integer> squaredMoreThan20 = new ArrayList<>();
    for (Integer number : numbers) {
      int pow = (int) Math.pow(number, 2);
      if (pow > 20) {
        squaredMoreThan20.add(pow);
      }
    }
    return (squaredMoreThan20);
  }
}
