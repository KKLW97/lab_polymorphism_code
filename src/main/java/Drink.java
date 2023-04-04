import interfaces.ISell;

public class Drink implements ISell {

    private double price;
    private double costToMake;
    public Drink(double price, double cost){
        this.price = price;
        this.costToMake = cost;
    }

//    @Override
//    public void calculateMargin() {
//
//    }
}
