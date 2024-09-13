package com.music;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        playlist playlist = new playlist();

        while (true) {
            System.out.println("\nMusic Playlist");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Move Song");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String addTitle = scanner.nextLine();
                    playlist.addSong(addTitle);
                    break;
                case 2:
                    System.out.print("Enter song title to remove: ");
                    String removeTitle = scanner.nextLine();
                    playlist.removeSong(removeTitle);
                    break;
                case 3:
                    System.out.print("Enter song title to move: ");
                    String moveTitle = scanner.nextLine();
                    System.out.print("Enter new position (1-based index): ");
                    int newPosition = scanner.nextInt();
                    scanner.nextLine();  
                    playlist.moveSong(moveTitle, newPosition - 1);
                    break;
                case 4:
                    playlist.displayPlaylist();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return; 
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
