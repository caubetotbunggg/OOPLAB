package hust.soict.dsai.aims.media;

abstract public class Media {
    private String title;
	private String category;
	private float cost;
    private int id;
    public static int nbId = 0;

    public Media(String title) {
        this.title = title;
        this.id = nbId;
        nbId++;
    }

    public Media(String title, String category) {
        this.title = title;
        this.category = category;
        this.id = nbId;
        nbId++;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = nbId;
        nbId++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return getId() + " - " + getTitle() + " - " + getCategory()  + ": " + getCost() + " $";
    }

    @Override
    public boolean equals(Object obj){
        Media media = (Media) obj;
        return title.equals(media.getTitle());
    }

    public Media(){
        // auto by myself
    }
}
