package com.musicstream;


public class radio {
    public void playRadio() {
        System.out.println("Playing music from radio station.");
    }
}

 class RadioStationAdapter implements musicsrc {
    private radio radioStationPlayer;

    public RadioStationAdapter(radio radioStationPlayer) {
        this.radioStationPlayer = radioStationPlayer;
    }

    @Override
    public void play() {
        radioStationPlayer.playRadio();
    }
}
