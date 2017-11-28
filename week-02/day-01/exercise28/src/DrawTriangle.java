import java.util.Scanner;
public class DrawTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int a = input.nextInt();

        for (int i=0; i<=a; i++)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
