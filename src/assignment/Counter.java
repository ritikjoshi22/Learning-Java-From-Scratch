package assignment;

public class Counter {
    int count = 0; 
    public synchronized void increment() {
        if (count < 1000) {
            count++;
            System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
        }
    }
}
