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
//                .filter(x -> !x.equals(""))
//                .count();
//        System.out.println(notEmptyStr);

//        ex4
//        List<Double> doubleList = Arrays.asList(1.0, 1.3, 4.5, 1.7, 2.0);
//        List<Double> reversed = doubleList.stream()
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//        System.out.println(reversed);

//          ex5
//        String result = List.of("abc", "def", "qqq").stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.joining(", "));
//        System.out.println(result);

//        ex6
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(5, 6, 7));
        Set<Set<Integer>> set = new HashSet<>();
        set.add(set1);
        set.add(set2);
        set.add(set3);
        Set<Integer> resultSet = set.stream()
                .flatMap(Set::stream)
                .collect(Collectors.toSet());
    }
}
