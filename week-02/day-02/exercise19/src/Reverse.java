import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int [] aj = {3, 4, 5, 6, 7};
        int [] rev = new int [aj.length];

        for(int i = 0; i < aj.length; i++) {
            rev[(aj.length - i - 1)] = aj[i];
        }
        aj = rev;
        System.out.println(Arrays.toString(aj));
    }
}
