package com.company.javaWzrceDobrePraktykiZadania.Zadanie3;

import java.util.Scanner;

// Uzyj interfejsu. Zwroc uwage na mozliwosc podmiany implementacji. ?????

public class PalindromVerifier {

    Scanner scanner = new Scanner(System.in);

    public boolean palindromCheck(String input){
        System.out.println("Give me text to check if it is a palindrome: ");
        int start = 0;
        int finish = input.length() - 1;

        while (start < finish){
            if(input.charAt(start) != input.charAt(finish)){
                return false;
            }
            start++;
            finish--;
        }
        return true;
    }
}
