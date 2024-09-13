package com.music;


public class localfilemusic {
 public void playLocalFile() {
     System.out.println("Playing music from local file.");
 }
}

class LocalFileAdapter implements musicsrc {
 private localfilemusic localFilePlayer;

 public LocalFileAdapter(localfilemusic localFilePlayer) {
     this.localFilePlayer = localFilePlayer;
 }

 @Override
 public void play() {
     localFilePlayer.playLocalFile();
 }
}

