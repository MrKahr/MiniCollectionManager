package Figures.Creation;

import java.lang.Thread.Builder;

import Figures.Parts.Arm;
import Figures.Parts.Body;
import Figures.Parts.Head;
import Figures.Parts.Leg;
import Figures.Parts.Weapon;
import Figures.Types.Cavalry;

public class CavalryBuilder extends FigureBuilder {
    // FIELD 
    private Cavalry cavalry;
    // CONSTRUCTOR 
    CavalryBuilder(){
        this.cavalry = new Cavalry();
    }
    // METHOD 
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
