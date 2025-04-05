package Multithreading.Thread_creation.Threadpool;

import java.util.concurrent.*;

public class ScheduledExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Task 1: Run once after 2 seconds
        scheduler.schedule(() -> {
            System.out.println("🚀 Task 1: Ran after 2 seconds");
        }, 2, TimeUnit.SECONDS);

        // Task 2: Repeats every 3 seconds after an initial 1-second delay
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("🔁 Task 2: Runs every 3 seconds");
        }, 1, 3, TimeUnit.SECONDS);

        // Let it run for 10 seconds before shutting down
        scheduler.schedule(() -> {
            System.out.println("🛑 Shutting down scheduler");
            scheduler.shutdown();
        }, 10, TimeUnit.SECONDS);
    }
}

