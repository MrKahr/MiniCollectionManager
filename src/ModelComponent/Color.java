package ModelComponent;

public class Color extends Coat {
    // FIELD
    String colorCode;

    // CONSTRUCTOR
    public Color(String id, String manifacturer, double price, String colorCode){
        super(id, manifacturer, price);
        this.colorCode = colorCode;
    }

    // METHOD
    public String getColorCode() {
        return colorCode;
    }

}
