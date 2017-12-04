import java.util.*;
public class QuoteSwap {
    public static void main(String[] args) {
        ArrayList<String> list =
                new ArrayList<String>(Arrays.asList("What", "I", "do", "create", "I", "cannot", "not", "understand."));

        Collections.swap(list, 5, 2);
        System.out.println(list);
    }
}
