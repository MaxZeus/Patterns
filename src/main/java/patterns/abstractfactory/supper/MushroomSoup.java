package main.java.patterns.abstractfactory.supper;

import main.java.patterns.abstractfactory.foodfactory.FirstMeal;

public class MushroomSoup implements FirstMeal {

    @Override
    public void createFirstMeal() {
        System.out.println("We are cooking mushroom soup");
    }
}
