package com.company.practice.zaawansownaProgPractice.Zadanie12;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Car  {

    private String name;
    private String model;
    private BigDecimal price;
    private int productionYear;
    private List<Manufacturer> manufacturerList;
    private EngineType engineType;

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", productionYear=" + productionYear +
                ", manufacturerList=" + manufacturerList +
                ", engineType=" + engineType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getProductionYear() == car.getProductionYear() && Objects.equals(getName(), car.getName()) && Objects.equals(getModel(), car.getModel()) && Objects.equals(getPrice(), car.getPrice()) && Objects.equals(getManufacturerList(), car.getManufacturerList()) && getEngineType() == car.getEngineType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getModel(), getPrice(), getProductionYear(), getManufacturerList(), getEngineType());
    }
    public static class CarBuilder{
        private String name;
        private String model;
        private BigDecimal price;
        private int productionYear;
        private List<Manufacturer> manufacturerList;
        private EngineType engineType;

        public CarBuilder(){}

        public CarBuilder name(String name){
            this.name = name;
            return this;
        }
        public CarBuilder model(String model){
            this.model = model;
            return this;
        }
        public CarBuilder price(BigDecimal price){
            this.price = price;
            return this;
        }
        public CarBuilder productionYear(int productionYear){
            this.productionYear = productionYear;
            return this;
        }
        public CarBuilder manufacturerList(List<Manufacturer> manufacturerList){
            this.manufacturerList = manufacturerList;
            return this;
        }
        public CarBuilder engineType(EngineType engineType){
            this.engineType = engineType;
            return this;
        }
        public Car build(){
            Car car = new Car();
            car.name = this.name;
            car.model = this.model;
            car.price = this.price;
            car.productionYear = this.productionYear;
            car.manufacturerList = this.manufacturerList;
            car.engineType = this.engineType;
            return car;
        }

    }
}
