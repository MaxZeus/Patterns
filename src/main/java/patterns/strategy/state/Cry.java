package main.java.patterns.strategy.state;

public class Cry implements State {
    @Override
    public void doAction() {
        System.out.println("Cry");
    }
}
