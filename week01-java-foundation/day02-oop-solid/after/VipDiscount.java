public class VipDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double rawTotal) {
        return rawTotal * 0.8; // 20% discount for VIP customers
    }
}