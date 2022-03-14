package com.company.practice.zaawansownaProgPractice.zadanie14;

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class RandomElements {
    Random random = new Random();

    private final int endRange = 100000;
    int numberToFill = random.nextInt(1, 20);
    Integer [] practiceArray = new Integer [endRange];
    Integer [] exARR = generateArray();
//    public List<Integer> returnList = generateArrayAndGetList();


    public Integer [] generateArray(){
        for (int i = 0; i < practiceArray.length; i++) {
            practiceArray[i] = numberToFill;
        }
        return practiceArray;
    }

    public List<Integer> findUniqueElements(){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < exARR.length; i++) {
            if (map.containsKey(exARR[i])) {
                map.put(exARR[i], map.get(exARR[i]) + 1);
            }
            else {
                map.put(exARR[i], 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry: entrySet){
            if (entry.getValue() == 1){
                uniqueList.add(entry.getKey());
            }
        }
        return uniqueList;
    }

    public List<Integer> generateArrayAndGetList(){
        for (int i = 0; i < practiceArray.length; i++) {
            practiceArray[i] = numberToFill;
        }
        return Arrays.asList(practiceArray);
    }
//
//    public List<Integer> findNonUniqueElements(){
////        List<Integer> uniqueElements = findUniqueElements();
//        returnList.removeAll(uniqueElements);
//        return returnList;
//    }

}
