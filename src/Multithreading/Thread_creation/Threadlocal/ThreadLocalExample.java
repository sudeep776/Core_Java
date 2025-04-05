package Multithreading.Thread_creation.Threadlocal;

public class ThreadLocalExample {

    // Create a ThreadLocal variable to store thread-specific names
    private static ThreadLocal<String> threadName = new ThreadLocal<>();

    public static void main(String[] args) {

        // First thread sets its own name
        Thread t1 = new Thread(() -> {
            threadName.set("Thread-A");
            System.out.println("T1 Name from ThreadLocal: " + threadName.get());
        });

        // Second thread sets a different name
        Thread t2 = new Thread(() -> {
            threadName.set("Thread-B");
            System.out.println("T2 Name from ThreadLocal: " + threadName.get());
        });

        t1.start();
        t2.start();
    }
}

