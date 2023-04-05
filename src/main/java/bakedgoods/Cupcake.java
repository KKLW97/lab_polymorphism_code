package bakedgoods;

import enums.BaseFlavours;
import enums.IcingFlavour;
import interfaces.IFilling;

public class Cupcake extends Cake implements IFilling {
    private boolean isCupcakeFilled;
    private String toppings;
    private String filling;

    public Cupcake(double price, double costToMake, String category, boolean glutenFreeAndVegan, int calories, String size, BaseFlavours baseFlavour, IcingFlavour icingFlavour, String occasion, boolean fillStatus, String topping, String filling) {
        super(price, costToMake, category, glutenFreeAndVegan, calories, size, baseFlavour, icingFlavour, occasion);
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


    @Override
    public String setSizeOfBakedGood(String size){
        this.size = size;
        return "this " + size + " size selected";
    }

    @Override
    public String setSizeOfBakedGood() {
        this.size = "normal";
        return "normal";
    }

}
