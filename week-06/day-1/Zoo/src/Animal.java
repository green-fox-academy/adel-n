public abstract class Animal {
  private String name;
  private int age;
  private String gender;

  public Animal(String name) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public abstract String breed();

  public abstract String eat();

  public abstract String move();


}
