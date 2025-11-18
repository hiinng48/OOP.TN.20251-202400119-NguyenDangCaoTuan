package com.hust.kstn.test;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);

        System.out.println("--- Add DVD1 ---");
        cart.addDigitalVideoDisc(dvd1);
        cart.print();

        System.out.println("\n--- Add DVD2 and DVD3 ---");
        cart.addDigitalVideoDisc(dvd2, dvd3);
        cart.print();
        
        System.out.println("\n--- Remove DVD2 ---");
        cart.removeDigitalVideoDisc(dvd2);
        cart.print();
        
        System.out.println("\n--- Try removing DVD2 ---");
        cart.removeDigitalVideoDisc(dvd2);
        cart.print();
    }
}