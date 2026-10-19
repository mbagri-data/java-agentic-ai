public class InvoiceCalculator implements Calculable {
    @Override
    public double calculateTotal(Order order, DiscountStrategy discountStrategy) {
        double rawTotal = order.getItems().stream()
                .mapToDouble(OrderItem::price)
                .sum();
        return discountStrategy.applyDiscount(rawTotal);
    }
}