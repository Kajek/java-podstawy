package com.company.javaZaawansowanaZadania.OOPzadania.Zadanie3;

public class Circle extends Shape implements GeometricObject{

    private double radius;

    public Circle(){
        super.setColor("unknown");
        super.setFilled(false);
        this.radius = 1;
    }

    public Circle(String color, boolean isFilled, int radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
//        Shape shape = new Shape(); jesli chcialbym wywolac tylko to co jest w klasie bazowe, mogli lepiej sformulowac zadnie
        return "Circle with radius: " + radius + " witch is a subclass off " + super.toString();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
