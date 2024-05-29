package ModelComponent;

public abstract class Coat {
    // Field 
    private String id;
    private String manifacturer;
    private float price;

    // Constructor 
    Coat(String id, String manifacturer, float price){
        this.id = id; 
        this.manifacturer = manifacturer;
        this.price = price;
    }

    // Method 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManifacturer() {
        return manifacturer;
    }

    void setManifacturer(String manifacturer){
        this.manifacturer = manifacturer;
    }

    public float getPrice() {
        return price;
    }

    void setPrice(float price){
        this.price = price;
    }
}
