import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

  @Test
  void isAnagram() {
    Anagram testAnagram = new Anagram();
    String string1 = "silent";
    String string2 = "listen";
    assertTrue(testAnagram.isAnagram(string1, string2));
  }
}