package com.company.practice.zaawansownaProgPractice.zadanie20;

public class Rectangle extends Shape{

    private double lengthA;
    private double lenghtB;

    @Override
    double calculatePeremiter() {
        return (2 * lengthA) + (2 *lenghtB);
    }

    @Override
    double calculateArea() {
        return lengthA * lenghtB;
    }
}
