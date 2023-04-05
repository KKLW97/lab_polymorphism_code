package bakedgoods;


public abstract class BakedGood {
    private double price;
    private double costToMake;
    private String category;
    private boolean glutenFreeAndVegan;
    private int caloriesPerServe;
    protected String size;


    public BakedGood(double price, double costToMake, String category, boolean glutenFreeAndVegan, int calories, String sizeOfBakedGood){
        this.price = price;
        this.costToMake = costToMake;
        this.category = category;
        this.glutenFreeAndVegan = glutenFreeAndVegan;
        this.caloriesPerServe = calories;
        this.size = sizeOfBakedGood;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public abstract String setSizeOfBakedGood();

    public abstract String setSizeOfBakedGood(String size);
}
