package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create a store with a capacity of 5
        Store store = new Store();

        // Create some DigitalVideoDiscs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Liems King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation", 18.99f);

        // Test adDigitalVideoDiscng DigitalVideoDiscs
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);

        // DigitalVideoDiscsplay the store
        store.displayStore();;

        // Test removing a DigitalVideoDisc
        store.removeMedia(2);

        // DigitalVideoDiscsplay the store again
        store.displayStore();
        
    }
}

