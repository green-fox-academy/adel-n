import java.util.Scanner;
public class PartyIndicator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");

        int a = input.nextInt();
        int b = input.nextInt();

        if (a == b && (a + b > 20)) {
            System.out.println("The party is excellent!");
        } else if ((a + b > 20) && a != b) {
            System.out.println("Quite cool party!");
        } else if (a + b < 20) {
            System.out.println("Average party...");
        } else if (a == 0) {
            System.out.println("Sausage party");
        }

    }
}
