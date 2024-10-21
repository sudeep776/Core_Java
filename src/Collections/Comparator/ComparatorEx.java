package Collections.Comparator;

import java.util.Arrays;

class Car{
    public Car(String name,String type){
        this.name=name;
        this.type=type;
    }
    String name;
    String type;
}

public class ComparatorEx {
    //comparator or comparable helps in sorting of collection of objects
    public static void main(String[] args) {
        //traditional sort
        int arr[] = {5,4,3,2,1};
        Arrays.sort(arr);

        //sort with comparator
        Integer[] arr1 = {5,3,2,1,4};
        Arrays.sort(arr1,(Integer a1,Integer a2)->a2-a1);
        for(Integer a1:arr1){
            System.out.println(a1);
        }

        //sorting objects with comparator
        Car[] cars = new Car[3];
        cars[0] = new Car("Tata","Diesel");
        cars[1] = new Car("Maruti","Petrol");
        cars[2] = new Car("Hyundai","Petrol");
        Arrays.sort(cars,(Car obj1, Car obj2)->obj1.name.compareTo(obj2.name));

        //to use comparable implement the interface and override method compareTo
    }
}
