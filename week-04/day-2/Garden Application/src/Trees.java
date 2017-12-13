public class Trees extends Plant {
 // private int initWaterTree;

  public Trees(String color, String name) {
    super(color, name);
 }

  public Trees() {

  }

  public void water(int water) {
    super.water((int)(water*0.4));
  }

  public boolean isThirsty(int level) {
    return super.isThirsty(level * 2);
  }
}
