package Figures;

public class Varnish extends Coat {
        // FIELD

        // CONSTRUCTOR
        private Varnish(Integer id, String manifacturer, float price){
            super(id, manifacturer, price);
        }
    
        // METHOD
        @Override
        public void print() {
            System.out.println(super.getId() +  super.getManifacturer() + super.getPrice()); 
        }
}
