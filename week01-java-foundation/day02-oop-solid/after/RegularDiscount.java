public class RegularDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double rawTotal) {
        // Regular customers get no discount
        return rawTotal;
    }
}