import bakedgoods.BakedGood;
import bakedgoods.Cookie;
import bakedgoods.Cupcake;
import enums.BaseFlavours;
import enums.IcingFlavour;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {
    Bakery bakery;
    Cupcake cupcake1;
    @BeforeEach
    void setUp(){
        bakery = new Bakery("Bright Bakery");
        cupcake1 = new Cupcake(4.50, 1.10, "cupcake", true, 300, "mini", BaseFlavours.CHOCOLATE, IcingFlavour.VANILLA,"party",true,"popping candy","chocolate");
        bakery.addBakedGood(cupcake1);
    }

//    can count baked goods in array list
    @Test
    void canCountBakedGoods(){
        assertThat(bakery.countBakedGoods()).isEqualTo(1);
    }

//    can add bakery items to the array list
    @Test
    void canAddBakedGoods(){
        BakedGood cookie1 = new Cookie(3.80, 1.60, "cookie",false, 40, "giant","cherry","crunchy",false,"null");
        bakery.addBakedGood(cookie1);
        assertThat(bakery.countBakedGoods()).isEqualTo(2);
    }

//    get total value of baked goods
    @Test
    public void canCalculateValueOfBakedGoods(){
        double result = bakery.calculateBakedGoodsValue();
        assertThat(result).isEqualTo(4.50);
    }
//    till starts at 0
    @Test
    public void tillStartsAtZero(){
        assertThat(bakery.getTill()).isEqualTo(0);
    }
}
