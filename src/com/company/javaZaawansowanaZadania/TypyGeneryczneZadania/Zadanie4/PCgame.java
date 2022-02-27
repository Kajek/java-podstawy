package com.company.javaZaawansowanaZadania.TypyGeneryczneZadania.Zadanie4;

public class PCgame extends MediaContent{

    private String producer;

    public PCgame(String title, String producer) {
        super(title);
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "PCgame{" +
                "title='" + title + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
