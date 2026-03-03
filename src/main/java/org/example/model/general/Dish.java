package org.example.model.general;

public class Dish {

    private String name;
    private int calories;
    private String type;

    public Dish(String name, int calories, String type) {
        this.name = name;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{name='" + name + "', calories=" + calories + "}";
    }
}