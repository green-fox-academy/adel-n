public class Bird extends Animal {
  public Bird(String name, int age) {
    super(name);
  }

  public Bird(String name) {
    super(name);
  }

  @Override
  public String breed() {
    return "laying eggs";
  }

  @Override
  public String eat() {
    return "eating seed";
  }

  @Override
  public String move() {
    return "flying";
  }
}
