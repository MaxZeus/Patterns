package main.java.patterns.observer.observer;

public interface Chef {
    public void addObserver(Observer ob);
    public void deleteObserver(Observer ob);
    public void notifyObservers();
}
