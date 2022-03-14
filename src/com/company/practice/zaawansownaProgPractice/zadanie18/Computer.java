package com.company.practice.zaawansownaProgPractice.zadanie18;

import java.util.Objects;

public class Computer {

    private String processor;
    private String ram;
    private String graphicsCard;
    private String producer;
    private String model;

    public Computer(String processor, String ram, String graphicsCard, String producer, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.producer = producer;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return Objects.equals(getProcessor(), computer.getProcessor()) && Objects.equals(getRam(), computer.getRam()) && Objects.equals(getGraphicsCard(), computer.getGraphicsCard()) && Objects.equals(getProducer(), computer.getProducer()) && Objects.equals(getModel(), computer.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProcessor(), getRam(), getGraphicsCard(), getProducer(), getModel());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
