package main.java.patterns.composite.worker;

import java.util.ArrayList;
import java.util.List;

public class Team implements Worker {
    List<Worker> workers = new ArrayList<>();

    public void addWorker(Worker worker) {
        workers.add(worker);
    }
    public void deleteWorker(Worker worker) {
        workers.remove(worker);
    }

    @Override
    public void build() {
        System.out.println("Building something big");
        for (Worker w : workers) {
            w.build();
        }
    }
}
