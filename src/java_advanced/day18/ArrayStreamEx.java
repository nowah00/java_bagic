package java_advanced.day18;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStreamEx {
    public static void main(String[] args) {
        String[] strings = new String[]{"1","2","3","4","5"};
        Stream<String> stream = Arrays.stream(strings);
//        stream.forEach(System.out::println);
        stream.forEach(item -> System.out.print(item + " "));

        Integer[] integers = new Integer[]{1,2,3,4,5};
        Stream<Integer> stream1 = Arrays.stream(integers);
        stream1.forEach(item -> System.out.print(item + " "));
    }
}
