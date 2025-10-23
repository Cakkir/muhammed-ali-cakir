public class DoublyLinkedPlaylist {

    public class Song {
        String title;
        Song next;
        Song prev;

        public Song(String title) {
            this.title = title;
            this.next = null;
            this.prev = null;
        }
    }


    Song head;
    Song tail;
    Song current;
    public DoublyLinkedPlaylist() {
        head = null;
        tail = null;
        current = null;
    }

    public void addSong(String title){
        Song newSong = new Song(title);

        if(head == null){
            head = newSong;
            tail = newSong;
            current = newSong;
            System.out.println("The first song added to the playlist: " + title);
        } else{
            newSong.prev = tail;
            tail.next = newSong;
            tail = newSong;
            System.out.println("The song added to the playlist: " + title);
        }
    }
    public void nextSong() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("NS: Now Playing: " + current.title);
        } else {
            System.out.println("End of playlist");
        }
    }

    public void previousSong() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("PS: Now Playing: " + current.title);
        } else {
            System.out.println("Start of playlist");
        }
    }

    public void displayCurrentSong() {
        if (current != null) {
            System.out.println("Current Song: " + current.title);
        } else {
            System.out.println("Playlist is empty.");
}
}
}