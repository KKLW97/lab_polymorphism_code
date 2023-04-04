import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {

    Cupcake cupcake1;

    @Test
    public void canAddFilling(){
        cupcake1 = new Cupcake(4.20, 1.90, "cupcake",true, 150, "vanilla", "lemon", "birthday", "normal", true,"sprinkles","null" );
        cupcake1.addFilling("lemon curd");
        assertThat(cupcake1.getFilling()).isEqualTo("lemon curd");
    }

}
