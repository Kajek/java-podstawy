package com.company.javaZaawansowanaZadania.OOPzadania.Zadanie3;

public class ResizableCircle implements Resizable{

    Circle circle;

    @Override
    public double resize(int percent) {
        return circle.getRadius() * ((double) percent /100);
    }
}
