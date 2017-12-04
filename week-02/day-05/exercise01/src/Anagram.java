import java.util.*;
public class Anagram {
  public static void main(String[] args) {

    String s1 = "Adel";
    String s2 = "Leda";
    System.out.println(isAnagram(s1, s2));

  }

  public static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }

    s1=s1.toLowerCase();
    s2=s2.toLowerCase();

    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();

    Arrays.sort(c1);
    Arrays.sort(c2);

    for (int i = 0; i < c1.length; i++) {
      if (c1[i] != c2[i]) {
        return false;
      }
    }
    return true;
  }
}

