package Java_Classes_3.Singleton;

public class Synchronized {
    private static Synchronized test;

    synchronized public static Synchronized getInstance(){
        if(test==null){
            test = new Synchronized();
        }
        return test;
    }
}
