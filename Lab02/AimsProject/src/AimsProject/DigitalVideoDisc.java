package AimsProject;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	private static int nbDigitalVideoDiscs = 0;
	
	// Create DVD 
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;

		this.id = nbDigitalVideoDiscs;
		nbDigitalVideoDiscs ++;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		
		this.id = nbDigitalVideoDiscs;
		nbDigitalVideoDiscs ++;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		
		this.id = nbDigitalVideoDiscs;
		nbDigitalVideoDiscs ++;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		
		this.id = nbDigitalVideoDiscs;
		nbDigitalVideoDiscs ++;
	}

	public String toString() {
		return this.id + " - " + this.title + " - " + this.category + " - " + this.director + " - " + this.length + ": " + this.cost + " $";
	}


	public boolean isMatch (String title){
		return this.title.equals(title);
	}
    
    // Only generate getter in this case

	public void setTitle(String title) {
		this.title = title;
	}
    
	public String getTitle() {
		return title;
	}
	
	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public float getCost() {
		return cost;
	}

	public int getId(){
		return id;
	}

	
}
