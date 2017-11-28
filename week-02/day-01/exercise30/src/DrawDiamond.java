import java.util.Scanner;
public class DrawDiamond  {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int a = input.nextInt();

       for (int i=1; i<= a; i += 2)
        {
            for (int k=0; k < (a - i / 2); k++)
            {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");

        }


        for (int i = a - 2; i > 0; i-=2) {

            for (int k = 0; k <= (a - i) / 2 + 2; k++) {
              System.out.print(" ");
        }
            for (int j = 0; j < i; j++) {
              System.out.print("*");
        }
          System.out.println("");
    }
    }
}