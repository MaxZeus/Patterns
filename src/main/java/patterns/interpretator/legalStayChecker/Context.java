package main.java.patterns.interpretator.legalStayChecker;

public class Context {
    private final String theLastDay;
    public Context(String theDate) {
        this.theLastDay = theDate;
    }
    public boolean legalStayInCountry(String date) {
        return theLastDay.equals(date);
    }
}
