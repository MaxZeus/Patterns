package main.java.patterns.state.state;

public class Eat implements State {
    @Override
    public void doAction() {
        System.out.println("Eat");
    }
}
