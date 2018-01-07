import main.java.creditcardreservations.CreditCardReservation;

public class CreditCardReservationApp {
  public static void main(String[] args) {
    int reservationCount = 10;

    for (int i = 0; i < reservationCount; i++) {
      CreditCardReservation card = new CreditCardReservation("DEF" + i);
      System.out.println(card.toString());
    }
  }
}
