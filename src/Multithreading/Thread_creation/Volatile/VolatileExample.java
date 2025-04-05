package Multithreading.Thread_creation.Volatile;

public class VolatileExample {
    public static void main(String[] args) throws InterruptedException {
        MyTask task = new MyTask();
        Thread t = new Thread(task);
        t.start();

        Thread.sleep(7000); // Let the thread run for a while

        task.stop(); // Signal the thread to stop

        t.join(); // Wait for the thread to finish
        System.out.println("Main thread exiting.");
    }
}
