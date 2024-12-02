package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
public class CartTest {
    public static void main(String[] args) {
        
        //Create a new cart
        Cart cart = new Cart();
        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Liems King", 
            "Animation", "Roger Allers", 87, 19.95f);
        cart.addMedia(dvd1);
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Aladin", 
            "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Bladin",
            "Animation", 18.99f);
        cart.addMedia(dvd3);
        
        //Test the print method
        cart.printCart();

        //Test the search methods
        // cart.searchById(5);
        // cart.searchByTitle("Aladin");
    }
}