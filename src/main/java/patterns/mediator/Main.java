package main.java.patterns.mediator;

import main.java.patterns.mediator.Messanger.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Valeryi");
        User user2 = new User("Maria");

        user1.sendMessage(user2, "Hello");
        user2.sendMessage(user1, "Hello there!");
    }
}
