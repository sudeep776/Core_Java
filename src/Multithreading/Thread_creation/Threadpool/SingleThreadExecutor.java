package Multithreading.Thread_creation.Threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable task1 = () -> {
            System.out.println("Task 1 started by " + Thread.currentThread().getName());
            try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
            System.out.println("Task 1 finished");
        };

        Runnable task2 = () -> {
            System.out.println("Task 2 started by " + Thread.currentThread().getName());
            try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
            System.out.println("Task 2 finished");
        };

        executor.submit(task1);
        executor.submit(task2);

        executor.shutdown();
    }
}

