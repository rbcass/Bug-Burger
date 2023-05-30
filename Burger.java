import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Burger extends Food{

    private enum Toppings{
        ONION,
        TOMATO,
        LETTUCE,
        GHERKIN
    }

    private List<Toppings> toppings;

    private boolean seedless;


    public Burger(String name, double price, boolean veg){

        super(name,price,veg);


        this.seedless = isSeedless();

        this.toppings = getToppings();


    }

    public List<Toppings> getToppings(){

        //enum in array
        Toppings[] toppings = Toppings.values();
        Random random = new Random();
        //random index in array
        int toppingINT = random.nextInt(toppings.length)+1;

        List<Toppings> selected = new ArrayList<>();

        for(int i=0; i < toppingINT; i++){
            int tpp = random.nextInt(toppings.length);
            selected.add(toppings[tpp]);

        }


        return selected;
    }

    public boolean isSeedless(){

        return Math.random() < 0.5;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Burger Information:\n");
        sb.append("Name: ").append(getName()).append("\n");
        sb.append("Price: ").append(getPrice()).append("\n");
        sb.append("Seedless: ").append(seedless).append("\n");
        sb.append("Toppings: ").append(toppings).append("\n");
        sb.append("Calories: ").append(getCal()).append("\n");
        sb.append("Veg: ").append(isVeg()).append("\n");
        sb.append("Rating: ").append(getRating()).append("\n");
        return sb.toString();
    }
}
