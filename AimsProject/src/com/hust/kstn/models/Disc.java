package com.hust.kstn.models;

public class Disc extends Media {
    private String director;

    public Disc(String title, String category, double cost, String director) {
        super(title, category, cost);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }
}