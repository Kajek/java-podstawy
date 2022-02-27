package com.company.javaZaawansowanaZadania.TypyGeneryczneZadania.Zadanie5;

public class Dog extends Animal{

    private boolean isGoodBoy;

    public Dog(String name, boolean isGoodBoy) {
        super(name);
        this.isGoodBoy = isGoodBoy;
    }

    public boolean isGoodBoy() {
        return isGoodBoy;
    }

    public void setGoodBoy(boolean goodBoy) {
        isGoodBoy = goodBoy;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", isGoodBoy=" + isGoodBoy +
                '}';
    }
}
