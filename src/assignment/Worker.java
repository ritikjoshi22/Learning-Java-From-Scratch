package assignment;

public class Worker implements Runnable {
    private final SharedResource resource;

    public Worker(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.waitForTask();
    }
}