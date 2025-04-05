package Multithreading.Thread_creation.Volatile;

public class MyTask implements Runnable{
    private volatile boolean running = true;
    @Override
    public void run() {
        while (running){
            System.out.println("Running ...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("stopped");
    }

    public void stop() {
        running=false;
    }
}
