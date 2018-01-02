package main.java.music;

public abstract class StringedInstrument extends Instrument {
  private int numberOfStrings;

  public StringedInstrument(int numberOfStrings) {
    super();
    this.numberOfStrings = numberOfStrings;
  }

  public StringedInstrument() {

  }

  public int getNumberOfStrings() {
    return numberOfStrings;
  }

  public void setNumberOfStrings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  abstract String sound();


  @Override
  public void play() {
    System.out.println(getName() + ", a " + getNumberOfStrings() + "-stringed instrument that goes " + sound().toString());
  }
}
