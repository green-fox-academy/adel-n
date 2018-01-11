package com.greenfoxacademy.hellobeanworld.services.colors;

import com.greenfoxacademy.hellobeanworld.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;

public class BlueColor implements MyColor {
  @Autowired
  Printer printer;

  @Override
  public void printColor() {
   printer.log("It is blue in color...");
  }
}
