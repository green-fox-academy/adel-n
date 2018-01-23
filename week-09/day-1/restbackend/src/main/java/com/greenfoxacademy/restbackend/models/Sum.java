package com.greenfoxacademy.restbackend.models;

public class Sum {
  private int result;

  public Sum() {
  }

  public Sum(int result) {
    this.result = sum(result);
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public static int sum (int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + sum (n-1);
    }
  }
}
