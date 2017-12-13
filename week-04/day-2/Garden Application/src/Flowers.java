public class Flowers extends Plant {

  public Flowers(String color, String name){
    super(color, name);

  }

  public Flowers() {

  }

  public boolean isThirsty(int level) {
    return super.isThirsty(level);
  }
}
