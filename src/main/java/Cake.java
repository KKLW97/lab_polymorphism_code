public class Cake extends BakedGood{
    private String baseFlavour;
    private String icingFlavour;
    private String occasion;

    public Cake(double price, double costToMake, String category, int numberOfServings, boolean glutenFree, boolean vegan, int calories, String baseFlavour, String icingFlavour, String occasion) {
        super(price, costToMake, category, numberOfServings, glutenFree, vegan, calories);
        this.baseFlavour = baseFlavour;
        this.icingFlavour = icingFlavour;
        this.occasion = occasion;
    }
}
