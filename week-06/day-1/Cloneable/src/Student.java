public class Student extends Person implements Cloneable {
  private String previousOrganization;
  private int skippedDays;


  public void introduce(){
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " +
            previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  public void skippedDays(int numberOfDays){
    this.skippedDays += numberOfDays;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public Student() {
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public Student clone()  {
    try {
      return (Student)super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }

  public static void main(String[] args) {
    Student john = new Student("John Doe", 20, "male", "BME");
    Student johnTheClone = john.clone();

    johnTheClone.introduce();
  }
}
