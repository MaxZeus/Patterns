package main.java.patterns.factory.animalsfactory;

import main.java.patterns.factory.animals.Animal;
import main.java.patterns.factory.animals.Cat;

public class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnAnimal() {
        return new Cat();
    }
}
