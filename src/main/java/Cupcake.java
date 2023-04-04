public class Cupcake extends Cake{
    private String size;
    private boolean isCupcakeFilled;
    private String presentationStyle;
    private String toppings;

    public Cupcake(double price, double costToMake, String category, int numberOfServings, boolean glutenFree, boolean vegan, int calories, String style, String presentationStyle, String topping) {
        super(price, costToMake, category, numberOfServings, glutenFree, vegan, calories);
        this.size = size;
        this.isCupcakeFilled = fillStatus;
        this.presentationStyle = style;
        this.toppings = topping;
    }



}
