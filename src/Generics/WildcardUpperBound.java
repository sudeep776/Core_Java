package Generics;

import java.util.List;

public class WildcardUpperBound {
    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);  // Prints any subclass of Number
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<Double> doubleList = List.of(3.14, 2.71);

        printNumbers(intList);    // Output: 1 2 3
        printNumbers(doubleList); // Output: 3.14 2.71
    }
}

