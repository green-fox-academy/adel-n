public class String3 {
// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".
  public static void main(String[] args) {
    String s = "mvdijmvopavpeov";
    System.out.println(string3(s));
  }

  public static String string3(String s){
    if(s.length() == 1){
      return s;
    } else {
      return s.substring(0, 1) + "*" + string3(s.substring(1));
    }
  }
}
