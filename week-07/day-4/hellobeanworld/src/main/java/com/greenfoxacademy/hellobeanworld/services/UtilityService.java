package com.greenfoxacademy.hellobeanworld.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
  ArrayList<String> colors;
  Random random;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public String validateEmail(String input) {
    if (input.contains("@") && input.contains(".")) {
      return "is@this.valid is a valid email address";
    } else {
      return "not_valid_email.com is not a valid email";
    }
  }
}
