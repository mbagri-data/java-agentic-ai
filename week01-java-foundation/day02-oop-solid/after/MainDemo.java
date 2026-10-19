public class MainDemo {
    public static void main(String[] args) {
        Order order = new Order("Manisha", CustomerType.VIP);
        order.addItem(new OrderItem("Keyboard", 75.00));
        order.addItem(new OrderItem("Monitor", 250.00));

        DiscountStrategy discountStrategy = getDiscountStrategy(order.getCustomerType());
        InvoiceCalculator invoiceCalculator = new InvoiceCalculator();
        double total = invoiceCalculator.calculateTotal(order, discountStrategy);

        InvoicePrinter invoicePrinter = new InvoicePrinter();
        invoicePrinter.print(order, total);

        InvoiceNotifier invoiceNotifier = new InvoiceNotifier(new EmailNotificationChannel());
        invoiceNotifier.notifyCustomer(order, total);

    }

    private static DiscountStrategy getDiscountStrategy(CustomerType customerType) {
        return switch (customerType) {
            case VIP -> new VipDiscount();
            case PREMIUM -> new PremiumDiscount();
            case REGULAR -> new RegularDiscount();
        };
    }
}
