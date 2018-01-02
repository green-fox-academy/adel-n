package main.java.animals;

public class Reptile extends Animal {
  public Reptile(String name, int age) {
    super(name);
  }

  public Reptile(String name) {
    super(name);
  }

  @Override
  public String breed() {
    return "laying eggs";
  }

  @Override
  public String eat() {
    return "eating insects";
  }

  @Override
  public String move() {
    return "crawling";
  }
}
