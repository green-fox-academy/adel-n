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
    int compare0 = compareDominoes.getValues()[0];
    int compare1 = compareDominoes.getValues()[1];

    if (this.getValues()[1] != compare0) {
      return this.getValues()[1] - compare1;
    } else {
      return this.getValues()[0] - compare0;
    }
  }
}
