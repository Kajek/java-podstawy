package com.company.practice.zaawansownaProgPractice.zadanie28;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<T> extends ArrayList<T> {


    public List<T> getEveryNthElement(int startIndex, int skip){
        List<T> returnList = new ArrayList<>();
        for (int i = startIndex; i < super.size(); i += skip + 1) {
            returnList.add(get(i));
        }
        return returnList;
    }

}
