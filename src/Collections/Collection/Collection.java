package Collections.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        //Collections - usage of collections
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(6);
        l1.add(3);
//        System.out.println(l1);
//        Collections.sort(l1);
//        System.out.println(l1);

        //iterator method
//        Iterator<Integer> it1 =l1.iterator();
//        while(it1.hasNext()){
//            Integer number = it1.next();
//            System.out.println(number);
//            if(number==3){
//                it1.remove();
//            }
//        }

        //using for each method
        l1.forEach((Integer x)-> System.out.println(x));

        //collection interface methods - generic methods for all implementation extending interfaces
        System.out.println("checks if its empty :"+l1.isEmpty());

        System.out.println("check if it contains :"+l1.contains(1));
    }
}
