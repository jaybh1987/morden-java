package org.example.model.modelToTest;

public class Demo {

    String name;
    private Integer age;

    private Demo(String name) {
        this.name = name;
    }

    public static Demo of(String name) {
        return new Demo(name);
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) throws IllegalArgumentException {

        if (age == 0 || age > 100) {
            throw new IllegalArgumentException("Age cannot be zero or >100");
        } else {
            this.age = age;
        }
    }

    public Integer getAge() {
        return age;
    }
}
