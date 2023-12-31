package main.java.patterns.bridge.work;

public abstract class Work {
    protected Worker worker;

    public Work(Worker worker) {
        this.worker = worker;
    }
    public abstract void doItsJob();
}
