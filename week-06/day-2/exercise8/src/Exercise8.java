import java.util.List;
import java.util.stream.Collectors;
import static java.lang.Character.isUpperCase;

public class Exercise8 {
  public static void main(String[] args) {
  //Write a Stream Expression to find the uppercase characters in a string!

    String myString = "BlaBlaBla";
    System.out.println(getUppercases(myString));

    List<Character> chars = myString.chars()
            .mapToObj(e->(char)e)
            .filter(x -> isUpperCase(x))
            .collect(Collectors.toList());
    System.out.println(chars);
  }

  public static String getUppercases(String input) {
    String filteredString = "";
    for (char character : input.toCharArray()) {
      if (isUpperCase(character)) {
        filteredString = filteredString + " " + character;
      }
    }
    return filteredString;
  }
}
