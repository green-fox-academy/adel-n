import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs the farmer has
    // It should print how many legs all the animals have

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");

        int chicken = input.nextInt();
        int pigs = input.nextInt();

        System.out.println((chicken * 2) + (pigs * 4));
    }
}
