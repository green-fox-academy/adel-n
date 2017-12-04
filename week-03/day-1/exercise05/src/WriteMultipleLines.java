import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
  public static void main(String[] args) {
// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the path of file: ");
    String path = input.nextLine();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Please enter a word: ");
    String word = input2.nextLine();

    Scanner input3 = new Scanner(System.in);
    System.out.println("Please enter how many lines the file should have: ");
    int number = input3.nextInt();

    List<String> content = new ArrayList();

    try {
      Path filePath = Paths.get(path);
      for(int i = 0; i < number; i++) {
        content.add(word);
        Files.write(filePath, content);
        System.out.println();
      }
    } catch (Exception e){
      System.out.println();
    }
  }
}
