package com.company.practice.zaawansownaProgPractice.zadanie30;

import java.io.*;

public class ReverseSave {

    public void saveAndReverse() throws IOException {

        StringBuilder sb = new StringBuilder();
        File file = new File("C:\\Users\\iT-Broker\\Desktop\\test.txt");
        String fileName = file.getName();
        String fileNameReversed = sb.append(fileName).reverse().toString();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\iT-Broker\\Desktop\\" + fileNameReversed +".txt")))
        {
            StringBuilder sb2 = new StringBuilder();
            String line = bufferedReader.readLine();
            while (line != null){
                bufferedWriter.write(sb2.append(line).reverse().toString());
                bufferedWriter.write("\n");
                line = bufferedReader.readLine();
                sb2 = new StringBuilder();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
