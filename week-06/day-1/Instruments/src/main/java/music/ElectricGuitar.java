package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
    super.setName("Electric Guitar");
  }

  public ElectricGuitar() {
    this.setName("Electric Guitar");
    this.setNumberOfStrings(6);
  }

  @Override
  String sound() {
    return "Twangg";
  }
}
