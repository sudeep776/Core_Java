package OOPS;

class Vehicle{
    int seater;
    String name;
    String type;
    public Vehicle(){

    }
}
class Bike extends Vehicle{
    public Bike(){

    }
}
public class OOPS2 {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.name="splendor";
        b1.type="100cc";
    }

}
