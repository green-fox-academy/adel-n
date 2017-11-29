import java.util.Arrays;

public class SwapElements {

    public static void main(String[] args) {

        String [] abc = {"first", "second", "third"};
        String [] cba = {"first", "second", "third"};

        abc[0] = abc[2];
        abc[2] = cba[0];

        System.out.println(Arrays.toString(abc));

    }
}
