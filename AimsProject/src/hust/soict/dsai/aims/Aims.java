package hust.soict.dsai.aims;

//import java.util.Arrays;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
	 public static void main(String[] args) {
	        Cart anOrder = new Cart();

	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
	        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

			DigitalVideoDisc dvd4 = new DigitalVideoDisc("Toan", "Animation", 18.99f);
			DigitalVideoDisc dvd5 = new DigitalVideoDisc("Dat", "Animation", 18.99f);

			// DigitalVideoDisc[] list = new DigitalVideoDisc[2];
			// list[0] = dvd4;
			// list[1] = dvd5;


	        // anOrder.addDigitalVideoDisc(dvd1);
	        // anOrder.addDigitalVideoDisc(dvd2);
	        // anOrder.addDigitalVideoDisc(dvd3);

			anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3);
			anOrder.addDigitalVideoDisc(dvd4, dvd5);

			//System.out.println(dvd1.toString());

	        System.out.println("Total Cost is: " + anOrder.totalCost());

	        anOrder.removeDigitalVideoDisc(dvd3);
	        System.out.println("Total cost after removing Aladdin: " + anOrder.totalCost());

	    }
}
