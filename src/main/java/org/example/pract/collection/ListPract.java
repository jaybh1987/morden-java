package org.example.pract.collection;

import com.sun.jdi.PrimitiveValue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListPract {

    final static List<String> friends = List.of("John", "Jane", "Doe", "Smith", "Emily");

    final Function<String, Predicate<String>> startsWithLetter = fst -> snd -> snd.toLowerCase().startsWith(fst.toLowerCase());

    final static Predicate<String> checkIfStartWith(final String letter) {
        String s = letter.toLowerCase();
        return n -> n.toLowerCase().startsWith(s);
    }

    private static void carryingComputationalState() {
        String ls = friends.stream().reduce("a",  (fst, snd) -> fst.length() >= snd.length() ? fst : snd);

        System.out.println(ls);
    }

    private static void coundCharts() {
        Integer i = friends.stream().mapToInt( r -> r.length()).sum();
        System.out.println(i);
    }

    private static void joining() {
        String s = friends.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(s);
    }

    private static void findingElements(String letter) {
//        String prefix = letter.toLowerCase();
//        List<String>  s = friends.stream().filter( names -> names.toLowerCase().startsWith(prefix)).toList();
//        System.out.println(s);

        checkIfStartWith(letter);
    }

    private static void tranformingUsingLamda() {

        friends.stream().map(String::toUpperCase).forEach(System.out::println);
    }
    private static void transformingList() {
        final List<String> uppercaseNames = new ArrayList<String>();
        friends.forEach( f -> uppercaseNames.add(f.toUpperCase()));

        System.out.println(uppercaseNames);
    }
    private static void iterateOverList() { friends.forEach(System.out::println); }

    final static List<BigDecimal> list = List.of(BigDecimal.valueOf(1), BigDecimal.valueOf(2), BigDecimal.valueOf(3));

    final static List<Integer> list2 = List.of(1, 2, 3);

}
