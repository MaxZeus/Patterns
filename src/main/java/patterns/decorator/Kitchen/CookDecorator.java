package main.java.patterns.decorator.Kitchen;

public class CookDecorator implements Cook {
    protected Cook cook;

    public CookDecorator(Cook cook) {
        this.cook = cook;
    }

    @Override
    public String toCook() {
        return cook.toCook();
    }
}
