import java.util.Random;

public class Food {

    private String name;
    private double price;
    private boolean veg;
    private int cal;
    //
    private enum Rating{
        BAD,
        OK,
        GOOD
    }


    public Food(String name, double price, boolean veg){

        this.name = name;
        this.price = price;
        this.veg = veg;


    }

    //random rating

    public Rating getRating(){

        Rating[] ratings = Rating.values();

        Random random = new Random();

        int randomIndx = random.nextInt(ratings.length);

        return ratings[randomIndx];

    }

    //calories
    public double calories(){
        return Math.floor(Math.random() * 401) + 100;
    }

    //setters
    public void setName(String n){
        this.name = n;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVeg(boolean veg){
        this.veg = veg;
    }


    //getters
    public String getName() {
        return name;
    }

    public double getPrice(){
        return price;
    }

    public boolean isVeg() {
        return veg;
    }

    public double getCal() {
        return calories();
    }


    public String toString(){

        return "Name:  " + getName() + "\n" +
                "Price: " + getPrice() +"\n" +
                "Veg: " + isVeg() + "\n" +
                "Calories: " + getCal() + "\n" +
                "Rating: " + getRating();
    }

}
