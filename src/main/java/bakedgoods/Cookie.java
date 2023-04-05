package bakedgoods;

import interfaces.IFilling;

public class Cookie extends BakedGood implements IFilling {
    private String flavour;
    private String texture;
    private boolean isFilled;
    private String filling;

    public Cookie(double price, double costToMake, String category, boolean glutenFreeAndVegan, int calories, String size, String flavour, String texture, boolean filled, String filling) {
        super(price, costToMake, category, glutenFreeAndVegan, calories, size);
        this.flavour = flavour;
        this.texture = texture;
        this.isFilled = filled;
        this.filling = filling;
    }


    public String getFilling(){
        return this.filling;
    }

    public void setFilling(String newFilling){
        this.filling = newFilling;
    }

    @Override
    public boolean addFilling(String filling) {
        if(isFilled){
            setFilling(filling);
        }
        return false;
    }

    @Override
    public String setSizeOfBakedGood(){
        return "normal";
    }
    public String setSizeOfBakedGood(String size) {
        this.size = size;
        return "this " + size + " size selected";
    }

}
