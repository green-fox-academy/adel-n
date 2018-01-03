import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
  public static void main(String[] args) {
  //Write a Stream Expression to find the strings which starts with A and ends with I in the following array:

    List<String> cities = new ArrayList<>(Arrays.asList
            ("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    System.out.println(getStartsWithAEndsWithI(cities));

    List<String> filteredCities = cities.stream()
            .filter(x -> x.startsWith("A"))
            .filter(y -> y.endsWith("I"))
            .collect(Collectors.toList());
    System.out.println(filteredCities);
  }

  public static List<String> getStartsWithAEndsWithI(List<String> cities) {
    List<String> filteredList = new ArrayList<>();

    for (String string : cities) {
      if (string.charAt(0) == 'A' && string.charAt(string.length() - 1) == 'I') {
        filteredList.add(string);
      }
    }
    return filteredList;
  }
}
