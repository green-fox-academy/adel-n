import java.util.*;
public class GuessTheNumber {

    public static void main(String[] args) {

        System.out.println("Please enter a min and max number for a random number: ");
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        int min = input1.nextInt();
        int max = input2.nextInt();

        int number = (int) (Math.random() * (max - min)) + min;
        int lives = 5;

        System.out.println("I've the number between " + min + " and " + max +  " you have 5 lives: ");

        do {
            Scanner input = new Scanner(System.in);

            int guess = input.nextInt();

            if(guess > number){
                lives--;
                System.out.println("Too high. You have " + lives + " lives left.");
            }
            else if(guess < number) {
                lives --;
                System.out.println("Too low. You have " + lives + " lives left.");
            }
            else if(guess == number) {
                System.out.println("Congratulations. You won!");
                break;
            }
        } while (lives > 0);
    }
}
