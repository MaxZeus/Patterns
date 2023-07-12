package main.java.patterns.decorator.Kitchen;

public class Chef extends CookDecorator {
    public Chef(Cook cook) {
        super(cook);
    }
    public String createMenu() {
        return "creating a menu ";
    }

    @Override
    public String toCook() {
        return super.toCook() + createMenu();
    }
}
