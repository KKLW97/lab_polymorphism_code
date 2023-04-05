package bakedgoods;

import enums.BaseFlavours;
import enums.IcingFlavour;

public abstract class Cake extends BakedGood {

    protected BaseFlavours baseFlavour;
    protected IcingFlavour icingFlavour;
    protected String occasion;

    public Cake(double price, double costToMake, String category, boolean glutenFreeAndVegan, int calories, String size, BaseFlavours baseFlavour, IcingFlavour icingFlavour, String occasion) {
        super(price, costToMake, category, glutenFreeAndVegan, calories, size);
        this.baseFlavour = baseFlavour;
        this.icingFlavour = icingFlavour;
        this.occasion = occasion;
    }

    public BaseFlavours getBaseFlavour() {
        return baseFlavour;
    }

    public void setBaseFlavour(BaseFlavours baseFlavour) {
        this.baseFlavour = baseFlavour;
    }

    public IcingFlavour getIcingFlavour() {
        return icingFlavour;
    }

    public void setIcingFlavour(IcingFlavour icingFlavour) {
        this.icingFlavour = icingFlavour;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }
}