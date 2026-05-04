package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import org.example.enumsdemo.Permissions;
import org.example.model.book.BookDetails;
import org.example.model.book.Countries;
import org.example.model.book.Mybook;
import org.example.model.employee.Employee;
import org.jooq.impl.QOM;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.example.model.book.Countries.USA;


public class Main {


    public static void main(String[] args) {

        List<Employee> list = List.of(
                new Employee(1, "John Doe", "IT", 50000, true, 30),
                new Employee(2, "Jane Smith", "HR", 45000, false, 28),
                new Employee(3, "Alice Johnson", "IT", 55000, true, 35),
                new Employee(4, "Bob Brown", "Finance", 60000, false, 40),
                new Employee(5, "Charlie Davis", "IT", 52000, true, 32),
                new Employee(6, "Eve Wilson", "HR", 48000, false, 29)
        );

        Map<Boolean, List<Employee>> result = list.stream()
                .collect(Collectors.partitioningBy(Employee::isActive));

        Map<Boolean, List<Employee>> partitionedBySalary = list
                .stream()
                .collect(Collectors.partitioningBy(emp -> emp.getSalary() > 50000));

        Map<Boolean, Long> countEmployeesInPartition = list
                .stream()
                .collect(Collectors.partitioningBy(
                        e -> e.getSalary() > 50000,
                        Collectors.counting()
                ));

        Map<Boolean, List<String>> namesOfActiveAndInActive = list
                .stream()
                .collect(Collectors.partitioningBy(
                        Employee::isActive,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));

        System.out.println(namesOfActiveAndInActive);
    }

}


























