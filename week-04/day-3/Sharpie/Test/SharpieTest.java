import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {

  Sharpie sharpie =  new Sharpie();

  @Test
  void use() {
    int inkAmount = 100;
    sharpie.use(inkAmount);
    assertEquals(90, sharpie.use(inkAmount));
  }
}