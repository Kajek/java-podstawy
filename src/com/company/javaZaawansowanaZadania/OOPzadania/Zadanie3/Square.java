package com.company.javaZaawansowanaZadania.OOPzadania.Zadanie3;

public class Square extends Rectangle{

    public Square() {
        super.setColor("unknown");
        super.setFilled(false);
        this.setWidth(getLenght());
        this.setLenght(getWidth());
    }

    public Square(String color, boolean isFilled, double width, double length) {
        super.setColor(color);
        super.setFilled(isFilled);
        this.setWidth(width);
        this.setLenght(width);
    }

    @Override
    public double getArea(){
        return getWidth() * getWidth();
    }
    @Override
    public double getPerimeter(){
        return 4 * getWidth();
    }



}
