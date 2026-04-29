package org.example.model.general.doingCollectors;
public class City {

    private String name;
    private double temperature;

    // Parameterized constructor
    public City(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    // Getters
    public String getName() { return name; }
    public Double getTemperature() { return temperature; }

    // Overriding toString for display
    @Override
    public String toString() {
        return name + " --> " + temperature;
    }
}