package figures.coats;

public class Color extends Coat {
    // FIELD
    String colorCode;

    // CONSTRUCTOR
    public Color(String name, Integer id, String manifacturer, double price, String colorCode){
        super(name,id, manifacturer, price);
        this.colorCode = colorCode;
    }
    
    // METHOD
    public String getColorCode() {
        return colorCode;
    }

    @Override
    public void print() {
        System.out.println(super.getId() +  super.getManifacturer() + super.getPrice()); 
    }

}
