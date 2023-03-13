package main.construct;

import main.HotDog;

public class ChileDecarator extends HotDogDecarator {

    protected ChileDecarator(HotDog decaretable) {
        super(decaretable);
    }

    @Override
    public HotDog prepare() {
        HotDog hotDog = super.prepare();
        hotDog.setChileCount(hotDog.getChileCount() + 1);
        return hotDog;
    }
}
