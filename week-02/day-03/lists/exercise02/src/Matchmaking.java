import java.util.*;
public class Matchmaking {

    public static void main(String[] args) {


    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
    ArrayList<String> order = new ArrayList<String>();


    for(int i = 0; i < girls.size(); i++) {

        if (i%2 == 0) {
            order.add(i, girls.get(i));
        }
        else {
            order.add(i, boys.get(i));
        }

    }
            order.add("Jeff");
        System.out.println(order);
    }
}
