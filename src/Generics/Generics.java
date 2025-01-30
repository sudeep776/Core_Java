package Generics;


class Print<T>{
    T value;

    public T getPrintValue(){
        return value;
    }

    public void setPrintValue(T value){
        this.value=value;
    }
}



public class Generics {
    public static void main(String[] args) {
        Print<Integer> printObj1 = new Print<Integer>();
        printObj1.setPrintValue(1);
        Integer PrintValue = printObj1.getPrintValue();
        System.out.println(PrintValue);
    }
}
