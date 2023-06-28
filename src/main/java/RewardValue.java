public class RewardValue {
  double cash;
  double miles;

  RewardValue(double valInCash) {
    this.cash = valInCash;
  }

  public void getCashValue() {
    System.out.println(this.cash);
  }

  public double getMilesValue() {
    return this.cash *= 0.0035;
  }
}
