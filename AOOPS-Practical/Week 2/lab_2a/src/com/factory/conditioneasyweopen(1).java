package com.factory;

public class conditioneasyweopen implements weopen {
    @Override
    public void fire() {
        System.out.println("Easy Weapon fires slowly.");
    }
}

 class MediumWeapon implements weopen {
    @Override
    public void fire() {
        System.out.println("Medium Weapon fires at medium speed.");
    }
}

 class HardWeapon implements weopen {
    @Override
    public void fire() {
        System.out.println("Hard Weapon fires rapidly.");
    }
}
 class EasyPowerUp implements PowerUp {
    @Override
    public void activate() {
        System.out.println("Easy PowerUp restores a small amount of health.");
    }
}

 class MediumPowerUp implements PowerUp {
    @Override
    public void activate() {
        System.out.println("Medium PowerUp restores a moderate amount of health.");
    }
}

 class HardPowerUp implements PowerUp {
    @Override
    public void activate() {
        System.out.println("Hard PowerUp restores a large amount of health.");
    }
}

