import main.java.animals.*;

public class Zoo {
  public static void main(String[] args) {

    Reptile crocodile = new Reptile("Crocodile");
    Mammal koala = new Mammal("Koala");
    Bird parrot = new Bird("Parrot");

    System.out.println("How do you breed?");
    System.out.println("A " + crocodile.getName() + " is breeding by " + crocodile.breed());
    System.out.println("A " + koala.getName() + " is breeding by " + koala.breed());
    System.out.println("A " + parrot.getName() + " is breeding by " + parrot.breed() + "\n");

    System.out.println("How do you move?");
    System.out.println("A " + crocodile.getName() + " is " + crocodile.move());
    System.out.println("A " + koala.getName() + " is " + koala.move());
    System.out.println("A " + parrot.getName() + " is " + parrot.move() + "\n");

    System.out.println("What do you eat?");
    System.out.println("A " + crocodile.getName() + " is " + crocodile.eat());
    System.out.println("A " + koala.getName() + " is " + koala.eat());
    System.out.println("A " + parrot.getName() + " is " + parrot.eat() + "\n");
  }
}
