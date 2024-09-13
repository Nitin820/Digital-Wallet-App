package com.music;


	public abstract class musicplayer implements musicsrc {
	    protected musicsrc decoratedMusicSource;

	    public musicplayer(musicsrc decoratedMusicSource) {
	        this.decoratedMusicSource = decoratedMusicSource;
	    }

	    public void play() {
	        decoratedMusicSource.play();
	    }
	}



