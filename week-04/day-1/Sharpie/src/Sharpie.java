public class Sharpie {
  String color;
  float width;
  float inkAmount = 100;

  public void use(int use) {
    inkAmount -= use;
  }

  public Sharpie (String color, float width){
    this.color = color;
    this.width = width;
  }

  public static void main(String[] args) {
    Sharpie sharpie = new Sharpie("red", 300);
    sharpie.use(10);
    System.out.println(sharpie.inkAmount);
  }
}
