package com.greenfoxacademy.restbackend.models;

public class ArrayObject {
  private String what;
  private int[] numbers;

  public ArrayObject() {
  }

  public ArrayObject(String what, int[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

  public int sum() {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum = sum + numbers[i];
    }
    return sum;
  }

  public int multiply() {
    int sum = 1;
    for (int i = 0; i < numbers.length; i++) {
      sum = sum * numbers[i];
    }
    return sum;
  }

  public int[] doubleNumbers() {
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = numbers[i] * 2;
    }
    return numbers;
  }
}
