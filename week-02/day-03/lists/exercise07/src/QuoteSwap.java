import java.util.*;
public class QuoteSwap {
    public static void main(String[] args) {
        ArrayList<String> list =
                new ArrayList<String>(Arrays.asList("What", "I", "do", "create", "I", "cannot", "not", "understand."));

        list.set(5, "do");
        list.set(2, "cannot");

        System.out.println(list);
    }
}
