public class RewardValue {
    private final double cash;
    public static final double miles = 0.0035;

    public RewardValue(double cashVal) {
        this.cash = cashVal;
    }

    public double getCashValue() {
        return this.cash;
    }

    public int getMilesValue() {
        return (int) (this.cash / miles);
    }
}
