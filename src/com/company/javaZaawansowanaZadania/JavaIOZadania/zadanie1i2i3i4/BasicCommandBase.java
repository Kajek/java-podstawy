package com.company.javaZaawansowanaZadania.JavaIOZadania.zadanie1i2i3i4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BasicCommandBase {

    //zadanie 1
    public void getFileContents(){
        File file = new File("C:\\javakurs\\java-podstawy");
        String [] fileList = file.list();
        for (String f : fileList){
            System.out.println(f);
        }
    }

    //zadanie 2
    public void readFileLineByLine() throws IOException {

        try(BufferedReader bufferedReader= new BufferedReader(new FileReader("C:\\Users\\iT-Broker\\Desktop\\TODO.txt"))){
            String line = bufferedReader.readLine();
            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    //zadanie 3
    public void addTextToFile() throws IOException {

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\iT-Broker\\Desktop\\TODO.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\iT-Broker\\Desktop\\test.txt")))
        {
            String line = "";
            bufferedWriter.write("test test");
            while (line != null){
                bufferedWriter.write(line);
                line = bufferedReader.readLine();
            }
            bufferedWriter.write("test test");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    //zadanie 4 z bufferReader
    public void returnLongestWordInText() throws FileNotFoundException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\iT-Broker\\Desktop\\TODO.txt"))){
            String line = bufferedReader.readLine();
            int maxLength = 0;
            String maxLenghtString = "";
            while (line != null){
                String [] words = line.split(" ");
                for (String word: words){
                    if(word.length() > maxLength){
                        maxLength = word.length();
                        maxLenghtString = word;
                    }
            }
                line = bufferedReader.readLine();
            }
            System.out.println(maxLenghtString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //zadanie 4 ze scanner
        public String returnLongestWordUsingScanner() throws FileNotFoundException{
        String longestWord = "";
        String current;
        Scanner scanner = new Scanner(new File("C:\\Users\\iT-Broker\\Desktop\\TODO.txt"));
        while (scanner.hasNext()){
            current = scanner.next();
            if(current.length() > longestWord.length()){
                longestWord = current;
            }
        }
        return longestWord;
    }

}
