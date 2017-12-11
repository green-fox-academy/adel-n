public class Main {
  public static void main(String[] args) {

  Car trabant = new Car();
  Station omv = new Station();

  int inGas = 25;

    System.out.println("Fuel in car: " + inGas);
    omv.refill(trabant);
    System.out.println("Fuel used to refill tank: " + omv.fullGasAmount);
    System.out.println("Full capacity of tank: " + trabant.capacity);

  }
}
