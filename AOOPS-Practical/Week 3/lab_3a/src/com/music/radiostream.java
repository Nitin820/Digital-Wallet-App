package com.music;

public class radiostream {
 public void playRadio() {
     System.out.println("Playing music from radio station.");
 }
}


 class RadioStationAdapter implements musicsrc {
 private radiostream radioStationPlayer;

 public RadioStationAdapter(radiostream radioStationPlayer) {
     this.radioStationPlayer = radioStationPlayer;
 }

 @Override
 public void play() {
     radioStationPlayer.playRadio();
 }
}

