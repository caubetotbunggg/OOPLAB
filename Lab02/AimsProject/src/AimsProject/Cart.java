package aims;

public class Cart {
	public static final int MAX_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_ORDERED];
	private int qtyOrdered = 0;

	public void addDigitalVideoDisc (DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_ORDERED) {
			System.out.println("The cart is full");
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered += 1;
			System.out.println("The disc has been added");
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc... discs) {
		for (DigitalVideoDisc disc : discs) {
			if (qtyOrdered == MAX_ORDERED) {
				System.out.println("The cart is full. Cannot add more discs.");
				break;
			} else {
				itemsOrdered[qtyOrdered] = disc;
				qtyOrdered++;
				System.out.println("The disc has been added");
			}
		}
	}

	// public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
	// 	for(DigitalVideoDisc disc : dvdList) {
	// 		if(qtyOrdered < MAX_ORDERED){
	// 			itemsOrdered[qtyOrdered] = disc;
	// 			qtyOrdered++;
	//			System.out.println("The disc has been added");

	// 		}
	// 		else{
	// 			System.out.println("The cart is full");
	// 		}
	// 	}
	// }

	public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		if (qtyOrdered >= MAX_ORDERED){
			System.out.println("The cart is full");
		}
		else {
			itemsOrdered[qtyOrdered] = disc1;
			qtyOrdered++;
			System.out.println("The first cart has been added successfully");
			if (qtyOrdered == MAX_ORDERED){
				System.out.println("The cart is full");
			}else{
				System.out.println("The second cart has been added successfully");
			}
		}
	}
	
	public void removeDigitalVideoDisc (DigitalVideoDisc dvd) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(dvd)) {
				for (int j = i; i < qtyOrdered - 1; i++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				itemsOrdered[qtyOrdered-1] = null;
				qtyOrdered -= 1;
				System.out.println("The disc has been removed");
				return;
			}
		}
		System.out.println("Cannot find the disc");
	}
	
	public float totalCost() {
		float totalCost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			totalCost += itemsOrdered[i].getCost();
		}
		return totalCost;
	}

	public void printCart() {
		System.out.println("***********************CART*********************** ");
		System.out.println("Ordered Items: ");
		for(int i = 0; i < qtyOrdered; i++) {
			System.out.println(itemsOrdered[i].toString());
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("*************************************************** ");
	}
	
	public void searchById(int idNum) {
		int found = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			if (idNum == i){
				System.out.println(itemsOrdered[i].toString());
				found = 1;
				break;
			}
		}
		if(found == 0){
			System.out.println("DVD not found");
		}
	}

	public void searchByTitle(String title) {
		int found = 0;
		for(int i = 0; i < qtyOrdered; i++){
			if(itemsOrdered[i].isMatch(title)){
				System.out.println(itemsOrdered[i].toString());
				found = 1;
				break;
			}
		}
		if(found == 0){
			System.out.println("DVD not found");
		}
	}

}
