package com.company.practice.worceProjektowePractice.Decorator.CarExample;

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
