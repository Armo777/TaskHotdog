package main.chain;

import main.HotDog;
import main.construct.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomHotDogPrepare extends AbstractHotDogPrepare {
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

    public CustomHotDogPrepare(AbstractHotDogPrepare next) {
        super(next);
    }

    @Override
    public HotDog prepareHotDog(int resipeNumber) {
        if(resipeNumber == 4){

            try {
                return prepareCustomHotDog();

            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        if(next != null){
            return next.prepareHotDog(resipeNumber);
        }
        return null;
    }
    private static HotDog prepareCustomHotDog() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
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

        return hotDog;
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
        stringBuilder.append("�������� ��� �������� \n");
        stringBuilder.append("������� - 1 \n");
        stringBuilder.append("������� - 2 \n");
        stringBuilder.append("������ - 3 \n");
        stringBuilder.append("��� - 4 \n");
        stringBuilder.append("��������� - 5 \n");
        stringBuilder.append("���� - 6 \n");
        stringBuilder.append("������ - 7 \n");
        stringBuilder.append("��������� ������ - 0 \n");
        return stringBuilder.toString();
    }
}
