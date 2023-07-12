package main.java.patterns.factory.animalsfactory;

import main.java.patterns.factory.animals.Animal;
import main.java.patterns.factory.animals.Snake;

public class SnakeFactory implements AnimalFactory {
    @Override
    public Animal createAnAnimal() {
        return new Snake();
    }
}
