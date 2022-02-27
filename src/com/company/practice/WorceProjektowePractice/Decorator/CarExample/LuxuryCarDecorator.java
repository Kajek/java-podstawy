package com.company.practice.WorceProjektowePractice.Decorator.CarExample;

public class LuxuryCarDecorator extends BasicDecorator {

    public LuxuryCarDecorator(ICar basicCar) {
        super(basicCar);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("check aircondition");
    }
}
