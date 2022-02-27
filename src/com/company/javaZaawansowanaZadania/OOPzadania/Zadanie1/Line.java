package com.company.javaZaawansowanaZadania.OOPzadania.Zadanie1;

public class Line {

    private Point2D center;
    private Point2D point;
//    private float centerX;
//    private float centerY;
//    private float pointX;
//    private float pointY;

    public Line(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

//    public Line(float centerX, float centerY, float pointX, float pointY){
//        this.centerX = centerX;
//        this.centerY = centerY;
//        this.pointX = pointX;
//        this.pointY = pointY;
//        center.setX(centerX);
//        center.setY(centerY);
//        point.setX(pointX);
//        point.setY(pointY);
//    } nie mam pojecia o co ma chodzic w tym konstruktorze be dziedziczenia

    public double getRadius(){ // prmoien dwuktornie
        return Math.sqrt(Math.pow((point.getX() - center.getX()), 2) + Math.pow((point.getY() - center.getY()), 2));
    }

    public double getHalfRadius() { // prmoien dwuktornie
        return (Math.sqrt(Math.pow((point.getX() - center.getX()), 2) + Math.pow((point.getY() - center.getY()), 2))) / 2;
    }

    public Point2D getCenter() {
        return center;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public Point2D getPoint() {
        return point;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }


}
