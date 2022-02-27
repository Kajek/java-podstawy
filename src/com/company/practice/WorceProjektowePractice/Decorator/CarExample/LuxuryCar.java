package com.company.practice.WorceProjektowePractice.Decorator.CarExample;

public class LuxuryCar extends Car {

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("check aircondition");
    }

}
