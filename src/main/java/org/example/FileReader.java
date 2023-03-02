package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class FileReader {

    public static HashMap<Integer,Say> read() {
        HashMap<Integer,Say> map = null;
        try {
            FileInputStream fis = new FileInputStream("sayList.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            map = (HashMap<Integer,Say>) ois.readObject();
            ois.close();
            fis.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return map;
    }
}
