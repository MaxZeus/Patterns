package main.java.patterns.facade;

import main.java.patterns.facade.Restaurant.RestaurantFacade;

public class Main {
    public static void main(String[] args) {
        RestaurantFacade restaurant = new RestaurantFacade();
        restaurant.WorkingTime();
    }
}
