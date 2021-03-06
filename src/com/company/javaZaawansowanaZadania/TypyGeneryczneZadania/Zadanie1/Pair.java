package com.company.javaZaawansowanaZadania.TypyGeneryczneZadania.Zadanie1;

public class Pair <T,V> {

    private T object1;
    private V object2;

    public Pair(T object1, V object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public T getObject1() {
        return object1;
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }

    public V getObject2() {
        return object2;
    }

    public void setObject2(V object2) {
        this.object2 = object2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "object1=" + object1 +
                ", object2=" + object2 +
                '}';
    }
}
