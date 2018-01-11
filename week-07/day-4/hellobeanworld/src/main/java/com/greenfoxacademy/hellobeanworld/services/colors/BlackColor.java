package com.greenfoxacademy.hellobeanworld.services.colors;

import com.greenfoxacademy.hellobeanworld.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;

public class BlackColor implements MyColor {
  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("It is black in color...");
  }
}
