package Figures.Creation;

import Figures.FigureStatus;
import Figures.Parts.Arm;
import Figures.Parts.Body;
import Figures.Parts.Head;
import Figures.Parts.Leg;
import Figures.Parts.Weapon;
import Figures.Types.Figure;

public abstract class Builder implements Creator {
    //FIELD 
    // CONSTRUCTOR
    // METHOD 
    public abstract void reset();
    public abstract void setHead(Head head);
    public abstract void setRightArm(Arm arm);
    public abstract void setLeftArm(Arm arm);
    public abstract void setBody(Body body);
    public abstract void setRightLeg(Leg leg);
    public abstract void setLeftLeg(Leg leg);
    public abstract void setWeapon(Weapon weapon);
    public abstract void setCreator(Creator creater);
    public abstract void setCoater(Coater coater);
    public abstract Figure getResult();
}
