public class Domino implements Comparable<Domino> {
  int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[] {valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }

  @Override
  public int compareTo(Domino compareDominoes) {
    return Integer.compare(this.getValues()[0], compareDominoes.getValues()[1]);
  }
}
