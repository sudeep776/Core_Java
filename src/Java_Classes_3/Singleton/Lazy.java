package Java_Classes_3.Singleton;

public class Lazy {
    private static Lazy lazy;

    public static Lazy getInstance(){
        if(lazy==null){
            lazy=new Lazy();
        }
        return lazy;
    }
}
