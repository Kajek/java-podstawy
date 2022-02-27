package com.company.practice.randomExamples.company;

public class Employee {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void show(){
        System.out.println("Name of employee: " + getName() +", salary: " + getSalary());
    }
    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
