package com.company.practice.zaawansownaProgPractice.zadanie20;

public class Cone extends D3Shape implements Fillable{

    double radius;
    double height;
    double side;

    @Override
    double calculateVolume() {
        return (Math.PI * Math.pow(radius, 2) * height)/3;
    }

    @Override
    double calculatePeremiter() {
        return Math.PI * radius * side;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2) * height;
    }


}
