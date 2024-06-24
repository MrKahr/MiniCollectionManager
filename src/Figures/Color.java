package Figures;

public class Color extends Coat {
    // FIELD
    Integer colorCode;

    // CONSTRUCTOR
    public Color(Integer id, String manifacturer, double price, Integer colorCode){
        super(id, manifacturer, price);
        this.colorCode = colorCode;
    }
    
    // METHOD
    public Integer getColorCode() {
        return colorCode;
    }

}
