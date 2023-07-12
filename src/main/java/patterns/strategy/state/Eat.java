package main.java.patterns.strategy.state;

public class Eat implements State {
    @Override
    public void doAction() {
        System.out.println("Eat");
    }
}
