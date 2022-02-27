package com.company.javaWzrceDobrePraktykiZadania.Zadanie4;

import java.util.Scanner;

public class PeselValidator {
    Scanner scanner = new Scanner(System.in);
    String validatingNumbers = "13791379131";

    public void validatePesel(String pesel){
        int sum = 0;

        for (int i = 0; i < pesel.length(); i++) {
            sum +=(Integer.parseInt(String.valueOf(pesel.charAt(i))) * Integer.parseInt(String.valueOf(validatingNumbers.charAt(i))));
        }

        String sumString = String.valueOf(sum);
        if (sumString.endsWith("0")){
            System.out.println("Pesel jest prawidłowy");
        }else{
            System.out.println("Pesel nie jest prawidłowy");
        }
    }

}
