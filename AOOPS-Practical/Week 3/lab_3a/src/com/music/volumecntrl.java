package com.music;

public class volumecntrl extends musicplayer {
    public volumecntrl(musicsrc decoratedMusicSource) {
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

