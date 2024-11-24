package aims;

public class StoreTest {
    public static void main(String[] args) {
        // Create a store with a capacity of 5
        Store store = new Store(3);

        // Create some DigitalVideoDiscs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Liems King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation", 18.99f);

        // Test adding DigitalVideoDiscs
        store.addDigitalVideoDisc(dvd1);
        store.addDigitalVideoDisc(dvd2);
        store.addDigitalVideoDisc(dvd3);

        // Display the store
        store.displayStore();

        // Test removing a DigitalVideoDisc
        store.removeDigitalVideoDisc(2);

        // Display the store again
        store.displayStore();

        // Try removing a non-existent DigitalVideoDisc
        store.removeDigitalVideoDisc(5);

    }
}

