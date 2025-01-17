package assignment;

public class InterThreadCommunication {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread worker1 = new Thread(new Worker(sharedResource), "Worker-1");
        Thread worker2 = new Thread(new Worker(sharedResource), "Worker-2");
        Thread worker3 = new Thread(new Worker(sharedResource), "Worker-3");

        worker1.start();
        worker2.start();
        worker3.start();

        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sharedResource.completeTask();

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