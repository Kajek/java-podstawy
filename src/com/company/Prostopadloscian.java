package com.company;

//Utworzyć klasę Prostopadloscian
//        Klasa przyjmuje zmienne:
//        double podstawaA
//        double podstawaB
//        double wysokosc
//        boolean szczescian
//
//        Dodatkowo w klasie mają być gettery i settery.
//        oraz dwa konstruktory:
//        1. dla wszystkich zmiennych
//        2. uzytkownik podaje tylko zmienna (bok),
//        natomiast konstruktor automatycznie
//        ustawia taka sama wartosc dla podstawaA, podstawaB oraz wysokosc
//        i zmienna szescian na true

public class Prostopadloscian {
    private double podstawaA;
    private double podstawaB;
    private double wysokosc;
    private boolean szescian;

    public Prostopadloscian(double podstawaA, double podstawaB, double wysokosc, boolean szescian) {
        this.podstawaA = podstawaA;
        this.podstawaB = podstawaB;
        this.wysokosc = wysokosc;
        this.szescian = szescian;
    }

    public Prostopadloscian(double bok) {
        this.podstawaA = bok;
        this.podstawaB = bok;
        this.wysokosc = bok;
        this.szescian = true;
    }

    public double getPodstawaA() {
        return podstawaA;
    }

    public void setPodstawaA(double podstawaA) {
        this.podstawaA = podstawaA;
    }

    public double getPodstawaB() {return podstawaB;    }

    public void setPodstawaB(double podstawaB) {
        this.podstawaB = podstawaB;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public boolean isSzescian() {
        return szescian;
    }

    public void setSzescian(boolean szescian) {
        this.szescian = szescian;
    }

    @Override
    public String toString() {
        return  podstawaA + " | " + podstawaB + " | " +
                wysokosc + " | " + szescian;
    }
}
