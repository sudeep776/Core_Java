package Collections.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Collections;
public class LinkedHmap {
    //maintains insertion order or access order
    // access order - high frequently used
    //it uses double linkedlist which consists before and after
    // to track the next and previous elements inserted

    //not thread safe use synchronizedmap below example

//    public static void main(String[] args) {
//
//        //throws concurrentmodification exception
//        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
//
//        // Adding elements
//        linkedHashMap.put("Alice", 30);
//        linkedHashMap.put("Bob", 25);
//
//        // Potentially unsafe iteration
//        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//            if (entry.getKey().equals("Alice")) {
//                linkedHashMap.put("Charlie", 35); // Adding a new entry
//            }
//            // Other threads could modify the map here, causing issues
//        }
//        System.out.println("Final map content: " + linkedHashMap);
//    }
    public static void main(String[] args) {
        // Create a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Wrap it with Collections.synchronizedMap to make it thread-safe
        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(linkedHashMap);

        // Adding elements
        synchronizedMap.put("Alice", 30);
        synchronizedMap.put("Bob", 25);

        // Safe iteration with explicit synchronization
        synchronized (synchronizedMap) { // Synchronize on the map for safe iteration
            for (Map.Entry<String, Integer> entry : synchronizedMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());

                // If you want to modify the map, do it after the iteration
                if (entry.getKey().equals("Alice")) {
                    // Instead of modifying directly, let's prepare to change it
                    // Example: update Alice's age to 31 after iteration
                    synchronizedMap.put("Alice", 31); // This can still be risky here
                }
            }
        }

        // Print final contents of the map
        System.out.println("Final map content: " + synchronizedMap);
    }
}

