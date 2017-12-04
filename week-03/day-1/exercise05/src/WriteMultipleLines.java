import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the path of file: ");
    String path = input.nextLine();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Please enter a word: ");
    String word = input2.nextLine();

    Scanner input3 = new Scanner(System.in);
    System.out.println("Please enter how many lines the file should have: ");
    int number = input3.nextInt();

    word.add

    try {
      Path path1 = Paths.get(path);
      Files.write(path1, word);

    } catch (Exception e){
      System.out.println();
    }


  }
}
