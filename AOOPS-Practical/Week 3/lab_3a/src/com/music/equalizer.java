package com.music;


	public class equalizer extends musicplayer {
	    public equalizer(musicsrc decoratedMusicSource) {
	        super(decoratedMusicSource);
	    }

	    public void play() {
	        super.play();
	        setEqualizer();
	    }

	    private void setEqualizer() {
	        System.out.println("Equalizer settings applied.");
	    }
	}


