package assignment;

public class CounterThread extends Thread {
    private final Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.count < 1000) {
            counter.increment();
        }
    }
}
