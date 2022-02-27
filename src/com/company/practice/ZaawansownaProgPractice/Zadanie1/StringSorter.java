package com.company.practice.ZaawansownaProgPractice.Zadanie1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorter {

    public List<String> stringSorter(List<String> list){
        List<String> sortedList = new ArrayList<>();
        list.stream().sorted((s1,s2) -> s2.compareTo(s1)).forEach(s -> sortedList.add(s));
        return sortedList;
        // lepiej list.stream().sorted((s1,s2) -> s2.compareTo(s1)).collect(Collectors.toList());
//        Collections.sort(list, (s1,s2) -> s2.compareTo(s1));
//        return list;  tutaj zmieniamy strukture oryginalnej listy
    }

    public List<String> stringSorterIgnoreCase(List<String> list){
        return list.stream().sorted((s1,s2) -> s2.compareToIgnoreCase(s1)).collect(Collectors.toList());
    }


}
