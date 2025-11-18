package com.hust.kstn.test;

import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;

public class CompactDiscTest {
    public static void main(String[] args) {
        CompactDisc cd = new CompactDisc("Hybrid Theory", "Rock", "Linkin Park", "Don Gilmore", 15.99);

        Track track1 = new Track("Papercut", 185);
        Track track2 = new Track("One Step Closer", 156);
        Track track3 = new Track("In the End", 216);

        System.out.println("--- Adding tracks ---");
        cd.addTrack(track1);
        cd.addTrack(track2);
        cd.addTrack(track3);
        System.out.println(cd);
        
        System.out.println("\n--- Trying to add an existing track ---");
        cd.addTrack(track2);

        System.out.println("\n--- Removing a track ---");
        cd.removeTrack(track2);
        System.out.println(cd);

        System.out.println("\n--- Trying to remove a non-existent track ---");
        cd.removeTrack(track2);
    }
}