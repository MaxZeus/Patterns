package main.java.patterns.decorator;

import main.java.patterns.decorator.Kitchen.*;

public class Main {
    public static void main(String[] args) {
        CookDecorator cookDecorator = new Chef(new SousChef(new UsualCook()));
        System.out.println(cookDecorator.toCook());
    }
}
