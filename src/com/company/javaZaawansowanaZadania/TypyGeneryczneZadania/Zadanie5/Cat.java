package com.company.javaZaawansowanaZadania.TypyGeneryczneZadania.Zadanie5;

public class Cat extends Animal{

    private String favouriteFood;

    public Cat(String name, String favouriteFood) {
        super(name);
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", favouriteFood='" + favouriteFood + '\'' +
                '}';
    }
}
