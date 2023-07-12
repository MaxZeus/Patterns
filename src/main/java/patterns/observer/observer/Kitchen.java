package main.java.patterns.observer.observer;

import java.util.ArrayList;
import java.util.List;

public class Kitchen implements Chef {
    private List<String> plates = new ArrayList<>();
    private List<Observer> waiters = new ArrayList<>();

    public void addPlate(String plate) {
        this.plates.add(plate);
        notifyObservers();
    }

    public void removePlate(String plate) {
        this.plates.remove(plate);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer ob) {
        this.waiters.add(ob);
    }

    @Override
    public void deleteObserver(Observer ob) {
        this.waiters.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : waiters) {
            ob.event(this.plates);
        }
    }
}
