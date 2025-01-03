package Java_Classes_3;

import java.util.ArrayList;
import java.util.List;

public class Immutable {
    private final String name;
    private final List<Object> petnameList;

    Immutable(String name,List<Object> petnameList){
        this.name=name;
        this.petnameList=petnameList;
    }
    public String getName(){
        return name;
    }
    public List<Object> getPetnameList(){
        return new ArrayList<>(petnameList);
    }
}
