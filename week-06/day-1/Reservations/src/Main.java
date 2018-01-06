import main.java.reservations.*;

public class Main {
  public static void main(String[] args) {
    int reservationCount = 10;

    for (int i = 0; i < reservationCount; i++) {
      Reservation reservations = new Reservation();
      System.out.println(reservations.toString());
    }
  }
}
