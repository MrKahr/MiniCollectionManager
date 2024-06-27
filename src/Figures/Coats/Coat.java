package Figures.Coats;

public abstract class Coat {
    // Field
    private String name; 
    private Integer id;
    private String manifacturer;
    private double price;

    // Constructor 
    Coat(String name, Integer id, String manifacturer, double price){
        this.name = name;
        this.id = id; 
        this.manifacturer = manifacturer;
        this.price = price;
    }

    // Method 
    public String getName() {
        return name;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public void setPrice(double price){
        this.price = price;
    }

    public abstract void print();
}
