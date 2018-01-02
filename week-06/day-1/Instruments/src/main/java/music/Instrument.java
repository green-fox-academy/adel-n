package main.java.music;

public abstract class Instrument {
  private String name;

  public Instrument(String name) {
    this.name = name;
  }

  public Instrument() {
    this.name = "Instrument";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  abstract void play();

}
