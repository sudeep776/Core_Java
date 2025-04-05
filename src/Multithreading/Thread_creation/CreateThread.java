package Multithreading.Thread_creation;

//class MyThread extends Thread{
//    public void run(){
//        System.out.println("running thread 1");
//    }
//}

public class CreateThread {
    public static Object sharedObject = new Object();
    public static void main(String[] args) {

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread runnable is running");
//            }
//        };

        Runnable runnable1 = ()->{
            System.out.println("Thread1 runnable is running");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread1 completed");
        };

        Runnable runnable2 = ()->{
            System.out.println("Thread1 runnable is running");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread1 completed");
        };

        Thread runnableThread1 = new Thread(runnable1,"runnable1");
        //runnableThread.setDaemon(true);
        runnableThread1.start();

        Thread runnableThread2 = new Thread(runnable2,"runnable2");
        runnableThread2.start();
        System.out.println("Reaching main thread");
    }
}
