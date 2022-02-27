package com.company.practice.dodatkoweZadania;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    public Point(){}

    public double distance(){
        int xA = getX();
        int yA = getY();
        int xB = 0;
        int yB = 0;
        return Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));
    }
    public double distance(int x, int y){
        int xA = getX();
        int yA = getY();
        return Math.sqrt((x - xA) * (x - xA) + (y - yA) * (y - yA));
    }
    public double distance(Point point){
        int xA = getX();
        int yA = getY();
        int xB = point.getX();
        int yB = point.getY();
        return Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
