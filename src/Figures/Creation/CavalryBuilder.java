package figures.creation;

import figures.FigureMaterial;
import figures.FigureStatus;
import figures.parts.Arm;
import figures.parts.Body;
import figures.parts.Head;
import figures.parts.Leg;
import figures.parts.Weapon;
import figures.types.Cavalry;

public class CavalryBuilder extends FigureBuilder {
    // FIELD 
    private Cavalry cavalry;
    // CONSTRUCTOR 
    CavalryBuilder(){
        this.cavalry = new Cavalry();
    }
    // METHOD 
    @Override
    public void setPrice(Double price) {
        cavalry.setPrice(price);
    }
    @Override
    public void setFigureMaterial(FigureMaterial figureMaterial) {
        cavalry.setFigureMaterial(figureMaterial);
    }

    @Override
    public void setFigureStatus(FigureStatus figureStatus) {
        cavalry.setStatus(figureStatus);
    }
 
    @Override
    public void reset() {
        this.cavalry = new Cavalry();
    }

    @Override
    public void setCreator(Creator creator){
        cavalry.setCreator(creator);
    }

    @Override
    public void setCoater(Coater coater){
        cavalry.setCoater(coater);
    }

    @Override
    public void setBody(Body body){
        cavalry.setBody(body);
    }
    
    @Override 
    public void setHead(Head head){
        cavalry.setHead(head);
    }

    @Override
    public void setRightArm(Arm arm){
        cavalry.setRightarm(arm);
    }

    @Override 
    public void setLeftArm(Arm arm){
        cavalry.setLeftarm(arm);
    }

    @Override
    public void setRightLeg(Leg leg){
        cavalry.setRightleg(leg);
    }

    @Override
    public void setLeftLeg(Leg leg){
        cavalry.setLeftleg(leg);
    }
    @Override
    public void setWeapon(Weapon weapon){
        cavalry.setWeapon(weapon);
    }

    public Cavalry getResult() {
        return this.cavalry;
    }
}
