import java.util.*;

public class Exercise2 {
  public static void main(String[] args) {
  //Write a Stream Expression to get the average value of the odd numbers from the following array:

    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    System.out.println(averageOfOdds(numbers));

    double average = numbers.stream()
            .filter(number -> Math.abs(number) % 2 == 1)
            .mapToDouble(number -> number)
            .average()
            .getAsDouble();
    System.out.println(average);
  }

  public static double averageOfOdds(List<Integer> numbers) {
    int oddCount = 0;
    int sum = 0;
    for (int number : numbers) {
      if (Math.abs(number) % 2 == 1) {
        sum += number;
        oddCount++;
      }
    }
    return sum / (double) oddCount;
  }
}
