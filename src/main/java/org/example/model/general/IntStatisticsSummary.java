package org.example.model.general;


public class IntStatisticsSummary {

    int count, sum, min, average, max;

    public IntStatisticsSummary(){}

    IntStatisticsSummary(int count, int sum, int min, int average, int max) {
        this.count = count;
        this.sum = sum;
        this.min = min;
        this.average = average;
        this.max = max;
    }

}
