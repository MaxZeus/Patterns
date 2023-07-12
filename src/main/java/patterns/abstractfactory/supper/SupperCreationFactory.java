package main.java.patterns.abstractfactory.supper;

import main.java.patterns.abstractfactory.foodfactory.Dessert;
import main.java.patterns.abstractfactory.foodfactory.FirstMeal;
import main.java.patterns.abstractfactory.foodfactory.FoodCourseCreation;
import main.java.patterns.abstractfactory.foodfactory.SecondMeal;

public class SupperCreationFactory implements FoodCourseCreation {
    @Override
    public FirstMeal CreateFirstMeal() {
        return new MushroomSoup();
    }

    @Override
    public SecondMeal CreateSecondMeal() {
        return new FishAndChips();
    }

    @Override
    public Dessert CreateDessert() {
        return new CheeseCake();
    }
}
