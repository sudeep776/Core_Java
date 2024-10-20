package Collections.Set;
import java.util.TreeSet;

//doesnt allow null because of natural ordering
//not thread safe
public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
    }
}
