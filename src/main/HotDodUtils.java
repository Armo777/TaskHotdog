package main;

public class HotDodUtils {

    public static HotDog doSpaceHotDog() {
        HotDog hotDog = new HotDog();
        hotDog.setChileCount(2);
        hotDog.setMustardCount(2);
        hotDog.setJalapenoCount(2);
        return hotDog;
    }

    public static HotDog doSimpleHotDog() {
        HotDog hotDog = new HotDog();
        hotDog.setKetchupCount(2);
        hotDog.setOnionCount(2);
        hotDog.setMayonnaiseCount(2);
        hotDog.setCucumberCount(2);
        return hotDog;
    }

    public static HotDog doMiniHotDog() {
        HotDog hotDog = new HotDog();
        hotDog.setOnionCount(1);
        hotDog.setKetchupCount(1);
        hotDog.setMustardCount(1);
        return hotDog;
    }
}
