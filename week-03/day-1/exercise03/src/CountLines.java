import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {
  public static void main(String[] args) {
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a filename: ");

    String fileName = input.nextLine();

    try{
      Path filePath = Paths.get(fileName);
      List<String> lines = Files.readAllLines((filePath), Charset.defaultCharset());
      int noOfLines = lines.size();
      System.out.println(noOfLines);
    } catch (Exception e){
      System.out.println(0);
    }
  }
}
