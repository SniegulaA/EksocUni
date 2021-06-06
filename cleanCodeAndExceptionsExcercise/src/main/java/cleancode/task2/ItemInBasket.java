package cleancode.task2;

public class ItemInBasket {
    private double itemPrice;
    private int quantity;
    private boolean isSpecialItem;

    public double getPrice(){
        double basePrice = quantity*itemPrice;
        double discountFactor;
        if(basePrice>1000) {
            discountFactor = 0.8;
        }
        else {
            discountFactor = 1.0;
        }
        double tax;
        if(isSpecialItem){
            tax= 0.08;
        }else{
            tax = 0.23;
        }
        return basePrice * discountFactor * tax;
    }

    public double getPriceCleanCode(){
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
