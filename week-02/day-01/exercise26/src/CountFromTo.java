import java.util.Scanner;
public class CountFromTo {
    public static void main(String[] args) {
// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
// If it is bigger it should count from the first number to the second by one

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");

        int a = input.nextInt();
        int b = input.nextInt();

        if (b>a){
           int i = a;
           while (i <= b) {
               System.out.println(i);
               i = i + 1;
           }
        }

        else {
            System.out.println("The second number should be bigger");
        }
    }
}
