package main.java.patterns.builder.burgers;

public abstract class BurgerBuilder {
    protected Burger burger;

    public void BurgerBuild() {
        burger = new Burger();
    }
    public Burger getBurger() {
        return this.burger;
    }

    public abstract void buildMeat();
    public abstract void buildCheese();
    public abstract void buildSalad();
    public abstract void buildPrice();
}
