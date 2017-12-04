import java.util.*;
public class PalindromeBuilder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a string you'd like to build palindrome for: ");

    String inputString = input.nextLine();

    String result = palindrome(inputString);
    System.out.println(result);

  }

  public static String palindrome(String s1){
    String s2 = reverseString(s1);
    return s1 + s2;
  }

  public static String reverseString(String input) {
    String reverse = "";
    int length = input.length();
    for( int i = length - 1 ; i >= 0 ; i-- ) {
      reverse = reverse + input.charAt(i);
    }
    return reverse;

  }
}
