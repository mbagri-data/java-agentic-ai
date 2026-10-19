public class InvoicePrinter implements Printable {
    @Override
    public void print(Order order, double total) {
        System.out.println("Customer Name: " + order.getCustomerName());
        System.out.println("Items:");
        for (OrderItem item : order.getItems()) {
            System.out.println(" - " + item.name() + ": " + item.price());
        }
        System.out.println("Total: " + total);
    }

}