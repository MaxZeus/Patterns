package main.java.patterns.strategy.state;

public class Infant {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void act() {
        this.state.doAction();
    }
}
