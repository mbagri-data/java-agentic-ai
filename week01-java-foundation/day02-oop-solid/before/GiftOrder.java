
public class GiftOrder extends Order{
    @Override
    public double calculateTotal(){
        throw new UnsupportedOperationException("Gift orders do not support total calculation.");
    }
}