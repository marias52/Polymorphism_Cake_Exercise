import java.util.ArrayList;

public class Cupcake extends Cake {

    private ArrayList<String> toppings;

    private String frosting;

    public Cupcake(String baseFlavour, String name, String frosting){
        super(name, baseFlavour);
        this.frosting = frosting;
        this.toppings = new ArrayList<>();
    }


    // GETTERS & SETTERS

    public ArrayList<String> getToppings() {
        return toppings;
    }
    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public String getFrosting() {
        return frosting;
    }

    public void setFrosting(String frosting) {
        this.frosting = frosting;
    }

    // METHOD

    public void addToppping(String topping){
        this.toppings.add(topping);
    }

    public boolean addCandles(boolean needToAddCandles) {
        return needToAddCandles;
    }

}
