package com.company.practice.worceProjektowePractice.Singleton;

public class CounterSigleton {

    private static CounterSigleton instance = new CounterSigleton();
    private int counter = 0;

    private CounterSigleton() {
    }

    public static CounterSigleton getInstance() {
        return instance;
    }

    public void count(){
        counter++;
    }
    public int getNumberOfInstances() {
        return counter;
    }


}
