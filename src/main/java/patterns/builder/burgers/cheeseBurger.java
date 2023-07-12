package main.java.patterns.builder.burgers;

public class cheeseBurger extends BurgerBuilder {
    @Override
    public void buildMeat() {
        burger.setMeatName("No meat");
    }

    @Override
    public void buildCheese() {
        burger.setCheeseName("Double cheddar");
    }

    @Override
    public void buildSalad() {
        burger.setSaladName("Coleslaw");
    }

    @Override
    public void buildPrice() {
        burger.setPrice(1.5);
    }
}
