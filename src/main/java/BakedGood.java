public abstract class BakedGood {
    private double price;
    private double costToMake;
    private String category;
    private int numberOfServings;
    private boolean glutenFree;
    private boolean vegan;
    private int caloriesPerServe;

    public BakedGood(double price, double costToMake, String category, int numberOfServings, boolean glutenFree, boolean vegan, int calories){
        this.price = price;
        this.costToMake = costToMake;
        this.category = category;
        this.numberOfServings = numberOfServings;
        this.glutenFree = glutenFree;
        this.vegan = vegan;
        this.caloriesPerServe = calories;
    }





}
