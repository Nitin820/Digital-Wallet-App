package com.musicstream;
public class main {
    public static void main(String[] args) {
        
        musicb localMusic = new LocalFileAdapter(new localfile());
        musicsrc onlineMusic = new OnlineStreamingAdapter(new onlinestream());
        musicsrc radioMusic = new RadioStationAdapter(new radio());

        
        System.out.println("--- Playing music with Advanced Music Player ---");
        musicp player = new advancemusic(localMusic);
        player.playMusic();

        
        System.out.println("\n--- Adding Equalizer to Playback ---");
        musicb equalizerMusic = new equalizer(localMusic);
        equalizerMusic.play();

        System.out.println("\n--- Adding Volume Control and Equalizer ---");
        musicb fullFeaturedMusic = new volume(equalizerMusic);
        fullFeaturedMusic.play();
    }
}
