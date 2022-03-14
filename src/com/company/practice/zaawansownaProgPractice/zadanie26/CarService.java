package com.company.practice.zaawansownaProgPractice.zadanie26;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    List<Manufacturer> manufacturers = new ArrayList<>();

    public List<Model> getModels() {
        return manufacturers.stream()
                .flatMap(manu -> manu.getModels().stream())
                .collect(Collectors.toList());
    }

    public List<Car> getCars(){
        return manufacturers.stream()
                .flatMap(m -> m.getModels().stream())
                .flatMap(c -> c.getCars().stream())
                .collect(Collectors.toList());
    }

    public List<String> getNameOfAllManufacturers(){
        return manufacturers.stream().map(Manufacturer::getName).collect(Collectors.toList());
    }

    public List<Integer> getYearOfManufacturerCreation() {
        return manufacturers.stream().map(Manufacturer::getYearOfCreation).collect(Collectors.toList());
    }

    public List<String> getAllModelNames(){
        return manufacturers.stream().flatMap(m->m.getModels().stream())
                .map(Model::getName).collect(Collectors.toList());
    }

    public List<Integer> getAllModelsProductionStartYear(){
        return manufacturers.stream().flatMap(m -> m.getModels().stream())
                .map(Model::getProductionStartYear).collect(Collectors.toList());
    }

    public List<String> getAllCarNames(){
        return manufacturers.stream()
                .flatMap(m -> m.getModels().stream())
                .flatMap(c -> c.getCars().stream())
                .map(Car::getName).collect(Collectors.toList());
    }

    public List<String> getAllCarDescriptions(){
        return manufacturers.stream()
                .flatMap(m -> m.getModels().stream())
                .flatMap(c -> c.getCars().stream())
                .map(Car::getDescription).collect(Collectors.toList());
    }

    public List<Model> getAllModelsWithEvenProductionStartYear(){
        return manufacturers.stream().flatMap(m -> m.getModels().stream())
                .filter(m -> m.getProductionStartYear() % 2 == 0)
                .collect(Collectors.toList());
    }


    public List<Car> getAllCarsWithEvenProductionStartYearAndOddManufacturerCreationYear(){
        return manufacturers.stream().filter(man -> man.getYearOfCreation() % 2 != 0)
                .flatMap(m -> m.getModels().stream())
                .filter(m -> m.getProductionStartYear() % 2 == 0)
                .flatMap(model -> model.getCars().stream())
                .collect(Collectors.toList());
    }

    public List<Car> getCabrioWithOddModelProductionYearAndEvenManufacturerYear(){
        return manufacturers.stream().filter(man -> man.getYearOfCreation() %2 ==0)
                .flatMap(m -> m.getModels().stream())
                .filter(m -> m.getProductionStartYear() % 2 != 0)
                .flatMap(model -> model.getCars().stream())
                .filter(c -> c.getCarType().equals(CarType.CABRIO))
                .collect(Collectors.toList());
        }

    public List<Car> getSedanModelNewerThan2019AndManufacturerYearBefore1919(){
        return manufacturers.stream().filter(man -> man.getYearOfCreation() < 1919)
                .flatMap(m -> m.getModels().stream())
                .filter(m->m.getProductionStartYear() > 2019)
                .flatMap(m -> m.getCars().stream())
                .filter(c -> c.getCarType().equals(CarType.SEDAN))
                .collect(Collectors.toList());
    }


}

