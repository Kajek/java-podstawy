package com.company.javaZaawansowanaZadania.TypyGeneryczneZadania.Zadanie4;

public class MediaLibrary<T extends MediaContent>{

    private T[] elements;

    public MediaLibrary(T[] elements) {
        this.elements = elements;
    }

    public T[] getElements() {
        return elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }
}
