package Java_Classes;

//types of inner class
//non static inner class - can access all members of outside class including private members
//static nested class  - can only access static members of outer class
//method local inner class - defined within method can access local variables and members of enclosing class
//anonmyous inner class -
class OuterClass{
    private String outerField = "Outer field";
    private static String staticOuterField = "Static Outer Field";

    class InnerClass{
        void display(){
            System.out.println("Accessing "+outerField);
        }
    }

    static class StaticNestedClass{
        void display(){
            System.out.println("Accessing "+staticOuterField);
        }
    }

    void outerMethod(){
        final String localVariable = "Local Variable";

        class LocalInnerClass{
            void display(){
                System.out.println("Accessing "+localVariable);
            }
        }
        LocalInnerClass l1 = new LocalInnerClass();
        l1.display();
    }
}

abstract class AbstractClass{
    abstract void display();
}


public class Main {
    public static void main(String[] args) {
        //non static inner class
//        OuterClass o1 = new OuterClass();
//        OuterClass.InnerClass inner = o1.new InnerClass();
//        inner.display();

        //static inner class
//        OuterClass o1 = new OuterClass();
//        OuterClass.StaticNestedClass staticInner = new OuterClass.StaticNestedClass();
//        staticInner.display();

        //method inner local class
//        OuterClass o1 = new OuterClass();
//        o1.outerMethod();

        AbstractClass anonymousClass = new AbstractClass() {
            @Override
            void display() {
                System.out.println("Anonmyous inner class");
            }
        };
        anonymousClass.display();
    }
}
