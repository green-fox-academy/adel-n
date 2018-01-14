package com.greenfoxacademy.hellobeanworld.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
  ArrayList<String> colors;
  Random random;
  private String email;
  private boolean isValid;
  private String ceasarText;
  private int number;
  String coded;


  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
    isValid = true;
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public void validateEmail(String input) {
    if (input.contains("@") && input.contains(".")) {
      setEmail(input + " is a valid email address");
      setValidEmail(true);
    } else {
      setEmail(input + " is not a valid email");
      setValidEmail(false);
    }
  }

  public void initialiseEmail() {
    setEmail("Enter Email");
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public boolean isValid() {
    return isValid;
  }

  public void setValidEmail(boolean isValid) {
    this.isValid = isValid;
  }

  public String caesarTranslate(String text, int number) {
    String result = "";
    for(int i = 0; i < text.length(); i++) {
      result += (char)((int)text.charAt(i) + number);
    }
    coded = result;
    return result;
  }

  public String getCoded() {
    return coded;
  }

  public void setCoded(String coded) {
    this.coded = coded;
  }

  public String getCeasarText() {
    return ceasarText;
  }

  public void setCeasarText(String ceasarText) {
    this.ceasarText = ceasarText;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }
}
