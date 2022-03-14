package com.company.javaZaawansowanaProgZadania.Zadanie3;

import java.util.ArrayList;
import java.util.List;

public class CalculateAverage {

//    List<Integer> listToTest = new ArrayList<>();

    public double averageCalculator(List<Integer> listToTest){
        return listToTest.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
    }

}
