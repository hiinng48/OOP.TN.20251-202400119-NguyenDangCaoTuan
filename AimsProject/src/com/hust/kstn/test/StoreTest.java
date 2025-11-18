package com.hust.kstn.test;

import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);

        System.out.println("--- Add DVD1 and DVD2 to the store ---");
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.printStore();

        System.out.println("\n--- Add DVD3 to the store ---");
        store.addDVD(dvd3);
        store.printStore();

        System.out.println("\n--- Remove DVD2 from the store ---");
        store.removeDVD(dvd2);
        store.printStore();

        System.out.println("\n--- Try removing DVD2 from the store again ---");
        store.removeDVD(dvd2);
        store.printStore();
    }
}