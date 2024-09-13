package com.factorymethod;


	public abstract class vehiclefactory {
	    public abstract vehicle createVehicle();
	}

	 class CarFactory extends vehiclefactory {
	    @Override
	    public vehicle createVehicle() {
	        return new car();
	    }
	}

 class BikeFactory extends vehiclefactory {
	    @Override
	    public vehicle createVehicle() {
	        return new bike();
	    }
	}

	class ScooterFactory extends vehiclefactory {
	    @Override
	    public vehicle createVehicle() {
	        return new scooter();
	    }
	}


