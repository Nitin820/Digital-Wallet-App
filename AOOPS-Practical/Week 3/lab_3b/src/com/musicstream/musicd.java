package com.musicstream;


public abstract class musicd implements musicb {
    protected musicb decoratedMusicSource;

    public musicd(musicb decoratedMusicSource) {
        this.decoratedMusicSource = decoratedMusicSource;
    }

    @Override
    public void play() {
        decoratedMusicSource.play();
    }
}

