package com.company.javaZaawansowanaZadania.OOPzadania.Zadanie2;

public class Lecturer extends Person {

    private String speciality;
    private int salary;

    public Lecturer(String speciality, int salary){
        this.speciality = speciality;
        this.salary = salary;
    }
    public String getSpeciality(){
        return speciality;
    }
    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Lecturer " + getName() + " living on: " + getAddress() +
                " speciality: " + speciality +
                ", is earning: " + salary;
    }
}
