package main;

import main.chain.CustomHotDogPrepare;
import main.chain.MiniHotDogPrepare;
import main.chain.SimpleHotDogPrepare;
import main.chain.SpaciHotDogPrepare;
import main.construct.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Меню: 1 - Острый, 2 - Обычный, 3 - Мини, 0 - собрать самому");
        int number = scanner.nextInt();

        SpaciHotDogPrepare spaciHotDogPrepare = new SpaciHotDogPrepare(null);
        SimpleHotDogPrepare simpleHotDogPrepare = new SimpleHotDogPrepare(spaciHotDogPrepare);
        MiniHotDogPrepare miniHotDogPrepare = new MiniHotDogPrepare(simpleHotDogPrepare);
        CustomHotDogPrepare customHotDogPrepare = new CustomHotDogPrepare(miniHotDogPrepare);

        HotDog h = customHotDogPrepare.prepareHotDog(number);
//        switch (number) {
//            case 1:
//                h = HotDodUtils.doSpaceHotDog();
//                break;
//            case 2:
//                h = HotDodUtils.doSimpleHotDog();
//                break;
//            case 3:
//                h = HotDodUtils.doMiniHotDog();
//                break;
//            default:
//                h = prepareCustomHotDog();
//        }

        System.out.println(h);
        HotDogWriter.hotDogWriterMethod(h);
        ArrayList<HotDog> hot = HotDogReader.hotDogRead();
        System.out.println(hot);
        System.out.println(hot.size());
    }


}