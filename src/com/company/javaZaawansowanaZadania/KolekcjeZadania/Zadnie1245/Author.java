package com.company.javaZaawansowanaZadania.KolekcjeZadania.Zadnie1245;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;
    private String sex;

    public Author(String name, String surname, String sex) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return getName().equals(author.getName()) && getSurname().equals(author.getSurname()) && getSex().equals(author.getSex());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getSex());
    }
}
