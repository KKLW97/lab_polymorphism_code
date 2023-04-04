public class TieredCake extends BakedGood{
    private int numberOfTiers;
    private int sizeInInches;
    private String icingStyle;
    public TieredCake(double price, double costToMake, String category, boolean glutenFreeAndVegan, int calories, int numberOfTiers, int inch, String style) {
        super(price, costToMake, category, glutenFreeAndVegan, calories);
        this.numberOfTiers = numberOfTiers;
        this.sizeInInches = inch;
        this.icingStyle = style;
    }
}
