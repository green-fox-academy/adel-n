import java.util.Scanner;
public class Sum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int number = input.nextInt();

        System.out.println(sum(number));

    }

    public static int sum(int input){
        int i = 1;
        int summ = 0;

        while( i <= input){
            summ = summ + i;
            i = i + 1;
        }
        return summ;
    }
}
