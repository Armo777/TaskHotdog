package main.construct;

import main.HotDog;

public class KetchupDecarator extends HotDogDecarator {

    protected KetchupDecarator(HotDog decaretable) {
        super(decaretable);
    }

    @Override
    public HotDog prepare() {
        HotDog hotDog = super.prepare();
        hotDog.setKetchupCount(hotDog.getKetchupCount() + 1);
        return hotDog;
    }
}
