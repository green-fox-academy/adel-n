import java.util.Scanner;
public class Printer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        String parameter = input.nextLine();

        System.out.print(print(parameter));
    }

    public static String print(String input){

        return input;
    }
}
