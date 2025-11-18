package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {
    private int id;
    private String title;
    private String category;
    private String artist;
    private String director;
    private double cost;
    private List<Track> tracks = new ArrayList<>();

    private static int nbCompactDiscs = 0;

    public CompactDisc(String title, String category, String artist, String director, double cost) {
        this.title = title;
        this.category = category;
        this.artist = artist;
        this.director = director;
        this.cost = cost;
        nbCompactDiscs++;
        this.id = nbCompactDiscs;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Error: Track is already in the CD.");
        } else {
            tracks.add(track);
            System.out.println("Added track '" + track.getTitle() + "' to the CD.");
        }
    }

    public void removeTrack(Track track) {
        if (!tracks.contains(track)) {
            System.out.println("Error: Track does not exist in the CD.");
        } else {
            tracks.remove(track);
            System.out.println("Removed track '" + track.getTitle() + "' from the CD.");
        }
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
        return "CompactDisc[" + this.id + "][" + this.title + "][" + this.category + "][" 
                + this.artist + "][" + this.director + "][" + this.cost + "]" 
                + "\nTotal Length: " + this.totalLength() + ", Tracks:" + this.tracks;
    }
}