package assignment;

public class SharedResource {
    private boolean taskCompleted = false;

    // Method for threads to wait until notified
    public synchronized void waitForTask() {
        while (!taskCompleted) {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting.");
                wait(); // Wait until notified
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " has resumed.");
    }

    // Method to complete the task and notify all waiting threads
    public synchronized void completeTask() {
        taskCompleted = true; // Set the flag to true
        System.out.println(Thread.currentThread().getName() + " completed the task. Notifying all...");
        notifyAll(); // Notify all waiting threads
    }
}