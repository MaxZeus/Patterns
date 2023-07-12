package main.java.patterns.bridge.work;

public class Taxist implements Worker {
    @Override
    public void work() {
        System.out.println("Ride people");
    }
}
