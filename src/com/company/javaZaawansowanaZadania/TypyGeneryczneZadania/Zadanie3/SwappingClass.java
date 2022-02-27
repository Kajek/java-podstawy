package com.company.javaZaawansowanaZadania.TypyGeneryczneZadania.Zadanie3;

public class SwappingClass {

    public static <T> void swap(T[] array, int index1, int index2){

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
