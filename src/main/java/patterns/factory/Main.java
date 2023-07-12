package main.java.patterns.factory;

import main.java.patterns.factory.animals.Animal;
import main.java.patterns.factory.animalsfactory.*;


public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = createAnimalByName("Dog");
        Animal animal = animalFactory.createAnAnimal();
        animal.makeNoise();
    }

    public static AnimalFactory createAnimalByName (String name) {
        switch (name) {
            case "Cat" -> {
                return new CatFactory();
            }
            case "Dog" -> {
                return new DogFactory();
            }
            case "Snake" -> {
                return new SnakeFactory();
            }
            default -> throw new RuntimeException(name + " unavailable animal");
        }
    }
}
