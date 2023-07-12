package main.java.patterns.builder;

import main.java.patterns.builder.burgers.Burger;
import main.java.patterns.builder.burgers.BurgerBuilder;

public class Cashier {
    private BurgerBuilder builder;

    public void setBuilder(BurgerBuilder builder) {
        this.builder = builder;
    }
    public Burger buildBurger() {
        builder.BurgerBuild();
        builder.buildMeat();
        builder.buildCheese();
        builder.buildSalad();
        builder.buildPrice();

        return builder.getBurger();
    }
}
