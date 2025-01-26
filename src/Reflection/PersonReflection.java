package Reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class PersonReflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sudeep"));
        people.add(new Person("Rahul"));

        for(Person p1 : people){
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true);
            String name = (String) field.get(p1);
            System.out.println(name);
        }
    }
}
