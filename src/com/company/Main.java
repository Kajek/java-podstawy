package com.company;

import com.company.javaZaawansowanaZadania.JavaIOZadania.zadanie1i2i3i4.BasicCommandBase;
import com.company.javaZaawansowanaZadania.OOPzadania.Zadanie1.Line;
import com.company.practice.zaawansownaProgPractice.zadanie18.Computer;
import com.company.practice.zaawansownaProgPractice.zadanie28.MyArrayList;
import com.company.practice.zaawansownaProgPractice.zadanie30.ReverseSave;
import com.company.practice.zaawansownaProgPractice.zadanie31.WordCounter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class Main {

    public static void main(String arg[]) throws IOException {


//        MyArrayList<Integer> randomlist = new MyArrayList<>();
//        randomlist.add(4);
//        randomlist.add(3);
//        randomlist.add(2);
//        randomlist.add(1);
//        randomlist.add(7);
//        randomlist.add(9);
//        MyArrayList myArrayList = new MyArrayList();
//        System.out.println(randomlist.getEveryNthElement(2,3));
//        ReverseSave reverseSave = new ReverseSave();
//        reverseSave.saveAndReverse();
        File file = new File("C:\\Users\\iT-Broker\\Desktop\\TODO.txt");
        WordCounter wordCounter = new WordCounter();

//        wordCounter.getMapOfWords(wordCounter.getListOfWords(file)).forEach((k,v) -> System.out.println(k + " :" + v));
//        System.out.println(wordCounter.getListOfWords(file).size());
//        wordCounter.exportToCSVFile(wordCounter.getMapOfWords(wordCounter.getListOfWords(file)));

    }


}






                                    // ADVENT OF CODE //
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Scanner scanner = new Scanner(System.in);
//
//        List<String> list = new ArrayList<>();
//        File file = new File("C:\\javakurs\\java-podstawy\\src\\com\\company\\file.txt");
//
//        try {
//            File myObj = new File("C:\\javakurs\\java-podstawy\\src\\com\\company\\file.txt");
//            Scanner myReader = new Scanner(myObj);
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine();
//                list.add(data);
////                System.out.println(data);
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//
//        int ones = 0;
//        int zeroes= 0;
//        String[] listArray = list.toArray(new String[0]);
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list.get(i).length(); j++) {
//                if(list.get(i).charAt(j) == '0'){
//                    zeroes++;
//                }else if(list.get(i).charAt(j) == '1') {
//                    ones++;
//                }
//            }if(zeroes>ones){
//                System.out.println(0);
//            }else{
//                System.out.println(1);
//            }
//        }
        ////////////////////////////1111111111

//        long     depth = 0;
//        long horizontal = 0;
//        long aim =0;
//        for (String dataPoint : list){
//            if(dataPoint.contains("down")){
//                aim += Integer.parseInt(dataPoint.substring(dataPoint.length()-1));
//            }else if(dataPoint.contains("up")){
//                aim -= Integer.parseInt(dataPoint.substring(dataPoint.length()-1));
//            }else if(dataPoint.contains("forward")){
//                horizontal += Integer.parseInt(dataPoint.substring(dataPoint.length()-1));
//                depth += aim * Integer.parseInt(dataPoint.substring(dataPoint.length()-1));
//            }
//        }
//        System.out.println("depth = " + depth);
//        System.out.println("horizontal = " + horizontal);
//        System.out.println(depth* horizontal);

//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//            String text = null;
//
//            while ((text = reader.readLine()) != null) {
//                list.add(Integer.parseInt(text));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(list);
//        Integer[] listArray = list.toArray(new Integer[0]);
//        int count = 0;
//        for (int i = 0; i < listArray.length-1; i++) {
//
//        }
//        }
//        for(int i = 0; i < list.size()-1; i++){
//            if(list.get(i) < list.get(i+1)){
//                count++;
//            }
//
//        }








