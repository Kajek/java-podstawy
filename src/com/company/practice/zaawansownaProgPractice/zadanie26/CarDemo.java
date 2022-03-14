package com.company.practice.zaawansownaProgPractice.zadanie26;

import java.util.List;

public class CarDemo {
    public static void main(String[] args) {

        Car myAudiA8 = new Car("A8", "My Audi A8", CarType.SEDAN);
        Car yourAudiA8 = new Car("A8", "Your Audi A8", CarType.SEDAN);
        Car audi3 = new Car("A3", "Audi A3", CarType.HATCHBACK);

        Model audiA8Model = new Model("Audi A8", 2004, List.of(myAudiA8, yourAudiA8));
        Model audiA3Model = new Model("Audi A3", 2001, List.of(audi3));
        Manufacturer manufacturer = new Manufacturer("Audi", 1950, List.of(audiA3Model, audiA8Model));

        Car myYaris = new Car("Yaris 1", "My Toyota Yaris", CarType.HATCHBACK);
        Car yoyrYaris = new Car("Yaris 2", "Your Toyota Yaris", CarType.HATCHBACK);
        Car chr = new Car("C-HR", "", CarType.HATCHBACK);

        Model toyotaYarisModel = new Model("Toyota Yaris", 1998, List.of(myYaris, yoyrYaris));
        Model toyotaChr = new Model("Toyota C-HR", 2015, List.of(chr));
        Manufacturer manufacturer1 = new Manufacturer("Toyota", 1961, List.of(toyotaChr, toyotaYarisModel));

        List<Manufacturer> manufacturers = List.of(manufacturer, manufacturer1);


    }
}
