package com.hust.kstn.models;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(title, category, cost); 
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "DVD" + super.toString() + "[" + this.length + "][" + this.director + "]";
    }
}