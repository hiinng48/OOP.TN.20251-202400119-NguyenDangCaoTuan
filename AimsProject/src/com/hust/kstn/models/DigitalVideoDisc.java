package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {
    private int length;

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(title, category, cost, director); 
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "DVD" + super.toString() + "[" + this.length + "][" + getDirector() + "]";
    }
}