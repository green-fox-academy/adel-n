import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {
  //Write a Stream Expression to convert a char array to a string!

    Character[] myCharArray = {'a', 'b', 'c', 'd'};
    System.out.println(convertToString(myCharArray));

    String value = Arrays.stream(myCharArray)
            .map(Object::toString)
            .collect(Collectors.joining());
    System.out.println(value);
  }

  public static String convertToString(Character[] input) {
    return Arrays.toString(input);
  }
}
