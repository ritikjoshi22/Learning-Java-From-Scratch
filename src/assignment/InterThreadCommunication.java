package assignment;

public class InterThreadCommunication {
    public static void main(String[] args) {
        // Shared resource for threads
        SharedResource sharedResource = new SharedResource();

        // Create multiple worker threads
        Thread worker1 = new Thread(new Worker(sharedResource), "Worker-1");
        Thread worker2 = new Thread(new Worker(sharedResource), "Worker-2");
        Thread worker3 = new Thread(new Worker(sharedResource), "Worker-3");

        // Start the worker threads
        worker1.start();
        worker2.start();
        worker3.start();

        // Main thread sleeps to simulate some processing
        try {
            Thread.sleep(2000); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Main thread completes the task and notifies all workers
        sharedResource.completeTask();

        // Ensure main thread terminates last
        try {
            worker1.join();
            worker2.join();
            worker3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread terminates last.");
    }
}