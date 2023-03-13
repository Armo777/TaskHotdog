package main.construct;

import main.HotDog;

public abstract class HotDogDecarator implements Decaretable{

    private final HotDog hotDog;

    protected HotDogDecarator(HotDog hotDog) {
        this.hotDog = hotDog;
    }

    @Override
    public HotDog prepare() {
        return hotDog;
    }
}
