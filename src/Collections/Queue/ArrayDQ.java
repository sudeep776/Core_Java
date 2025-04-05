package Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDQ {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(2);
        dq.add(3);
        dq.add(5);
        dq.add(7);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.addFirst(3);
        dq.addLast(7);
        System.out.println(dq);
    }
}
