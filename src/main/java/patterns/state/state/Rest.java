package main.java.patterns.state.state;

public class Rest implements State {
    @Override
    public void doAction() {
        System.out.println("Rest");
    }
}
