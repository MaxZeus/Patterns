package main.java.patterns.abstractfactory;

import main.java.patterns.abstractfactory.breakfast.BreakfastCreationFactory;
import main.java.patterns.abstractfactory.foodfactory.*;


public class Main {
    public static void main(String[] args) {
        FoodCourseCreation foodCourseCreation = new BreakfastCreationFactory();

        FirstMeal breakfastFirstMeal = foodCourseCreation.CreateFirstMeal();
        SecondMeal breakfastSecondMeal = foodCourseCreation.CreateSecondMeal();
        Dessert breakfastDessert = foodCourseCreation.CreateDessert();

        breakfastFirstMeal.createFirstMeal();
        breakfastSecondMeal.createSecondMeal();
        breakfastDessert.createDesert();
    }
}
