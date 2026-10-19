import java.util.ArrayList;
import java.util.List;

public class Order{

        public String customerName;
        public String customerType;//"REGULAR", "PREMIUM", "VIP" -- a string, not even a type
        public List<String>itemNames=new ArrayList<>();
        public List<Double> itemPrices-new ArrayList<>();


        public double calculateTotal(){

            double total=0;
            for(double price :itemPrices)total+=price;

            if (customerType.equals("REGULAR")) {
                // no discount
            } else if (customerType.equals("PREMIUM")) {
                total = total * 0.9;
            } else if (customerType.equals("VIP")) {
                total = total * 0.8;
            }
            return total;
        }
        public void printInvoice(){
            System.out.println("Invoice for "+ customerName);
            for(int i=0;i<itemNames.size();i++){
                System.out.println(itemNames.get(i)+": $"+itemPrices.get(i));
            }
            System.out.println("Total: $"+calculateTotal());
        }
        public void sendEmailReceipt(){
            EmailSender sender=new EmailSender();
            sender.send(customerName,"Your invoice total is $"+calculateTotal());
        }
        public void saveToDatabase(){
            System.out.println("Saving order to database...");
        }
}