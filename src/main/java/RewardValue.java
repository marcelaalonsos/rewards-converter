public class RewardValue {
    private final double cash;
    public static final double miles = 0.0035;

    public RewardValue(double cashVal) {
        this.cash = cashVal;
    }

    public RewardValue( int milesVal) {
      this.cash = convertMilesToCash(milesVal);
    }

    private static int convertCashToMiles(double cashVal) {
      return (int) (cashVal / miles);
    }

    private static double convertMilesToCash(int milesVal) {
      return milesVal * miles;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return convertCashToMiles(this.cash);
    }
}
