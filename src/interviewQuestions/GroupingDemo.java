package interviewQuestions;

import java.util.*;
import java.util.stream.Collectors;


//create a map as key as age and value as employee in that age group using java
class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupingDemo {
    public static void main(String[] args) {
        // Sample employee data
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25),
                new Employee("Bob", 30),
                new Employee("Charlie", 25),
                new Employee("David", 30),
                new Employee("Eve", 35),
                new Employee("Frank", 40)
        );

        // Group by age and create a list of employees in each age group
        Map<Integer, List<Employee>> ageGroups = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.age));


        Map<Integer, Set<Employee>> ageSet = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.age,Collectors.toSet()));

        Map<Integer, Set<Employee>> ageSetSorted = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.age,TreeMap::new,Collectors.toSet()));



        // Print the resulting map
        ageGroups.forEach((age, employeeList) ->
                System.out.println("Age: " + age + ", Employees: " + employeeList));
    }
}

