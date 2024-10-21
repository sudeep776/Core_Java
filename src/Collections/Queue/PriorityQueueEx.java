package Collections.Queue;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    //methods - Queue interface
    //add - throws exception if insertion fails and NPE
    //offer - inserts element and returns false on failure
    //poll - removes head and returns null if empty
    //remove - throws exception if empty
    //peek - returns head value
    //element - returns head but throws exception if empty

    //PriorityQueue - natural ordering
    //uses min heap
    public static void main(String[] args) {
        //uses min heap by default
        PriorityQueue<Integer> pq = new PriorityQueue();
        //add comparator for max heap
        //PriorityQueue<Integer> pq = new PriorityQueue<>((Integer a, Integer b)-> a - b);
         pq.add(5);
         pq.add(2);
         pq.add(8);
         pq.add(1);
         pq.forEach(x-> System.out.println(x));

         //remove or poll
        pq.poll();
        System.out.println(pq);
    }
}
