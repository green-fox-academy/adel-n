public class Plant {
  private String color;
  private String name;
  private int currentWater;

  public Plant() {
    this.color = "black";
    this.name = "flower";
    this.currentWater = (int) (Math.random() * 15);
  }

  public Plant(String color, String name) {
    this.color = color;
    this.name = name;
    this.currentWater = (int) (Math.random() * 15);

  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public int getCurrentWater() {
    return currentWater;
  }

    public void water(int water) {
    this.currentWater =+ water;
  }

  public boolean isThirsty (int level) {
    boolean result;
    if(this.currentWater < level) {
      result = true;
    } else {
      result = false;
    }
    return result;
  }
}
