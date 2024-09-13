package com.factorymethod;


 class car implements vehicle {
    @Override
    public void book() {
        System.out.println("Car booked.");
    }
}
 class bike implements vehicle {
    @Override
    public void book() {
        System.out.println("Bike booked.");
    }
}

 class scooter implements vehicle {
    @Override
    public void book() {
        System.out.println("Scooter booked.");
    }
}

