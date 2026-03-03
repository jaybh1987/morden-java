package org.example;

import org.example.model.general.Dish;
import org.example.model.general.DishUtils.*;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.example.model.general.DishUtils.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


        System.out.println(caloricLevelsByType_two(menu));
    }

}