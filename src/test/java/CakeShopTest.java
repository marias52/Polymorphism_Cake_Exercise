import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CakeShopTest {

    CakeShop cakeShop;

    @BeforeEach
    public void setUp(){
        cakeShop = new CakeShop("London", 0);
        cakeShop.addCakeToStock("chocolate tray bake");
        cakeShop.addCakeToStock("vanilla tiered cake");
        cakeShop.addCakeToStock("oreo Cupcakes");
    }

    @Test
    public void hasLocation(){
        assertThat(cakeShop.getLocation()).isEqualTo("London");
    }

    @Test
    public void canGetCakeInStock(){

        assertThat(cakeShop.getCakesInStock().size()).isEqualTo(3);
    }

    @Test
    public void canGetTill(){
        assertThat(cakeShop.getTill()).isEqualTo(0);
    }

    @Test
    public void canSetCakesInStock() {

        ArrayList<String> cakesInStock = new ArrayList<>();
        cakeShop.setCakesInStock(cakesInStock);
        assertThat(cakeShop.getCakesInStock().size()).isEqualTo(0);
    }
    @Test
    public void canSetLocation(){
        cakeShop.setLocation( "London");
        assertThat(cakeShop.getLocation()).isEqualTo("London");
    }

    @Test
    public void canSetTill(){
        cakeShop.setTill(0);
        assertThat(cakeShop.getTill()).isEqualTo(0);
    }

    @Test
    public void addCakeToStock () {
        cakeShop.addCakeToStock("Red velvet cupcake");
        assertThat(cakeShop.getCakesInStock().size()).isEqualTo(4);
    }

    @Test
    public void removeCakeToStock () {
        cakeShop.removeCakeToStock("chocolate tray bake");
        assertThat(cakeShop.getCakesInStock().size()).isEqualTo(2);
    }
}