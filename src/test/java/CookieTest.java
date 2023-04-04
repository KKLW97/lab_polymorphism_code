import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CookieTest {
    Cookie cookie;

    @Test
    public void canAddFilling(){
        cookie = new Cookie(12,5.50,"cookie",false,60,"chocolate","chewy","normal",true,"null");
        cookie.addFilling("chocolate");
        assertThat(cookie.getFilling()).isEqualTo("chocolate");
    }



}
