public class Cake extends BakedGood{
    private String baseFlavour;
    private String icingFlavour;
    private String occasion;

    public Cake(double price, double costToMake, String category, boolean glutenFreeAndVegan, int calories, String baseFlavour, String icingFlavour, String occasion) {
        super(price, costToMake, category, glutenFreeAndVegan, calories);
        this.baseFlavour = baseFlavour;
        this.icingFlavour = icingFlavour;
        this.occasion = occasion;
    }

    public String getBaseFlavour() {
        return baseFlavour;
    }

    public void setBaseFlavour(String baseFlavour) {
        this.baseFlavour = baseFlavour;
    }

    public String getIcingFlavour() {
        return icingFlavour;
    }

    public void setIcingFlavour(String icingFlavour) {
        this.icingFlavour = icingFlavour;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }
}
