package figures.creation;

import figures.FigureMaterial;
import figures.FigureStatus;
import figures.parts.Arm;
import figures.parts.Body;
import figures.parts.Head;
import figures.parts.Leg;
import figures.parts.Weapon;

public abstract class FigureBuilder implements Creator {
    //FIELD 
    // METHOD 
    public abstract void setPrice(Double price);
    public abstract void setFigureMaterial(FigureMaterial figureMaterial);
    public abstract void setFigureStatus(FigureStatus figureStatus);
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
