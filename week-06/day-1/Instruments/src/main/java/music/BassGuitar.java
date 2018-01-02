package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
    super.setName("Bass Guitar");
  }

  public BassGuitar() {
    this.setName("Bass Guitar");
    this.setNumberOfStrings(4);
  }

  @Override
  String sound() {
    return "Duum-duum-duum";
  }
}
