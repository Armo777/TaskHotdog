package main.construct;

import main.HotDog;

public class OnionDecarator extends HotDogDecarator {

    protected OnionDecarator(HotDog decaretable) {
        super(decaretable);
    }

    @Override
    public HotDog prepare() {
        HotDog hotDog = super.prepare();
        hotDog.setOnionCount(hotDog.getOnionCount() + 1);
        return hotDog;
    }
}
