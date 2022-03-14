package com.company.javaZaawansowanaZadania.JavaIOZadania.zadanie5;

public class UserParser {

    public User fromCSV(String csvLine){
        String[] data = csvLine.split(",");
        return new User(data[0],data[1],Integer.parseInt(data[2]));
    }
}
