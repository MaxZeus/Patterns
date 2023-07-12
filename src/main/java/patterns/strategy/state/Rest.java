package main.java.patterns.strategy.state;

public class Rest implements State {
    @Override
    public void doAction() {
        System.out.println("Rest");
    }
}
