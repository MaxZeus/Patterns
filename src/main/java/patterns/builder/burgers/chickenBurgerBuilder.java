package main.java.patterns.builder.burgers;

public class chickenBurgerBuilder extends BurgerBuilder {
    @Override
    public void buildMeat() {
        burger.setMeatName("Chicken");
    }

    @Override
    public void buildCheese() {
        burger.setCheeseName("Parmesan");
    }

    @Override
    public void buildSalad() {
        burger.setSaladName("Iceberg");
    }

    @Override
    public void buildPrice() {
        burger.setPrice(2.5);
    }
}
