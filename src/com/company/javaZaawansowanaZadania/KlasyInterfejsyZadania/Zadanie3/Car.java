package com.company.javaZaawansowanaZadania.KlasyInterfejsyZadania.Zadanie3;

import java.util.Objects;

public class Car {

    private String name;
    private String type; // economy / luxury / default

    public class Engine{

        private String engineType;

        public void setEngine(){
            if(Objects.equals(getType(), "economy")){
                this.engineType = "diesel";
            }else if(getType().equals("luxury")){
                this.engineType = "electric";
            }else{
                this.engineType = "petrol";
            }
        }

        @Override
        public String toString() {
            return "engine type: " + engineType;
        }
    }


    @Override
    public String toString() {
        return "Car " +
                "name: " + name +
                ", type: " + type ;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
