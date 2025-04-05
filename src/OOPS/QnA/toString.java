package OOPS.QnA;

class Vehicle{
    public String name;
    public Vehicle(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String TestVehicle(){
        return "Test OK";
    }
}

class Tvs extends Vehicle{
    public Tvs(String name) {
        super(name);
    }
    public String make(){
        return "Tvs India";
    }
}


public class toString {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Honda");
        System.out.println(v1.toString());

        String a1 = "Hello";
        String a2 = new String("Hello");
        System.out.println(a1==a2);

        Tvs v2 = new Tvs("TVS_Scooty");
        v2.make();
    }
}
