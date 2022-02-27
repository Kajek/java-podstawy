package com.company.practice.WorceProjektowePractice.Singleton;

public class Samochod {

    ISilnik silnik; //w jaki sposob zainicjalizowac silnik?

    public Samochod() { //obiekt konfiguruje sie sam, staram sie tego unikac
        silnik = new SilnikImpl();
        SingletonExmaple.getInstance().count();
    }

    public Samochod(ISilnik silnik) { //tak jest lepiej, dostarczamy zaleznosci z zewnatrz, to daje nam wieksz elastycznosc
        this.silnik = silnik;
        SingletonExmaple.getInstance().count();
    }

    public ISilnik getSilnik() {
        return silnik;
    }

    public void wlaczkSilink() {
        silnik.wlaczSilnik();
    }
}
