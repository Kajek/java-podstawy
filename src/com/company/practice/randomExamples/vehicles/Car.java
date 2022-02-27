package com.company.practice.randomExamples.vehicles;

public class Car {

    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.setBrand(brand);
        this.setModel(model);
    }

    public void show(){
        System.out.println("Brand of the car is " + brand +
                "|| Model of the car is " + model );
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand of the car is'" + brand + '\'' +
                " Model od the car is" + model + '\'';
    }
}
