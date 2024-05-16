import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TraybakeTest {

    private Traybake traybake;

    @BeforeEach
    public void setUp(){
        traybake = new Traybake("chocolate","chocolate cake", 20, false);
    }
    @Test
    public void canGetNumberOfServings(){
        assertThat(traybake.getNumberOfServings());
    }
    @Test
    public void canGetHealthier(){
        assertThat(traybake.getHealthier());
    }

    @Test
    public void canSetNumberOfServings(){
        traybake.setNumberOfServings(15);
        assertThat(traybake.getNumberOfServings()).isEqualTo(15);
    }

    @Test
    public void canSetHealthier(){
        traybake.setHealthier(false);
        assertThat(traybake.getHealthier()).isFalse();
    }

    @Test
    public void AddCandles(){
        Traybake traybake = new Traybake("Chocolate", "Chocolate Traybake", 10, true);
        assertThat(traybake.addCandles(true)).isEqualTo(true);
    }

    @Test
    public void testEat(){
        Traybake traybake = new Traybake("Chocolate", "Chocolate Traybake", 10, true);
        assertThat(traybake.eat(6)).isEqualTo("This cake usually takes 6 bites to eat");
    }
}
