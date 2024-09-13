package com.musicstream;


public class localfile {
    public void playLocalFile() {
        System.out.println("Playing music from local file.");
    }
}

 class LocalFileAdapter implements musicsrc, musicb {
    private localfile localFilePlayer;

    public LocalFileAdapter(localfile localFilePlayer) {
        this.localFilePlayer = localFilePlayer;
    }

    @Override
    public void play() {
        localFilePlayer.playLocalFile();
    }
}
