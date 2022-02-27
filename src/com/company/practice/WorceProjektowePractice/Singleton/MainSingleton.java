package com.company.practice.WorceProjektowePractice.Singleton;

public class MainSingleton {

    public static void main(String[] args) {

//        SingletonExmaple singletonExmaple = new SingletonExmaple(); nie moge tak utworzyc obiektu, poniewaz jest prywatny kostruktor
        SingletonExmaple singletonExmaple = SingletonExmaple.getInstance();
        System.out.println(singletonExmaple.getPassword());

        Samochod samochod = new Samochod(new SilnikImpl());
        System.out.println(SingletonExmaple.getInstance().getNumberOfInstances());
        Samochod samochod2 = new Samochod(new SilnikImpl());
        Samochod samochod3 = new Samochod(new SilnikImpl());
        System.out.println(SingletonExmaple.getInstance().getNumberOfInstances());


        //zlamanie prawa Demeter
        samochod.getSilnik().wlaczSilnik();
        //zgodnie z prawem Demeter
        samochod.wlaczkSilink();
    }

}
