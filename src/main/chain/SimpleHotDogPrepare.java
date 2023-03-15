package main.chain;

import main.HotDodUtils;
import main.HotDog;


    public class SimpleHotDogPrepare extends AbstractHotDogPrepare {

        public SimpleHotDogPrepare(AbstractHotDogPrepare next) {
            super(next);
        }

        @Override
        public HotDog prepareHotDog(int resipeNumber) {
            if(resipeNumber == 2){
                return HotDodUtils.doSimpleHotDog();
            }
            if(next != null){
                return next.prepareHotDog(resipeNumber);
            }
            return null;
        }
    }

