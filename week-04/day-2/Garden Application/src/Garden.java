import java.util.ArrayList;

public class Garden {
  private String secretGarden;
  private ArrayList<Plant> plants;

  public Garden(String secretGarden) {
    plants = new ArrayList<>();
    this.secretGarden = secretGarden;
  }

  public Garden() {

  }

  public void addList(Plant plant) {
    plants.add(plant);
  }

  public void getInfo() {
    for(Plant plant : plants) {
      System.out.println(plant.getColor() + " " + plant.getName() + " water level is " + plant.getCurrentWater());
    }
  }

  public Plant getPlant(int i) {
    return plants.get(i);
  }

  public ArrayList<Plant> getPlants() {
    return plants;
  }

  public int counter() {
    int counterA = 0;
    for(int i = 0; i < this.getPlants().size(); i++){
      if(this.getPlant(i).isThirsty(5)) {
        counterA ++;
      }
    }
    return counterA;
  }

  public void waterGarden(int water) {
    int portion = water/counter();
    for(int i = 0; i < this.getPlants().size(); i++) {
      if(getPlant(i).isThirsty(5)) {
        this.getPlant(i).water(portion);
      }
    }
  }
}
