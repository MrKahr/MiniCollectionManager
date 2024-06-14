package ModelComponent;

public abstract class Coat {
    // Field 
    private String id;
    private String manifacturer;
    private double price;

    // Constructor 
    Coat(String id, String manifacturer, double price){
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

    public double getPrice() {
        return price;
    }

    void setPrice(double price){
        this.price = price;
    }
}
