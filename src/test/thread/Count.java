package test.thread;

public class Count {
    private int num;

    public synchronized void increment() {
        num++;
    }

    public int get() {
        return num;
    }
}
