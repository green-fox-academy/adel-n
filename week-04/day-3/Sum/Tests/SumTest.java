import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

  ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(0, 5, 10, 3));
  int result = 18;

  @Test
  public void Sum() {
    Sum sum1 = new Sum();
    assertEquals(result, sum1.sumsum(testList));

  }
}