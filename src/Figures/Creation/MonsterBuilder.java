package Figures.Creation;

import Figures.Parts.Arm;
import Figures.Parts.Body;
import Figures.Parts.Head;
import Figures.Parts.Leg;
import Figures.Parts.Weapon;
import Figures.Types.Monster;

public class MonsterBuilder extends FigureBuilder {
    // FIELD 
    private Monster monster;
    // CONSTRUCTOR 
    MonsterBuilder(){
        this.monster = new Monster();
    }
    // METHOD 
    @Override
    public void reset() {
        this.monster = new Monster();
    }

    @Override
    public void setCreator(Creator creator){
        monster.setCreator(creator);
    }

    @Override
    public void setCoater(Coater coater){
        monster.setCoater(coater);
    }

    @Override
    public void setBody(Body body){
        monster.setBody(body);
    }
    
    @Override 
    public void setHead(Head head){
        monster.setHead(head);
    }

    @Override
    public void setRightArm(Arm arm){
        monster.setRightarm(arm);
    }

    @Override 
    public void setLeftArm(Arm arm){
        monster.setLeftarm(arm);
    }

    @Override
    public void setRightLeg(Leg leg){
        monster.setRightleg(leg);
    }

    @Override
    public void setLeftLeg(Leg leg){
        monster.setLeftleg(leg);
    }
    public void setWeapon(Weapon weapon){
        monster.setWeapon(weapon);
    }

    public Monster getResult() {
        return this.monster;
    }

}
