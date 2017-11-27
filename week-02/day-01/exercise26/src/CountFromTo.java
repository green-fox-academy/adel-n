import java.util.Scanner;
public class CountFromTo {
    public static void main(String[] args) {

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
