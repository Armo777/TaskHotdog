package main;

import main.construct.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Class<?>> componentAndDecoratorClassMap = new HashMap<>();

    static {
        componentAndDecoratorClassMap.put(1, MayonnaiseDekarator.class);
        componentAndDecoratorClassMap.put(2, MustardDecarator.class);
        componentAndDecoratorClassMap.put(3, KetchupDecarator.class);
        componentAndDecoratorClassMap.put(4, OnionDecarator.class);
        componentAndDecoratorClassMap.put(5, JalapenoDecarator.class);
        componentAndDecoratorClassMap.put(6, ChileDecarator.class);
        componentAndDecoratorClassMap.put(7, CucumberDecarator.class);
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Меню: 1 - Острый, 2 - Обычный, 3 - Мини, 0 - собрать самому");
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
                prepareCustomHotDog();
        }
    }

    private static void prepareCustomHotDog() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        String menu = getMenu();
        System.out.println(menu);
        int componentNumber = scanner.nextInt();
        HotDog hotDog = new HotDog();
        while (componentNumber != 0) {
            hotDog = addComponentToHotDog(componentNumber, hotDog);
            System.out.println(menu);
            componentNumber = scanner.nextInt();
        }
        System.out.println(hotDog);
    }

    private static HotDog addComponentToHotDog(int componentNumber, HotDog hotDog) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = componentAndDecoratorClassMap.get(componentNumber);
        Constructor<?> constructor = clazz.getDeclaredConstructor(HotDog.class);
        constructor.setAccessible(true);
        HotDogDecarator hotDogDecarator = (HotDogDecarator) constructor.newInstance(hotDog);
        return hotDogDecarator.prepare();
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
        stringBuilder.append("Закончить сборку - 0 \n");
        return stringBuilder.toString();
    }
}