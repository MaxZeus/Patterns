package main.java.patterns.abstractfactory.breakfast;

import main.java.patterns.abstractfactory.foodfactory.SecondMeal;

public class Oatmeal implements SecondMeal {
    @Override
    public void createSecondMeal() {
        System.out.println("We are cooking oatmeal with nuts and blackberry");
    }
}
