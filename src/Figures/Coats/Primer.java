package Figures.Coats;
public class Primer extends Coat{
       // FIELD

        // CONSTRUCTOR
        private Primer(Integer id, String manifacturer, float price){
            super(id, manifacturer, price);
        }
    
        // METHOD
        @Override
        public void print() {
            System.out.println(super.getId() +  super.getManifacturer() + super.getPrice()); 
        }

    }