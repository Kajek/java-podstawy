package com.company.practice.worceProjektowePractice;

import com.company.practice.worceProjektowePractice.Singleton.CounterSigleton;

import java.util.*;

public class ChildrenRepositoryImpl implements ChildrenRepository {

    private List<String> names = new ArrayList<>();


    @Override
    public void addChild(String name) {
        names.add(name);
        CounterSigleton.getInstance().count();
    }

    @Override
    public List<String> getChildren() {
        return new ArrayList<>(names);
    }

    @Override
    public void sortChildren() {
        Collections.sort(names);
    }

    @Override
    public void removeDuplicates() {
        HashSet namesSet = new HashSet(names);
        names = new ArrayList<>(namesSet);
    }

    @Override
    public void setNamesToUpperCase() {
//        names.forEach(n -> n = n.toUpperCase()); //jak zrobic zeby dzialalo
        for (int i = 0; i < names.size(); i++) {
            String result = names.get(i).toUpperCase();
            names.set(i, result);
        }
    }

    @Override
    public void setNamesToLowerCase() {
        names.replaceAll(n -> n.toLowerCase());
//        for (int i = 0; i < names.size(); i++) {
//            String result = names.get(i).toLowerCase();
//            names.set(i, result);
//        }
    }
}
