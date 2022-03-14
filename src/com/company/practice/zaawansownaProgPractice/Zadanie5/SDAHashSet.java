package com.company.practice.zaawansownaProgPractice.Zadanie5;

import java.util.HashMap;
import java.util.Map;

public class SDAHashSet<T> {

    Map<T, ?> map = new HashMap<>();

    public void add(T objToAdd){
        map.put(objToAdd, null);
    }
    public void remove(T objToRemove){
        map.remove(objToRemove);
    }
    public int size(){
        return map.size();
    }
    public boolean contains(T objToCheck){
        return map.containsKey(objToCheck);
    }
    public void clear(){
        map.clear();
    }

}

// zrobic atrybut hashmap
//wykorzystać metody hash mapy pod spodem