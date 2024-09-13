package com.musicstream;


public class equalizer extends musicd {
    public equalizer(musicb decoratedMusicSource) {
        super(decoratedMusicSource);
    }

    @Override
    public void play() {
        super.play();
        setEqualizer();
    }

    private void setEqualizer() {
        System.out.println("Equalizer settings applied.");
    }
}

