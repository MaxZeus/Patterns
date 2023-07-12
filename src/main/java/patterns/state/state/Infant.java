package main.java.patterns.state.state;

public class Infant {
    private State state;
    public void setState(State state) {
        this.state = state;
    }
    public void cycleActivity() {
        if (state instanceof Rest) state = new Cry();
        else if (state instanceof Cry) state = new Eat();
        else if (state instanceof Eat) state = new Shit();
        else if (state instanceof Shit) state = new Rest();

        act();
    }
    public void act() {
        this.state.doAction();
    }
}
