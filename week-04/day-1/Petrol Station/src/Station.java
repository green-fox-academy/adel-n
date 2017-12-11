public class Station {
  int fullGasAmount;

  public void refill (Car car){
    fullGasAmount = car.capacity - car.gasAmount;
    car.setGasAmount();
  }

  public int getGasAmount (){
    return this.fullGasAmount;
  }
}
