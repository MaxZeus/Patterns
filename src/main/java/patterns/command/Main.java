package main.java.patterns.command;

import main.java.patterns.command.Kitchen.*;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();

        Staff staff = new Staff(
                new Cooking(kitchen),
                new Serving(kitchen),
                new Cleaning(kitchen),
                new Preparing(kitchen)
        );
        staff.staffCook();
        staff.staffServe();
        staff.staffClean();
        staff.staffPrepare();
    }
}
