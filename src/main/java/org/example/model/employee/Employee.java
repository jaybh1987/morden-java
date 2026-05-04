package org.example.model.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;
    private boolean active;
    private int age;


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", active=" + active +
                ", age=" + age +
                '}';
    }
}
