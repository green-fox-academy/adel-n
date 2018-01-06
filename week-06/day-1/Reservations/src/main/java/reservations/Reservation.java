package main.java.reservations;

import java.util.Random;

public class Reservation implements Reservationy{
  private String characters;
  private String[] dow;
  private String reservationCode;
  private String day;

  public Reservation() {
    this.characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    this.dow = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    this.reservationCode = getCodeBooking();
    this.day = getDowBooking();
  }

  public String getReservationCode() {
    return this.reservationCode;
  }

  public String getDay() {
    return this.day;
  }


  @Override
  public String getDowBooking() {
    int i = new Random().nextInt(7);
    return dow[i];
  }

  @Override
  public String getCodeBooking() {
    String code = "";
    for (int i = 0; i < 8; i++) {
      int element = new Random().nextInt(this.characters.length());
      code += characters.charAt(element);
    }
    return code;
  }

  @Override
  public String toString() {
    return "Booking# " + getCodeBooking() + " for " + getDay();
  }
}
