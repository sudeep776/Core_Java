package Collections.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    String name;
    int age;
    public Student(String name,int age){
        this.age=age;
        this.name=name;
    }
}
public class ComparatorvsComparable {
    public static void main(String[] args) {
        //Students
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Sudeep",23));
        studentList.add(new Student("Rahul",23));
        studentList.add(new Student("Aman",24));

        //using lambda
//        studentList.sort((s1,s2)->Integer.compare(s2.age,s1.age));
//        for(Student s1:studentList){
//            System.out.println(s1.age);
//        }

        //using anonymous class
        Comparator<Student> ageComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.age, s2.age);  // Compare by age
            }
        };

        // Sort the student list using the comparator
        studentList.sort(ageComparator);
        for(Student s1:studentList){
            System.out.println(s1.age);
        }
    }
}
