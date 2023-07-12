package main.java.patterns.factory.animalsfactory;

import main.java.patterns.factory.animals.Animal;
import main.java.patterns.factory.animals.Dog;

public class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnAnimal() {
        return new Dog();
    }
}
