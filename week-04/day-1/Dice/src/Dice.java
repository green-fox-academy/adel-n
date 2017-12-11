import java.util.Arrays;

public class Dice {
//    You have a Dice class which has 6 dice
//    You can roll all of them with roll()
//    Check the current rolled numbers with getCurrent()
//    You can reroll with reroll()
//    Your task is to get where all dice is a 6
  public int [] Dice(){
    return dices;
  }


  int[] dices = new int[6];

  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }


  public static void main(String[] args) {
    Dice myDice = new Dice();

    myDice.roll();
    myDice.getCurrent();
    System.out.println(Arrays.toString(myDice.getCurrent()));
    int counter = 0;

    for (int i = 0; i < 6; i++){
      if (myDice.dices[i] != 6){
        while (myDice.dices[i] != 6){
          counter++;
          myDice.getCurrent(i);
          myDice.reroll(i);
        }
      }
    }

    System.out.println(Arrays.toString(myDice.getCurrent()));
    System.out.println("Rolls: " + counter);
  }
}
