package main;

import main.construct.*;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Меню: 1 - Острый, 2 - Обычный, 3 - Мини");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println(HotDodUtils.doSpaceHotDog());
                break;
            case 2:
                System.out.println(HotDodUtils.doSimpleHotDog());
                break;
            case 3:
                System.out.println(HotDodUtils.doMiniHotDog());
                break;
            default:
                System.out.println("Добавьте ингредиенты");
                priperCastomHotDog();
        }
    }

    private static void priperCastomHotDog() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        String menu = getMenu();
        System.out.println(menu);
        int componentNumber = scanner.nextInt();
        HotDog hotDog = new HotDog();
        while (componentNumber != 0) {
            hotDog = addComponentToHotDog(componentNumber,hotDog);
            System.out.println(menu);
            componentNumber = scanner.nextInt();
        }
        System.out.println(hotDog);
    }

    private static HotDog addComponentToHotDog(int componentNumber, HotDog hotDog) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Map<Integer, Class<?>> map = new HashMap<>();
        map.put(1,MayonnaiseDekarator.class);
        map.put(2, MustardDecarator.class);
        map.put(3, KetchupDecarator.class);
        map.put(4, OnionDecarator.class);
        map.put(5, JalapenoDecarator.class);
        map.put(6, ChileDecarator.class);
        map.put(7, CucumberDecarator.class);
        Class<?> clazz = map.get(componentNumber);
        HotDogDecarator decarator = (HotDogDecarator) clazz.getConstructor(HotDogDecarator.class).newInstance(hotDog);
        return decarator.prepare();
    }

    private static String getMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Выберете что добавить \n");
        stringBuilder.append("Майонез - 1 \n");
        stringBuilder.append("Горчица - 2 \n");
        stringBuilder.append("Кетчуп - 3 \n");
        stringBuilder.append("Лук - 4 \n");
        stringBuilder.append("Халапенье - 5 \n");
        stringBuilder.append("Чили - 6 \n");
        stringBuilder.append("Огурец - 7 \n");
        return stringBuilder.toString();
    }
}