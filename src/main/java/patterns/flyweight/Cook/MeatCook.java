package main.java.patterns.flyweight.Cook;

public class MeatCook implements Cook {
    @Override
    public void toCook() {
        System.out.println("Cooking meat");
    }
}
