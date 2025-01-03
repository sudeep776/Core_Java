package Java_Classes_3.Singleton;

//eager initialization
public class Eager {
    private static Eager singleton = new Eager();
    private Eager(){

    }
    public static Eager getInstance(){
        return singleton;
    }
}
