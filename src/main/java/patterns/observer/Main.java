package main.java.patterns.observer;

import main.java.patterns.observer.observer.Kitchen;
import main.java.patterns.observer.observer.Observer;
import main.java.patterns.observer.observer.Waiter;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();

        kitchen.addPlate("Mash potato");
        kitchen.addPlate("Grilled beef");
        kitchen.addPlate("Chicken salad");
        kitchen.addPlate("Pizza with pineapple");
        kitchen.addPlate("Kebab");

        Observer walt = new Waiter("Walter");
        Observer soul = new Waiter("Solomon");
        Observer mike = new Waiter("Mike");
        Observer vic = new Waiter("Victor");

        kitchen.addObserver(walt);
        kitchen.addObserver(soul);
        kitchen.addObserver(mike);
        kitchen.addObserver(vic);

        kitchen.addPlate("Ice cream with berries");




    }
}
