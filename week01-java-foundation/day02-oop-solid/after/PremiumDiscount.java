public class PremiumDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double rawTotal) {
        return rawTotal * 0.9; // 10% discount for premium customers
    }
}