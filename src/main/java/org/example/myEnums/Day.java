package org.example.myEnums;

import java.time.temporal.ValueRange;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


// add method that takes alphabet as input for e.g
// when I put "M" then it will return MONDAY("M") when no alphabet match then return DEFAULT("")
public enum Day {

    MONDAY("M"),
    TUESDAY("T"),
    WEDNESDAY("W"),
    DEFAULT("");


    String initialLetter ;

    Day(String initialLetter) {
        this.initialLetter = initialLetter;
    }

    //static lookup once
    private static final Map<String, Day> LOOKUP = Arrays.stream(values()).collect(Collectors.toMap(
            i -> i.initialLetter,
            i -> i
    ));

    public static Day fromLetter(String letter) {
        return LOOKUP.getOrDefault(letter, DEFAULT);
    }

    public static List<Day> getConstants () {
        return Arrays.stream(values()).toList();
    }

    public static List<String> getConstantsValues () {
        return Arrays.stream(values()).map( i -> i.initialLetter).toList();
    }

    public static void showLenght() {

        Integer i = IntStream.range(0, values().length).sum();

        System.out.println(i);
    }

    public static Map<Integer, Day> indexedMap() {

        return IntStream.range(0, values().length)
                .boxed()
                .collect(Collectors.toMap(
                        i -> i,
                        i -> values()[i]
                ));
    }





}
