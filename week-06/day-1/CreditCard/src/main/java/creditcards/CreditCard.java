package main.java.creditcards;

import java.util.Random;

public class CreditCard implements CreditCardy{
  private String codeAccount;
  private String nameCardholder;

  public CreditCard(String name) {
    this.nameCardholder = name;
    this.codeAccount = generateCodeAccount();
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
  public String toString() {
    return String.format("Name=%s CC#=%s CVV=%d", getNameCardholder(), getCodeAccount(), getSumCVV());
  }
}
