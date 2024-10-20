package Collections.Set;

//Set does not contain duplpicate values
//Set doesnt maintain order and cant be indexed
//linkedhashset maintains order

//stack internally use hashmap

//hashset -- internally uses hashmap
//when insertion map.put(element,new Object());
//not thread safe use  - concurrenthashmap.newKeySet() or Collections.synchronizedSet

import java.util.HashMap;
import java.util.Map;

public class HashSet {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");
    }
}
