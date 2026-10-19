import java.util.ArrayList;
import java.util.List;

// SRP fix: Order now only holds order data. It doesn't calculate,
// print, email, or save itself.
public class Order {

    public final String customerName;
    public final CustomerType customerType;//"REGULAR", "PREMIUM", "VIP" -- a string, not even a type
    public final List<OrderItem> item = new ArrayList<>();

    public Order (String customerName, CustomerType customerType) {
        this.customerName = customerName;
        this.customerType = customerType;
    }
    public void addItem(OrderItem item) {
        this.item.add(item);
    }
    public List<OrderItem> getItems() {
        return List.copyOf(item);
    }

    public String getCustomerName() {
        return customerName;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }
    }