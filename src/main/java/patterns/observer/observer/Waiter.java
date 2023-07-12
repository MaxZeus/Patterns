package main.java.patterns.observer.observer;

import java.util.List;

public class Waiter implements Observer {
    private String name;

    public Waiter(String name) {
        this.name = name;
    }
    @Override
    public void event(List<String> list) {
        System.out.println(this.name + " you could serve the dishes: " + list);
    }
}
