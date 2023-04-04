public class Cookie extends BakedGood{
    private String flavour;
    private String texture;
    private String size;
    private boolean isCookieFilled;
    private String filling;

    public Cookie(double price, double costToMake, String category, int numberOfServings, boolean glutenFree, boolean vegan, int calories, String flavour, String texture, String size, boolean filled, String filling) {
        super(price, costToMake, category, numberOfServings, glutenFree, vegan, calories);
        this.flavour = flavour;
        this.texture = texture;
        this.size = size;
        this.isCookieFilled = filled;
        this.filling = filling;
    }

    public boolean addFilling(String filling){
        if(isCookieFilled == true){
        setFilling(String newFilling);
        return newFilling;
        }
    }

    public void setFilling(String newFilling){
        this.filling = newFilling;
    }
}
