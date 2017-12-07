public class String2 {
  // Given a string, compute recursively a new string where all the 'x' chars have been removed.

  public static void main(String[] args) {
    String string = "xhgoirngdsxxxxkbnxxx";
    String remove = "x";
    String add = "";
    System.out.println(string2(string, remove, add));
  }

  public static String string2(String string, String remove, String add){
    if(!string.contains(remove)){
      return string;
    } else{
      return string2(string.replace(remove, add), remove, add);
    }
  }
}
