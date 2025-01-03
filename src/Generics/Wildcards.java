package Generics;

import java.util.List;

public class Wildcards {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<String> strList = List.of("A", "B", "C");

        // Works with any type of List
        printList(intList);  // Output: 1 2 3
        printList(strList);  // Output: A B C
    }
}
