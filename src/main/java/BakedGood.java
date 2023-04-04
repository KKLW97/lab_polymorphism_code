import java.util.ArrayList;

public abstract class BakedGood {
    private ArrayList<BakedGood>bakedGoods;
    private double price;
    private double costToMake;
    private String category;
    private boolean glutenFreeAndVegan;
    private int caloriesPerServe;

    public BakedGood(double price, double costToMake, String category, boolean glutenFreeAndVegan, int calories){
        this.price = price;
        this.costToMake = costToMake;
        this.category = category;
        this.glutenFreeAndVegan = glutenFreeAndVegan;
        this.caloriesPerServe = calories;
    }





}
