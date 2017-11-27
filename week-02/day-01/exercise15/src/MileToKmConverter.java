import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a distance in kilometers, for example: 11 ");

       double km = input.nextDouble();
       double miles = km * 0.621;

        System.out.println("Distance in miles: " + miles);

    }
}
