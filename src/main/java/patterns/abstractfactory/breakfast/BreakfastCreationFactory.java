package main.java.patterns.abstractfactory.breakfast;

import main.java.patterns.abstractfactory.foodfactory.*;

public class BreakfastCreationFactory implements FoodCourseCreation {

    @Override
    public FirstMeal CreateFirstMeal() {
        return new TeaWithMilk();
    }

    @Override
    public SecondMeal CreateSecondMeal() {
        return new Oatmeal();
    }

    @Override
    public Dessert CreateDessert() {
        return new Fruits();
    }
}
