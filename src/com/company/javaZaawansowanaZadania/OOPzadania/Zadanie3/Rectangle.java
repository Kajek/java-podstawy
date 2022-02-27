package com.company.javaZaawansowanaZadania.OOPzadania.Zadanie3;

public class Rectangle extends Shape{

    private double width;
    private double lenght;

    public Rectangle(){
        super.setColor("unknown");
        this.setFilled(false);
        this.width = 1;
        this.lenght = 1;
    }
    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.lenght = length;
    }

    public double getArea(){
        return width * lenght;
    }
    public double getPerimeter(){
        return 2* width + 2* lenght;
    }

    @Override
    public String toString(){
        return "Rectangle with width: "+width+" and lenght: "+lenght+" witch is a subclass of " + super.toString();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
}
