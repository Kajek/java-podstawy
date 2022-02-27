package com.company.practice.dodatkoweZadania;

public class Wall {

    private double width;
    private double height;

    public Wall(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }
    public Wall(){

    }
    public double getArea(){
        return getHeight() * getWidth();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0){
            this.width = 0;
        }else{
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }
}
