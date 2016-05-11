package com.sh;

import java.util.*;

public class Main {

    private static ArrayList<Album> albumsCollection = new ArrayList<Album>();

    public static void main(String[] args) {
        // Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()

        Album album = new Album("ANTI", "Rihanna");
        album.addSongs("Consideration", 2.41);
        album.addSongs("James Joint", 1.12);
        album.addSongs("Kiss It Better", 4.13);
        album.addSongs("Work ft. Drake", 3.39);
        album.addSongs("Desperado", 3.06);
        albumsCollection.add(album);

        album = new Album("A Head Full Of Dreams", "Coldplay");
        album.addSongs("A Head Full Of Dreams", 3.43);
        album.addSongs("Birds", 3.48);
        album.addSongs("Hymn For The Weekend", 4.18);
        album.addSongs("Everglow", 4.42);
        album.addSongs("Adventure Of A Lifetime", 4.23);
        albumsCollection.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albumsCollection.get(0).addToPlayList("Work ft. Drake", playlist);
        albumsCollection.get(0).addToPlayList("Kiss It Better", playlist);
        albumsCollection.get(0).addToPlayList("Princess Of China", playlist); //Does not exist
        albumsCollection.get(0).addToPlayList(2, playlist);
        albumsCollection.get(1).addToPlayList(3, playlist);
        albumsCollection.get(1).addToPlayList(1, playlist);
        albumsCollection.get(1).addToPlayList(6, playlist); //There is no track 6

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> playlistIterator = playlist.listIterator();

        if (playlist.isEmpty()){
            System.out.println("Playlist is empty.");
            return;
        } else {
            System.out.println("Now playing "+ playlistIterator.next().getTitle());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Player stopped.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (playlistIterator.hasNext()) {
                            playlistIterator.next();
                        }
                        forward = true;
                    }
                    if (playlistIterator.hasNext()) {
                        System.out.println("Now playing " + playlistIterator.next().getTitle());
                    } else {
                        System.out.println("Reached the end of the playlist.");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (playlistIterator.hasPrevious()) {
                            playlistIterator.previous();
                        }
                        forward = false;
                    }
                    if (playlistIterator.hasPrevious()) {
                        System.out.println("Now playing " + playlistIterator.previous().getTitle());
                    } else {
                        System.out.println("Reached the beginning of the playlist.");
                        forward = true;
                    }
                    break;
                case 3: //write it better
                    if (forward) {
                        if (playlistIterator.hasPrevious()) {
                            System.out.println("Now playing " + playlistIterator.previous().getTitle());
                            forward = false;
                        } else {
                            System.out.println("Reached the beginning of the playlist.");
                        }
                    } else {
                        if (playlistIterator.hasNext()) {
                            System.out.println("Now playing " + playlistIterator.next().getTitle());
                            forward = true;
                        } else {
                            System.out.println("Reached the end of the playlist.");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0) {
                        playlistIterator.remove();
                        if (playlistIterator.hasNext()) {
                            System.out.println("Now playing " + playlistIterator.next());
                        } else if (playlistIterator.hasPrevious()) {
                            System.out.println("Now playing " + playlistIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Press: ");
        System.out.println("0 - to quit");
        System.out.println("1 - to skip to the next song");
        System.out.println("2 - to go to the previous song");
        System.out.println("3 - to repeat the current song");
        System.out.println("4 - list songs in the playlist");
        System.out.println("5 - to to print the menu options");
        System.out.println("6 - to remove the current song from the playlist");
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
    }
}
