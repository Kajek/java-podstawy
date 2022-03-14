package com.company.practice.zaawansownaProgPractice.Zadanie12;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarServiceDemo {
    public static void main(String[] args) {

        Manufacturer manufacturerGM = new Manufacturer("GM", 1930, "USA");
        Manufacturer manufacturerVW = new Manufacturer("VW", 1900, "Germany");
        Manufacturer manufacturerLambo = new Manufacturer("Lambo", 1920, "Italy");
        List<Manufacturer> randomManufacturerList = new ArrayList<>();
        List<Manufacturer> randomManufacturerList2 = new ArrayList<>();
        randomManufacturerList.add(manufacturerGM);
        randomManufacturerList.add(manufacturerVW);
        randomManufacturerList2.add(manufacturerVW);
        randomManufacturerList2.add(manufacturerLambo);
        randomManufacturerList2.add(manufacturerGM);
        Car car1 = new Car.CarBuilder()
                .name("Dodge")
                .model("Viper")
                .manufacturerList(randomManufacturerList)
                .price(BigDecimal.valueOf(50000.0))
                .engineType(EngineType.V8)
                .productionYear(1990)
                .build();

        Car car2 = new Car.CarBuilder()
                .name("Lamborghini")
                .model("Miura")
                .manufacturerList(randomManufacturerList2)
                .engineType(EngineType.V12)
                .price(BigDecimal.valueOf(300000))
                .productionYear(1960)
                .build();

        CarService carService = new CarService();
        carService.addCar(car1);
        carService.addCar(car2);
        carService.findMostExpensiveCar();
//        System.out.println(carService.sortCarListByGivenParameter("price"));
//        System.out.println(carService.getCarsProducedByProducerEstablishmentYearCondition(1950));


    }

}
