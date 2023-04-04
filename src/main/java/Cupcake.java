import interfaces.IFilling;

public class Cupcake extends Cake implements IFilling {
    private String size;
    private boolean isCupcakeFilled;
    private String toppings;
    private String filling;

    public Cupcake(double price, double costToMake, String category, boolean glutenFreeAndVegan, int calories, String baseFlavour, String icingFlavour, String occasion,String size, boolean fillStatus, String topping, String filling) {
        super(price, costToMake, category, glutenFreeAndVegan, calories, baseFlavour, icingFlavour, occasion);
        this.size = size;
        this.isCupcakeFilled = fillStatus;
        this.toppings = topping;
        this.filling = filling;
    }
    public boolean addFilling(String filling){
        if(isCupcakeFilled){
            setFilling(filling);
        }
        return false;
    }

    public String getFilling(){
        return this.filling;
    }

    public void setFilling(String newFilling){
        this.filling = newFilling;
    }



}
