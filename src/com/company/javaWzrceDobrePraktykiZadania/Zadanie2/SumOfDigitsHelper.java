package com.company.javaWzrceDobrePraktykiZadania.Zadanie2;

import java.util.Scanner;

public class SumOfDigitsHelper implements ISumAllThings{

    private boolean isWorking = true;
    int sum = 0;
    Scanner scanner = new Scanner(System.in);

    @Override
    public int sumOfStringDigits(String userString){

        String [] userStringNumbers = userString.split(" ");
        for (int i = 0; i < userStringNumbers.length; i++) {
            sum += Integer.parseInt(userStringNumbers[i]);
        }
        System.out.println("Sum of initial numbers is: "+ sum);

        while (isWorking){

            System.out.println("Give me number or numbers(divided by space) to add: ");
            String userInput = scanner.nextLine();
            if (userInput.equals("exit")){
                isWorking = false;
                break;
            }
            if (userInput.contains(" ")){
                String [] userNumbers = userInput.split(" ");
                for (String userNumber : userNumbers) {
                    sum += Integer.parseInt(userNumber);
                }
//                for (int i = 0; i < userNumbers.length; i++) {
//                    sum += Integer.parseInt(userNumbers[i]);
//                }
                System.out.println(sum);
            }else{
                sum += Integer.parseInt(userInput);
                System.out.println(sum);
            }

        }return sum;
    }

    @Override
    public int sumOfIntDigits(int userInt) {

        while (isWorking){
            System.out.println("Give me number to add to initial number: ");
            String userInput = scanner.nextLine();
            if(userInput.equals("exit")){
                isWorking = false;
                break;
            }else{
                int userInputInt = Integer.parseInt(userInput);
                sum += userInputInt;
            }
            System.out.println(sum);
        }return sum;
    }
}
