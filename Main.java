public class Main {

    public static void main(String[] args) {


        Song song1 = new Song("Shape of You");
        Song song2 = new Song("Believer");
        Song song3 = new Song("Blinding Lights");


        song1.next = song2;
        song2.prev = song1;
        song2.next = song3;
        song3.prev = song2;

        // Test
        System.out.println("Current: " + song2);
        System.out.println("Next: " + song2.next);
        System.out.println("Previous: " + song2.prev);
    }
}


class Song {
    String title;
    Song next;
    Song prev;


    public Song(String title) {
        this.title = title;
        this.next = null;
        this.prev = null;
    }


    public String toString() {
        return title;
}
}














