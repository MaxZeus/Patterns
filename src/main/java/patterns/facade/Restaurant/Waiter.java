package main.java.patterns.facade.Restaurant;

public class Waiter {
    public void Working(Open open) {
        if (open.isOpen()) {
            System.out.println("Chef is serving customers");
        } else {
            System.out.println("Chef is resting");
        }
    }
}
