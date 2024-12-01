package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.List;
import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_ORDERED = 20;
	private List<Media> itemsOrdered = new ArrayList<Media>();

	public void addMedia (Media media){
		for(Media m : itemsOrdered){
			if(media.equals(m)){
				System.out.println("The media has been added already");
				return;
			}
		}
		itemsOrdered.add(media);
	}

	public void removeMedia(Media media){
		for(Media m : itemsOrdered){
			if(media.equals(m)){
				System.out.println("Remove successfully");
				itemsOrdered.remove(media);
				return;
			}
		}
		System.out.println("Media not found");
	}
	
	public float totalCost() {
		float totalCost = 0;
		for (Media media : itemsOrdered) {
			totalCost += media.getCost();
		}
		return totalCost;
	}

	public void printCart() {
		System.out.println("***********************CART*********************** ");
		System.out.println("Ordered Items: ");
		for(Media media : itemsOrdered) {
			System.out.println(media.toString());
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("*************************************************** ");
	}
	
	// public void searchById(int idNum) {
	// 	int found = 0;
	// 	for(int i = 0; i < qtyOrdered; i++) {
	// 		if (idNum == i){
	// 			System.out.println(itemsOrdered[i].toString());
	// 			found = 1;
	// 			break;
	// 		}
	// 	}
	// 	if(found == 0){
	// 		System.out.println("DVD not found");
	// 	}
	// }

	// public void searchByTitle(String title) {
	// 	int found = 0;
	// 	for(int i = 0; i < qtyOrdered; i++){
	// 		if(itemsOrdered[i].isMatch(title)){
	// 			System.out.println(itemsOrdered[i].toString());
	// 			found = 1;
	// 			break;
	// 		}
	// 	}
	// 	if(found == 0){
	// 		System.out.println("DVD not found");
	// 	}
	// }

}
