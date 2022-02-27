package com.company.javaWzrceDobrePraktykiZadania.Zadanie5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomSum implements IRandomSum{

    Scanner scanner = new Scanner(System.in);
    Random randomNum = new Random();
    int min = 1;
    int max = 100;
    int sum = 0;
    int[] randomArray;
    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

    public void randomSum(){

        System.out.println("What size of an array do you want?");
        int arraySize = scanner.nextInt();
        randomArray = new int[arraySize];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
        }
        for(int num : randomArray){
            sum += num;
        }
    }

    @Override
    public void getSumOfAllNumbers() {
        System.out.println(sum);
    }

    @Override
    public void getArrayOfNumbers() {
        System.out.println(Arrays.toString(randomArray));
    }
}
