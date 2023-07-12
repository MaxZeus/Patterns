package main.java.patterns.bridge;

import main.java.patterns.bridge.projects.*;
import main.java.patterns.bridge.work.*;


public class Main {
    public static void main(String[] args) {
        Work[] works = {
                new EmpireStateBuilding(new Builder()),
                new Uber(new Taxist()),
                new Government(new Taxman())
        };

        for (Work w : works) {
            w.doItsJob();
            System.out.println();
        }
    }
}
