import bakedgoods.TieredCake;
import enums.BaseFlavours;
import enums.IcingFlavour;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class TieredCakeTest {

    TieredCake cake1;
    @BeforeEach
    void setUp(){
        cake1 = new TieredCake(120.99, 40.88, "Tiered cake",true, 320,"13 inch", BaseFlavours.CHOCOLATE, IcingFlavour.VANILLA,"party", 5, "buttercream");
    }

//    can add message to cake
    @Test
    public void canAddMessage(){
        cake1.setMessage("Happy birthday!");
        assertThat(cake1.getMessage()).isEqualTo("Happy birthday!");
    }

//    can add candles to cake
    @Test
    public void canAddCandle(){
        cake1.addCandles(2);
        assertThat(cake1.getCandles()).isEqualTo(2);
    }

//    can set number of tiers
    @Test
    public void canSetNumberOfTiers(){
        cake1.setNumberOfTiers(3);
        assertThat(cake1.getNumberOfTiers()).isEqualTo(3);
    }

//    can get number of tiers
    @Test
    public void canGetNumberOfTiers(){
        assertThat(cake1.getNumberOfTiers()).isEqualTo(5);
    }

//    can set icing flavour
    @Test
    public void canSetIcingFlavour(){
        cake1.setIcingFlavour(IcingFlavour.CHOCOLATE);
        assertThat(cake1.getIcingFlavour()).isEqualTo(IcingFlavour.CHOCOLATE);
    }

//    can set base flavour
    @Test
    public void canSetBaseFlavour(){
        cake1.setBaseFlavour(BaseFlavours.REDVELVET);
        assertThat(cake1.getBaseFlavour()).isEqualTo(BaseFlavours.REDVELVET);
    }
}
