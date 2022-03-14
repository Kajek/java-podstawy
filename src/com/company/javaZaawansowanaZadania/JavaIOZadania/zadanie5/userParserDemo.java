package com.company.javaZaawansowanaZadania.JavaIOZadania.zadanie5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class userParserDemo {
    public static void main(String[] args) throws IOException {

        UserParser userParser = new UserParser();
        Path path = Paths.get("C:\\Users\\iT-Broker\\Desktop\\test.txt");
        List<User> users = new ArrayList<>();
        List<String> lines = Files.readAllLines(path);
        for (String line: lines){
            User user = userParser.fromCSV(line);
            users.add(user);
        }
        System.out.println(users);
    }
}
