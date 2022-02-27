package com.company.practice.objects;
//
//Utwórz klasę Student
//        Klasa posiada zmienne:
//        String indeks
//        String dataUrodzenia
//        String imie
//        String Nazwisko
//        bolean aktywny
//        double[] listaOcen = new double[5];
//
//        // Utworzyć: gettery i settery.
//        // Konstruktor dla zmiennych: od indeks do aktywny
//
//        // Dodać nowe metody:
//        1. Pozwala dodać nową ocenę do listy.
//        ! Jeżeli lista jest pełna (nie ma obiektu, który == 0.0)
//        -> wyświetl odpowiedni komunikat
//
//// Zdefiniować metodę toString,
// która zwróci tekst w formie Indeks - "lista ocen"

public class Student {
    private String indeks;
    private String dataUrodzenia;
    private String imie;
    private String nazwisko;
    private boolean aktywny;
    private double[] listaOcen = new double[5];

    public Student(String indeks, String dataUrodzenia, String imie, String nazwisko, boolean aktywny) {
        this.indeks = indeks;
        this.dataUrodzenia = dataUrodzenia;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.aktywny = aktywny;
    }

    public void dodajOceneDoListy(double nowaOcena){
        boolean czyPelna = true;

        for (int i = 0; i < listaOcen.length; i++) {
            if (listaOcen[i] == 0.0){
                listaOcen[i] = nowaOcena;
                czyPelna =false;
                break;
            }

        }
        if(czyPelna){
            System.out.println("Lista ocen jest pełna");
        }

    }
    public void pokazListeOcen(double[] listaOcen){
        for(double x : listaOcen){
            System.out.println(x);
        }
    }

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public boolean isAktywny() {
        return aktywny;
    }

    public void setAktywny(boolean aktywny) {
        this.aktywny = aktywny;
    }

    public double[] getListaOcen() {
        return listaOcen;
    }

    public void setListaOcen(double[] listaOcen) {
        this.listaOcen = listaOcen;
    }

    @Override
    public String toString() {
        String komunikat = this.indeks + " - ";

        for(double x : getListaOcen()){
            komunikat += x;
            komunikat += " ";
        }
        return komunikat;
    }
}
