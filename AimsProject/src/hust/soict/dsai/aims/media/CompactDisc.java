package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {

    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public void addTrack(Track t){
        for(Track i : tracks){
            if(t.equals(i)){
                System.out.println("Track has been added already");
                return;
            }
        }
        tracks.add(t);
        System.out.println("Track added successfully");
    }

    public void removeTrack(Track t){
        for(Track i : tracks){
            if(t.equals(i)){
                System.out.println("Track removed");
                tracks.remove(tracks.indexOf(t));
                return;
            }
        }
        System.out.println("Track not found");
    }

    @Override
    public int getLength(){
        int len = 0;
        for(Track track : tracks){
            len += track.getLength();
        }
        return len;
    }

    @Override
    public void play(){
        System.out.println("Playing CompactDisc: " + this.getTitle());
        System.out.println("CD contains " + tracks.size() + " tracks.");

        for (Track track : tracks) {
            track.play(); 
        }
    }

    @Override
    public String toString() {
        return getId() + " - " + getTitle() + " - " + getCategory() + " - " + this.artist + " - " + getLength() + ": " + getCost() + " $";
    }

    public String getArtist() {
        return artist;
    }
    public CompactDisc(String title) {
        super(title);
    }

    public CompactDisc(String title, String category) {
        super(title, category);
    }

    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public CompactDisc(String title, String category, String artist, float cost) {
        super(title, category, cost);
        this.artist = artist;
    }

}
