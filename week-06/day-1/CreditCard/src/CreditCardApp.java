import main.java.creditcards.CreditCard;

public class CreditCardApp {
  public static void main(String[] args) {
    int creditCardCount = 10;

    for (int i = 0; i < creditCardCount; i++) {
      CreditCard card = new CreditCard("ABC" + i);
      System.out.println(card.toString());
    }
  }
}
