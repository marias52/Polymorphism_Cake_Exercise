import interfaces.IEat;

public class Traybake extends Cake implements IEat {
    private int numberOfServings;
    private boolean healthier;

    public Traybake(String baseFlavour, String name, int numberOfServings, boolean healthier){
        super(name, baseFlavour);
        this.healthier = healthier;
        this.numberOfServings =  numberOfServings;
    }


    // GETTERS & SETTERS

    public int getNumberOfServings(){
        return numberOfServings;
    }
    public void setNumberOfServings(int numberOfServings) {
        this.numberOfServings = numberOfServings;
    }

    public boolean getHealthier() {
        return healthier;
    }
    public void setHealthier(boolean healthier) {
        this.healthier = healthier;
    }

    // METHODS

    public boolean addCandles(boolean needToAddCandles) {
        return needToAddCandles;
    }

    @Override
    public String eat(int bites){
        return "This cake usually takes " + bites + " bites to eat";
    }
}
