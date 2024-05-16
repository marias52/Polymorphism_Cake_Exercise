import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {

    Cupcake cupcake;

    @BeforeEach
    public void setUp(){
        cupcake = new Cupcake("vanilla", "Strawberry", "Cream cheese");
        cupcake.addToppping("sprinkles");
    }

    @Test
    public void canGetToppings(){
        assertThat(cupcake.getToppings().size()).isEqualTo(1);
    }

    @Test
    public void canGetFrosting(){
        assertThat(cupcake.getFrosting()).isEqualTo("Cream cheese");
    }

    @Test
    public void canSetFrosting(){
       cupcake.setFrosting("Stars");
        assertThat(cupcake.getFrosting()).isEqualTo("Stars");
    }
    @Test
    public void canSetTopping(){
        ArrayList<String> newToppings = new ArrayList<>();
        cupcake.setToppings(newToppings);
        assertThat(cupcake.getToppings().size()).isEqualTo(0);
    }

    @Test
    public void AddCandles(){
        assertThat(cupcake.addCandles(true)).isEqualTo(true);
    }


}
