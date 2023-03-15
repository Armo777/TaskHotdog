package main.construct;

import main.HotDog;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class HotDogWriter {
    public static void hotDogWriterMethod(HotDog hotdozhik){
        ArrayList<HotDog> arrayList = HotDogReader.hotDogRead();
        try {
            File file = new File("HotDog");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            arrayList.add(hotdozhik);
            objectOutputStream.writeObject(arrayList);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
//   static{
//         try {
//             File file = new File("HotDog");
//             FileOutputStream fileOutputStream = new FileOutputStream(file);
//             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//
//             objectOutputStream.writeObject(new ArrayList<HotDog>());
//
//
//         } catch (IOException e) {
//             throw new RuntimeException(e);
//         }
//
//     }
}
