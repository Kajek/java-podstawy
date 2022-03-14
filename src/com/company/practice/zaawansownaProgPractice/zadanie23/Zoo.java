package com.company.practice.zaawansownaProgPractice.zadanie23;

import java.util.*;
import java.util.stream.Collectors;

public class Zoo {

    private Map<String, Integer> map = new HashMap<>();

    public void addAnimals(String animalName, int number){
        if (map.containsKey(animalName)){
            int newNumber = map.get(animalName) + number;
            map.put(animalName, newNumber);
        }else{
            map.put(animalName, number);
        }
    }

    public int getNumberOfAllAnimals(){
        return map.values().stream().mapToInt(a -> a).sum();
    }

    public Map<String, Integer> getAnimalsCount(){
        return new HashMap<>(map);
    }

    public Map<String, Integer> getAnimalsCountSorted(){
        Map<String, Integer> result = new LinkedHashMap<>();
        List<Map.Entry<String, Integer>> sortedEntryList = map.entrySet().stream()
                .sorted((a1, a2) -> a2.getValue().compareTo(a1.getValue()))
                .collect(Collectors.toList());
        sortedEntryList.forEach(entry -> result.put(entry.getKey(), entry.getValue()));
        return result;
//        return (LinkedHashMap<String, Integer>) map.entrySet().stream().sorted((a1, a2) -> a2.getValue().compareTo(a1.getValue()));
    }

}
