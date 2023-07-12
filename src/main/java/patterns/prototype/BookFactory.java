package main.java.patterns.prototype;

public class BookFactory {
    private Book book;

    public BookFactory(Book book) {
        this.book = book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book copy() {
        return this.book.copy();
    }
}
