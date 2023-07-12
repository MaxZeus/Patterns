package main.java.patterns.builder;

import main.java.patterns.builder.burgers.*;


public class Main {
    public static void main(String[] args) {
        Cashier burgerBuy = new Cashier();

        burgerBuy.setBuilder(new cheeseBurger());
        Burger cheeseBurger = burgerBuy.buildBurger();
        System.out.println(cheeseBurger);

        burgerBuy.setBuilder(new chickenBurgerBuilder());
        Burger chickenBurger = burgerBuy.buildBurger();
        System.out.println(chickenBurger);
    }
}
