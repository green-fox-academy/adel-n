public class String1 {
// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.
  public static void main(String[] args) {
    String string = "xfxkxxxrx";
    String from = "x";
    String to = "y";

    System.out.println(string1(string, from, to));
  }

  public static String string1(String string, String from, String to){
    if(!string.contains(from)){
      return string;
    } else {
      return string1(string.replace(from, to), from, to);
    }
  }
}
