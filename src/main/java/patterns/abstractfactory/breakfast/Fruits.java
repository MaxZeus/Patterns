package main.java.patterns.abstractfactory.breakfast;

import main.java.patterns.abstractfactory.foodfactory.Dessert;

public class Fruits implements Dessert {
    @Override
    public void createDesert() {
        System.out.println("We are cutting some fruits");
    }
}
