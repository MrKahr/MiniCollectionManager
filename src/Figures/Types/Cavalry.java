package Figures.Types;

import Figures.Parts.Vehicle;

public class Cavalry extends Figure {
        // FIELD 
        private Vehicle vehicle;

        // CONSTRUCTOR 
        public Cavalry(Double price, Vehicle vehicle){
            super(price);
            this.vehicle = vehicle;
        }

        public Cavalry(){}

        // METHOD 
}
