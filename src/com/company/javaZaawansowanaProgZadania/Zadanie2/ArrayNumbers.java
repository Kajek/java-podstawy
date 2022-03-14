package com.company.javaZaawansowanaProgZadania.Zadanie2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayNumbers {

    Scanner scanner = new Scanner(System.in);

    public int [] bubleSort(){
        System.out.println("Give me length of an array: ");
        int arrayLength = scanner.nextInt();
        int [] arrayToFill = new int[arrayLength];
        int count = 0;
        while (count != arrayLength){
            System.out.println("Give me number: ");
            int number = scanner.nextInt();
            arrayToFill[count] = number;
            count++;
        }

        boolean changed = false;
        for (int i = 0; i < arrayToFill.length -1 ; i++) {
            int currentNum = arrayToFill[i];
            int nextNum = arrayToFill[i + 1];
            if( currentNum > nextNum){
                arrayToFill[i] = nextNum;
                arrayToFill[i + 1] = currentNum;
                changed = true;
            }
        }
        return arrayToFill;
    }
}
