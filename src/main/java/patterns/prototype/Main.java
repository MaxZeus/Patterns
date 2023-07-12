package main.java.patterns.prototype;

public class Main {
    public static void main(String[] args) {
        Book original = new Book("2 nights in Rostov", "Yevgeny Prigozhin", 152);

        BookFactory factory = new BookFactory(original);

        Book copy = factory.copy();
        System.out.println(copy);
    }
}
