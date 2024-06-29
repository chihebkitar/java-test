package collection;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2);
        List<Double> results1 = CollectionTest.compute1(integers);
        System.out.println("compute1 Results: " + results1);

        List<String> strings = Arrays.asList("hello", "world");
        List<String> results2 = CollectionTest.compute2(strings);
        System.out.println("compute2 Results: " + results2);

    }
}
