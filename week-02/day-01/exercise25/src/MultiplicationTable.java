import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");

        int a = input.nextInt();

        System.out.println("Multiplication table of " + a + "is: ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "x" + i + "=" + (a*i));
        }
    }
}
