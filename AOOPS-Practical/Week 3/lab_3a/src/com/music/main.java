package com.music;


public class main {
    public static void main(String[] args) {
         musicsrc localMusic = new LocalFileAdapter(new localfilemusic());
        musicsrc onlineMusic = new OnlineStreamingAdapter(new onlinestream());
        musicsrc radioMusic = new RadioStationAdapter(new radiostream());

        System.out.println("--- Playing music file-----");
        onlineMusic.play(); // Play radio station

               System.out.println("\n--- Applying additional features ---");
        musicsrc basicMusicPlayer = new basicmusic();

               musicsrc equalizerPlayer = new equalizer(basicMusicPlayer);
        equalizerPlayer.play();

       
        musicsrc fullFeaturedPlayer = new volumecntrl(equalizerPlayer);
        fullFeaturedPlayer.play();
    }
}

