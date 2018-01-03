import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {
  public static void main(String[] args) {
  //Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes,
  // it's up to you how you name/create them! Write a Stream Expression to find the foxes with green color!
  // Write a Stream Expression to find the foxes with green color and pallida type!

    Fox fox1 = new Fox("foxy", "fennec", "yellow");
    Fox fox2 = new Fox("foxee", "forest", "red");
    Fox fox3 = new Fox("foxx", "polar", "yellow");
    Fox fox4 = new Fox("fox", "forest", "red");
    Fox fox5 = new Fox("foxxy", "polar", "white");
    Fox fox6 = new Fox("foxee", "fennec", "yellow");

    List<Fox> foxList = new ArrayList<>();
    foxList.add(fox1);
    foxList.add(fox2);
    foxList.add(fox3);
    foxList.add(fox4);
    foxList.add(fox5);
    foxList.add(fox6);

    System.out.println(getColorAndType(foxList));

    List<Fox> selectedList = foxList.stream()
            .filter(p -> p.getColor().equals("white"))
            .filter(q -> q.getType().equals("polar"))
            .collect(Collectors.toList());
    System.out.println(selectedList);
  }

  public static List<Fox> getColorAndType(List<Fox> input) {
    List<Fox> filteredList = new ArrayList<>();
    for (Fox element : input) {
      if (element.getColor().equals("white") && element.getType().equals("polar")) {
        filteredList.add(element);
      }
    }
    return filteredList;
  }
}
