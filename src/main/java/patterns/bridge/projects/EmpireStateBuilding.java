package main.java.patterns.bridge.projects;

import main.java.patterns.bridge.work.Work;
import main.java.patterns.bridge.work.Worker;

public class EmpireStateBuilding extends Work {

    public EmpireStateBuilding(Worker worker) {
        super(worker);
    }

    @Override
    public void doItsJob() {
        System.out.println("Building in progress........");
        worker.work();
    }
}
