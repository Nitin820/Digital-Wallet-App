package com.factory;

public interface weopen {
	
	
	    void fire();
	}

	
	 interface PowerUp {
	    void activate();
	}

	
	 interface GameFactory {
	    weopen createWeapon();
	    PowerUp createPowerUp();
	}

