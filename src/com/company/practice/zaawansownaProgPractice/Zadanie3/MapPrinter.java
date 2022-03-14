package com.company.practice.zaawansownaProgPractice.Zadanie3;

import java.util.*;

public class MapPrinter {

    public static void printFormattedMap(Map<String, Integer> mapToFormat){
        Set<Map.Entry<String, Integer>> entrySet = mapToFormat.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = mapToFormat.entrySet().iterator();

// przez iterator
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            String delimiter = iterator.hasNext() ? "," : ".";
            System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + delimiter);
//            if (!iterator.hasNext()){
//                System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ".");
//            }else{
//                System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ",");
//            }
        }
// najładniej
        for (Iterator<Map.Entry<String, Integer>> iterator1 = mapToFormat.entrySet().iterator(); iterator1.hasNext();) {
            Map.Entry<String, Integer> entry = iterator1.next();
            String delimiter = iterator1.hasNext() ? "," : ".";
            System.out.println("Klucz: " + entry.getKey() + ", Value: " + entry.getValue() + delimiter);
        }
// przez listy
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
        for (int i = 0; i < entryList.size(); i++) {
            Map.Entry<String, Integer> entry = entryList.get(i);
            String delimiter = i == entryList.size() -1
                    ? "."
                    : ",";
            System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + delimiter);
        }
}}

//    Map<String, Integer> mapExmpl = Map.of("Java", 10, "Python", 3, "PHP",5);
//    printFormattedMap(mapExmpl);
