import java.util.ArrayList;

public class CakeShop {

    CakeShop cakeShop;

    private ArrayList<String> cakesInStock;
    private String location;
    private double till;

    public CakeShop(String location, double till) {
        this.location = location;
        this.till = till;
        this.cakesInStock = new ArrayList<>();
    }

    public CakeShop(){
        this.cakesInStock = new ArrayList<>();
    }

    // GETTERS & SETTERS
    public ArrayList<String> getCakesInStock(){
        return cakesInStock;
    }

    public String getLocation(){
        return location;
    }

    public double getTill() {
        return till;
    }

    public void setCakesInStock(ArrayList<String> cakesInStock){
        this.cakesInStock = cakesInStock;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTill(double till) {
        this.till = till;
    }


    // METHODS

    public void addCakeToStock (String cake){
        this.cakesInStock.add(cake);
    }

    public void removeCakeToStock (String cake) {
        this.cakesInStock.remove(cake);
    }


}
