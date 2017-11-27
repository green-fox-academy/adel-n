public class FizzBuzz {
    public static void main(String[] args) {

        int a = 1;
        while (a <= 100) {

            if ((a % 3 == 0) && (a % 5 == 0)) {
                System.out.println("FizzBuzz");


            } else if (a % 5 == 0) {
                System.out.println("Buzz");

            } else if (a % 3 == 0) {
                System.out.println("Fizz");


            } else {
                System.out.println(a);
            }
            a++;
        }
    }
    }


