package main.java.patterns.factory.animals;

public class Dog implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }
}
