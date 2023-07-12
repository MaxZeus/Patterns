package main.java.patterns.bridge.projects;

import main.java.patterns.bridge.work.Work;
import main.java.patterns.bridge.work.Worker;

public class Government extends Work {

    public Government(Worker worker) {
        super(worker);
    }

    @Override
    public void doItsJob() {
        System.out.println("Freeing people from money is in progress......");
        worker.work();
    }
}
