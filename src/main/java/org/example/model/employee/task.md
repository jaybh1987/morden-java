Good choice—`partitioningBy` is one of those Java Stream features that looks simple but can get surprisingly powerful when used well.

Before jumping to problems, keep one thing straight:

* `partitioningBy` is just a **special case of grouping** where the key is **boolean (true/false)**.
* It always returns:
  `Map<Boolean, List<T>>` (or with downstream collector)

---

## 🔧 Sample Class for Practice

We’ll use one consistent model so you can focus on partitioning logic:

```java
class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String department;
    private boolean active;

    // constructor, getters, setters, toString
}
```

---

# 🧠 10 Partitioning Practice Questions (with Answers)

---

## 1. Partition employees by active/inactive

👉 Basic use case

```java
Map<Boolean, List<Employee>> result =
    employees.stream()
             .collect(Collectors.partitioningBy(Employee::isActive));
```

---

## 2. Partition employees by salary > 50,000

```java
Map<Boolean, List<Employee>> result =
    employees.stream()
             .collect(Collectors.partitioningBy(e -> e.getSalary() > 50000));
```

---

## 3. Count employees in each partition (salary > 50k)

👉 Using downstream collector

```java
Map<Boolean, Long> result =
    employees.stream()
             .collect(Collectors.partitioningBy(
                 e -> e.getSalary() > 50000,
                 Collectors.counting()
             ));
```

---

## 4. Get names of active vs inactive employees

👉 Mapping + partitioning

```java
Map<Boolean, List<String>> result =
    employees.stream()
             .collect(Collectors.partitioningBy(
                 Employee::isActive,
                 Collectors.mapping(Employee::getName, Collectors.toList())
             ));
```

---

## 5. Partition employees by age > 30 and get average salary

```java
Map<Boolean, Double> result =
    employees.stream()
             .collect(Collectors.partitioningBy(
                 e -> e.getAge() > 30,
                 Collectors.averagingDouble(Employee::getSalary)
             ));
```

---

## 6. Partition and get highest salary in each group

```java
Map<Boolean, Optional<Employee>> result =
    employees.stream()
             .collect(Collectors.partitioningBy(
                 e -> e.getSalary() > 50000,
                 Collectors.maxBy(Comparator.comparing(Employee::getSalary))
             ));
```

---

## 7. Partition employees into IT vs Non-IT

```java
Map<Boolean, List<Employee>> result =
    employees.stream()
             .collect(Collectors.partitioningBy(
                 e -> "IT".equalsIgnoreCase(e.getDepartment())
             ));
```

---

## 8. Partition and convert to Set instead of List

```java
Map<Boolean, Set<Employee>> result =
    employees.stream()
             .collect(Collectors.partitioningBy(
                 Employee::isActive,
                 Collectors.toSet()
             ));
```

---

## 9. Partition and sum salaries

```java
Map<Boolean, Double> result =
    employees.stream()
             .collect(Collectors.partitioningBy(
                 Employee::isActive,
                 Collectors.summingDouble(Employee::getSalary)
             ));
```

---

## 10. Nested logic: Partition + Grouping

👉 Advanced use case

```java
Map<Boolean, Map<String, List<Employee>>> result =
    employees.stream()
             .collect(Collectors.partitioningBy(
                 e -> e.getSalary() > 50000,
                 Collectors.groupingBy(Employee::getDepartment)
             ));
```

---

# 📌 Best Practices (Important)

### 1. Use `partitioningBy` ONLY when condition is boolean

❌ Bad:

```java
groupingBy(e -> e.getDepartment())
```

✅ Good:

```java
partitioningBy(e -> e.getSalary() > 50000)
```

---

### 2. Prefer method references when possible

```java
partitioningBy(Employee::isActive)
```

---

### 3. Always consider downstream collectors

Most real power comes from:

* `counting()`
* `mapping()`
* `averagingDouble()`
* `maxBy()`
* `groupingBy()`

---

### 4. Know the structure

| Case            | Output                  |
| --------------- | ----------------------- |
| Simple          | `Map<Boolean, List<T>>` |
| With downstream | `Map<Boolean, D>`       |

---

### 5. Avoid overusing partitioning

If you need **more than 2 groups**, use:

```java
groupingBy()
```

---

# 💡 What Next?

If you want to go deeper, next step could be:

* Compare `partitioningBy vs groupingBy`
* Real-world scenarios (like fraud detection, filtering APIs)
* Writing custom collectors

Or I can give you:
👉 **10 hands-on coding problems (without answers)** so you can practice like an interview.
