package figures.creation;

import figures.FigureMaterial;
import figures.FigureStatus;
import figures.parts.*;
import figures.types.Figure;
import figures.types.Infantry;

public class InfantryBuilder extends FigureBuilder {
    // FIELD
    // CONSTRUCTOR 
    InfantryBuilder(){
        this.figure = new Infantry();
    }

    // METHOD 
    @Override
    public void setFigure(Figure figure) {
        this.figure = figure;
        
    }
    @Override
    public void setPrice(Double price) {
        figure.setPrice(price);
    }
    @Override
    public void setFigureMaterial(FigureMaterial figureMaterial) {
        figure.setFigureMaterial(figureMaterial);
    }

    @Override
    public void setFigureStatus(FigureStatus figureStatus) {
        figure.setStatus(figureStatus);
    }
 
    @Override
    public void reset() {
        this.figure = new Infantry();
    }

    @Override
    public void setCreator(Creator creator){
        figure.setCreator(creator);
    }

    @Override
    public void setCoater(Coater coater){
        figure.setCoater(coater);
    }

    @Override
    public void setBody(Body body){
        figure.setBody(body);
    }
    
    @Override 
    public void setHead(Head head){
        figure.setHead(head);
    }

    @Override
    public void setRightArm(Arm arm){
        figure.setRightarm(arm);
    }

    @Override 
    public void setLeftArm(Arm arm){
        figure.setLeftarm(arm);
    }

    @Override
    public void setRightLeg(Leg leg){
        figure.setRightleg(leg);
    }

    @Override
    public void setLeftLeg(Leg leg){
        figure.setLeftleg(leg);
    }
    public void setWeapon(Weapon weapon){
        figure.setWeapon(weapon);
    }

    public Infantry getResult() {
        return (Infantry)this.figure;
    }

}
