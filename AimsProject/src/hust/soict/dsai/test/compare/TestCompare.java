package hust.soict.dsai.test.compare;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestCompare {
    public static void main(String[] args) {
        Cart cart = new Cart();

		CompactDisc cd1 = new CompactDisc("Xin Loi","con mua", "vua qua", 22.5f);
		CompactDisc cd2 = new CompactDisc("Ngung phan xet");

        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

		Book b1 = new Book("Con meo", "Truyen", 80.25f);
		Book b2 = new Book("So Dua", "Truyen Co Tich", 40.5f);

		cart.addMedia(cd1);
		cart.addMedia(cd2);
		cart.addMedia(jungleDVD);
		cart.addMedia(cinderellaDVD);
		cart.addMedia(b1);
		cart.addMedia(b2);

        // Sort by Title, then Cost
        cart.sortByTitleCost();

        System.out.println("");

        // Sort by Cost, then Title
        cart.sortByCostTitle();
    }
}