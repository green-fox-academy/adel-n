public class Car {
  int gasAmount;
  int capacity;

  public Car () {
    this.capacity = 100;
    this.gasAmount = 30;
  }

  public Car (int gasAmount, int capacity){
    this.capacity = capacity;
    this.gasAmount = gasAmount;

  }

  public int gasAmount (){
    return this.gasAmount;

  }

  public int capacity () {
    return this.capacity;

  }

  public void setGasAmount() {
    this.gasAmount = capacity;
  }
}
