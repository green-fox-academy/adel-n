public class Sharpie {
  String color;
  int width;
  int inkAmount = 100;

  public Sharpie() {

  }


  public static void main(String[] args) {
    Sharpie sharpie = new Sharpie("red", 300);
    sharpie.use(100);
    System.out.println(sharpie.inkAmount);
  }


  public int use(int inkAmount) {
    this.inkAmount = inkAmount - 10;
    return this.inkAmount;
  }

  public Sharpie (String color, int width){
    this.color = color;
    this.width = width;
  }
}
