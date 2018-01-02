public class Gnirts implements CharSequence {
  private String itsAString;

  public Gnirts(String itsAString) {
    this.itsAString = itsAString;
  }

  @Override
  public int length() {
    return itsAString.length();
  }

  @Override
  public char charAt(int index) {
    return itsAString.charAt(itsAString.length() - index - 1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return itsAString.subSequence(itsAString.length() - start, itsAString.length() - end);
  }

  public static void main(String[] args) {
    Gnirts g = new Gnirts("example");
    System.out.println(g.charAt(1));
    // should print out: l

    Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));
    // should print out: a
  }
}
