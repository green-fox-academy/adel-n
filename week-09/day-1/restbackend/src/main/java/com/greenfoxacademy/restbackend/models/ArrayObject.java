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

  public void sum(int[] numbers) {

  }

  public void multiply() {

  }
}
