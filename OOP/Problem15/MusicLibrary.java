package OOP.Problem15;

import java.util.ArrayList;
import java.util.Random;

class MusicLibrary {

    ArrayList<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public void displaySongs() {
        System.out.println("Songs in the library: ");
        for (Song s : songs) {
            System.out.println("- " + s);
        }
    }

    void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs available!");
            return;
        }
        Random rand = new Random();
        int index = rand.nextInt(songs.size());
        System.out.println("Now Playing: " + songs.get(index));
    }

    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();

        musicLibrary.addSong(new Song("Bohemian Rhapsody"));
        musicLibrary.addSong(new Song("Shape of You"));
        musicLibrary.addSong(new Song("Blinding Lights"));
        musicLibrary.addSong(new Song("Hotel California"));
        musicLibrary.addSong(new Song("Smells Like Teen Spirit"));

        musicLibrary.displaySongs();

        musicLibrary.playRandomSong();
    }
}
