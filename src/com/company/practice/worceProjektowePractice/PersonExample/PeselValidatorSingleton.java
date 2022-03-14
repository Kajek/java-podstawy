package com.company.practice.worceProjektowePractice.PersonExample;


public class PeselValidatorSingleton {

    private static PeselValidatorSingleton instance = new PeselValidatorSingleton();

    public PeselValidatorSingleton(){}
    public static PeselValidatorSingleton getInstance() {
        return instance;
    }

    public boolean validatePesel(String pesel){
        if(!(pesel.length() == 11)){
            return false;
        }

        for(char ch: pesel.toCharArray()){
            if(!Character.isDigit(ch)){
                return false;
            }
        }return true;
    }

}
