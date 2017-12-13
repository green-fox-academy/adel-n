import java.util.Arrays;

public class Anagram {
  private String string1;
  private String string2;

  public Anagram(String string1, String string2) {
    this.string1 = string1;
    this.string2 = string2;
  }

  public Anagram() {

  }

  public boolean isAnagram(String string1, String string2) {

    if (string1.length() != string2.length()) {
      System.out.println("Length not the same, can't be an anagram!");
      return false;
    }

    string1 = string1.toLowerCase();
    string2 = string2.toLowerCase();

    char[] c1 = string1.toCharArray();
    char[] c2 = string2.toCharArray();

    Arrays.sort(c1);
    Arrays.sort(c2);

    for (int i = 0; i < c1.length; i++) {
      if (c1[i] != c2[i]) {
        System.out.println("Not an anagram :(");
        return false;
      }
    }
    return true;
  }
}


