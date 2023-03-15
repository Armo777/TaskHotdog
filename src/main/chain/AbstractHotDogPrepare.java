package main.chain;

import main.HotDog;

public abstract class AbstractHotDogPrepare {
    protected AbstractHotDogPrepare next;

    public AbstractHotDogPrepare(AbstractHotDogPrepare next) {
        this.next = next;
    }
    public abstract HotDog prepareHotDog(int resipeNumber);

}

