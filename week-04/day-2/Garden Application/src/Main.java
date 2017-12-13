public class Main {
  public static void main(String[] args) {

    Plant tulip = new Flowers("yellow", "tulip");
    Plant rose = new Flowers("blue", "rose");
    Plant pine = new Trees("purple", "pine");
    Plant beech = new Trees("orange", "beech");

    Garden garden = new Garden("garden");
    garden.addList(tulip);
    garden.addList(rose);
    garden.addList(pine);
    garden.addList(beech);

    garden.getInfo();

    System.out.println(garden.counter());

    garden.waterGarden(40);
    System.out.println("Watering with " + 40);

    garden.getInfo();

    garden.counter();

    garden.waterGarden(70);
    System.out.println("Watering with " + 70);

    garden.getInfo();

    garden.counter();

  }
}
