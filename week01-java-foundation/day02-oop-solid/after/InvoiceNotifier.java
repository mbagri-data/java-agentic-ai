public class InvoiceNotifier implements Notifiable {
    public final NotificationChannel channel;

    public InvoiceNotifier(NotificationChannel channel) {
        this.channel = channel;
    }

    @Override
    public void notifyCustomer(Order order, double total) {
        String message = "Hi " + order.getCustomerName() + ", your invoice total is " + total + ".";
        channel.sendNotification(order.getCustomerName(), message);
    }

}