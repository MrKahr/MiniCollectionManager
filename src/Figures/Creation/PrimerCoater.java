package figures.creation;

import figures.coats.Coat;
import figures.coats.Primer;
import figures.parts.FigurePart;
import figureExceptions.IllegalDuplicateElementException;

public class PrimerCoater extends Coater {
    // FIELD
    // CONSTRUCTOR 
    PrimerCoater(){}
    // METHOD 
    @Override
     public void applyCoat(FigurePart figurePart, Coat coat){
        if (figurePart.getColors().contains(coat)) {
            throw new IllegalDuplicateElementException("Figure already has " + coat.getId() + " applied to it!");
        } else if(!(coat instanceof Primer)){
            throw new IllegalArgumentException("Cannot apply " + Coat.class + " as color!");
        } else {
            figurePart.getPrimers().add((Primer)coat);
        }
    }
    
    @Override
    public void removeCoat(FigurePart figurePart, Coat coat){
        if (!figurePart.getPrimers().contains(coat)) {
            throw new IllegalDuplicateElementException("Figure did not have " + coat.getName() + " applied to it!");
        } else if(!(coat instanceof Primer)){
            throw new IllegalArgumentException("Cannot apply " + Coat.class + " as color!");
        } else {
            figurePart.getPrimers().add((Primer)coat);
        }
    }

    @Override
    public void showCoats(FigurePart figurePart) {
        for (Coat primer : figurePart.getPrimers()) {
            System.out.println(primer);
        }
    }
}
