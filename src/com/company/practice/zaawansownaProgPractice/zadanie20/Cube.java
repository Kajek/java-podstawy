package com.company.practice.zaawansownaProgPractice.zadanie20;

public class Cube extends D3Shape {

    double side;
    private double stateOfWater;

    @Override
    double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    double calculatePeremiter() {
        return Math.pow(side, 2);
    }

    @Override
    double calculateArea() {
        return 6 * Math.pow(side, 2);
    }


}
