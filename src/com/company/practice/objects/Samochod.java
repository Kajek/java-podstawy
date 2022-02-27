package com.company.practice.objects;

public class Samochod {


    private String kolor;
    private String rocznik;
    private int pojemnosc;
    private boolean czUruchomiony;
    private double predkosc;
    private final double maxPredkosc = 240;

    public Samochod(String kolor, String rocznik, int pojemnosc, boolean czUruchomiony, double predkosc) {
        this.kolor = kolor;
        this.rocznik = rocznik;
        this.pojemnosc = pojemnosc;
        this.czUruchomiony = czUruchomiony;
        this.predkosc = predkosc;

    }

    public Samochod(String kolor, String rocznik, int pojemnosc) {
        this.kolor = kolor;
        this.rocznik = rocznik;
        this.pojemnosc = pojemnosc;
    }

    // domyślny konstruktor
    public Samochod() {
        this.kolor = "";
        this.predkosc = 0.0;
        this.czUruchomiony= false;
        this.rocznik = "";
        this.pojemnosc = 0;
    }


    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getRocznik() {
        return rocznik;
    }

    public void setRocznik(String rocznik) {
        this.rocznik = rocznik;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public boolean isCzUruchomiony() {
        return czUruchomiony;
    }

    public void setCzUruchomiony(boolean czUruchomiony) {
        this.czUruchomiony = czUruchomiony;
    }

    public double getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(double predkosc) {
            this.predkosc = predkosc;
        }

    public void zmienPredkosc(double predkosc){
        if (this.czUruchomiony && predkosc <= this.maxPredkosc){
            setPredkosc(predkosc);
        }else{
            System.out.println("Silnik wyłączony albo ustawiasz powyżej max prędkości");
        }
    }
}
