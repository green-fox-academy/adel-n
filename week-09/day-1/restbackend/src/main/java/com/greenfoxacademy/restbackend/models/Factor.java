package com.greenfoxacademy.restbackend.models;

public class Factor {
  private int result;

  public Factor() {
  }

  public Factor(int result) {
    this.result = factorial(result);
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int factorial(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }
}
