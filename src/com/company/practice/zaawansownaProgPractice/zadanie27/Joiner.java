package com.company.practice.zaawansownaProgPractice.zadanie27;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joiner<T> {

    String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(List<T> objects ){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < objects.size(); i++) {
            if(i == objects.size()-1){
                stringBuilder.append(objects.get(i));
            }else{
                stringBuilder.append(objects.get(i));
                stringBuilder.append(separator);
            }
        }
        return stringBuilder.toString();
    }

    public String join2(List<T> objects){
        return objects.stream().map(Object::toString).collect(Collectors.joining(separator));
    }
}
// metoda generyczna lepsze rowiazanie

//    public <T> String join(T... objects) {
//        return Stream.of(objects)
//                .map(o -> o.toString())
//                .collect(Collectors.joining(delimiter));
//    }