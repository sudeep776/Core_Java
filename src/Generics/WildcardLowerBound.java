package Generics;

import java.util.ArrayList;
import java.util.List;


    public class WildcardLowerBound {
        public static void addInteger(List<? super Integer> list) {
            list.add(10);  // Can safely add Integer or any supertype of Integer
        }

        public static void main(String[] args) {
            List<Number> numberList = new ArrayList<>();
            List<Object> objectList = new ArrayList<>();

            addInteger(numberList);   // Works: Number is a superclass of Integer
            addInteger(objectList);   // Works: Object is a superclass of Integer

            System.out.println(numberList);  // Output: [10]
            System.out.println(objectList);  // Output: [10]
        }
    }

