package com.hust.kstn.models;

public class Store {
    public static final int MAX_NUMBERS = 100;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS];
    private int dvdCount = 0; 

    public void addDVD(DigitalVideoDisc dvd) {
        if (dvdCount >= MAX_NUMBERS) {
            System.out.println("Error: Store is full, cannot add more DVDs.");
            return;
        }
        itemsInStore[dvdCount] = dvd;
        dvdCount++;
        System.out.println("Added '" + dvd.getTitle() + "' to the store.");
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        if (dvdCount <= 0) {
            System.out.println("Error: Store is empty, cannot remove DVDs.");
            return;
        }

        int index = -1;
        for (int i = 0; i < dvdCount; i++) {
            if (itemsInStore[i] == dvd) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Error: DVD '" + dvd.getTitle() + "' not found in the store.");
            return;
        }

        for (int i = index; i < dvdCount - 1; i++) {
            itemsInStore[i] = itemsInStore[i + 1];
        }

        itemsInStore[dvdCount - 1] = null;
        dvdCount--;
        System.out.println("Removed '" + dvd.getTitle() + "' from the store.");
    }

    public void printStore() {
        System.out.println("======================= STORE'S DVD LIST =======================");
        if (dvdCount == 0) {
            System.out.println("The store is empty.");
        } else {
            for (int i = 0; i < dvdCount; i++) {
                System.out.println((i + 1) + ". " + itemsInStore[i].toString());
            }
        }
        System.out.println("===============================================================");
    }
}