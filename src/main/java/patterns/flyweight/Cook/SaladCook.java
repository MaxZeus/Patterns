package main.java.patterns.flyweight.Cook;

public class SaladCook implements Cook {
    @Override
    public void toCook() {
        System.out.println("Cooking salad");
    }
}
