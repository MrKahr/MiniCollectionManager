package figures.creation;

import figures.FigureMaterial;
import figures.FigureStatus;
import figures.parts.Arm;
import figures.parts.Body;
import figures.parts.Head;
import figures.parts.Leg;
import figures.parts.Weapon;
import figures.types.Figure;
import figures.types.Monster;

public class MonsterBuilder extends FigureBuilder {
    // FIELD 
    // CONSTRUCTOR 
    MonsterBuilder(){
        this.figure = new Monster();
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
        figure = new Monster();
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

    public Monster getResult() {
        return (Monster)this.figure;
    }

}
