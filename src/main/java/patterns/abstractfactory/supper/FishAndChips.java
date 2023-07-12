package main.java.patterns.abstractfactory.supper;

import main.java.patterns.abstractfactory.foodfactory.SecondMeal;

public class FishAndChips implements SecondMeal {
    @Override
    public void createSecondMeal() {
        System.out.println("We are cooking Fish and chips");
    }
}
