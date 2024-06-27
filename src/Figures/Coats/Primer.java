package Figures.Coats;
public class Primer extends Coat{
       // FIELD

        // CONSTRUCTOR
        private Primer(String name, Integer id, String manifacturer, float price){
            super(name,id, manifacturer, price);
        }
    
        // METHOD
        @Override
        public void print() {
            System.out.println(super.getId() +  super.getManifacturer() + super.getPrice()); 
        }

    }