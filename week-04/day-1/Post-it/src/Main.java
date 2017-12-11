public class Main {

  public static void main(String[] args) {
    PostIt postit1 = new PostIt();
    postit1.backgroundColor = "Orange";
    postit1.textColor = "Blue";
    postit1.text = "Idea 1";

    PostIt postit2 = new PostIt();
    postit2.backgroundColor = "Pink";
    postit2.textColor = "Black";
    postit2.text = "Awesome!";

    PostIt postit3 = new PostIt();
    postit3.backgroundColor = "Yellow";
    postit3.textColor = "Green";
    postit3.text = "Superb!";

    System.out.println("This is a post-it with " + postit1.backgroundColor+ " background color, " + postit1.textColor
            + " text color, that says " + postit1.text);
    System.out.println("This is a post-it with " + postit2.backgroundColor+ " background color, " + postit2.textColor
            + " text color, that says " + postit2.text);
    System.out.println("This is a post-it with " + postit3.backgroundColor+ " background color, " + postit3.textColor
            + " text color, that says " + postit3.text);

  }
}
