import java.util.Scanner;
public class Factorio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int number = input.nextInt();

        System.out.println(factorio(number));

    }

    public static int factorio(int input) {

        int fact = input;
        for(int i = (input-1); i > 1; i--){
            fact = fact * i;

        }
        return fact;
    }
}
