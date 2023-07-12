package main.java.patterns.composite;

import main.java.patterns.composite.worker.*;

public class Main {
    public static void main(String[] args) {
        Team job = new Team();

        Worker plumber = new Plumber();
        Worker designerFirst = new Designer();
        Worker designerSecond = new Designer();

        job.addWorker(plumber);
        job.addWorker(designerFirst);
        job.addWorker(designerSecond);

        job.build();

    }
}
