package com.company.practice.zaawansownaProgPractice.Zadanie12;

import java.util.Objects;

public class Manufacturer {

    private String name;
    private int foundationDate;
    private String country;

    public Manufacturer(String name, int foundationDate, String country) {
        this.name = name;
        this.foundationDate = foundationDate;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(int foundationDate) {
        this.foundationDate = foundationDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", foundationDate='" + foundationDate + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manufacturer)) return false;
        Manufacturer that = (Manufacturer) o;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getFoundationDate(), that.getFoundationDate()) && Objects.equals(getCountry(), that.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFoundationDate(), getCountry());
    }
}
