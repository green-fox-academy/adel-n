
import java.util.*;
public class PalindromeSearcher {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a string you'd like to search for palindromes in: ");

    String s = input.nextLine();
    palindromeSearcher(s);



    //System.out.println(result);
  }

  public static void palindromeSearcher(String s) {
    int l = s.length();
    int counter = 0;

    Set<String> hs = new HashSet<String>();

    for(int i = 1; i <= l + 3; i++){
      for(int j = 0; j < (l - i); j++){
        String subs = s.substring(j, i + j + 1);
        counter++;
        if(isPalindrome(subs))
        hs.add(subs);
      }
    }

    System.out.println("Possible palindromic substrings: "+ hs.toString());

    //return hs.toString();
  }
  public static boolean isPalindrome(String s) {
    if(s.length() == 0 || s.length() == 1)
      return true;
    if(s.charAt(0) ==  s.charAt(s.length()-1))
      return isPalindrome(s.substring(1, s.length()-1));
    return false;
  }
}
