import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
  Fibonacci testFibonacci = new Fibonacci();


  @Test
  public void fibonacci() throws Exception{
    int n = 3;
    assertEquals(2, testFibonacci.fibonacci(n));
  }
}