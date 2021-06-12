package linkedLists.linkedListChallenge;

import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.songs = new ArrayList<Song>();
    }
    // use boolean for validation purposes
    public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for(Song checkedSong : songs) {
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }
}
