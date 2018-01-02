package main.java.music;

public class Violin extends StringedInstrument {

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
    super.setName("Violin");
  }

  public Violin() {
    this.setName("Violin");
    this.setNumberOfStrings(4);
  }

  @Override
  String sound() {
    return "Screech";
  }
}
