package com.company.practice.randomExamples.vehicles;

public class VehiclesMain {

    public static void main(String arg[]) {

        Car [] cars = {new Car ("Opel", "Astra"),new Car("Ford", "Raptor"),
                        new Car("Suzuki", "Jimny"), new Car("Opel","Vectra"),
                                new Car("Fiat", "126p")};

        cars[2].setModel("Vitara");
        for(Car c: cars){
            c.show();
        }
    }
}
