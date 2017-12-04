import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
  public static void main(String[] args) {
// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
    String source2 = "test1.txt";
    String target2 = "test2.txt";

    copyFile(source2, target2);
    if(copyFile(source2, target2)){
      System.out.println("yaay");
    } else{
      System.out.println("nooa");
    }
  }

  public static boolean copyFile(String path, String fileName){
    boolean result = true;
    try{
      Path source = Paths.get(path);
      Path target = Paths.get(fileName);
      Files.copy(source, target);
  } catch (Exception e) {
      result = false;
    }
    return result;
  }
}


