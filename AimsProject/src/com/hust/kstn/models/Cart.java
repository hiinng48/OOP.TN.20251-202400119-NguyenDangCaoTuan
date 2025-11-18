package com.hust.kstn.models;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added successfully.");
        } else {
            System.out.println("The cart is full.");
        }
    }
    //part 2.1 new overloading method
    public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED - 1) {
            addDigitalVideoDisc(disc1);
            addDigitalVideoDisc(disc2);
        } else {
            System.out.println("The cart is almost full.");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if (qtyOrdered + dvdList.length <= MAX_NUMBERS_ORDERED) {
            for (DigitalVideoDisc disc : dvdList) {
                addDigitalVideoDisc(disc);
            }
        } else {
            System.out.println("The cart is almost full.");
        }
    }
    //end 2.1

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty.");
            return;
        }

        int index = -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < qtyOrdered - 1; i++) {
                itemsOrdered[i] = itemsOrdered[i + 1];
            }
            itemsOrdered[qtyOrdered - 1] = null;
            qtyOrdered--;
            System.out.println("The disc has been removed successfully.");
        } else {
            System.out.println("The disc does not exist.");
        }
    }

    //2.3 print method + totalCost method
    public double totalCost() {
        double total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    public void print() {
        System.out.println("======================= THE CURRENT CART =======================");
        if (qtyOrdered == 0) {
            System.out.println("Cart is empty.");
            System.out.println("Subtotal: 0.0$");
        } else {
            System.out.println("Total items: [" + qtyOrdered + "]");
            for (DigitalVideoDisc disc : itemsOrdered) {
                if (disc != null) {
                    System.out.println(disc.toString());
                }
            }
            System.out.println("Subtotal: [" + this.totalCost() + "]$");
        }
        System.out.println("================================================================");
    }
    // end 2.3
}
