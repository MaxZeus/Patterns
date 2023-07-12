package main.java.patterns.template.template;

public abstract class Hamburger {
    public void putIngredients() {
        System.out.println("Put bread");
        putMeatOrSubstitute();
        System.out.println("Put sous");
    }
    public abstract void putMeatOrSubstitute();
}
