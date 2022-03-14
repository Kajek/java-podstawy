package com.company.javaZaawansowanaZadania.JavaIOZadania.zadanie6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ObjectOutputStream {

    public final Object readObject() throws IOException, ClassNotFoundException{
        try{
            FileInputStream fileIn = new FileInputStream("test.txt");
//            ObjectInputStream in = new ObjectInputStream(fileIn);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
