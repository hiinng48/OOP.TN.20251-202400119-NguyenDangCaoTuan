package com.hust.kstn.models;

public class Media {
    private int id;
    private String title;
    private String category;
    private double cost;
    private static int nbMedias = 0;

    public Media(String title, String category, double cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbMedias++;
        this.id = nbMedias;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "[" + this.id + "][" + this.title + "][" + this.category + "][" + this.cost + "]";
    }
}