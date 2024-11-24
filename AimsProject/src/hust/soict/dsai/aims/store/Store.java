package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
//import java.util.ArrayList;

public class Store {
    private DigitalVideoDisc[] itemsInStore; // Array to store DigitalVideoDiscs
    private int currentCount;   // Tracks the number of DigitalVideoDiscs in the store

    // Constructor to initialize the store with a given capacity
    public Store(int capacity) {
        itemsInStore = new DigitalVideoDisc[capacity];
        currentCount = 0;
    }

    // Method to add a DigitalVideoDisc to the store
    public void addDigitalVideoDisc(DigitalVideoDisc DigitalVideoDisc) {
        if (currentCount < itemsInStore.length) {
            itemsInStore[currentCount] = DigitalVideoDisc;
            currentCount++;
            System.out.println("Added DigitalVideoDisc: " + DigitalVideoDisc.toString());
        } else {
            System.out.println("Store is full. Cannot add more DigitalVideoDiscs.");
        }
    }

    // Method to remove a DigitalVideoDisc from the store by ID
    public void removeDigitalVideoDisc(int id) {
        boolean found = false;
        for (int i = 0; i < currentCount; i++) {
            if (itemsInStore[i].getId() == id) { // Assuming DigitalVideoDisc has a getId() method
                found = true;
                // Shift all elements after the removed DigitalVideoDisc
                for (int j = i; j < currentCount - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[currentCount - 1] = null; // Clear the last slot
                currentCount--;
                System.out.println("Removed DigitalVideoDisc with ID: " + id);
                break;
            }
        }
        if (!found) {
            System.out.println("DigitalVideoDisc with ID " + id + " not found in the store.");
        }
    }

    // Method to display all DigitalVideoDiscs in the store
    public void displayStore() {
        System.out.println("DigitalVideoDiscs currently in the store:");
        for (int i = 0; i < currentCount; i++) {
            System.out.println(itemsInStore[i].toString());
        }
    }
}
