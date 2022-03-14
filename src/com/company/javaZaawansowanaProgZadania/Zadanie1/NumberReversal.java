package com.company.javaZaawansowanaProgZadania.Zadanie1;

public class NumberReversal {

    public int reverseNumber(int number){
        int reversedNumn = 0;
        while (number != 0){
            int reminder = number%10;
            reversedNumn = reversedNumn*10 + reminder;
            number /= 10;
        }
        return reversedNumn;
    }
}
