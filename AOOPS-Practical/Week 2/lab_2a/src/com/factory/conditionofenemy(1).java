package com.factory;

public class conditionofenemy implements enemy {
    @Override
    public void attack() {
        System.out.println("Easy Enemy attacks with basic power.");
    }
}

 class MediumEnemy implements enemy {
    @Override
    public void attack() {
        System.out.println("Medium Enemy attacks with moderate power.");
    }
}

 class hard implements enemy {
    @Override
    public void attack() {
        System.out.println("Hard Enemy attacks with high power.");
    }
}
