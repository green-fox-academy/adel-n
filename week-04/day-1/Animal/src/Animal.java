public class Animal {
  int hunger = 50;
  int thirst = 50;

  public void eat () {
    hunger--;
  }

  public void drink () {
    thirst--;
  }

  public void play () {
    hunger++;
    thirst++;
  }

  public int getHunger() {
    return this.hunger;
  }

  public int getThirst() {
    return this.thirst;
  }

  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.drink();
    animal.drink();
    animal.eat();
    animal.play();

    System.out.println("Hunger: " + animal.getHunger());
    System.out.println("Thirst: " + animal.getThirst());
  }
}
