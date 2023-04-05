import bakedgoods.Cupcake;
import enums.BaseFlavours;
import enums.IcingFlavour;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {

    Cupcake cupcake1;

//    adds filling to cupcake
    @Test
    public void canAddFilling(){
        cupcake1 = new Cupcake(4.20, 1.90, "cupcake",true, 150, "normal", BaseFlavours.VANILLA, IcingFlavour.LEMON, "birthday", true,"sprinkles","null" );
        cupcake1.addFilling("lemon curd");
        assertThat(cupcake1.getFilling()).isEqualTo("lemon curd");
    }

//    can set base flavour
    @Test
    public void canSetBaseFlavour(){
        cupcake1 = new Cupcake(4.20, 1.90, "cupcake",true, 150, "normal", BaseFlavours.VANILLA, IcingFlavour.LEMON, "birthday", true,"sprinkles","null" );
        cupcake1.setBaseFlavour(BaseFlavours.LEMON);
        assertThat(cupcake1.getBaseFlavour()).isEqualTo(BaseFlavours.LEMON);
    }
//    can set icing flavour
    @Test
    public void canSetIcingFlavour(){
        cupcake1 = new Cupcake(4.20, 1.90, "cupcake",true, 150, "normal", BaseFlavours.VANILLA, IcingFlavour.LEMON, "birthday", true,"sprinkles","null" );
        cupcake1.setIcingFlavour(IcingFlavour.CREAMCHEESE);
        assertThat(cupcake1.getIcingFlavour()).isEqualTo(IcingFlavour.CREAMCHEESE);
    }
}
