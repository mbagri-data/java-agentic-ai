
public interface OrderOperations {
    double calculateTotal();
    void printInvoice();
    void sendEmailReceipt();
    void saveToDatabase();
    void refund();
    void applyCoupon(String code);
}