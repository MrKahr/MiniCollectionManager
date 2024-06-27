package Figures.Creation;

import Figures.Parts.Arm;
import Figures.Parts.Body;
import Figures.Parts.Head;
import Figures.Parts.Leg;
import Figures.Parts.Weapon;

public abstract class FigureBuilder implements Creator {
    //FIELD 
    // CONSTRUCTOR
    // METHOD 
    public abstract void reset();
    public abstract void setCreator(Creator creater);
    public abstract void setCoater(Coater coater);
    public abstract void setBody(Body body);
    public abstract void setHead(Head head);
    public abstract void setRightArm(Arm arm);
    public abstract void setLeftArm(Arm arm);
    public abstract void setRightLeg(Leg leg);
    public abstract void setLeftLeg(Leg leg);
    public abstract void setWeapon(Weapon weapon);

}
