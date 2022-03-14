package com.company.javaZaawansowanaProgZadania.Zadanie456;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

public class ListConverter {

    public List<String> convertToUpper(List<String> list){
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public List<String> getStartsWithaLength3(List<String> list){
        return list.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() ==3)
                .collect(Collectors.toList());
    }

    public String addEToEvenAToOdd(List<Integer> list){
//        StringBuilder stringBuilder = new StringBuilder();
//        List<Integer> evenList = list.stream().filter(n -> n % 2 == 0).toList();
//        List<Integer> oddList = list.stream().filter(n -> n % 2 != 0).toList();
//        for( Integer n: list){
//            if(evenList.contains(n)){
//                stringBuilder.append("e");
//                stringBuilder.append(n);
//                stringBuilder.append(",");
//            }else {
//                stringBuilder.append("a");
//                stringBuilder.append(n);
//                stringBuilder.append(",");
//            }
//        }
//        return stringBuilder.toString();
        return list.stream()
                .map(i -> i%2 ==0 ? "e" + i : "a" + i)
                .collect(Collectors.joining(","));

    }


}
