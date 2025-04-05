package Multithreading.Thread_creation.Atomic;

//class SharedCounter{
//    //private int count;
//    private AtomicInteger count=new AtomicInteger(0);
//    public void increment(){
//    count.getAndIncrement();
//    }
//    public int getCount(){
//        return count.get();
//    }
//}
class SharedCounter{
    private int count;
    //private AtomicInteger count=new AtomicInteger(0);
//    public synchronized void increment(){
//        count++;
//    }
    public void increment(){
        synchronized (this){
            count++;
        }
    }
    public synchronized int getCount(){
        return count;
    }
}

public class Atomic1 {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter s1 = new SharedCounter();
        //create a thread increase it 5000 times and start it
        Thread t1 =new Thread(()->{
            System.out.println("Thread 1 started");
            for(int i=0;i<5000;i++){
                s1.increment();
            }
            System.out.println("Thread 1 completed");
        });
        t1.start();
        t1.join();
        System.out.println(s1.getCount());
    }
}
