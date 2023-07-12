package main.java.patterns.prototype;

public class Book implements Copyable {
    private String title;
    private String authorName;
    private int pagesNumber;

    public Book(String title, String authorName, int pagesNumber) {
        this.title = title;
        this.authorName = authorName;
        this.pagesNumber = pagesNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }
    public Book copy() {
        return new Book(title, authorName, pagesNumber);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", pagesNumber=" + pagesNumber +
                '}';
    }
}
