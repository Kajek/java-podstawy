package com.company;

public class Main {
//doczytać o static przy metodach i klasach

    public static void main(String[] args) {
        System.out.println(sumaLiczb("dodawaj",2,3));
        System.out.println(sumaLiczb("odejmuj",5,5,5,5,5));
        System.out.println(sumaLiczb("dodawaj",21,45,23,12,345,123,22,33,56,77));
    }
    static int sumaLiczb(String dzialanie, int... liczby) {
        int wynik = 0;

            if(dzialanie.equals("dodawaj")){
                for (int j : liczby) {
                    wynik += j;
                }}
            else{
                for (int j : liczby) {
                    wynik -= j;
                }
        }
        return wynik;
    }
}

