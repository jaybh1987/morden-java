package org.example.model.general;

import java.util.*;
import java.util.concurrent.RecursiveTask;
import java.util.function.BinaryOperator;

import java.util.function.Function;
import java.util.stream.Collectors;

public class DishUtils {

    public static List<Dish> menu = Arrays.asList(new Dish("Pasta", 10, "Veg"), new Dish("Salad", 20, "Veg"),
            new Dish("Burger", 80, "Veg"), new Dish("Paplet", 100, "SeaFood"), new Dish("Chicken", 120, "NonVeg"));

    private void test() {

        Map<String, List<Dish>> s = menu.stream().collect(Collectors.groupingBy(Dish::getType));
    }

    public static Map<String, HashSet<CaloricLevel>> caloricLevelsByType_two(List<Dish> list) {

        return list.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.mapping(dish -> {

            if (dish.getCalories() <= 20)
                return CaloricLevel.DIET;
            else if (dish.getCalories() <= 50)
                return CaloricLevel.NORMAL;
            else
                return CaloricLevel.FAT;
        }, Collectors.toCollection(HashSet::new))));
    }

    public static Map<String, Set<CaloricLevel>> caloricLevelsByType(List<Dish> list) {

        return list.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.mapping(d -> {
            if (d.getCalories() <= 20)
                return CaloricLevel.DIET;
            else if (d.getCalories() <= 50)
                return CaloricLevel.NORMAL;
            else
                return CaloricLevel.FAT;
        }, Collectors.toSet()

        )));

    }

    public static Map<String, Dish> mostCaloriesByType_two(List<Dish> list) {

        // return list
        // .stream()
        // .collect(
        // Collectors.groupingBy(
        // Dish::getType,
        // Collectors.collectingAndThen(
        // Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get
        // )
        // ));
        return list.stream().collect(Collectors.toMap(Dish::getType, Function.identity(),
                BinaryOperator.maxBy(Comparator.comparingInt(Dish::getCalories))));
    }

    public static Map<String, Optional<Dish>> mostCaloriesByType(List<Dish> list) {

        return list.stream().collect(
                Collectors.groupingBy(Dish::getType, Collectors.maxBy(Comparator.comparingInt(Dish::getCalories))));
    }

    public static Map<String, Long> typeCount(List<Dish> list) {

        return list.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));
    }

    static public Map<String, List<Dish>> groupByType(List<Dish> list) {
        return list.stream().collect(Collectors.groupingBy(Dish::getType));
    }

    static public Map<String, Map<CaloricLevel, List<Dish>>> multiLevelGrouping(List<Dish> list) {

        Map<String, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloricLevel = list.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.groupingBy(dish -> {
                    if (dish.getCalories() <= 20) {
                        return CaloricLevel.DIET;
                    } else if (dish.getCalories() <= 50) {
                        return CaloricLevel.NORMAL;
                    } else
                        return CaloricLevel.FAT;
                })));

        return dishesByTypeCaloricLevel;
    }

    public static enum CaloricLevel {
        DIET, NORMAL, FAT
    }

    public static Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);

    static public Map<CaloricLevel, List<Dish>> specialClassify(List<Dish> list) {

        return list.stream().collect(Collectors.groupingBy(dish -> {
            if (dish.getCalories() <= 20)
                return CaloricLevel.DIET;
            else if (dish.getCalories() <= 100) {
                return CaloricLevel.NORMAL;
            } else
                return CaloricLevel.FAT;
        }));
    }
}
