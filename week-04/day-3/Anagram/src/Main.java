public class Main {
  public static void main(String[] args) {
    Anagram testAnagram = new Anagram();
    String string1 = "silent";
    String string2 = "listen";
    System.out.println(testAnagram.isAnagram(string1, string2));
  }
}
