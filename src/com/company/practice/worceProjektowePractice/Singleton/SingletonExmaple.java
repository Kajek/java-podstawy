package com.company.practice.worceProjektowePractice.Singleton;

public class SingletonExmaple {

    //pole private, czyli niedostepne spoza klasy
    //pole statyczne, czyli jeden obiekt wspoldzielony, przez wszsystkie instancje, w tym przypadku bedzie jedna intancja
//    private static SingletonExmaple instance = new SingletonExmaple();
    private static SingletonExmaple instance;
    private String password = "***";
    private int counter = 0;

    //konstruktor prywatny, aby nie mozna bylo stworzyc instancji klasy poza klasa SingletonExmaple
    private SingletonExmaple() {
    }

    public static SingletonExmaple getInstance() {
        if (instance == null) {
            instance = new SingletonExmaple();
        }
        return instance;
    }

    public String getPassword() {
        return password;
    }

    public void count() {
        counter++;
    }

    public int getNumberOfInstances() {
        return counter;
    }

}
