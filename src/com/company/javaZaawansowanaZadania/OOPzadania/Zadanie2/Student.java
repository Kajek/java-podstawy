package com.company.javaZaawansowanaZadania.OOPzadania.Zadanie2;

public class Student extends Person{

    private String majorsIn;
    private int yearOfStudies;
    private int priceOfMajor;

    public Student(String majorsIn, int yearOfStudies, int priceOfMajor){
        this.majorsIn = majorsIn;
        this.yearOfStudies = yearOfStudies;
        this.priceOfMajor = priceOfMajor;
    }

    public String getMajorsIn() {
        return majorsIn;
    }

    public void setMajorsIn(String majorsIn) {
        this.majorsIn = majorsIn;
    }

    public int getYearOfStudies() {
        return yearOfStudies;
    }

    public void setYearOfStudies(int yearOfStudies) {
        this.yearOfStudies = yearOfStudies;
    }

    public int getPriceOfMajor() {
        return priceOfMajor;
    }

    public void setPriceOfMajor(int priceOfMajor) {
        this.priceOfMajor = priceOfMajor;
    }

    @Override
    public String toString(){
        return getName() + " adress: " + getAddress() + " Majors in: " + majorsIn+
                " is on " + yearOfStudies + " year and pays " + priceOfMajor;
    }
}
