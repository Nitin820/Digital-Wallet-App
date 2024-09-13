package com.music;


public class onlinestream {
 public void playOnlineStream() {
     System.out.println("Playing music from online streaming service.");
 }
}

//Adapter for OnlineStreamingPlayer
 class OnlineStreamingAdapter implements musicsrc {
 private onlinestream onlineStreamingPlayer;

 public OnlineStreamingAdapter(onlinestream onlineStreamingPlayer) {
     this.onlineStreamingPlayer = onlineStreamingPlayer;
 }

 @Override
 public void play() {
     onlineStreamingPlayer.playOnlineStream();
 }
}

