package Figures;

public class Color extends Coat {
    // FIELD
    String colorCode;

    // CONSTRUCTOR
    public Color(Integer id, String manifacturer, double price, String colorCode){
        super(id, manifacturer, price);
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
