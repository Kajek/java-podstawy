package com.company.practice.worceProjektowePractice.Decorator.CarExample;

public class PoliceCar extends Car {

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Check safety system");
    }
}