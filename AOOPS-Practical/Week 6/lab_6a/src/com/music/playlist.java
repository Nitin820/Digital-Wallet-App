package com.music;

import java.util.LinkedList;

public class playlist {
    private LinkedList<song> songs;

    public playlist() {
        songs = new LinkedList<>();
    }

    
    public void addSong(String title) {
        songs.add(new song(title));
        System.out.println("Added song: " + title);
    }

   
    public void removeSong(String title) {
        song songToRemove = null;
        for (song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                songToRemove = song;
                break;
            }
        }

        if (songToRemove != null) {
            songs.remove(songToRemove);
            System.out.println("Removed song: " + title);
        } else {
            System.out.println("Song not found: " + title);
        }
    }

    // Move a song to a different position
    public void moveSong(String title, int newPosition) {
        song songToMove = null;
        for (song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                songToMove = song;
                break;
            }
        }

        if (songToMove != null) {
            songs.remove(songToMove);
            if (newPosition < 0) newPosition = 0;
            if (newPosition > songs.size()) newPosition = songs.size();
            songs.add(newPosition, songToMove);
            System.out.println("Moved song: " + title + " to position " + newPosition);
        } else {
            System.out.println("Song not found: " + title);
        }
    }

    
    public void displayPlaylist() {
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }

        System.out.println("Playlist:");
        for (int i = 0; i < songs.size(); i++) {
            System.out.println((i + 1) + ": " + songs.get(i));
        }
    }
}

