package org.example.model.general;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class People {

    static long howManyDishes (List<Integer> dishes) {

        return dishes.stream().collect(Collectors.counting());

    }

    static List<Integer> list = Arrays.asList(3,4,5,66,22,4,5,54,234,5);
    static Comparator<Integer> dishCalComparator = Comparator.comparingInt(Integer::intValue);

    public static void main(String arg[]) {


        Optional<Integer> maxValue = list.stream()
                .collect(maxBy(dishCalComparator));

        int totalCalories = list
                .stream()
                .collect(summingInt(Integer::intValue));

        double avgCal = list
                .stream()
                .collect(averagingDouble(Integer::doubleValue));

        System.out.println(totalCalories);
        System.out.println(avgCal);

    }
}
