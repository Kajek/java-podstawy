package com.company.javaZaawansowanaProgZadania.Zadanie789;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Employee findEmplyeeBySalary(List<Employee> list, int salaryBreakpoint){
        return list.stream().filter(Objects::nonNull)
                .filter(e -> e.getSalary() > salaryBreakpoint)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public List<Employee> sortEmployeesByName(List<Employee> list){
        return list.stream().sorted((e1,e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
    }

    public double findMaxSalary(List<Employee> list){
        return list.stream()
                .map(e -> e.getSalary())
                .max(Comparator.naturalOrder())
                .orElseThrow(NoSuchElementException::new);
    }
}

