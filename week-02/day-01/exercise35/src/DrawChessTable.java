public class DrawChessTable {
  public static void main(String[] args) {

    for (int i = 0; i < 8; i++) {
      for (int j = i + 1; j < 8 + i + 1; j++) {
        if (j % 2 == 0) {
          System.out.print(" ");
        } else {
          System.out.print("%");
        }
      }
      System.out.println("");
    }
  }
}
