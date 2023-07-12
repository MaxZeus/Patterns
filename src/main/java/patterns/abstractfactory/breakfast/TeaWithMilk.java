package main.java.patterns.abstractfactory.breakfast;

import main.java.patterns.abstractfactory.foodfactory.FirstMeal;

public class TeaWithMilk implements FirstMeal {
    @Override
    public void createFirstMeal() {
        System.out.println("We are making tea with milk, and sigar");
    }
}
