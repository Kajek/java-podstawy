package com.company.practice.WorceProjektowePractice.Decorator.CarExample;

public class PoliceCarDecorator extends BasicDecorator {
    public PoliceCarDecorator(ICar basicCar) {
        super(basicCar);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Check safety system");
    }
}
