package main.java.patterns.decorator.Kitchen;

public class UsualCook implements Cook {
    @Override
    public String toCook() {
        return "Just cooking ";
    }
}
