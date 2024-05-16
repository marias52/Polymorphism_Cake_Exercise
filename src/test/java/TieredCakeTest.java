import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TieredCakeTest {

    Tieredcake tieredcake;

    @BeforeEach
    public void setUp(){
        tieredcake = new Tieredcake("Red velvet", "Red Velvet Cake",3 ,12 );
    }

    @Test
    public void CanGetTieredcake(){
        assertThat(tieredcake.getTiers()).isEqualTo(3);
    }

    @Test
    public void CanGetNumberOfServings(){
        assertThat(tieredcake.getNumberOfServings()).isEqualTo(12);
    }

    @Test
    public void canSetNumberOfServings(){
        tieredcake.setNumberOfServings(12);
        assertThat(tieredcake.getNumberOfServings()).isEqualTo(12);
    }

    @Test
    public void canSetTiers(){
        tieredcake.setTiers(3);
        assertThat(tieredcake.getTiers()).isEqualTo(3);
    }

    @Test
    public void addFlower(){
        assertThat(tieredcake.addFlowers("sunflower")).isEqualTo("adding sunflowerflower to the cake");
    }

    @Test
    public void addFrosting(){
        assertThat(tieredcake.addFrosting(false)).isFalse();
    }
}
