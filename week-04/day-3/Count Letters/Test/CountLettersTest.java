import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {
  @Test
  public void countLetters() throws Exception{
   String input = "green";

    CountLetters test = new CountLetters();
    test.countLetters(input);
    assertEquals(1, test.countLetters(input).get("e").intValue());

  }
}