package main.java.patterns.state;

import main.java.patterns.state.state.Infant;
import main.java.patterns.state.state.Rest;

public class Main {
    public static void main(String[] args) {
        Infant Michiel = new Infant();
        Michiel.setState(new Rest());

        for (int i = 0; i < 5; i++) {
            Michiel.cycleActivity();
        }
    }
}
