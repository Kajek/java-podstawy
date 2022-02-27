package com.company.practice.WorceProjektowePractice.Decorator.CarExample;

public class BasicDecorator implements ICar {

    private ICar basicCar;

    public BasicDecorator(ICar basicCar) {
        this.basicCar = basicCar;
    }

    @Override
    public void startEngine() {
        basicCar.startEngine();
    }
}
