package main.java.patterns.decorator.Kitchen;

public class SousChef extends CookDecorator {
    public SousChef(Cook cook) {
        super(cook);
    }
    public String observeKitchen() {
        return "observe and control kitchen and stuff ";
    }

    @Override
    public String toCook() {
        return super.toCook() + observeKitchen();
    }
}
