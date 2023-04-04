public class TieredCake extends BakedGood{
    private int numberOfTiers;
    private int sizeInInches;
    private String icingStyle;
    public TieredCake(double price, double costToMake, String category, int numberOfServings, boolean glutenFree, boolean vegan, int calories, int numberOfTiers, int inch, String style) {
        super(price, costToMake, category, numberOfServings, glutenFree, vegan, calories);
        this.numberOfTiers = numberOfTiers;
        this.sizeInInches = inch;
        this.icingStyle = style;
    }
}
