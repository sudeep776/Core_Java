package Java_Classes_3.Singleton;

public class Bill_Pugh {
    private Bill_Pugh(){

    }
    private static class helper{
        private static final Bill_Pugh INSTANCE_OBJECT = new Bill_Pugh();
    }
    public static Bill_Pugh getInstance(){
        return helper.INSTANCE_OBJECT;
    }
}
