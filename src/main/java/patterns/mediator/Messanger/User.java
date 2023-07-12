package main.java.patterns.mediator.Messanger;

public class User implements Send {
    private String name;
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.printf("%s to %s \nMessage: %s\n", this.name, user.getName(), message);
    }
}
