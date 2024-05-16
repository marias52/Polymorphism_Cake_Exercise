public class Tieredcake extends Cake {

    private int tiers;
    private int numberOfServings;

    public Tieredcake(String baseFlavour, String name, int tiers, int numberOfServings){
        super(name, baseFlavour);
        this.tiers = tiers;
        this.numberOfServings = numberOfServings;
    }


    // GETTERS & SETTERS
    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public int getNumberOfServings() {
        return numberOfServings;
    }
    public void setNumberOfServings(int numberOfServings) {
        this.numberOfServings = numberOfServings;
    }

    // METHODS

    public boolean addFrosting(boolean needToAddFrosting) {
        return needToAddFrosting;
    }

    public String addFlowers(String flowerType){
        return "adding " + flowerType + "flower to the cake";
    }

}