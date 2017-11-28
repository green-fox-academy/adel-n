import java.util.Scanner;
public class Factorio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int number = input.nextInt();

        System.out.println(factorio(number));

    }

    public static int factorio(int input) {
        int i = 1;
        int fact = 1;

        while(i <= input) {
            fact = fact * i;
            i = i + 1;

        }
        return fact;
    }
}
