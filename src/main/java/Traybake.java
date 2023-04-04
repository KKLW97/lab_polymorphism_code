public class Traybake extends BakedGood{
    private String flavour;
    private String size;
    public Traybake(double price, double costToMake, String category, int numberOfServings, boolean glutenFree, boolean vegan, int calories, String flavour, String size) {
        super(price, costToMake, category, numberOfServings, glutenFree, vegan, calories);
        this.flavour = flavour;
        this.size = size;
    }
}
