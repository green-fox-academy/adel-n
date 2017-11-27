import java.util.Scanner;
public class OneTwoALot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int a = input.nextInt();

        if (a <= 0) {
            System.out.println("Not enough");
        } else if (a == 1) {
            System.out.println("One");
        } else if (a == 2) {
            System.out.println("Two");
        } else if (a > 2) {
            System.out.println("A lot");
        }

    }
}
