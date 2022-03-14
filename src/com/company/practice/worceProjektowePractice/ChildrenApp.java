package com.company.practice.worceProjektowePractice;

import com.company.practice.worceProjektowePractice.Singleton.CounterSigleton;

import java.util.Scanner;

public class ChildrenApp {
    public static void main(String[] args) {
        boolean isWorking = true;
        Scanner scanner = new Scanner(System.in);
        ChildrenRepository childrenRepository = new ChildrenRepositoryImpl();

        while (isWorking) {
            String input = scanner.nextLine();
            switch (input) {
                case "exit":
                    isWorking = false;
                    break;
                case "add":
                    String name = scanner.nextLine();
                    childrenRepository.addChild(name);
                    break;
                case "display":
                    System.out.println(childrenRepository.getChildren());
                    break;
                case "remove":
                    childrenRepository.removeDuplicates();
                    break;
                case "sort":
                    childrenRepository.sortChildren();
                    break;
                case "lower":
                    childrenRepository.setNamesToLowerCase();
                    break;
                case "upper":
                    childrenRepository.setNamesToUpperCase();
                    break;
                case "count":
                    System.out.println(CounterSigleton.getInstance().getNumberOfInstances());
            }

        }
    }
}
