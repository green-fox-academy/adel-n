import java.util.ArrayList;

public class Sum {
  private static int total;
  private ArrayList<Integer> myList;

  public Sum(ArrayList<Integer> myList) {
    this.myList = myList;
  }

  public Sum() {

  }

  public ArrayList<Integer> getList() {
    return myList;
  }

  public int sumsum(ArrayList<Integer> myList){
    int total = 0;
    for(int i = 0; i < myList.size(); i++){
      total = total + (int)(myList.get(i));
    }
    return total;
  }
}


