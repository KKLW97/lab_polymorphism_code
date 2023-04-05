import bakedgoods.BakedGood;

import java.util.ArrayList;

public class Bakery {
    private ArrayList<BakedGood> bakedGoods;
    private String name;
    private double till;
    public Bakery(String name){
        this.name = name;
        this.bakedGoods = new ArrayList<>();
        this.till = 0;
    }
    public int countBakedGoods(){
        return this.bakedGoods.size();
    }
    public void addBakedGood(BakedGood bakedGood){
        this.bakedGoods.add(bakedGood);
    }
    public double calculateBakedGoodsValue(){
        double total = 0;
        for (BakedGood bakedGood : this.bakedGoods){
            total += bakedGood.getPrice();
        }
        return total;
    }
    public double getTill() {
        return till;
    }
}
