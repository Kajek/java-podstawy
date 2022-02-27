package com.company.javaWzrceDobrePraktykiZadania.Zadanie6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NamesShuffle {

    Scanner scanner = new Scanner(System.in);
    List<String> namesList = new ArrayList<>();

    public void namesShuffler(){
        System.out.println("Give me 5 names");
        while (namesList.size() != 5){
            namesList.add(scanner.nextLine());
        }

        System.out.println(namesList);
        System.out.println("Give me name to remove from the list");
        String nameToRemove = scanner.nextLine();
        namesList.removeIf(n -> n.equals(nameToRemove));
        namesList.stream().sorted().forEach(n -> System.out.println(n));

    }
}
