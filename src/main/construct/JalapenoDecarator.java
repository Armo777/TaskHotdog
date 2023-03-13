package main.construct;

import main.HotDog;

public class JalapenoDecarator extends HotDogDecarator{

    protected JalapenoDecarator(HotDog decaretable) {
        super(decaretable);
    }

    @Override
    public HotDog prepare() {
        HotDog hotDog = super.prepare();
        hotDog.setJalapenoCount(hotDog.getJalapenoCount() + 1);
        return hotDog;
    }
}
