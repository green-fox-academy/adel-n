import java.util.*;
public class unique {
    public static void main(String[] args) {

       // Collection I = (1, 11, 34, 11, 52, 61, 1, 34);
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 11, 34, 11, 52, 61, 1, 34));

        Set<Integer> list1 = new LinkedHashSet<>(list);

        list1.addAll(list);
        list.clear();
        list.addAll(list1);

        System.out.println(list1);

    }
}




