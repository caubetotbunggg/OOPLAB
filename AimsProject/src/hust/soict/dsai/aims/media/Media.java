package hust.soict.dsai.aims.media;

abstract public class Media {
    private String title;
	private String category;
	private float cost;
    private int id;
    public static int nbId = 0;

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

    public Media(){
        // auto by myself
    }
}
