package OOPS.Inheritance;

public class Car{
    private int wheels;
    private Engine engine;
    public Car(Engine engine){
        this.engine=engine;
    }
    public String brake() {
        return "applying brake";
    }

    public static void main(String[] args) {
        // creating out of scope
        Engine engine1 = new Engine();
        Car car1 = new Car(engine1);
        //car1.destroy();
    }
}



// Hyundai is a Car
//Assocation - has a relationship
// Car has a engine

class Engine{
    public Engine(){

    }
    public String startEngine(){
        return "Start engine";
    }
}

class ElectricEngine extends Engine{

}
class DieselEngine extends Engine{

}