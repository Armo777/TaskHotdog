package main.chain;

import main.HotDodUtils;
import main.HotDog;

public class SpaciHotDogPrepare extends AbstractHotDogPrepare {

    public SpaciHotDogPrepare(AbstractHotDogPrepare next) {
        super(next);
    }

    @Override
    public HotDog prepareHotDog(int resipeNumber) {
        if(resipeNumber == 1){

            return HotDodUtils.doSpaceHotDog();
        }
        if(next != null){
            return next.prepareHotDog(resipeNumber);
        }
        return null;
    }
}
