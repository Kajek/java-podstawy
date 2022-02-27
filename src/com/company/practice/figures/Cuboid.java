package com.company.practice.figures;

//        Utworzyć klasę Cuboid, która definiuje zmienne: obiekt klasy Rectangle, wysokosc
//         - Posiadamy gettery, settery, constructor i toString
//         - Definiujemy metody, które zwracają:
//         - pole, objętość, czy jest to szcześcian.


public class Cuboid {
    private double wysokosc;
    private Rectangle r2;

    public Cuboid(double wysokosc, Rectangle r2) {
        this.wysokosc = wysokosc;
        this.r2 = r2;
    }
    public boolean isCube(){
        return r2.isSquare() && r2.getBokA() == wysokosc;
    }

    public double calculateField(){
        if(isCube()){
            return 6* r2.getField();
        }else {
            return 2 * (r2.getField() + r2.getBokA() * wysokosc + r2.getBokB() * wysokosc);
        }
    }
    public double calculateV(){
        return r2.getField() * wysokosc;
    }

    @Override
    public String toString() {
        return "rectangle: " + r2 + " | " +
                "wysokosc: " + wysokosc;
    }

    // GET SET
    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public Rectangle getR2() {
        return r2;
    }

    public void setR2(Rectangle r2) {
        this.r2 = r2;
    }
}
