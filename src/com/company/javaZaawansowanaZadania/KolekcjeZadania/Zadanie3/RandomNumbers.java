package com.company.javaZaawansowanaZadania.KolekcjeZadania.Zadanie3;

import com.sun.source.doctree.SerialTree;

import java.util.*;

public class RandomNumbers {

    public int[] fillRandomNumbersToArray() {
        Random randomNum = new Random();
        int upperBound = 50;

        List<Integer> numbersList = new ArrayList<>();
        while(numbersList.size()!=100){
            int newRandom = randomNum.nextInt(upperBound);
            numbersList.add(newRandom);
        }
        Set<Integer> uniqeNums = new HashSet<>();
        Set<Integer> duplicateNums = new HashSet<>();
        for (Integer i: numbersList){
            if(!uniqeNums.add(i)){
                duplicateNums.add(i);
            }
        }
        System.out.println("Unique numbers: " +uniqeNums);
        System.out.println("Non Unique numbers: " +duplicateNums);

        int[] numbers = numbersList.stream().mapToInt(i -> i).toArray();;
        return numbers;
    }

}
