public class Shifter implements CharSequence {
  private String toBeShifted;
  private int howManyToShift;

  public Shifter(String toBeShifted, int howManyToShift) {
    this.toBeShifted = toBeShifted;
    this.howManyToShift = howManyToShift;
  }

  @Override
  public int length() {
    return toBeShifted.length();
  }

  @Override
  public char charAt(int index) {
    return toBeShifted.charAt(index + howManyToShift);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return toBeShifted.subSequence(start, end);
  }
}
