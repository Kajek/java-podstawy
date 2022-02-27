package com.company;

import java.util.*;

import static java.lang.String.valueOf;

public class Main {

    public static void main(String arg[]) {


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








