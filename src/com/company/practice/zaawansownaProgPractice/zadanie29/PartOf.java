package com.company.practice.zaawansownaProgPractice.zadanie29;

public class PartOf {

    public <T> boolean divideByTwo(T num){
        return num.toString().length() > 3;
    }
    public <T> double partOf(T[] array){
        int arrySize = array.length;
        int counter = 0;
        for( T o: array){
            if (divideByTwo(o) == true){
                counter++;
            }
        }
        return (double) arrySize/counter;
    }
}
