package main.java.patterns.template.template;

public class VeganBurger extends Hamburger {
    @Override
    public void putMeatOrSubstitute() {
        System.out.println("Put tofu");
    }
}
