import java.util.*;
public class sortlist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(34, 12, 24, 9, 5));

        Collections.sort(list);

        boolean selector = false;

        if (selector == true) {
            descending(list);
        } else {
            ascending(list);
        }
    }

    public static void ascending(ArrayList<Integer>input) {
        System.out.println();
        for (int counter : input) {
            System.out.println(counter);
        }
    }

    public static void descending(ArrayList<Integer>input) {
        Collections.sort(input, Collections.reverseOrder());
        System.out.println();
        for (int counter : input) {
            System.out.println(counter);

        }
    }
}




