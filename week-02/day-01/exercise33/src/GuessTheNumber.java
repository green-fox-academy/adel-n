import java.util.Scanner;
public class GuessTheNumber {

    public static void main(String[] args) {

        int number = 5;

        System.out.println("Guess the number: ");

        do {
        Scanner input = new Scanner(System.in);

        int guess = input.nextInt();

            if(guess > number){
                System.out.println("The stored number is lower");
            }
            else if(guess < number) {
                System.out.println("The stored number is higher");
            }
            else if(guess == number) {
                System.out.println("You found the number: " + number);
                break;
            }
        } while (number == 5);
    }

}
