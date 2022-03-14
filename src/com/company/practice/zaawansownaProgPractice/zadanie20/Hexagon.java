package com.company.practice.zaawansownaProgPractice.zadanie20;

public class Hexagon extends Shape{

    double side;

    @Override
    double calculatePeremiter() {
        return side *6 ;
    }

    @Override
    double calculateArea() {
        return (6*(Math.pow(side,2)* Math.sqrt(3)))/4;
    }
}
