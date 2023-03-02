package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class FileWriter {


    public static void write(HashMap<Integer,Say> hashMap) {

        try {
            FileOutputStream fos = new FileOutputStream("sayList.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(hashMap);
            oos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
