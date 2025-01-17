package assignment;

public class SharedResource {
    private boolean taskCompleted = false;

    public synchronized void waitForTask() {
        while (!taskCompleted) {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting.");
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " has resumed.");
    }

    public synchronized void completeTask() {
        taskCompleted = true;
        System.out.println(Thread.currentThread().getName() + " completed the task. Notifying all...");
        notifyAll(); 
    }
}