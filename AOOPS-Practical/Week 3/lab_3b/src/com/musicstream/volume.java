package com.musicstream;

public class volume extends musicd {
    public volume(musicb decoratedMusicSource) {
        super(decoratedMusicSource);
    }

    @Override
    public void play() {
        super.play();
        adjustVolume();
    }

    private void adjustVolume() {
        System.out.println("Volume adjusted.");
    }
}

