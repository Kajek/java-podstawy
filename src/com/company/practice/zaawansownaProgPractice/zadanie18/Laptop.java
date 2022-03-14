package com.company.practice.zaawansownaProgPractice.zadanie18;

import java.util.Objects;

public class Laptop extends Computer{

    private int battery;

    public Laptop(String processor, String ram, String graphicsCard, String producer, String model, int battery) {
        super(processor, ram, graphicsCard, producer, model);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBatteryName(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return super.toString() + " battery = " + battery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(getBattery(), laptop.getBattery());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBattery());
    }
}
