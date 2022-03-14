package com.company.practice.zaawansownaProgPractice.Zadanie4;

import java.util.*;

public class Storage {

    private Map<String, List<String>> exmplMap = new HashMap<>();

    public Storage(Map<String, List<String>> exmplMap) {
    }

    public void addToStorage(String key, String value){
        if(exmplMap.containsKey(key)){
            List<String> valueList = exmplMap.get(key);
            valueList.add(value);
        }else{
            List<String> valueList = new ArrayList<>();
            valueList.add(value);
            exmplMap.put(key, valueList);
        }
    }

    public void printValues(String key){
        if(exmplMap.containsKey(key)){
            List<String> valuesList = exmplMap.get(key);
            valuesList.forEach(System.out::println);
        }
    }

    public void findValues(String value) {
        for (Map.Entry<String, List<String>> entry : exmplMap.entrySet()) {
            List<String> valueList = entry.getValue();
            if (valueList.contains(value)) {
                System.out.println(entry.getKey());
            }
        }
    }
                // EWENTULANIE
//        public void findValues(String value){
//            exmplMap.forEach((k,v)-> {
//                        if (value.contains(value)) {
//                            System.out.println(k);
//                        }
//                    });

//        Set<String> keySet = exmplMap.keySet();
//            for(String key: keySet){
//                if(key.equals(value)){
//                    System.out.println(key);
//                }
//            }
//        }
    }


