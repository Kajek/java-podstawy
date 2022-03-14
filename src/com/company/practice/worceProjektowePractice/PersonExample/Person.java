package com.company.practice.worceProjektowePractice.PersonExample;

import java.util.Objects;

public class Person {

    private String name;
    private String pesel;

    public Person(String name, String pesel) {
        if(PeselValidatorSingleton.getInstance().validatePesel(pesel)){
            this.pesel = pesel;
        }else{
            throw  new WrongPeselExeption("Wrong pesel");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
//        return Objects.equals(getName(), person.getName()) && Objects.equals(getPesel(), person.getPesel());
        return getPesel().equals(person.getPesel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPesel());
    }
}
