import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {
  private Apple apple = new Apple("Apple");


  @Test
  void getName() {
    assertEquals("Apple", apple.getName());
  }
}