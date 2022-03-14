package com.company.practice.zaawansownaProgPractice.zadanie20;

public class Triangle extends Shape{

    private double height;
    private double base;
    private double sideA;
    private double sideB;

    @Override
    double calculatePeremiter() {
        return base + sideA + sideB;
    }

    @Override
    double calculateArea() {
        return (base * height)/2;
    }
}
