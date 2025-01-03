package Java_Classes_3.Singleton;

public class Double_Check {
    private static volatile Double_Check test;
    private Double_Check(){

    }
    public static Double_Check getInstance(){
        if(test==null){
            synchronized (Double_Check.class){
                if(test==null){
                    test= new Double_Check();
                }
            }
        }
        return test;
    }
}
