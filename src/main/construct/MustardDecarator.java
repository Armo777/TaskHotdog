package main.construct;

import main.HotDog;

public class MustardDecarator extends HotDogDecarator {

    protected MustardDecarator(HotDog decaretable) {
        super(decaretable);
    }

    @Override
    public HotDog prepare() {
        HotDog hotDog = super.prepare();
        hotDog.setMustardCount(hotDog.getMustardCount() + 1);
        return hotDog;
    }
}
