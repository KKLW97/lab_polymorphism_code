import bakedgoods.Cookie;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CookieTest {
    Cookie cookie;

//    can add filling to cookie
    @Test
    public void canAddFilling(){
        cookie = new Cookie(12,5.50,"cookie",false,60,"normal","chocolate","chewy",true,"null");
        cookie.addFilling("chocolate");
        assertThat(cookie.getFilling()).isEqualTo("chocolate");
    }

//    can set size of cookie
    @Test
    public void canSetSize(){
        cookie = new Cookie(12,5.50,"cookie",false,60,"normal","chocolate","chewy",true,"null");
        cookie.setSizeOfBakedGood("giant");
        assertThat(cookie.getSize()).isEqualTo("giant");
    }


}
