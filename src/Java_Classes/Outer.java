package Java_Classes;

class OuterClass {
    int instanceVariable = 10;
    static int classVariable = 20;

    static class NestedClass{
        public void print(){
            System.out.println(classVariable);
            //cant access classVariable;
        }
    }
}

public class Outer {
    public static void main(String[] args) {
        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
        nestedClass.print();
    }
}
