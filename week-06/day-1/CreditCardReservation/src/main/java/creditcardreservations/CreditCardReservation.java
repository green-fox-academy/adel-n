package main.java.creditcardreservations;

import java.util.Random;

public class CreditCardReservation implements Reservationy, CreditCardy{
  private String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";;
  private String[] dow = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  private String reservationCode;
  private String day;
  private String codeAccount;
  private String nameCardholder;

  public CreditCardReservation(String name) {
    this.nameCardholder = name;
    this.codeAccount = generateCodeAccount();
    this.day = getDowBooking();
    this.reservationCode = getCodeBooking();
  }

  public String generateCodeAccount() {
    String accountNumber = "";
    Random randomNumber = new Random();
    for (int i = 0; i < 16; i++) {
      accountNumber += randomNumber.nextInt(9);
    }
    return accountNumber;
  }

  @Override
  public int getSumCVV() {
    return cumeSumCVV(codeAccount);
  }

  @Override
  public String getNameCardholder() {
    return this.nameCardholder;
  }

  @Override
  public String getCodeAccount() {
    return this.codeAccount;
  }

  @Override
  public int cumeSumCVV(String codeAccount) {
    int sum = 0;
    for (int i = 0; i < codeAccount.length(); i++) {
      sum += Character.getNumericValue(codeAccount.charAt(i));
    }
    return sum;
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
    return String.format("Booking# %s for %s paid by NAME=%s CC#=%s CVV=%d", getCodeBooking(), getDowBooking(), getNameCardholder(), getCodeAccount(), getSumCVV());
  }
}
