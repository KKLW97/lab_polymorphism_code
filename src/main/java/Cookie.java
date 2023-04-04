import interfaces.IFilling;

public class Cookie extends BakedGood implements IFilling {
    private String flavour;
    private String texture;
    private String size;
    private boolean isFilled;
    private String filling;

    public Cookie(double price, double costToMake, String category, boolean glutenFreeAndVegan, int calories, String flavour, String texture, String size, boolean filled, String filling) {
        super(price, costToMake, category, glutenFreeAndVegan, calories);
        this.flavour = flavour;
        this.texture = texture;
        this.size = size;
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
}
