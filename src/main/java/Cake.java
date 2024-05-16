public abstract class Cake {

    protected String name;
    protected String baseFlavour;


    public Cake(String name,String baseFlavour) {
        this.name = name;
        this.baseFlavour = baseFlavour;
    }

    // GETTERS & SETTERS

    public String getName(){
        return name;
    }

    public String getBaseFlavour(){
        return baseFlavour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseFlavour(String baseFlavour) {
        this.baseFlavour = baseFlavour;

    }

    //METHODS

    public String addMessage(String message) {
        return message;

    }

}
