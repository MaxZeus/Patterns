package main.java.patterns.factory.animals;

public class Cat implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}
