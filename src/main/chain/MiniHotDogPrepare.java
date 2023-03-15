package main.chain;

import main.HotDodUtils;
import main.HotDog;

public class MiniHotDogPrepare extends AbstractHotDogPrepare {

    public MiniHotDogPrepare(AbstractHotDogPrepare next) {
        super(next);
    }

    @Override
    public HotDog prepareHotDog(int resipeNumber) {
        if(resipeNumber == 3){
            return HotDodUtils.doMiniHotDog();
        }
        if(next != null){
            return next.prepareHotDog(resipeNumber);
        }
        return null;
    }
}


