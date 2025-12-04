import java.util.ArrayList;

public class Playlist {
    String name;
    ArrayList<String> Songs;

    public Playlist(String name) {
        this.name = name;
        this.Songs = new ArrayList<String>();
    }
    public String getName() {
        return name;
    }
    public void addSong(String songName) {
        Songs.add(songName);
    }
    public void removeSong(String songName) {
        Songs.remove(songName);
    }
    public void printSongs() {
        for (String song : Songs) {
            System.out.println(song);
        }
    }
    public int getSongCount() {
        return Songs.size();
    }
}
