package main.construct;

import main.HotDog;

public class MayonnaiseDekarator extends HotDogDecarator{

    protected MayonnaiseDekarator(HotDog decaretable) {
        super(decaretable);
    }

    @Override
    public HotDog prepare() {
        HotDog hotDog = super.prepare();
        hotDog.setMayonnaiseCount(hotDog.getMayonnaiseCount() + 1);
        return hotDog;
    }
}
