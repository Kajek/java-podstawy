package com.company.javaZaawansowanaZadania.JavaIOZadania.zadanie6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectInputStream {

    public final void writeObcject(Object x) throws IOException {
        try {

            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\iT-Broker\\Desktop\\test.txt");
//            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
