package com.company.javaZaawansowanaZadania.TypyGeneryczneZadania.Zadanie5;

import java.util.Arrays;

public class AnimalHouse<T extends Animal> {

    T[] animals;

    public AnimalHouse(T[] animals) {
        this.animals = animals;
    }

    public T[] getAnimals() {
        return animals;
    }

    public void setAnimals(T[] animals) {
        this.animals = animals;
    }
}
//public class Main {
//
//    public static void main(String arg[]) {
//
//        Animal[] animals = {new Cat("Lilo","serek"), new Dog("Diuna", true)};
//        AnimalHouse<Animal> animalHouse = new AnimalHouse<>(animals);
//        System.out.println(Arrays.toString(animalHouse.getAnimals()));
//    }
