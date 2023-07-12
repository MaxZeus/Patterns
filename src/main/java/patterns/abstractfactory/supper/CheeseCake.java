package main.java.patterns.abstractfactory.supper;

import main.java.patterns.abstractfactory.foodfactory.Dessert;

public class CheeseCake implements Dessert {
    @Override
    public void createDesert() {
        System.out.println("We are cooking cheesecake");
    }
}
