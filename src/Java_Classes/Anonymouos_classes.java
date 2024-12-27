package Java_Classes;

abstract class Car{
    public abstract void pressBreak();
}
public class Anonymouos_classes {

    public static void main(String[] args) {
        Car audiCarObj = new Car() {
            @Override
            public void pressBreak() {
                System.out.println("brake applied");
            }
        };
        audiCarObj.pressBreak();
    }
}
