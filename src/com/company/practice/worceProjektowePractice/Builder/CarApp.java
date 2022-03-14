package com.company.practice.worceProjektowePractice.Builder;

public class CarApp {

    public static void main(String[] args) {

        Car tesla1 = new Car.CarBuilder()
                .engine("4x electric motors")
                .isElectric(true)
                .vin("5NPEC4ACXCH390027")
                .owner("Artur G.")
                .maxSpeed(250)
                .build();

        System.out.println(tesla1);
    }
}
