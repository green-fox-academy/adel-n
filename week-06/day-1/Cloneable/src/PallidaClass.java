import java.util.ArrayList;

public class PallidaClass {
  private String className;
  private ArrayList<Student> students;
  private ArrayList<Mentor> mentors;

  public PallidaClass(String className) {
    this.className = className;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  public void PallidaClass(String className){
  }

  public void addStudent(Student student){
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println(className + " class has " + students.size() + " students and " + mentors.size() + " mentors.");
  }
}
