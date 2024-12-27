package Java_Classes;

class OuterClass1{
    int instanceVariable =10;
    static int classVariable = 20;

    class InnerClass{
        public void print(){
            System.out.println(classVariable+instanceVariable);
        }
    }
    public void display(){
        int methodLocalVariable = 3;
        class LocalInnerClass{
            int localInnerVariable = 4;
            public void print(){
                System.out.println(instanceVariable+classVariable+methodLocalVariable+localInnerVariable);
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.print();
    }
}
public class Inner {
    public static void main(String[] args) {
        OuterClass1 outerClass1 = new OuterClass1();
        OuterClass1.InnerClass innerClass = outerClass1.new InnerClass();
        innerClass.print();
    }
}
