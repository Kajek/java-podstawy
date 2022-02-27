package com.company.practice.dodatkoweZadania;

public class Floor {

    private double width;
    private double lenght;

    public Floor(double width, double lenght){
        this.setWidth(width);
        this.setLenght(lenght);
    }

    public double getArea(){
        return getLenght() * getWidth();
    }

    public void setWidth(double width) {
        if(width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }
    }
    public void setLenght(double lenght){
        if (lenght < 0){
            this.lenght = 0;
        }
        else {
            this.lenght = lenght;
        }
    }
    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }
}
