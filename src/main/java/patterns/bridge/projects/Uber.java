package main.java.patterns.bridge.projects;

import main.java.patterns.bridge.work.Work;
import main.java.patterns.bridge.work.Worker;

public class Uber extends Work {

    public Uber(Worker worker) {
        super(worker);
    }

    @Override
    public void doItsJob() {
        System.out.println("Delivering people to destinations in progress.....");
        worker.work();
    }
}
