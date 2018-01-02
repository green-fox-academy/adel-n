import java.util.List;

public class Thing implements Comparable<Thing> {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing compareThing) {
    boolean completeStatus = compareThing.completed;
    String descriptionStatus = compareThing.name;

    if(this.completed && !completeStatus) {
      return -1;
    } else if (!this.completed && completeStatus) {
      return 1;
    } else {
      return this.name.compareTo(descriptionStatus);
    }
  }
}
