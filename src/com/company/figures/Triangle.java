package com.company.figures;

//        1. Utworzyć w pakiecie com.company pakiet figures
//        2. Utworzyć w tym pakiecie dwie klasy:
//        - Klasa Triangle, która zawiera zmienne podstawa, wysokosc, bokA, bokB
//        - Posiada odpowiednie gettery i settery.
//        - Należy również zdefiniować dodatkowy konstruktor, który każe nam
//        podać wszystkie zmienne powyżej
//        - Zdefiniować dodatkowo toString, który wyświetli tekst w formacie:
//        Wysokość: ... | BokA: ... | BokB: ... | Podstawa: ...
//        - Zdefiniować dodatkowe metody, które zwrócą nam informacje, czy trójkąt jest
//        równoramienny (1 metoda) albo równoboczny (2 metoda).
//        - Zdefiniować metody, które obliczą pole i obwód trójkąta.

public class Triangle {
    private double podstawa;
    private double wysokosc;
    private double bokA;
    private double bokB;

    public Triangle(double podstawa, double wysokosc, double bokA, double bokB) {
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
        this.bokA = bokA;
        this.bokB = bokB;
    }
    public boolean areSidesEqual(){
        return bokA == bokB;
}
    public boolean areAllArmsEqual(){
        return bokA == bokB && bokA == podstawa;
    }

    public double calculateField(){
        return podstawa * wysokosc / 2;
    }

    public double calculateCircumference(){
        return podstawa + bokA + bokB;
    }



    @Override
    public String toString() {
        return "Wysokość: " + wysokosc +
                " | " + "BokA :" + bokA +
                " | " + "BokB: " + bokB +
                " | " + "Podstawa: " + podstawa;

    }

    //Gettery Settery
    public double getPodstawa() {
        return podstawa;
    }

    public void setPodstawa(double podstawa) {
        this.podstawa = podstawa;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double getBokA() {
        return bokA;
    }

    public void setBokA(double bokA) {
        this.bokA = bokA;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;
    }
}

