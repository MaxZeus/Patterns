package main.java.patterns.memento;

import main.java.patterns.memento.User.MementoClass;
import main.java.patterns.memento.User.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MementoClass first = new MementoClass();
        MementoClass second = new MementoClass();
        MementoClass third = new MementoClass();

        first.setUser(new User("Max", 30));
        second.setUser(new User("Alex", 27));
        third.setUser(new User("Mark", 25));

        List<MementoClass> userList = new ArrayList<>(Arrays.asList(first, second, third));

        for (MementoClass mc : userList) {
            System.out.println(mc.getUser().toString());
        }



    }
}
