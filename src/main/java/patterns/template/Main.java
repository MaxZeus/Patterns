package main.java.patterns.template;

import main.java.patterns.template.template.Hamburger;
import main.java.patterns.template.template.MeatBurger;
import main.java.patterns.template.template.VeganBurger;

public class Main {
    public static void main(String[] args) {
        Hamburger meat = new MeatBurger();
        Hamburger vegan = new VeganBurger();

        meat.putIngredients();
        System.out.println();
        vegan.putIngredients();
    }
}
