package com.musicstream;


	public abstract class musicp {
	    protected musicb musicSource;

	    public musicp(musicb musicSource) {
	        this.musicSource = musicSource;
	    }

	    public abstract void playMusic();
	}


