package main.java.patterns.strategy;

import main.java.patterns.strategy.state.*;


public class Main {
    public static void main(String[] args) {
        Infant Michiel = new Infant();

        Michiel.setState(new Rest());
        Michiel.act();

        Michiel.setState(new Cry());
        Michiel.act();

        Michiel.setState(new Eat());
        Michiel.act();

        Michiel.setState(new Shit());
        Michiel.act();
    }
}
