package Collections.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        //count greater than 2
        Long count = l1.stream().filter(x->x<3).count();
        System.out.println(count);

        //ex2 : stream iterate
        Stream<Integer> stream = Stream.iterate(0, x -> x + 3).limit(10);
        stream.forEach(x-> System.out.println(x));

        ////map method
        List<Integer> l2 = l1.stream().map(x->x*3).collect(Collectors.toList());
        System.out.println(l2);

        //flatMap - flattens 2d to 1d array
        List<List<String>> f1 = Arrays.asList(Arrays.asList("I","Love","Java"),
                Arrays.asList("Concepts","are","clear"));
        Stream<String> s1 = f1.stream().flatMap(x->x.stream());
        s1.forEach(x-> System.out.println(x));

        Stream<String> s2 = f1.stream().flatMap(x->x.stream().map(y->y.toLowerCase()));
        s2.forEach(x-> System.out.println(x));

        //distinct --remove dupicates and sorted -- sorts

        //mapToInt
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");

        // Convert the list of strings to an IntStream and sum them
        int sum = numbers.stream()
                .mapToInt(Integer::parseInt) // Convert each String to int
                .sum(); // Sum the integers

        System.out.println("Sum: " + sum); // Output: Sum: 15


        //Intermediate operation as Lazy
        //beacause stream is invoked when terminal operation is executed
        Stream<Integer> streamLazy = l1.stream().filter(x->x>2).peek(y-> System.out.println(y));
        streamLazy.count(); // comment this line and it wont print
    }
}
