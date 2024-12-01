package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media {

	private String director;
	//private int id;	
	private int length;
	//private static int nbId = 0;
	
	public DigitalVideoDisc(String title) {
		super();
		setTitle(title); 
		setId(nbId);
		nbId ++;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		setTitle(title);
		setCost(cost);
		setCategory(category);
		setId(nbId);
		nbId ++;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.director = director;
		setTitle(title);
		setCost(cost);
		setCategory(category);
		setId(nbId);
		nbId ++;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.director = director;
		this.length = length;
		setTitle(title);
		setCost(cost);
		setCategory(category);
		setId(nbId);	
		nbId ++;
	}

	public String toString() {
		return getId() + " - " + getTitle() + " - " + getCategory() + " - " + this.director + " - " + this.length + ": " + getCost() + " $";
	}

	public boolean isMatch (String title){
		return getTitle().equals(title);
	}
    
    // Only generate getter in this case

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}
	
}
