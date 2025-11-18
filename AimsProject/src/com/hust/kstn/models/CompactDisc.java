package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Media {
    private String artist;
    private String director;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, String artist, String director, double cost) {
        super(title, category, cost); 
        this.artist = artist;
        this.director = director;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        }
    }
    public void removeTrack(Track track) {
        tracks.remove(track);
    }
    public int totalLength() {
        int total = 0;
        for (Track track : tracks) {
            total += track.getLength();
        }
        return total;
    }
    
    @Override
    public String toString() {
        return "CompactDisc" + super.toString() + "[" + this.artist + "][" + this.director + "]"
                + "\nTotal Length: " + this.totalLength() + ", Tracks:" + this.tracks;
    }
}