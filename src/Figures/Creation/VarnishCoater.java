package Figures.Creation;

import FigureExpections.IllegalDuplicateElementException;
import Figures.Coats.Coat;
import Figures.Coats.Color;
import Figures.Coats.Varnish;
import Figures.Parts.FigurePart;

public class VarnishCoater extends Coater {
    // FIELD
    // CONSTRUCTOR 
    // METHOD 
    @Override
     public void applyCoat(FigurePart figurePart, Coat coat){
        if (figurePart.getVarnishs().contains(coat)) {
            throw new IllegalDuplicateElementException("Figure already has " + coat.getId() + " applied to it!");
        } else if(!(coat instanceof Varnish)){
            throw new IllegalArgumentException("Cannot apply " + Coat.class + " as varnish!");
        } else {
            figurePart.getVarnishs().add((Varnish)coat);
        }
    }
    
    @Override
    public void removeCoat(FigurePart figurePart, Coat coat){
        if (!figurePart.getColors().contains(coat)) {
            throw new IllegalDuplicateElementException("Figure did not have " + coat.getName() + " applied to it!");
        } else if(!(coat instanceof Varnish)){
            throw new IllegalArgumentException("Cannot apply " + Coat.class + " as varnish!");
        } else {
            figurePart.getVarnishs().add((Varnish)coat);
        }
    }

    @Override
    public void showCoats(FigurePart figurePart) {
        for (Coat color : figurePart.getVarnishs()) {
            System.out.println(color);
        }
    }
}
