import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
// create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number: ");

    int divisor = input.nextInt();

    try {
      int result = 10/divisor;
      System.out.println(result);
    } catch (ArithmeticException e){
      System.out.println("fail");
    }
  }
}
