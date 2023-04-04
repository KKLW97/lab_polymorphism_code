public class Traybake extends BakedGood{
    private String flavour;
    private String size;
    public Traybake(double price, double costToMake, String category, boolean glutenFreeAndVegan, int calories, String flavour, String size) {
        super(price, costToMake, category, glutenFreeAndVegan, calories);
        this.flavour = flavour;
        this.size = size;
    }
}
