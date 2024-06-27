package Figures.Creation;

import Figures.Parts.*;
import Figures.Types.Infantry;

public class InfantryBuilder extends FigureBuilder {
    // FIELD 
    private Infantry infantry;

    // CONSTRUCTOR 
    InfantryBuilder(){
        this.infantry = new Infantry();
    }

    // METHOD 
    @Override
    public void reset() {
        this.infantry = new Infantry();
    }

    @Override
    public void setCreator(Creator creator){
        infantry.setCreator(creator);
    }

    @Override
    public void setCoater(Coater coater){
        infantry.setCoater(coater);
    }

    @Override
    public void setBody(Body body){
        infantry.setBody(body);
    }
    
    @Override 
    public void setHead(Head head){
        infantry.setHead(head);
    }

    @Override
    public void setRightArm(Arm arm){
        infantry.setRightarm(arm);
    }

    @Override 
    public void setLeftArm(Arm arm){
        infantry.setLeftarm(arm);
    }

    @Override
    public void setRightLeg(Leg leg){
        infantry.setRightleg(leg);
    }

    @Override
    public void setLeftLeg(Leg leg){
        infantry.setLeftleg(leg);
    }
    public void setWeapon(Weapon weapon){
        infantry.setWeapon(weapon);
    }

    public Infantry getResult() {
        return this.infantry;
    }

}
