package proModule.home4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
//        ex1
//        int sum = IntStream.rangeClosed(1, 100)
//                .filter(n -> n % 2 == 0)
//                .sum();
//
//        System.out.println(sum);

//        ex2
//        int strm = IntStream.rangeClosed(1, 5)
//                .reduce((x, y) -> x * y)
//                .getAsInt();
//        System.out.println(strm);

//        ex3
//        long notEmptyStr = Stream.of("abc", "", "", "def", "qqq")
//                .filter(x -> x != "")
//                .count();
//        System.out.println(notEmptyStr);

//        ex4
//        List<Double> doubleList = Arrays.asList(1.0, 1.3, 4.5, 1.7, 2.0);
//        List<Double> reversed = doubleList.stream()
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//        System.out.println(reversed);

//          ex5
//        List<String> result = List.of("abc", "def", "qqq").stream()
//                .map(x -> x.toUpperCase())
//                .collect(Collectors.toList());
//        System.out.println(result);

//        ex6
//        Set<Set<Integer>> set = new HashSet<>();
//        set.stream()
//                .collect(Collectors.toSet());
//        System.out.println(set instanceof Set);
    }
}
