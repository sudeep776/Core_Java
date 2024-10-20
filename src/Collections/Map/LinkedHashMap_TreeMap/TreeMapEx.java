package Collections.Map.LinkedHashMap_TreeMap;

import java.util.Map;
import java.util.TreeMap;

//Map -- SortedMap --NavigableMap-- TreeMap

//sorted by natural ordering
//based on bst red black tree ( self balancing binary tree)
//o(logn) time complexity of insert,remove and get operations \

//has parent left and right
// 4,1,5 lets say if i insert 4 so 1 will be on left and 5 on right to maintain bst.
public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding some entries
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        // Find the immediate lower entry for a given key
        Map.Entry<Integer, String> lowerEntry = map.lowerEntry(3);

        //lowerkey - return immediate less than 3
        Integer lowerKey = map.lowerKey(3);

        //ceiling entry - returns equal or greater entry
        Map.Entry<Integer, String> ceilingEntry = map.ceilingEntry(4);

        //similar -- higherentry , floorentry and higherkey ,firstentry , lastentry
    }
}
