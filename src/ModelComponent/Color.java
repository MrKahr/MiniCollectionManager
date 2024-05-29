package ModelComponent;

public class Color extends Coat {
    // FIELD
    String colorCode;

    // CONSTRUCTOR
    private Color(String id, String manifacturer, float price, String colorCode){
        super(id, manifacturer, price);
        this.colorCode = colorCode;
    }

    // METHOD
    public String getColorCode() {
        return colorCode;
    }

}
