package com.musicstream;

 public class advancemusic extends musicp {
    public advancemusic(musicb musicSource) {
        super(musicSource);
    }

    @Override
    public void playMusic() {
        System.out.println("Using advanced music player...");
        musicSource.play();
    }
}

