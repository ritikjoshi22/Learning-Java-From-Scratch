package assignment;

public class Worker implements Runnable {
    private final SharedResource resource;

    // Constructor to accept the shared resource
    public Worker(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.waitForTask(); // Wait for the task to complete
    }
}