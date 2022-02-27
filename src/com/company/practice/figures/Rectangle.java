package com.company.practice.figures;
//
//        Utworzyć klasę Square, która zawiera zmienne: BokA, BokB
//        - Dodatkowo definiujemy gettery, settery, constructor dla wszystkich zmiennych
//        - toString, aby podobnie wyświetlał informacje jak w trójkącie
//        - dopisać metody, które zwracają pole, obwod i czy jest to kwadrat

public class Rectangle {
    private double bokA;
    private double bokB;

    public Rectangle(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public boolean isSquare(){
        return bokA == bokB;
    }
    public double getField(){
        return bokA * bokB;
    }
    public double getCircumference(){
        return 2*bokA + 2*bokB;
    }


    @Override
    public String toString() {
        return  "BokA: " + bokA + " | " + "BokB: " + bokB;
    }

    // GET SET
    public double getBokA() {
        return bokA;
    }

    public void setBokA(double bokA) {
        bokA = bokA;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double bokB) {
        bokB = bokB;
    }
}
