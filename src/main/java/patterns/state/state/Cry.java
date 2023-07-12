package main.java.patterns.state.state;

public class Cry implements State {
    @Override
    public void doAction() {
        System.out.println("Cry");
    }
}
