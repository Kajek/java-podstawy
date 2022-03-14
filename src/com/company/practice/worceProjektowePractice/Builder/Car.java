package com.company.practice.worceProjektowePractice.Builder;

public class Car {

    private String engine;
    private boolean isElectric;
    private String vin;
    private String owner;
    private int maxSpeed;

    public String getEngine() {
        return engine;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public String getVin() {
        return vin;
    }

    public String getOwner() {
        return owner;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", isElectric=" + isElectric +
                ", vin='" + vin + '\'' +
                ", owner='" + owner + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public static class CarBuilder{

        private String engine;
        private boolean isElectric;
        private String vin;
        private String owner;
        private int maxSpeed;

        public CarBuilder(){}

        public CarBuilder engine(String engine){
            this.engine = engine;
            return this;
        }

        public CarBuilder isElectric(boolean isElectric){
            this.isElectric = isElectric;
            return this;
        }

        public CarBuilder vin(String vin){
            this.vin = vin;
            return this;
        }

        public CarBuilder owner(String owner){
            this.owner = owner;
            return this;
        }

        public CarBuilder maxSpeed(int maxSpeed){
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Car build(){
            Car car = new Car();
            car.engine = this.engine;
            car.isElectric = this.isElectric;
            car.vin = this.vin;
            car.owner = this.owner;
            car.maxSpeed = this.maxSpeed;
            return car;
        }

    }
}
