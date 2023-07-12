package main.java.patterns.abstractfactory.foodfactory;

public interface FoodCourseCreation {
    public FirstMeal CreateFirstMeal();
    public SecondMeal CreateSecondMeal();
    public Dessert CreateDessert();
}
