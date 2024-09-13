package com.factory;


 class EasyGameFactory implements GameFactory {
    @Override
    public weopen createWeapon() {
        return new conditioneasyweopen();
    }

    @Override
    public PowerUp createPowerUp() {
        return new EasyPowerUp();
    }
}

 class MediumGameFactory implements GameFactory {
    @Override
    public weopen createWeapon() {
        return new MediumWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new MediumPowerUp();
    }
}

 
 class HardGameFactory implements GameFactory {
    @Override
    public weopen createWeapon() {
        return new HardWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new HardPowerUp();
    }
}

