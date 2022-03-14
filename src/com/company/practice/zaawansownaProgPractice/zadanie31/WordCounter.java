package com.company.practice.zaawansownaProgPractice.zadanie31;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;

public class WordCounter {

    //Napisz program, który policzy wystąpienia każdego słowa
    //w pliku tekstowym a następnie wyniki zapisze w formie
    //tabelki w nowym pliku. (plik CSV)

    private static final String separator = " | ";
    private final static Path path = Paths.get("C:\\Users\\iT-Broker\\Desktop\\test.txt");

    public List<String> getListOfWords(File file){

        List<String> linesList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null){
                String [] words = line.split(" ");
                linesList.addAll(Arrays.asList(words));
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        linesList = linesList.stream().map(c->c.replaceAll("\\p{Punct}", "")).map(String::toLowerCase).collect(Collectors.toList());
        linesList.removeIf(w -> w == null || "".equals(w));
        return linesList;
    }

    public Map<String, Integer> getMapOfWords(List<String> list){
        Map<String,Integer> map = new HashMap<>();
        for(String word: list) {
            Integer count = map.get(word);
            map.put(word, (count==null) ? 1 : count+1);
        }
        return map;
    }

    public void exportToCSVFile(Map<String, Integer> testMap) throws IOException {
        Set<String> keySet = testMap.keySet();
        StringBuilder sb = new StringBuilder();
        for(String key: keySet){
            sb.append(key)
                    .append(separator)
                    .append(testMap.get(key))
                    .append("\n");
        }
        Files.writeString(path,sb.toString(), StandardOpenOption.APPEND);
    }



}
