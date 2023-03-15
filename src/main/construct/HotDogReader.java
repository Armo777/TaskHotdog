package main.construct;

import main.HotDog;

import java.io.*;
import java.util.ArrayList;

public class HotDogReader {
    public static ArrayList<HotDog> hotDogRead(){
        File file = new File("HotDog");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            return (ArrayList<HotDog>) objectInputStream.readObject();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
