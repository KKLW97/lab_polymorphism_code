package bakedgoods;

import enums.BaseFlavours;
import enums.IcingFlavour;

public class TieredCake extends Cake {
    private int numberOfTiers;
    private String icingStyle;
    private int candles;
    private String message;

    public TieredCake(double price, double costToMake, String category, boolean glutenFreeAndVegan, int calories, String size, BaseFlavours baseFlavour, IcingFlavour icingFlavour, String occasion, int numberOfTiers, String style) {
        super(price, costToMake, category, glutenFreeAndVegan, calories, size, baseFlavour, icingFlavour, occasion);
        this.numberOfTiers = numberOfTiers;
        this.icingStyle = style;
        this.candles = 0;
        this.message = null;
    }
    public void setMessage(String newMessage){
        this.message = newMessage;
    }
    public String getMessage(){
        return this.message;
    }
    public void addCandles(int numberOfCandles){
        this.candles += numberOfCandles;
    }
    public int getCandles(){
        return this.candles;
    }
    public int getNumberOfTiers() {
        return numberOfTiers;
    }

    public void setNumberOfTiers(int numberOfTiers) {
        this.numberOfTiers = numberOfTiers;
    }

    @Override
    public String setSizeOfBakedGood() {
       this.size = "normal";
        return "normal";
    }
    public String setSizeOfBakedGood(String size) {
        this.size = size;
        return "this " + size + " size selected";
    }


}
