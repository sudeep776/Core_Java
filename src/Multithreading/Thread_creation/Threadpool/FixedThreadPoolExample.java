package Multithreading.Thread_creation.Threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Create 5 tasks
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            Runnable task = () -> {
                System.out.println("Task " + taskId + " started by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task " + taskId + " finished by " + Thread.currentThread().getName());
            };

            executor.submit(task);
        }

        executor.shutdown(); // Shut down the executor after all tasks are submitted
    }
}

