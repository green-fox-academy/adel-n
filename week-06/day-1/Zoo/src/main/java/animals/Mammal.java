package main.java.animals;

public class Mammal extends Animal {
  public Mammal(String name, int age) {
    super(name);
  }

  public Mammal(String name) {
    super(name);
  }

  @Override
  public String breed() {
    return "pushing miniature versions out";
  }

  @Override
  public String eat() {
    return "eating plants";
  }

  @Override
  public String move() {
    return "running";
  }
}
