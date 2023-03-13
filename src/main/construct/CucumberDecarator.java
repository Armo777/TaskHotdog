package main.construct;

import main.HotDog;

public class CucumberDecarator extends HotDogDecarator {

    protected CucumberDecarator(HotDog decaretable) {
        super(decaretable);
    }

    @Override
    public HotDog prepare() {
        HotDog hotDog = super.prepare();
        hotDog.setCucumberCount(hotDog.getCucumberCount() + 1);
        return hotDog;
    }
}
